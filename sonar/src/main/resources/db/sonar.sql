--违规代码信息表
--drop table illegal_code_info;
create table illegal_code_info
(
   illegal_id           number(8)                      null,
   code_time            varchar2(20)                   null,
   developer            varchar2(20)                   null,
   project              varchar2(20)                   null,
   modular              varchar2(20)                   null,
   code_url             varchar2(200)                  null,
   code_line            number(5)                      null,
   illegal_level        varchar2(15)                   null,
   rule_name            varchar2(2000)                 null,
   illegal_description  varchar2(2000)                 null,
   revising_suggestions1 varchar2(4000)                 null,
   revising_suggestions2 varchar2(4000)                 null,
   revising_suggestions3 varchar2(4000)                 null,
   illegal_label        varchar2(1000)                 null,
   create_time          date                           null,
   batch_number         number(8)                      null,
   state                number(1)                      null,
   bug_serial           varchar2(50)                   null
);
--主键
alter table illegal_code_info add constraint PK_illegal_id primary key (illegal_id);
alter table work.illegal_code_info add modify_developer     varchar2(20);
alter table work.illegal_code_info add modify_time          date;
alter table work.illegal_code_info add remark               varchar2(200);
alter table work.illegal_code_info add modify_state               varchar2(20);
--索引
create index IDX_ILLEGAL_CODE_INFO_DEV on illegal_code_info (developer);
--序列
--drop sequence ILLEGAL_CODE_INFO$SEQ;
create sequence ILLEGAL_CODE_INFO$SEQ
minvalue 10000000
maxvalue 99999999
start with 10000000
increment by 1
cache 10;

--批次
create table illegal_batch_info
(
   batch_number         number(8)                      null,
   BLOCKER              number(8)                      null,
   CRITICAL             number(8)                      null,
   MAJOR                number(8)                      null,
   MINOR                number(8)                      null,
   INFO                 number(8)                      null,
   create_date          date                       null,
   state                number(1)                      null
);
--主键
alter table illegal_batch_info add constraint PK_batch_number primary key (batch_number);
alter table illegal_batch_info add has_modify           number(8);
alter table illegal_batch_info add surplus              number(8);
--序列
create sequence ILLEGAL_BATCH_INFO$SEQ
minvalue 10000000
maxvalue 99999999
start with 10000000
increment by 1
cache 1;
--开发人员违规信息
create table developer_illegal_info
(
   developer            varchar2(20)                   null,
   BLOCKER              number(8)                      null,
   CRITICAL             number(8)                      null,
   MAJOR                number(8)                      null,
   MINOR                number(8)                      null,
   INFO                 number(8)                      null,
   create_date          date                       null,
   batch_number         number(8)                      null,
   state                number(1)                      null
);
alter table developer_illegal_info add has_modify           number(8);
alter table developer_illegal_info add surplus              number(8);

--雇员表
create table sonar_employee
(
   developer            varchar2(20)                   null,
   password             varchar2(20)                   null,
   superior_leadership  varchar2(20)                   null,
   import_flag          varchar(1)                     null,
   state                number(1)                      null,
   superadministrator_flag varchar(1)                     null
);
