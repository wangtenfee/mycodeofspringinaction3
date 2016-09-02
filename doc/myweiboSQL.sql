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
	lastmodifytime timestamp not null default CURRENT_TIMESTAMP,--这个建表语句在MYSQL5.5里是不可以的，MySQL 5.6.5以下的版本不能创建多个用CURRENT_TIMESTAMP修饰的列
	primary key(id)
);
--下面的语句用的触发器，与上个类似。
CREATE TABLE spittle (
	id int not null auto_increment,
	userid int not null,
	createtime timestamp not null default CURRENT_TIMESTAMP,
	lastmodifytime timestamp not null,
	primary key(id)
) ENGINE=InnoDB;
DROP TRIGGER IF EXISTS `update_spittle_trigger`;
DELIMITER // --将MYSQL语句结束符修改为//，一般在存储过程中用到
CREATE TRIGGER `update_spittle_trigger` BEFORE UPDATE ON `spittle`
 FOR EACH ROW SET NEW.`lastmodifytime` = NOW()
//
DELIMITER ; --改回默认的MYSQL语句结束符。
--修改为更规范的表名
alter table spittle rename t_spittle;
alter table spitter rename t_spitter;

--下面的SQL是从SIA3源代码里找到的
create table spitter (
  id identity,
  username varchar(25) not null,
  password varchar(25) not null,
  fullname varchar(100) not null,
  email varchar(50) not null,
  update_by_email boolean not null
);

create table spittle (
  id integer identity primary key,
  spitter_id integer not null,
  spittleText varchar(2000) not null,
  postedTime date not null,
  foreign key (spitter_id) references spitter(id)
);
--下面做一些修改,已执行 201609011118
drop table if exists t_spittle;
drop table if exists t_spitter;

create table t_spitter (
  id int not null auto_increment,
  username varchar(25) not null,
  password varchar(25) not null,
  fullname varchar(100) ,
  email varchar(50) not null,
  createtime timestamp not null default CURRENT_TIMESTAMP,
  update_by_email boolean ,
  primary key(id)
);

create table t_spittle (
  id int not null auto_increment,
  spitter_id integer not null,
  spittleText varchar(2000) not null,
  postedTime timestamp not null default CURRENT_TIMESTAMP,
  lastmodifytime timestamp not null,
  primary key(id)
);
--DELIMITER //  将MYSQL语句结束符修改为//，一般在存储过程中用到
DROP TRIGGER IF EXISTS `update_spittle_trigger`;
DELIMITER // 
CREATE TRIGGER `update_spittle_trigger` BEFORE UPDATE ON `t_spittle`
 FOR EACH ROW SET NEW.`lastmodifytime` = NOW()
//
DELIMITER ; 
--改回默认的MYSQL语句结束符。
insert into t_spitter (username, password, fullname, email, update_by_email) values ('habuma', 'password', 'Craig Walls', 'craig@habuma.com', false);
insert into t_spitter (username, password, fullname, email, update_by_email) values ('artnames', 'password', 'Art Names', 'artnames@habuma.com', false);

insert into t_spittle (spitter_id, spittleText, postedTime) values (1, 'Have you read Spring in Action 3? I hear it is awesome!', '2010-06-09');
insert into t_spittle (spitter_id, spittleText, postedTime) values (2, 'Trying out Spring''s new expression language.', '2010-06-11');
insert into t_spittle (spitter_id, spittleText, postedTime) values (1, 'Who''s going to SpringOne/2GX this year?', '2010-06-19');

ALTER TABLE t_spittle  modify lastmodifytime DATETIME;
--201609021508
alter table t_spittle add column  isdelete boolean not null default false;
alter table t_spittle drop column  lastmodifytime;

