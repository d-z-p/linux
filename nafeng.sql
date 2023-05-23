/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.1.73 : Database - nafeng
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`nafeng` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `nafeng`;

/*Table structure for table `trade` */

DROP TABLE IF EXISTS `trade`;

CREATE TABLE `trade` (
  `tradeid` int(11) NOT NULL AUTO_INCREMENT,
  `tradename` varchar(100) DEFAULT NULL,
  `tradeprice` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tradeid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `trade` */

insert  into `trade`(`tradeid`,`tradename`,`tradeprice`) values (2,'紫金苑A栋102','002'),(3,'紫金苑A栋103','003'),(5,'紫金苑A栋104','004是贵'),(6,'',''),(7,'gj','发给'),(8,'gj','i'),(9,'gj',''),(10,'gj','LJL'),(11,'gj','BLACK'),(13,'',''),(14,'造成','2'),(15,'造成','2'),(16,'造成','2'),(17,'大阿斯顿','tyj'),(18,'是大法官','倒萨'),(19,'好困','好困'),(20,'挖到','阿大'),(21,'',''),(22,'阿大','阿大'),(24,'自行车在','造成'),(25,'阿打算','啊大大'),(26,'1111','55'),(27,'阿打算','啊大大'),(28,'阿打算','啊大大'),(29,'阿打算','啊大大'),(30,'阿打算','啊大大'),(31,'阿打算','啊大大'),(32,'阿打算','啊大大'),(33,'阿打算','啊大大'),(34,'出来了','哈哈哈'),(35,'出来了','哈哈哈'),(36,'',''),(37,'',''),(38,'',''),(39,'ad','ad'),(40,'dw','dq'),(41,'',''),(42,'',''),(43,'',''),(44,'',''),(45,'','');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) DEFAULT NULL,
  `user_pwd` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_name`,`user_pwd`) values (1,'xiaoniucr','1'),(2,'zhangsan','1'),(3,'lisi','1'),(4,'wangwu','1'),(5,'1','1'),(6,'ad阿大','ad');

/*Table structure for table `websites` */

DROP TABLE IF EXISTS `websites`;

CREATE TABLE `websites` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(20) NOT NULL DEFAULT '' COMMENT '站点名称',
  `url` varchar(255) NOT NULL DEFAULT '',
  `alexa` int(11) NOT NULL DEFAULT '0' COMMENT 'Alexa 排名',
  `country` char(10) NOT NULL DEFAULT '' COMMENT '国家',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `websites` */

insert  into `websites`(`id`,`name`,`url`,`alexa`,`country`) values (1,'Google','https://www.google.cm/',1,'USA'),(2,'淘宝','https://www.taobao.com/',13,'CN'),(3,'runoops自学教程','http://www.runoops.com',5865,''),(4,'微博','http://weibo.com/',20,'CN'),(5,'Facebook','https://www.facebook.com/',3,'USA');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
