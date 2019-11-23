INSERT INTO USER_MST(USER_SEQ, USER_ACCOUNT, USER_ENCODED_PASSWORD, USER_NAME, USER_LOCALE, USER_TIMEZONE, USER_CURRENCY, USER_SUB_MENU_ROLE, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(1, 'user01', 'ce5f8d0c5790bf82e9b253d362feb51ba02853301ae24149b260bd30acb00f1b2a0d8b18bbff97a9' /*demo*/, 'テストユーザ０１', 'ja-JP', 'Asia/Tokyo', 'JPY', 'all', false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO USER_MST(USER_SEQ, USER_ACCOUNT, USER_ENCODED_PASSWORD, USER_NAME, USER_LOCALE, USER_TIMEZONE, USER_CURRENCY, USER_SUB_MENU_ROLE, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(2, 'user02', 'ce5f8d0c5790bf82e9b253d362feb51ba02853301ae24149b260bd30acb00f1b2a0d8b18bbff97a9' /*demo*/, 'TEST_USER02', 'en-us', 'America/Los_Angeles', 'USD', 'all', false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO USER_MST(USER_SEQ, USER_ACCOUNT, USER_ENCODED_PASSWORD, USER_NAME, USER_LOCALE, USER_TIMEZONE, USER_CURRENCY, USER_SUB_MENU_ROLE, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(3, 'user03', 'ce5f8d0c5790bf82e9b253d362feb51ba02853301ae24149b260bd30acb00f1b2a0d8b18bbff97a9' /*demo*/, 'テストユーザ０３', 'ja-JP', 'Asia/Tokyo', 'JPY', 'normal', false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');

INSERT INTO MENU_MST(MENU_SEQ, MENU_CODE, MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(1, 'purchase', 1, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO MENU_MST(MENU_SEQ, MENU_CODE, MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(2, 'product', 2, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO MENU_MST(MENU_SEQ, MENU_CODE, MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(3, 'stock', 3, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');

INSERT INTO SUB_MENU_MST(SUB_MENU_SEQ, SUB_MENU_CODE, MENU_SEQ, SUB_MENU_ROLL, SUB_MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(1, 'purchase-history-Listing', 1, 'all', 1, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO SUB_MENU_MST(SUB_MENU_SEQ, SUB_MENU_CODE, MENU_SEQ, SUB_MENU_ROLL, SUB_MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(2, 'dummy-purchasing', 1, 'all', 2, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO SUB_MENU_MST(SUB_MENU_SEQ, SUB_MENU_CODE, MENU_SEQ, SUB_MENU_ROLL, SUB_MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(3, 'product-listing', 2, 'all', 3, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO SUB_MENU_MST(SUB_MENU_SEQ, SUB_MENU_CODE, MENU_SEQ, SUB_MENU_ROLL, SUB_MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(4, 'stock-registering', 3, 'all', 4, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO SUB_MENU_MST(SUB_MENU_SEQ, SUB_MENU_CODE, MENU_SEQ, SUB_MENU_ROLL, SUB_MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(5, 'purchase-history-Listing', 1, 'normal', 1, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO SUB_MENU_MST(SUB_MENU_SEQ, SUB_MENU_CODE, MENU_SEQ, SUB_MENU_ROLL, SUB_MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(6, 'product-listing', 2, 'normal', 3, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');
INSERT INTO SUB_MENU_MST(SUB_MENU_SEQ, SUB_MENU_CODE, MENU_SEQ, SUB_MENU_ROLL, SUB_MENU_ORDER, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER)VALUES(7, 'stock-registering', 3, 'normal', 4, false, '2020-01-01 00:00:00.000', 'system', '2020-01-01 00:00:00.000', 'system');

INSERT INTO PUBLIC.PRODUCT_MST(PRODUCT_SEQ, PRODUCT_CODE, PRODUCT_NAME, PRODUCT_GENRE, PRODUCT_SIZE_STANDARD, PRODUCT_COLOR, PRODUCT_UNIT_PRICE, END_OF_SALE, END_OF_SALE_DATE, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER) VALUES(1, 'PRO0001', 'テスト商品A', '靴', '25,26,27,28cm', '黒', 5400, false, NULL, false, '2020-01-01 00:00:00.000', 'user01', '2020-01-01 00:00:00.000', 'user01');

INSERT INTO PUBLIC.PRODUCT_STOCK_MST(PRODUCT_STOCK_SEQ, PRODUCT_SEQ, PRODUCT_STOCK_QUANTITY, DELETED, ENTER_DATE, ENTER_USER, UPDATE_DATE, UPDATE_USER) VALUES (1, 1, 500, false, '2020-01-01 00:00:00.000', 'user01', '2020-01-01 00:00:00.000', 'user01');
