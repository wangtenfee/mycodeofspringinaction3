create database myweibo;

create table spitter(
	id int not null AUTO_INCREMENT,
	username varchar(20) not null unique,
	password varchar(20) not null,
	fullname varchar(40),
	primary key(id)
);

create table spittle(
	id int not null auto_increment,
	userid int not null,
	createtime timestamp not null default CURRENT_TIMESTAMP,
	lastmodifytime timestamp not null default CURRENT_TIMESTAMP,
	primary key(id)
);