create database employdb;
use employdb;
create table EMP(Empid int not null,Empname varchar(20),age int);
select *from EMP;
insert into EMP(Empid,Empname,age)values(2,'din',23);
insert into EMP(Empid,Empname,age)values(3,'sahin',22);
update EMP set Empname='divin' where Empid=2;
update EMP set Empname='Sachin' where Empid=3;
insert into EMP values(4,'Sandeep',22);
select *from EMP;


