
create table work.devops_config_info (
config_id number(12),
dmp_id varchar2(40),
file_name varchar2(1000),
create_date DATE,
dmp_date DATE,
config_status number(2),
config_context varchar2(4000),
config_description varchar2(4000),
submitter varchar2(200)
);
alter table work.devops_config_info add constraint PK_CONFIG_ID primary key (config_id);
create index work.IDX_config_DMP_ID on work.devops_config_info (dmp_id);

create sequence work.DEVOPS_CONFIG_INFO_ID$SEQ
minvalue 100000000000
maxvalue 999999999999
start with 100000000000
increment by 1
cache 10;


