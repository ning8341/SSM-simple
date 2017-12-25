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



INSERT INTO student_t VALUES(1,'jack','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(2,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(3,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(4,'jack','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(5,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(6,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(7,'jack','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(8,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(9,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(10,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(11,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(12,'jack','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(13,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(14,'jack','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(15,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(16,'jack','jsd1508',18,'��',4);
INSERT INTO student_t VALUES(17,'jack','jsd1508',18,'��',4);
INSERT INTO student_t VALUES(18,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(19,'jack','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(20,'jack','jsd1508',18,'��',3);
INSERT INTO student_t VALUES(21,'½С��','jsd1508',18,'��',1)
INSERT INTO student_t VALUES(22,'������','jsd1508',18,'��',2),
INSERT INTO student_t VALUES(23,'�Ħ��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(24,'����','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(25,'����','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(26,'��չ��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(27,'��ܽ��','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(28,'�϶�','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(29,'�����','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(30,'��˹','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(31,'��ǹ','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(32,'����','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(33,'��������','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(34,'�ձ���','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(35,'��Ů','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(36,'��Ů','jsd1508',18,'��',4);
INSERT INTO student_t VALUES(37,'�ϲ�ͷ','jsd1508',18,'��',4);
INSERT INTO student_t VALUES(38,'ĪС��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(39,'��С��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(40,'ף��˫','jsd1508',18,'��',3);
INSERT INTO student_t VALUES(41,'½С��','jsd1508',18,'��',1)
INSERT INTO student_t VALUES(42,'������','jsd1508',18,'��',2),
INSERT INTO student_t VALUES(43,'�Ħ��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(44,'����','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(45,'����','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(46,'��չ��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(47,'��ܽ��','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(48,'�϶�','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(49,'�����','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(50,'��˹','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(51,'½С��','jsd1508',18,'��',1)
INSERT INTO student_t VALUES(52,'������','jsd1508',18,'��',2),
INSERT INTO student_t VALUES(53,'�Ħ��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(54,'����','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(55,'����','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(56,'��չ��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(57,'��ܽ��','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(58,'�϶�','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(59,'�����','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(60,'��˹','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(61,'��ǹ','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(62,'����','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(63,'��������','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(64,'�ձ���','jsd1508',18,'��',1);
INSERT INTO student_t VALUES(65,'��Ů','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(66,'��Ů','jsd1508',18,'��',4);
INSERT INTO student_t VALUES(67,'�ϲ�ͷ','jsd1508',18,'��',4);
INSERT INTO student_t VALUES(68,'ĪС��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(69,'��С��','jsd1508',18,'��',2);
INSERT INTO student_t VALUES(70,'ף��˫','jsd1508',18,'��',3);