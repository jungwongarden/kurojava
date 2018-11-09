insert into member values ('100','100','100','100');
insert into member values ('200','200','200','200');
insert into member values ('300','300','300','300');
insert into member values ('400','400','400','400');
insert into member values ('500','500','500','500');
insert into member values ('600','600','600','600');
insert into member values ('700','700','700','700');
insert into member values ('800','800','800','800');

insert into member values (?,?,?,?);

insert into  member(id, pw, name, tel)  values ('999','999','999', '999');
insert into  member(id, pw, tel)  values ('888','888', '888');

select * from member; 

-- 이것은 설명(주석) 컨트롤+/: 자동 주석


insert into member values ('300','300','300','300');
insert into member values ('400','400','400','444');

create table test2(id varchar(20) primary key, pw varchar(20));
insert into test2 values ('100', '100');
insert into test2(pw) values('200') ;
desc test;


select * from member test2 where id <>'100';


create table test3(
	id varchar(20) primary key, 
	pw varchar(20) unique
);
--insert into test3 values ('200', '100'); -- 에러  unique.
insert into test3 values ('100', '100'); 
insert into test3 values ('200', '200'); 
insert into test3 values ('300', '300'); 

create table test4(
	id varchar(20),
	refId varchar(20),
	foreign key (refId) references test3(id) 
);

create table test5(
	id varchar(20),
	refId varchar(20),
	foreign key (refId) references test3(id) on delete cascade
);


insert into test5 values ('100', '100');
insert into test5 values ('200', '200');
insert into test5 values ('333', '300');
--delete from test3 where id = '200';
--delete from test5;

select * from test5;
select * from test3;

select test3.id, test5.id 
from test3, test5
where test3.id = test5.refId and test5.id = '333';


select  * --모든 컬럼 다 보기
from test3, test5
where test3.id = test5.refId and test5.id = '333' ;

create table test6(
	id int primary key auto_increment, 
	pw varchar(20) unique
);

insert into test6 values (null, '555');
insert into test6 values (null, '666');
insert into test6 values (null, '777');

select * from test6;
















