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
	lastmodifytime timestamp not null default CURRENT_TIMESTAMP,--������������MYSQL5.5���ǲ����Եģ�MySQL 5.6.5���µİ汾���ܴ��������CURRENT_TIMESTAMP���ε���
	primary key(id)
);
--���������õĴ����������ϸ����ơ�
CREATE TABLE spittle (
	id int not null auto_increment,
	userid int not null,
	createtime timestamp not null default CURRENT_TIMESTAMP,
	lastmodifytime timestamp not null,
	primary key(id)
) ENGINE=InnoDB;
DROP TRIGGER IF EXISTS `update_spittle_trigger`;
DELIMITER // --��MYSQL���������޸�Ϊ//��һ���ڴ洢�������õ�
CREATE TRIGGER `update_spittle_trigger` BEFORE UPDATE ON `spittle`
 FOR EACH ROW SET NEW.`lastmodifytime` = NOW()
//
DELIMITER ; --�Ļ�Ĭ�ϵ�MYSQL����������
--�޸�Ϊ���淶�ı���
alter table spittle rename t_spittle;
alter table spitter rename t_spitter;
