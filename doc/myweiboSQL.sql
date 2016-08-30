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
