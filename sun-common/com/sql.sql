create table SYS_USER (
id number primary key,
username varchar2(15),
allname varchar2(15),
password varchar2(30),
phone varchar2(15),
birthday date,
status varchar2(1),
create_time date,
update_time date
);
CREATE SEQUENCE SEQ_SYS_USER start with 1 increment  by 1 ;

select * from  sys_user