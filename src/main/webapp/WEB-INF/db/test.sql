/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50523
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2018-06-06 15:12:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `country`
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `cid` int(5) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO `country` VALUES ('1', 'USA');
INSERT INTO `country` VALUES ('2', 'England');

-- ----------------------------
-- Table structure for `fcourse`
-- ----------------------------
DROP TABLE IF EXISTS `fcourse`;
CREATE TABLE `fcourse` (
  `cid` int(5) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of fcourse
-- ----------------------------
INSERT INTO `fcourse` VALUES ('1', 'javaSE');
INSERT INTO `fcourse` VALUES ('2', 'javaEE');
INSERT INTO `fcourse` VALUES ('3', 'Android');

-- ----------------------------
-- Table structure for `fmiddle`
-- ----------------------------
DROP TABLE IF EXISTS `fmiddle`;
CREATE TABLE `fmiddle` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `fstudentId` int(5) DEFAULT NULL,
  `fcourseId` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of fmiddle
-- ----------------------------
INSERT INTO `fmiddle` VALUES ('1', '1', '1');
INSERT INTO `fmiddle` VALUES ('2', '1', '2');
INSERT INTO `fmiddle` VALUES ('3', '2', '1');
INSERT INTO `fmiddle` VALUES ('4', '2', '3');

-- ----------------------------
-- Table structure for `fstudent`
-- ----------------------------
DROP TABLE IF EXISTS `fstudent`;
CREATE TABLE `fstudent` (
  `sid` int(5) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of fstudent
-- ----------------------------
INSERT INTO `fstudent` VALUES ('1', 'dwc');
INSERT INTO `fstudent` VALUES ('2', 'dsk');
INSERT INTO `fstudent` VALUES ('3', 'gbr');

-- ----------------------------
-- Table structure for `minister`
-- ----------------------------
DROP TABLE IF EXISTS `minister`;
CREATE TABLE `minister` (
  `mid` int(5) NOT NULL AUTO_INCREMENT,
  `mname` varchar(20) DEFAULT NULL,
  `countryId` int(5) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of minister
-- ----------------------------
INSERT INTO `minister` VALUES ('1', 'aaa', '1');
INSERT INTO `minister` VALUES ('2', 'bbb', '1');
INSERT INTO `minister` VALUES ('3', 'ccc', '1');
INSERT INTO `minister` VALUES ('4', 'ddd', '2');
INSERT INTO `minister` VALUES ('5', 'eee', '2');

-- ----------------------------
-- Table structure for `newslabel`
-- ----------------------------
DROP TABLE IF EXISTS `newslabel`;
CREATE TABLE `newslabel` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pid` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of newslabel
-- ----------------------------
INSERT INTO `newslabel` VALUES ('1', '娱乐新闻', '0');
INSERT INTO `newslabel` VALUES ('2', '体育新闻', '0');
INSERT INTO `newslabel` VALUES ('3', 'NBA', '2');
INSERT INTO `newslabel` VALUES ('4', 'CBA', '2');
INSERT INTO `newslabel` VALUES ('5', '火箭', '3');
INSERT INTO `newslabel` VALUES ('6', '湖人', '3');
INSERT INTO `newslabel` VALUES ('7', '北京金瓯', '4');
INSERT INTO `newslabel` VALUES ('8', '浙江广厦', '4');
INSERT INTO `newslabel` VALUES ('9', '青岛双星', '4');
INSERT INTO `newslabel` VALUES ('10', '港台明星', '1');
INSERT INTO `newslabel` VALUES ('11', '内地影视', '1');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `score` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三', '18', '79');
INSERT INTO `student` VALUES ('2', '蔻飞', '20', '80');
INSERT INTO `student` VALUES ('3', 'c1k', '19', '89');
INSERT INTO `student` VALUES ('4', 'ck2', '22', '89');
INSERT INTO `student` VALUES ('5', 'c2k', '15', '89');
INSERT INTO `student` VALUES ('6', 'c3k', '22', '99');
INSERT INTO `student` VALUES ('7', 'c3k', '22', '89');
INSERT INTO `student` VALUES ('8', 'Asmery', '22', '89');
INSERT INTO `student` VALUES ('9', '古赛昆', '25', '99');
INSERT INTO `student` VALUES ('10', '杜蕾斯', '12', '55');
INSERT INTO `student` VALUES ('11', 'Acery', '22', '89');
INSERT INTO `student` VALUES ('12', 'Acery', '22', '89');
INSERT INTO `student` VALUES ('13', '戴维超', '20', '19');
