/* db_fcme.transitExpenseDetail　交通費詳細情報
交通費詳細id
交通費id
支払開始日
支払終了日
出発区間
到着区間
通勤タイプ
単価
交通機関
備考
交通費詳細ステータス
作成者
作成日時
更新者
更新日時 */
create table db_fcme.transit_expense_detail(
id int(8) primary key auto_increment,
transit_expense_id int(8),
date_from date,
date_to date,
section_from varchar(20) not null,
section_to varchar(20) not null,
transit_mode tinyint(1) not null,
price decimal(6,0) not null,
commute_type char(3) not null,
comment varchar(200) not null default ' ',
status char(3) not null,
create_user char(8) not null,
create_time timestamp not null,
update_user char(8) not null,
update_time timestamp not null default '0000-00-00 00:00:00.000000' on update CURRENT_TIMESTAMP
);

/* db_fcme.transitExpense　交通費情報
交通費id
提出日
精算開始日
精算終了日
作成者
作成日時
更新者
更新日時 */
create table db_fcme.transit_expense(
id int(8) primary key auto_increment,
submit_date date,
settlement_date_from date,
settlement_date_to date,
status char(3) not null,
create_user char(8) not null,
create_time timestamp not null,
update_user char(8) not null,
update_time timestamp not null default '0000-00-00 00:00:00.000000' on update CURRENT_TIMESTAMP
);