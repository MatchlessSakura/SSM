/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 5.7.27-log : Database - system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`system` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `system`;

/*Table structure for table `company` */

DROP TABLE IF EXISTS `company`;

CREATE TABLE `company` (
  `comid` int(10) NOT NULL,
  `comname` varchar(256) DEFAULT NULL,
  `compho` int(11) DEFAULT NULL,
  `comaddress` varchar(256) DEFAULT NULL,
  `cominfo` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`comid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `company` */

insert  into `company`(`comid`,`comname`,`compho`,`comaddress`,`cominfo`) values 
(1,'xxx旅行社',4561237,'xxx大学','这是一个旅行社，也只有一个旅行');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `customerid` int(10) NOT NULL AUTO_INCREMENT,
  `customername` varchar(256) DEFAULT NULL,
  `customersex` int(2) DEFAULT NULL,
  `customerage` int(2) DEFAULT NULL,
  `customerpho` int(11) DEFAULT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`customerid`,`customername`,`customersex`,`customerage`,`customerpho`) values 
(1,'方法',2,19,123),
(2,'小A',1,20,2562),
(3,'单独的',0,33,1234),
(28,'aaa',NULL,NULL,182),
(30,'胡xx',NULL,NULL,321654987),
(31,'马xx',NULL,NULL,987321654),
(32,'马x会',NULL,NULL,321456987),
(34,'聂x',NULL,NULL,1986251638),
(35,'lijl',NULL,NULL,123456798),
(36,'里斯',NULL,NULL,123456789),
(37,'李x',NULL,NULL,123465798);

/*Table structure for table `line` */

DROP TABLE IF EXISTS `line`;

CREATE TABLE `line` (
  `lineid` int(10) NOT NULL AUTO_INCREMENT,
  `lineap` varchar(256) DEFAULT NULL,
  `linebp` varchar(256) DEFAULT NULL,
  `lineday` int(3) DEFAULT NULL,
  PRIMARY KEY (`lineid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `line` */

insert  into `line`(`lineid`,`lineap`,`linebp`,`lineday`) values 
(1,'淄博','上海',2),
(2,'济南','淄博',4),
(6,'贵州','淄博',3),
(7,'淄博','贵州',2),
(8,'烟台','淄博',10),
(9,'淄博','烟台',4),
(10,'北京','上海',2),
(11,'上海','北京',1),
(12,'杭州','重庆',1),
(15,'新疆','上海',2),
(17,'淄博','新疆',3);

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staffid` int(10) NOT NULL AUTO_INCREMENT,
  `staffname` varchar(256) DEFAULT NULL,
  `staffsex` varchar(2) DEFAULT NULL,
  `staffage` int(2) DEFAULT NULL,
  `staffpho` int(11) DEFAULT NULL,
  PRIMARY KEY (`staffid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `staff` */

insert  into `staff`(`staffid`,`staffname`,`staffsex`,`staffage`,`staffpho`) values 
(1,'张三','男',21,12345612),
(3,'胡xx','男',21,123456789),
(4,'里斯','女',20,987654321),
(5,'王五','男',21,123456789);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userid` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(256) DEFAULT NULL,
  `userpassword` varchar(256) DEFAULT NULL,
  `usercon` int(2) DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `user` */

insert  into `user`(`userid`,`username`,`userpassword`,`usercon`) values 
(1,'admin','admin',1),
(2,'abc','abc',2),
(3,'123','1234',2),
(4,'1234','asdasd',2),
(13,'自行车','1234',2),
(17,'12345','4321',2),
(19,'132456','321654',2),
(23,'admin2','admin2',2),
(24,'admin2','admin2',1);

/*Table structure for table `work` */

DROP TABLE IF EXISTS `work`;

CREATE TABLE `work` (
  `workid` int(10) NOT NULL AUTO_INCREMENT,
  `workstatus` int(2) DEFAULT NULL,
  `workday` date DEFAULT NULL,
  `workmoney` int(11) DEFAULT NULL,
  `lnum` int(11) DEFAULT NULL,
  `cnum` int(11) DEFAULT NULL,
  `worktime` date DEFAULT NULL,
  PRIMARY KEY (`workid`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

/*Data for the table `work` */

insert  into `work`(`workid`,`workstatus`,`workday`,`workmoney`,`lnum`,`cnum`,`worktime`) values 
(2,1,'2021-07-16',500,3,2,'2021-07-23'),
(37,0,'2021-07-16',10,2,28,'2021-07-15'),
(38,0,'2021-08-20',200,6,30,'2021-08-07'),
(40,0,'2021-07-27',200,6,31,'2021-07-26'),
(41,0,'2021-07-20',200,6,35,'2021-07-15'),
(43,0,'2021-11-11',250,1,34,'2021-09-25'),
(44,0,'2021-07-20',200,6,35,'2021-07-15'),
(45,0,'2021-08-19',150,8,36,'2021-07-20'),
(46,0,'2021-09-10',200,1,37,'2021-08-25');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
