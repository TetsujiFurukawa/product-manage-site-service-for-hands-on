-- Project Name : product-manage-db
-- Date/Time    : 2019/10/17 9:54:58
-- Author       : ts-tetsuji.furukawa
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

/*
 BackupToTempTable, RestoreFromTempTable directive is attached.
 This preserve data after drop table and create table.
 This function temporarily creates temporary table like $$TableName.
*/

-- ユーザマスタ
--* RestoreFromTempTable
create table USER_MST (
  USER_SEQ bigserial not null
  , USER_ACCOUNT varchar(20) not null unique
  , USER_ENCODED_PASSWORD varchar(128) not null
  , USER_NAME varchar(50) not null
  , USER_LANG varchar(30) not null
  , USER_TIMEZONE varchar(30) not null
  , USER_SUB_MENU_ROLE varchar(10) not null
  , DELETED boolean default false not null
  , ENTER_DATE datetime not null
  , ENTER_USER varchar(50) not null
  , UPDATE_DATE datetime not null
  , UPDATE_USER varchar(50) not null
  , constraint USER_MST_PKC primary key (USER_SEQ)
) ;

-- 商品マスタ
--* RestoreFromTempTable
create table PRODUCT_MST (
  PRODUCT_SEQ bigserial not null
  , PRODUCT_CODE varchar(20) unique
  , PRODUCT_NAME varchar(50)
  , PRODUCT_GENRE varchar(20)
  , PRODUCT_SIZE_STANDARD varchar(50)
  , PRODUCT_COLOR varchar(20)
  , PRODUCT_UNIT_PRICE decimal(8,0)
  , END_OF_SALE boolean
  , END_OF_SALE_DATE datetime
  , DELETED boolean default false not null
  , ENTER_DATE datetime not null
  , ENTER_USER varchar(50) not null
  , UPDATE_DATE datetime not null
  , UPDATE_USER varchar(50) not null
  , constraint PRODUCT_MST_PKC primary key (PRODUCT_SEQ)
) ;

-- 商品在庫マスタ
--* RestoreFromTempTable
create table PRODUCT_STOCK_MST (
  PRODUCT_STOCK_SEQ bigserial not null
  , PRODUCT_SEQ bigint not null unique
  , PRODUCT_STOCK_QUANTITY decimal(8,0) not null
  , DELETED boolean default false not null
  , ENTER_DATE datetime not null
  , ENTER_USER varchar(50) not null
  , UPDATE_DATE datetime not null
  , UPDATE_USER varchar(50) not null
  , constraint PRODUCT_STOCK_MST_PKC primary key (PRODUCT_STOCK_SEQ)
) ;

-- 商品購入テーブル
--* RestoreFromTempTable
create table PRODUCT_PURCHASE_TBL (
  PRODUCT_PURCHASE_SEQ bigserial not null
  , PRODUCT_SEQ bigint not null unique
  , PRODUCT_PURCHASE_NAME varchar(50) not null
  , PRODUCT_PURCHASE_UNIT_PRICE decimal(8,0) not null
  , PRODUCT_PURCHASE_QUANTITY decimal(8,0) not null
  , PRODUCT_PURCHASE_AMOUNT decimal(8,0) not null
  , DELETED boolean default false not null
  , ENTER_DATE datetime not null
  , ENTER_USER varchar(50) not null
  , UPDATE_DATE datetime not null
  , UPDATE_USER varchar(50) not null
  , constraint PRODUCT_PURCHASE_TBL_PKC primary key (PRODUCT_PURCHASE_SEQ)
) ;

-- サブメニューマスタ
--* RestoreFromTempTable
create table SUB_MENU_MST (
  SUB_MENU_SEQ bigserial not null
  , SUB_MENU_CODE varchar(30) not null
  , MENU_SEQ bigint not null
  , SUB_MENU_ROLL varchar(10)
  , SUB_MENU_ORDER smallint not null
  , DELETED boolean default false not null
  , ENTER_DATE datetime not null
  , ENTER_USER varchar(50) not null
  , UPDATE_DATE datetime not null
  , UPDATE_USER varchar(50) not null
  , constraint SUB_MENU_MST_PKC primary key (SUB_MENU_SEQ)
) ;

-- メニューマスタ
--* RestoreFromTempTable
create table MENU_MST (
  MENU_SEQ bigserial not null
  , MENU_CODE varchar(10) not null
  , MENU_ORDER smallint not null
  , DELETED boolean default false not null
  , ENTER_DATE datetime not null
  , ENTER_USER varchar(50) not null
  , UPDATE_DATE datetime not null
  , UPDATE_USER varchar(50) not null
  , constraint MENU_MST_PKC primary key (MENU_SEQ)
) ;

alter table PRODUCT_PURCHASE_TBL
  add constraint PRODUCT_PURCHASE_TBL_FK1 foreign key (product_seq) references PRODUCT_MST(product_seq)
  on delete cascade;

alter table PRODUCT_STOCK_MST
  add constraint PRODUCT_STOCK_MST_FK1 foreign key (product_seq) references PRODUCT_MST(product_seq)
  on delete cascade;

alter table SUB_MENU_MST
  add constraint SUB_MENU_MST_FK1 foreign key (MENU_SEQ) references MENU_MST(MENU_SEQ)
  on delete cascade;

