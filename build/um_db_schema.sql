drop table if exists N_ROLE;
drop table if exists N_USER;
create table N_ROLE (USER_ID varchar(32) not null, USER_NAME varchar(50), USER_DESC longtext, primary key (USER_ID));
create table N_USER (USER_ID varchar(32) not null, USER_NAME varchar(50), USER_AGE integer, USER_SEX char(1), USER_HEIGHT float, USER_WEIGHT float, USER_DESC longtext, primary key (USER_ID));
