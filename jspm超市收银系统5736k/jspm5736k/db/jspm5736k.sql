-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: jspm5736k
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `jspm5736k`
--

/*!40000 DROP DATABASE IF EXISTS `jspm5736k`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `jspm5736k` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `jspm5736k`;

--
-- Table structure for table `chaoshishangpin`
--

DROP TABLE IF EXISTS `chaoshishangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chaoshishangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinbianhao` varchar(200) NOT NULL COMMENT '商品编号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpinfenlei` varchar(200) DEFAULT NULL COMMENT '商品分类',
  `shangpintupian` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `shangpinjieshao` longtext COMMENT '商品介绍',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `shangpinjiage` int(11) NOT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shangpinbianhao` (`shangpinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='超市商品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chaoshishangpin`
--

LOCK TABLES `chaoshishangpin` WRITE;
/*!40000 ALTER TABLE `chaoshishangpin` DISABLE KEYS */;
INSERT INTO `chaoshishangpin` VALUES (21,'2022-08-01 06:15:59','1111111111','商品名称1','商品分类1','upload/chaoshishangpin_shangpintupian1.jpg','商品介绍1','品牌1',1),(22,'2022-08-01 06:15:59','2222222222','商品名称2','商品分类2','upload/chaoshishangpin_shangpintupian2.jpg','商品介绍2','品牌2',2),(23,'2022-08-01 06:15:59','3333333333','商品名称3','商品分类3','upload/chaoshishangpin_shangpintupian3.jpg','商品介绍3','品牌3',3),(24,'2022-08-01 06:15:59','4444444444','商品名称4','商品分类4','upload/chaoshishangpin_shangpintupian4.jpg','商品介绍4','品牌4',4),(25,'2022-08-01 06:15:59','5555555555','商品名称5','商品分类5','upload/chaoshishangpin_shangpintupian5.jpg','商品介绍5','品牌5',5),(26,'2022-08-01 06:15:59','6666666666','商品名称6','商品分类6','upload/chaoshishangpin_shangpintupian6.jpg','商品介绍6','品牌6',6);
/*!40000 ALTER TABLE `chaoshishangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shangpinfenlei`
--

DROP TABLE IF EXISTS `shangpinfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shangpinfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinfenlei` varchar(200) DEFAULT NULL COMMENT '商品分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='商品分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shangpinfenlei`
--

LOCK TABLES `shangpinfenlei` WRITE;
/*!40000 ALTER TABLE `shangpinfenlei` DISABLE KEYS */;
INSERT INTO `shangpinfenlei` VALUES (41,'2022-08-01 06:15:59','商品分类1'),(42,'2022-08-01 06:15:59','商品分类2'),(43,'2022-08-01 06:15:59','商品分类3'),(44,'2022-08-01 06:15:59','商品分类4'),(45,'2022-08-01 06:15:59','商品分类5'),(46,'2022-08-01 06:15:59','商品分类6');
/*!40000 ALTER TABLE `shangpinfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shouyinxinxi`
--

DROP TABLE IF EXISTS `shouyinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shouyinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shouyinbianhao` varchar(200) DEFAULT NULL COMMENT '收银编号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpinfenlei` varchar(200) DEFAULT NULL COMMENT '商品分类',
  `shouyinyuangonghao` varchar(200) DEFAULT NULL COMMENT '收银员工号',
  `shouyinyuanxingming` varchar(200) DEFAULT NULL COMMENT '收银员姓名',
  `shouyinshijian` datetime DEFAULT NULL COMMENT '收银时间',
  `shangpinjiage` float DEFAULT NULL COMMENT '商品价格',
  `goumaishuliang` float DEFAULT NULL COMMENT '购买数量',
  `zongjiage` float DEFAULT NULL COMMENT '总价格',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shouyinbianhao` (`shouyinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='收银信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shouyinxinxi`
--

LOCK TABLES `shouyinxinxi` WRITE;
/*!40000 ALTER TABLE `shouyinxinxi` DISABLE KEYS */;
INSERT INTO `shouyinxinxi` VALUES (31,'2022-08-01 06:15:59','1111111111','商品名称1','商品分类1','收银员工号1','收银员姓名1','2022-08-01 14:15:59',1,1,1),(32,'2022-08-01 06:15:59','2222222222','商品名称2','商品分类2','收银员工号2','收银员姓名2','2022-08-01 14:15:59',2,2,2),(33,'2022-08-01 06:15:59','3333333333','商品名称3','商品分类3','收银员工号3','收银员姓名3','2022-08-01 14:15:59',3,3,3),(34,'2022-08-01 06:15:59','4444444444','商品名称4','商品分类4','收银员工号4','收银员姓名4','2022-08-01 14:15:59',4,4,4),(35,'2022-08-01 06:15:59','5555555555','商品名称5','商品分类5','收银员工号5','收银员姓名5','2022-08-01 14:15:59',5,5,5),(36,'2022-08-01 06:15:59','6666666666','商品名称6','商品分类6','收银员工号6','收银员姓名6','2022-08-01 14:15:59',6,6,6);
/*!40000 ALTER TABLE `shouyinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shouyinyuan`
--

DROP TABLE IF EXISTS `shouyinyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shouyinyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shouyinyuangonghao` varchar(200) NOT NULL COMMENT '收银员工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `shouyinyuanxingming` varchar(200) DEFAULT NULL COMMENT '收银员姓名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `shouyinyuanshouji` varchar(200) DEFAULT NULL COMMENT '收银员手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shouyinyuangonghao` (`shouyinyuangonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='收银员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shouyinyuan`
--

LOCK TABLES `shouyinyuan` WRITE;
/*!40000 ALTER TABLE `shouyinyuan` DISABLE KEYS */;
INSERT INTO `shouyinyuan` VALUES (11,'2022-08-01 06:15:59','收银员工号1','123456','收银员姓名1','姓名1','年龄1','upload/shouyinyuan_zhaopian1.jpg','13823888881'),(12,'2022-08-01 06:15:59','收银员工号2','123456','收银员姓名2','姓名2','年龄2','upload/shouyinyuan_zhaopian2.jpg','13823888882'),(13,'2022-08-01 06:15:59','收银员工号3','123456','收银员姓名3','姓名3','年龄3','upload/shouyinyuan_zhaopian3.jpg','13823888883'),(14,'2022-08-01 06:15:59','收银员工号4','123456','收银员姓名4','姓名4','年龄4','upload/shouyinyuan_zhaopian4.jpg','13823888884'),(15,'2022-08-01 06:15:59','收银员工号5','123456','收银员姓名5','姓名5','年龄5','upload/shouyinyuan_zhaopian5.jpg','13823888885'),(16,'2022-08-01 06:15:59','收银员工号6','123456','收银员姓名6','姓名6','年龄6','upload/shouyinyuan_zhaopian6.jpg','13823888886');
/*!40000 ALTER TABLE `shouyinyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-08-01 06:15:59');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-01 14:19:34