comment on table USER_MST is 'ユーザマスタ';
comment on column USER_MST.USER_SEQ is 'ユーザ連番';
comment on column USER_MST.USER_ACCOUNT is 'ユーザアカウント';
comment on column USER_MST.USER_ENCODED_PASSWORD is 'ユーザパスワード';
comment on column USER_MST.USER_NAME is 'ユーザ名';
comment on column USER_MST.USER_LANG is '言語';
comment on column USER_MST.USER_TIMEZONE is 'タイムゾーン';
comment on column USER_MST.USER_SUB_MENU_ROLE is 'サブメニュー権限';
comment on column USER_MST.DELETED is '削除';
comment on column USER_MST.ENTER_DATE is '登録日';
comment on column USER_MST.ENTER_USER is '登録者';
comment on column USER_MST.UPDATE_DATE is '更新日';
comment on column USER_MST.UPDATE_USER is '更新者';

comment on table PRODUCT_MST is '商品マスタ';
comment on column PRODUCT_MST.PRODUCT_SEQ is '商品連番';
comment on column PRODUCT_MST.PRODUCT_CODE is '商品コード';
comment on column PRODUCT_MST.PRODUCT_NAME is '商品名';
comment on column PRODUCT_MST.PRODUCT_GENRE is 'ジャンル';
comment on column PRODUCT_MST.PRODUCT_SIZE_STANDARD is 'サイズ・規格';
comment on column PRODUCT_MST.PRODUCT_COLOR is '色';
comment on column PRODUCT_MST.PRODUCT_UNIT_PRICE is '単価';
comment on column PRODUCT_MST.END_OF_SALE is '販売終了';
comment on column PRODUCT_MST.END_OF_SALE_DATE is '販売終了日';
comment on column PRODUCT_MST.DELETED is '削除';
comment on column PRODUCT_MST.ENTER_DATE is '登録日';
comment on column PRODUCT_MST.ENTER_USER is '登録者';
comment on column PRODUCT_MST.UPDATE_DATE is '更新日';
comment on column PRODUCT_MST.UPDATE_USER is '更新者';

comment on table PRODUCT_STOCK_MST is '商品在庫マスタ';
comment on column PRODUCT_STOCK_MST.PRODUCT_STOCK_SEQ is '商品在庫連番';
comment on column PRODUCT_STOCK_MST.PRODUCT_SEQ is '商品連番';
comment on column PRODUCT_STOCK_MST.PRODUCT_STOCK_QUANTITY is '商品在庫数';
comment on column PRODUCT_STOCK_MST.DELETED is '削除';
comment on column PRODUCT_STOCK_MST.ENTER_DATE is '登録日';
comment on column PRODUCT_STOCK_MST.ENTER_USER is '登録者';
comment on column PRODUCT_STOCK_MST.UPDATE_DATE is '更新日';
comment on column PRODUCT_STOCK_MST.UPDATE_USER is '更新者';

comment on table PRODUCT_PURCHASE_TBL is '商品購入テーブル';
comment on column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_SEQ is '商品購入連番';
comment on column PRODUCT_PURCHASE_TBL.PRODUCT_SEQ is '商品連番';
comment on column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_NAME is '商品購入者';
comment on column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_UNIT_PRICE is '商品単価';
comment on column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_QUANTITY is '商品購入数';
comment on column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_AMOUNT is '商品購入価格';
comment on column PRODUCT_PURCHASE_TBL.DELETED is '削除';
comment on column PRODUCT_PURCHASE_TBL.ENTER_DATE is '登録日';
comment on column PRODUCT_PURCHASE_TBL.ENTER_USER is '登録者';
comment on column PRODUCT_PURCHASE_TBL.UPDATE_DATE is '更新日';
comment on column PRODUCT_PURCHASE_TBL.UPDATE_USER is '更新者';

comment on table SUB_MENU_MST is 'サブメニューマスタ';
comment on column SUB_MENU_MST.SUB_MENU_SEQ is 'サブメニュー連番';
comment on column SUB_MENU_MST.SUB_MENU_CODE is 'サブメニューコード';
comment on column SUB_MENU_MST.MENU_SEQ is 'メニュー連番';
comment on column SUB_MENU_MST.SUB_MENU_ROLL is 'サブメニュー権限';
comment on column SUB_MENU_MST.SUB_MENU_ORDER is 'サブメニュー並び順';
comment on column SUB_MENU_MST.DELETED is '削除';
comment on column SUB_MENU_MST.ENTER_DATE is '登録日';
comment on column SUB_MENU_MST.ENTER_USER is '登録者';
comment on column SUB_MENU_MST.UPDATE_DATE is '更新日';
comment on column SUB_MENU_MST.UPDATE_USER is '更新者';

comment on table MENU_MST is 'メニューマスタ';
comment on column MENU_MST.MENU_SEQ is 'メニュー連番';
comment on column MENU_MST.MENU_CODE is 'メニューコード';
comment on column MENU_MST.MENU_ORDER is 'メニュー並び順';
comment on column MENU_MST.DELETED is '削除';
comment on column MENU_MST.ENTER_DATE is '登録日';
comment on column MENU_MST.ENTER_USER is '登録者';
comment on column MENU_MST.UPDATE_DATE is '更新日';
comment on column MENU_MST.UPDATE_USER is '更新者';
