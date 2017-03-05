/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : eshopping

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-03-05 22:17:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `adminID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT '',
  `password` varchar(50) DEFAULT '',
  PRIMARY KEY (`adminID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `commodityID` int(11) NOT NULL AUTO_INCREMENT,
  `commodityName` varchar(50) DEFAULT '',
  `commodityClass` int(11) DEFAULT '0',
  `Manufacturer` varchar(50) DEFAULT '',
  `commodityPrice` decimal(8,2) DEFAULT '0.00',
  `fcPrice` decimal(8,2) DEFAULT '0.00',
  `commodityAmount` int(11) DEFAULT '0',
  `commodityLeaveNum` int(11) DEFAULT '0',
  `RegTime` datetime DEFAULT NULL,
  PRIMARY KEY (`commodityID`),
  KEY `FK_commodity_commodityClass` (`commodityClass`),
  CONSTRAINT `commodity_ibfk_1` FOREIGN KEY (`commodityClass`) REFERENCES `commodityclass` (`commodityClassID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('10', '先锋DS6119 ', '9', '先锋', '519.00', '269.00', '100', '100', '2009-11-15 10:37:24');
INSERT INTO `commodity` VALUES ('11', '美的空气加湿器', '9', '美的', '129.00', '89.00', '100', '100', '2009-11-15 10:39:01');
INSERT INTO `commodity` VALUES ('12', '美的电磁炉SN216D', '10', '美的', '399.00', '235.00', '50', '50', '2009-11-15 10:41:00');
INSERT INTO `commodity` VALUES ('13', '九阳豆浆机JYDZ-56W', '10', '九阳', '329.00', '199.00', '500', '500', '2009-11-15 10:42:27');
INSERT INTO `commodity` VALUES ('14', '飞利浦电动剃须刀', '11', '飞利浦', '99.00', '77.00', '150', '150', '2009-11-15 10:45:33');
INSERT INTO `commodity` VALUES ('15', '任我游GPS导航仪', '12', '任我游', '2280.00', '1450.00', '500', '500', '2009-11-15 10:47:58');
INSERT INTO `commodity` VALUES ('16', '华硕X85E66SE-SL笔记本电脑', null, '华硕', '5299.00', '4599.00', '50', '50', '2009-11-16 10:16:26');
INSERT INTO `commodity` VALUES ('17', '宏碁AS4736ZG-421G25MN笔记本电脑', null, '宏碁', '4999.00', '3599.00', '50', '50', '2009-11-16 10:17:50');
INSERT INTO `commodity` VALUES ('18', 'ThinkPad SL410（2842-5AC）笔记本电脑', null, 'ThinkPad', '5700.00', '5160.00', '100', '100', '2009-11-16 10:19:05');
INSERT INTO `commodity` VALUES ('19', 'test2', '11', null, null, null, null, null, null);
INSERT INTO `commodity` VALUES ('20', 'test3', '11', null, null, null, null, null, null);
INSERT INTO `commodity` VALUES ('21', 'test2', '11', null, null, null, null, null, null);
INSERT INTO `commodity` VALUES ('22', 'test2', '11', null, null, null, null, null, null);
INSERT INTO `commodity` VALUES ('44', '美的空气加湿器', '9', '美的', '129.00', '89.00', '100', '100', '2017-03-05 13:31:38');

-- ----------------------------
-- Table structure for commodityclass
-- ----------------------------
DROP TABLE IF EXISTS `commodityclass`;
CREATE TABLE `commodityclass` (
  `commodityClassID` int(11) NOT NULL AUTO_INCREMENT,
  `commodityClassName` varchar(50) DEFAULT '',
  PRIMARY KEY (`commodityClassID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodityclass
-- ----------------------------
INSERT INTO `commodityclass` VALUES ('1', 'test');
INSERT INTO `commodityclass` VALUES ('9', '生活电器');
INSERT INTO `commodityclass` VALUES ('10', '厨房电器');
INSERT INTO `commodityclass` VALUES ('11', '个人护理');
INSERT INTO `commodityclass` VALUES ('12', '汽车用品');
INSERT INTO `commodityclass` VALUES ('13', '手机通信');
INSERT INTO `commodityclass` VALUES ('14', '手机配件');
INSERT INTO `commodityclass` VALUES ('15', '数码影音');
INSERT INTO `commodityclass` VALUES ('18', '办公设备');

-- ----------------------------
-- Table structure for commoditydepict
-- ----------------------------
DROP TABLE IF EXISTS `commoditydepict`;
CREATE TABLE `commoditydepict` (
  `commodityID` int(11) NOT NULL,
  `commodityDepict` longtext NOT NULL,
  KEY `commodityID` (`commodityID`),
  CONSTRAINT `commoditydepict_ibfk_1` FOREIGN KEY (`commodityID`) REFERENCES `commodity` (`commodityID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commoditydepict
-- ----------------------------

-- ----------------------------
-- Table structure for commodityimage
-- ----------------------------
DROP TABLE IF EXISTS `commodityimage`;
CREATE TABLE `commodityimage` (
  `commodityID` int(11) NOT NULL,
  `image` mediumblob NOT NULL,
  KEY `commodityID` (`commodityID`),
  CONSTRAINT `commodityimage_ibfk_1` FOREIGN KEY (`commodityID`) REFERENCES `commodity` (`commodityID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodityimage
-- ----------------------------

-- ----------------------------
-- Table structure for orderform
-- ----------------------------
DROP TABLE IF EXISTS `orderform`;
CREATE TABLE `orderform` (
  `orderFormID` int(11) NOT NULL AUTO_INCREMENT,
  `orderFormNO` varchar(50) DEFAULT '',
  `userID` int(11) NOT NULL DEFAULT '0',
  `submitTime` datetime DEFAULT NULL,
  `consignmentTime` datetime DEFAULT NULL,
  `totalPrice` decimal(9,2) DEFAULT '0.00',
  `remark` varchar(50) DEFAULT '',
  `IPAddress` varchar(50) DEFAULT '',
  `isPayoff` int(11) DEFAULT '0',
  `isConsignment` int(11) DEFAULT '0',
  PRIMARY KEY (`orderFormID`),
  KEY `FK_orderForm_users` (`userID`),
  CONSTRAINT `FK_orderForm_users` FOREIGN KEY (`userID`) REFERENCES `users` (`userID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderform
-- ----------------------------
INSERT INTO `orderform` VALUES ('1', '11', '1', '2008-01-02 17:08:00', '2008-01-03 00:00:00', '1.00', '1', '1', '0', '1');

-- ----------------------------
-- Table structure for orderlist
-- ----------------------------
DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist` (
  `orderListID` int(11) NOT NULL AUTO_INCREMENT,
  `orderFormID` int(11) DEFAULT '0',
  `commodityID` int(11) DEFAULT '0',
  `amount` int(11) DEFAULT '0',
  PRIMARY KEY (`orderListID`),
  KEY `FK_orderList_orderForm` (`orderFormID`),
  KEY `FK_orderList_commodity` (`commodityID`),
  CONSTRAINT `FK_orderList_commodity` FOREIGN KEY (`commodityID`) REFERENCES `commodity` (`commodityID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_orderList_orderForm` FOREIGN KEY (`orderFormID`) REFERENCES `orderform` (`orderFormID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderlist
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT '',
  `password` varchar(50) DEFAULT '',
  `name` varchar(50) DEFAULT '',
  `sex` tinyint(1) DEFAULT '0',
  `address` varchar(50) DEFAULT '',
  `phone` varchar(50) DEFAULT '',
  `post` varchar(50) DEFAULT '',
  `email` varchar(50) DEFAULT '',
  `regTime` datetime DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'lifengxing', 'l3', 'l2', null, 'yangz hou', null, null, null, null);
INSERT INTO `users` VALUES ('2', 'test', '1122', 'lifengxing', null, null, null, null, null, null);
