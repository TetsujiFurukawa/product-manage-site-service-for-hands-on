-- Project Name : product-manage-db
-- Date/Time    : 2019/10/04 22:17:59
-- Author       : tetsuji
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

/*
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
*/

-- 商品購入テーブル
--* RestoreFromTempTable
create table product_purchase_tbl (
  product_purchase_seq int auto_increment not null
  , product_seq int not null unique
  , product_purchase_name varchar(50) not null
  , product_purchase_unit_price decimal(8,0) not null
  , product_purchase_quantity decimal(8,0) not null
  , product_purchase_amount decimal(8,0) not null
  , deleted boolean default false
  , enter_date timestamp not null
  , enter_user varchar(50) not null
  , update_date timestamp not null
  , update_user varchar(50) not null
  , constraint product_purchase_tbl_PKC primary key (product_purchase_seq)
) ;

-- 商品在庫マスタ
--* RestoreFromTempTable
create table product_stock_mst (
  product_stock_seq int auto_increment not null
  , product_seq int not null unique
  , product_stock_quantity decimal(8,0)
  , deleted boolean default false
  , enter_date timestamp not null
  , enter_user varchar(50) not null
  , update_date timestamp not null
  , update_user varchar(50) not null
  , constraint product_stock_mst_PKC primary key (product_stock_seq)
) ;

-- 商品マスタ
--* RestoreFromTempTable
create table product_mst (
  product_seq int auto_increment not null
  , product_code varchar(20) unique
  , product_name varchar(50)
  , product_genre varchar(20)
  , product_size_standard varchar(50)
  , product_color varchar(20)
  , product_unit_price decimal(8,0)
  , end_of_sale boolean
  , end_of_sale_date timestamp
  , deleted boolean default false
  , enter_date timestamp not null
  , enter_user varchar(50) not null
  , update_date timestamp not null
  , update_user varchar(50) not null
  , constraint product_mst_PKC primary key (product_seq)
) ;

-- ユーザマスタ
--* RestoreFromTempTable
create table user_mst (
  user_seq int auto_increment not null
  , user_account varchar(20) not null unique
  , user_name varchar(50) not null
  , user_lang varchar(30) not null
  , user_timezone varchar(30) not null
  , deleted boolean default false
  , enter_date timestamp not null
  , enter_user varchar(50) not null
  , update_date timestamp not null
  , update_user varchar(50) not null
  , constraint user_mst_PKC primary key (user_seq)
) ;

alter table product_stock_mst
  add constraint product_stock_mst_FK1 foreign key (product_seq) references product_mst(product_seq)
  on delete cascade;

alter table product_purchase_tbl
  add constraint product_purchase_tbl_FK1 foreign key (product_seq) references product_mst(product_seq)
  on delete cascade;

comment on table product_purchase_tbl is '商品購入テーブル';
comment on column product_purchase_tbl.product_purchase_seq is '商品購入連番';
comment on column product_purchase_tbl.product_seq is '商品連番';
comment on column product_purchase_tbl.product_purchase_name is '商品購入者';
comment on column product_purchase_tbl.product_purchase_unit_price is '商品単価';
comment on column product_purchase_tbl.product_purchase_quantity is '商品購入数';
comment on column product_purchase_tbl.product_purchase_amount is '商品購入価格';
comment on column product_purchase_tbl.deleted is '削除';
comment on column product_purchase_tbl.enter_date is '登録日';
comment on column product_purchase_tbl.enter_user is '登録者';
comment on column product_purchase_tbl.update_date is '更新日';
comment on column product_purchase_tbl.update_user is '更新者';

comment on table product_stock_mst is '商品在庫マスタ';
comment on column product_stock_mst.product_stock_seq is '商品在庫連番';
comment on column product_stock_mst.product_seq is '商品連番';
comment on column product_stock_mst.product_stock_quantity is '商品在庫数';
comment on column product_stock_mst.deleted is '削除';
comment on column product_stock_mst.enter_date is '登録日';
comment on column product_stock_mst.enter_user is '登録者';
comment on column product_stock_mst.update_date is '更新日';
comment on column product_stock_mst.update_user is '更新者';

comment on table product_mst is '商品マスタ';
comment on column product_mst.product_seq is '商品連番';
comment on column product_mst.product_code is '商品コード';
comment on column product_mst.product_name is '商品名';
comment on column product_mst.product_genre is 'ジャンル';
comment on column product_mst.product_size_standard is 'サイズ・規格';
comment on column product_mst.product_color is '色';
comment on column product_mst.product_unit_price is '単価';
comment on column product_mst.end_of_sale is '販売終了';
comment on column product_mst.end_of_sale_date is '販売終了日';
comment on column product_mst.deleted is '削除';
comment on column product_mst.enter_date is '登録日';
comment on column product_mst.enter_user is '登録者';
comment on column product_mst.update_date is '更新日';
comment on column product_mst.update_user is '更新者';

comment on table user_mst is 'ユーザマスタ';
comment on column user_mst.user_seq is 'ユーザ連番';
comment on column user_mst.user_account is 'ユーザアカウント';
comment on column user_mst.user_name is 'ユーザ名';
comment on column user_mst.user_lang is '言語';
comment on column user_mst.user_timezone is 'タイムゾーン';
comment on column user_mst.deleted is '削除';
comment on column user_mst.enter_date is '登録日';
comment on column user_mst.enter_user is '登録者';
comment on column user_mst.update_date is '更新日';
comment on column user_mst.update_user is '更新者';
