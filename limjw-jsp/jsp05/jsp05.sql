select * from member;
select * from bbs;

create table bbs (
	id varchar(10) not null,
	title varchar(20) not null,
	content varchar(50),
	user varchar(10)
);

desc bbs;

