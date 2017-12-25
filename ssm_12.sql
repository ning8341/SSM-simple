CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm_12` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm_12`;

DROP TABLE IF EXISTS `student_t`;
CREATE TABLE `student_t` (
  `id` int(50) NOT NULL,
  `name` varchar(20) NOT NULL,
  `class_name` varchar(20) NOT NULL,
  `age` int(20) NOT NULL,
  `sex` varchar(20) NOT NULL,
  `teacher_id` int(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(40) NOT NULL,
  `phoneNumber` int(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

DROP TABLE IF EXISTS `img_t`;
CREATE TABLE `img_t` (
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `imgData` blob,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci



INSERT INTO student_t VALUES(1,'jack','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(2,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(3,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(4,'jack','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(5,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(6,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(7,'jack','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(8,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(9,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(10,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(11,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(12,'jack','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(13,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(14,'jack','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(15,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(16,'jack','jsd1508',18,'ÄÐ',4);
INSERT INTO student_t VALUES(17,'jack','jsd1508',18,'ÄÐ',4);
INSERT INTO student_t VALUES(18,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(19,'jack','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(20,'jack','jsd1508',18,'ÄÐ',3);
INSERT INTO student_t VALUES(21,'Â½Ð¡·ï','jsd1508',18,'ÄÐ',1)
INSERT INTO student_t VALUES(22,'ÕÅÈý·á','jsd1508',18,'ÄÐ',2),
INSERT INTO student_t VALUES(23,'ð¯Ä¦ÖÇ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(24,'ÊÞÍõ','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(25,'¸«Íõ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(26,'°×Õ¹ÌÃ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(27,'¹ùÜ½ÈØ','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(28,'ÀÏ¶­','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(29,'Àî´ó×ì','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(30,'ÖæË¹','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(31,'»ðÇ¹','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(32,'ÃÍáï','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(33,'°ëÈËÃÍáï','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(34,'¸Õ±³ÊÞ','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(35,'±ùÅ®','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(36,'»ðÅ®','jsd1508',18,'ÄÐ',4);
INSERT INTO student_t VALUES(37,'ÐÏ²¶Í·','jsd1508',18,'ÄÐ',4);
INSERT INTO student_t VALUES(38,'ÄªÐ¡±´','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(39,'ÑàÐ¡Áù','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(40,'×£ÎÞË«','jsd1508',18,'ÄÐ',3);
INSERT INTO student_t VALUES(41,'Â½Ð¡·ï','jsd1508',18,'ÄÐ',1)
INSERT INTO student_t VALUES(42,'ÕÅÈý·á','jsd1508',18,'ÄÐ',2),
INSERT INTO student_t VALUES(43,'ð¯Ä¦ÖÇ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(44,'ÊÞÍõ','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(45,'¸«Íõ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(46,'°×Õ¹ÌÃ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(47,'¹ùÜ½ÈØ','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(48,'ÀÏ¶­','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(49,'Àî´ó×ì','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(50,'ÖæË¹','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(51,'Â½Ð¡·ï','jsd1508',18,'ÄÐ',1)
INSERT INTO student_t VALUES(52,'ÕÅÈý·á','jsd1508',18,'ÄÐ',2),
INSERT INTO student_t VALUES(53,'ð¯Ä¦ÖÇ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(54,'ÊÞÍõ','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(55,'¸«Íõ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(56,'°×Õ¹ÌÃ','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(57,'¹ùÜ½ÈØ','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(58,'ÀÏ¶­','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(59,'Àî´ó×ì','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(60,'ÖæË¹','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(61,'»ðÇ¹','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(62,'ÃÍáï','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(63,'°ëÈËÃÍáï','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(64,'¸Õ±³ÊÞ','jsd1508',18,'ÄÐ',1);
INSERT INTO student_t VALUES(65,'±ùÅ®','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(66,'»ðÅ®','jsd1508',18,'ÄÐ',4);
INSERT INTO student_t VALUES(67,'ÐÏ²¶Í·','jsd1508',18,'ÄÐ',4);
INSERT INTO student_t VALUES(68,'ÄªÐ¡±´','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(69,'ÑàÐ¡Áù','jsd1508',18,'ÄÐ',2);
INSERT INTO student_t VALUES(70,'×£ÎÞË«','jsd1508',18,'ÄÐ',3);