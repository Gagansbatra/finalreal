-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.33-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema attendance
--

CREATE DATABASE IF NOT EXISTS attendance;
USE attendance;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminid` int(10) unsigned NOT NULL,
  `adminname` varchar(45) NOT NULL,
  `adminpwd` varchar(45) NOT NULL,
  `photograph` varchar(200) NOT NULL,
  PRIMARY KEY  (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`adminid`,`adminname`,`adminpwd`,`photograph`) VALUES 
 (1,'prachi','123',''),
 (2,'gautam','123','');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `attendancedetails`
--

DROP TABLE IF EXISTS `attendancedetails`;
CREATE TABLE `attendancedetails` (
  `transactionid` int(20) unsigned NOT NULL auto_increment,
  `facultyid` varchar(45) NOT NULL,
  `enrollmentno` varchar(45) NOT NULL,
  `branchid` varchar(45) NOT NULL,
  `semester` varchar(45) NOT NULL,
  `subject` varchar(45) NOT NULL,
  `currentdate` date NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY  (`transactionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendancedetails`
--

/*!40000 ALTER TABLE `attendancedetails` DISABLE KEYS */;
INSERT INTO `attendancedetails` (`transactionid`,`facultyid`,`enrollmentno`,`branchid`,`semester`,`subject`,`currentdate`,`status`) VALUES 
 (61,'0905f100','0905cs131034','1','6th','cs4','2016-04-12','Present'),
 (62,'0905f100','0905cs131034','1','6th','cs4','2016-04-12','Present'),
 (63,'0905f100','0905cs131034','1','6th','cs4','2016-04-12','Present'),
 (64,'0905f100','0905cs131102','1','6th','cs4','2016-04-12','Present'),
 (65,'0905f100','0905cs131102','1','6th','cs4','2016-04-12','Present'),
 (66,'0905f100','0905cs131102','1','6th','cs4','2016-04-12','Present'),
 (67,'0905f100','0905cs131234','1','6th','cs4','2016-04-12','Present'),
 (68,'0905f100','0905cs131234','1','6th','cs4','2016-04-12','Present'),
 (69,'0905f100','0905cs131234','1','6th','cs4','2016-04-12','Present'),
 (70,'0905f100','0905cs131234','1','6th','cs4','2016-04-12','Present'),
 (71,'0905f100','0905cs131102','1','6th','cs4','2016-04-12','Present'),
 (72,'0905f100','0905cs131102','1','6th','cs4','2016-04-12','Present'),
 (73,'0905f100','0905cs131102','1','6th','cs4','2016-04-12','Present'),
 (74,'0905f100','0905cs13234','1','6th','cs4','2016-04-12','Present'),
 (75,'0905f100','0905cs131034','1','6th','cs3','2016-04-12','Present'),
 (76,'0905f100','0905cs131234','1','6th','cs3','2016-04-12','Present'),
 (77,'0905f100','0905cs131102','1','6th','cs3','2016-04-12','Present'),
 (78,'0905f100','0905cs131102','1','6th','CS6','2016-04-12','Present'),
 (79,'0905f100','0905cs131102','1','6th','CS6','2016-04-12','Present'),
 (80,'0905f100','0905cs131102','1','6th','CS6','2016-04-12','Present'),
 (81,'0905f100','0905cs131102','1','6th','CS6','2016-04-12','Present'),
 (82,'0905f100','0905cs131102','1','6th','CS6','2016-04-12','Present'),
 (83,'0905f100','0905cs131034','1','6th','cs1','2016-04-12','Present'),
 (84,'0905f100','0905cs131034','1','6th','cs1','2016-04-12','Present'),
 (85,'0905f100','0905cs131102','1','6th','cs1','2016-04-12','Present'),
 (86,'0905f100','0905cs131102','1','6th','cs1','2016-04-12','Present'),
 (87,'0905f100','0905cs131034','1','6th','cs1','2016-04-12','Present'),
 (88,'0905f100','0905cs131102','1','6th','cs1','2016-04-12','Present'),
 (89,'0905f100','0905cs131234','1','6th','cs1','2016-04-12','Present'),
 (90,'0905f100','0905cs13234','1','6th','cs1','2016-04-12','Present'),
 (91,'0905f100','0905CS234','1','6th','cs1','2016-05-12','Present'),
 (92,'0905f100','0905cs131034','1','6th','cs1','2016-04-12','Present'),
 (93,'0905f100','0905cs131102','1','6th','cs1','2016-04-12','Present'),
 (94,'0905f100','0905cs131102','1','6th','cs1','2016-04-12','Present'),
 (95,'0905f100','0905cs131102','1','6th','cs1','2016-04-12','Present'),
 (96,'0905f100','0905cs131102','1','6th','cs1','2016-04-12','Present'),
 (97,'0905f100','0905cs131102','1','6th','cs1','2016-04-12','Present'),
 (98,'0905f100','0905cs131102','1','6th','cs1','2016-04-14','Present'),
 (99,'0905f100','0905cs1232','1','6th','601','2016-04-26','Present'),
 (100,'0905f100','0905cs1232','1','6th','602','2016-04-26','Present'),
 (101,'0905f100','0905cs1232','1','6th','603','2016-04-26','Present'),
 (102,'0905f103','0905cs1232','1','6th','601','2016-04-26','Present'),
 (103,'0905f103','0905cs1234','1','6th','601','2016-04-26','Present'),
 (104,'0905f103','0905cs131102','1','6th','601','2016-04-26','Present'),
 (105,'0905f103','0905cs131100','1','6th','601','2016-04-26','Present'),
 (106,'0905f103','0905cs1232','1','6th','602','2016-04-26','Present'),
 (107,'0905f103','0905cs1232','1','6th','602','2016-04-26','Present'),
 (108,'0905f103','0905cs1232','1','6th','603','2016-04-26','Present'),
 (109,'0905f103','0905cs1232','1','6th','602','2016-04-26','Present'),
 (110,'0905f103','0905cs1234','1','6th','602','2016-04-26','Present');
/*!40000 ALTER TABLE `attendancedetails` ENABLE KEYS */;


--
-- Definition of table `branchdata`
--

DROP TABLE IF EXISTS `branchdata`;
CREATE TABLE `branchdata` (
  `BranchID` varchar(45) NOT NULL,
  `BranchName` varchar(150) NOT NULL,
  PRIMARY KEY  (`BranchID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branchdata`
--

/*!40000 ALTER TABLE `branchdata` DISABLE KEYS */;
INSERT INTO `branchdata` (`BranchID`,`BranchName`) VALUES 
 ('1','Computer Science Engineering'),
 ('2','Electronics and Communication'),
 ('3','Civil Engineering'),
 ('4','Mechanical Engineering'),
 ('5','Information Technology'),
 ('6','Electronics and Instrumentation Engineering'),
 ('7','Chemical Engineering');
/*!40000 ALTER TABLE `branchdata` ENABLE KEYS */;


--
-- Definition of table `city`
--

DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `stateid` varchar(45) NOT NULL,
  `cityid` varchar(45) NOT NULL,
  `cityname` varchar(45) NOT NULL,
  PRIMARY KEY  (`cityid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `city`
--

/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` (`stateid`,`cityid`,`cityname`) VALUES 
 ('100','1001','Gwalior'),
 ('100','1002','Bhopal'),
 ('100','1003','Indore'),
 ('101','1011','Mathura'),
 ('101','1012','Agra'),
 ('101','1013','Lucknow'),
 ('102','1021','Nasik'),
 ('102','1022','Mumbai'),
 ('102','1023','Pune '),
 ('200','2001','Turbat'),
 ('200','2002','chaman'),
 ('200','2003','Hub'),
 ('201','2011','Islamkot'),
 ('201','2012','karachi'),
 ('201','2013','Shahdadpur'),
 ('202','2021','Lahore'),
 ('202','2022','jhelum'),
 ('202','2023','Sialkot');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;


--
-- Definition of table `country`
--

DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `countryid` varchar(45) NOT NULL,
  `countryname` varchar(45) NOT NULL,
  PRIMARY KEY  (`countryid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `country`
--

/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` (`countryid`,`countryname`) VALUES 
 ('1','india'),
 ('2','pakistan');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;


--
-- Definition of table `facultydata`
--

DROP TABLE IF EXISTS `facultydata`;
CREATE TABLE `facultydata` (
  `FacultyID` varchar(45) NOT NULL,
  `FacultyName` varchar(45) NOT NULL,
  `FacultyBirthDate` date NOT NULL,
  `FacultyGender` varchar(45) NOT NULL,
  `FacultyCNO` varchar(45) NOT NULL,
  `FacultyEmailID` varchar(45) NOT NULL,
  `FacultyBranch` varchar(45) character set latin1 collate latin1_bin NOT NULL,
  `FacultyDesignation` varchar(45) NOT NULL,
  `FacultyPhotograph` varchar(45) NOT NULL,
  `FacultyPassword` varchar(45) NOT NULL,
  `FacultyAddress` varchar(60) NOT NULL,
  `country` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  PRIMARY KEY  (`FacultyID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `facultydata`
--

/*!40000 ALTER TABLE `facultydata` DISABLE KEYS */;
INSERT INTO `facultydata` (`FacultyID`,`FacultyName`,`FacultyBirthDate`,`FacultyGender`,`FacultyCNO`,`FacultyEmailID`,`FacultyBranch`,`FacultyDesignation`,`FacultyPhotograph`,`FacultyPassword`,`FacultyAddress`,`country`,`state`,`city`) VALUES 
 ('0905f100','RajniKant','1980-02-01','Male','33333333333','Rajnikant@gmail.com',0x31,'HOD','20.jpg','123','south','1','100','1002'),
 ('0905f103','Amitabh Bacchan','1965-05-05','Male','38888888822','amitabh@gmail.com',0x31,'Proffessor','21.jpg','123','amitabh apartment','1','102','1022'),
 ('0905f1234','Siddarth Malj=hotra','1985-05-05','Male','38888888822','siddarth@gmail.com',0x31,'Proffessor','18.jpg','123','Siddarth Malhotra','1','102','1022');
/*!40000 ALTER TABLE `facultydata` ENABLE KEYS */;


--
-- Definition of table `facultysubject`
--

DROP TABLE IF EXISTS `facultysubject`;
CREATE TABLE `facultysubject` (
  `FacultyID` varchar(45) NOT NULL,
  `BranchID` varchar(45) NOT NULL,
  `Semester` varchar(45) NOT NULL,
  `SubjectID` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `facultysubject`
--

/*!40000 ALTER TABLE `facultysubject` DISABLE KEYS */;
INSERT INTO `facultysubject` (`FacultyID`,`BranchID`,`Semester`,`SubjectID`) VALUES 
 ('0905f100','1','6th','601'),
 ('0905f103','1','6th','603'),
 ('0905f103','1','6th','602'),
 ('0905f103','1','6th','601'),
 ('0905f1234','1','6th','601'),
 ('0905f1234','1','6th','602'),
 ('0905f1234','1','6th','603');
/*!40000 ALTER TABLE `facultysubject` ENABLE KEYS */;


--
-- Definition of table `marks`
--

DROP TABLE IF EXISTS `marks`;
CREATE TABLE `marks` (
  `studentid` varchar(45) NOT NULL,
  `subjectname` varchar(45) NOT NULL,
  `midterm1` varchar(45) NOT NULL,
  `midterm2` varchar(45) NOT NULL,
  `assignment1` varchar(45) NOT NULL,
  `assignment2` varchar(45) NOT NULL,
  `quiz1` varchar(45) NOT NULL,
  `quiz2` varchar(45) NOT NULL,
  `labquiz` varchar(45) NOT NULL,
  `classattendance` varchar(45) NOT NULL,
  `labattendance` varchar(45) NOT NULL,
  `internalviva` varchar(45) NOT NULL,
  `labperformance` varchar(45) NOT NULL,
  `total` varchar(45) NOT NULL,
  `subjectid` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`studentid`,`subjectid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` (`studentid`,`subjectname`,`midterm1`,`midterm2`,`assignment1`,`assignment2`,`quiz1`,`quiz2`,`labquiz`,`classattendance`,`labattendance`,`internalviva`,`labperformance`,`total`,`subjectid`) VALUES 
 ('0905cs1232','MicroProcessor','033','0','04','0','0','0','0','0','0','0','0','37','601'),
 ('0905cs1232','Principles','033','0','04','0','0','0','0','0','0','0','0','37','602'),
 ('0905cs1232','Software','0','04','04','0','0','0','0','0','0','0','0','8','603');
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;


--
-- Definition of table `report`
--

DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
  `branchid` varchar(45) NOT NULL,
  `semester` varchar(45) NOT NULL,
  `studentid` varchar(45) NOT NULL,
  PRIMARY KEY  (`branchid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `report`
--

/*!40000 ALTER TABLE `report` DISABLE KEYS */;
/*!40000 ALTER TABLE `report` ENABLE KEYS */;


--
-- Definition of table `reportbydate`
--

DROP TABLE IF EXISTS `reportbydate`;
CREATE TABLE `reportbydate` (
  `branchid` int(10) unsigned NOT NULL auto_increment,
  `semester` varchar(45) NOT NULL,
  `studentid` varchar(45) NOT NULL,
  `previousdate` date NOT NULL,
  `nextdate` date NOT NULL,
  PRIMARY KEY  (`branchid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reportbydate`
--

/*!40000 ALTER TABLE `reportbydate` DISABLE KEYS */;
/*!40000 ALTER TABLE `reportbydate` ENABLE KEYS */;


--
-- Definition of table `state`
--

DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `countryid` varchar(45) NOT NULL,
  `stateid` varchar(45) NOT NULL,
  `statename` varchar(100) NOT NULL,
  PRIMARY KEY  (`stateid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `state`
--

/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` (`countryid`,`stateid`,`statename`) VALUES 
 ('1','100','madhya pradesh'),
 ('1','101','uttar pradesh'),
 ('1','102','Maharshtra'),
 ('1','103','Andhra Pradesh'),
 ('1','104','Arunachal Pradesh'),
 ('1','105','Assam'),
 ('1','106','Bihar'),
 ('1','107','Chattisgarh'),
 ('1','108','Goa'),
 ('1','109','Gujarat'),
 ('1','110','Haryana'),
 ('1','111','Jammu & Kashmir'),
 ('1','112','Himachal Pradesh'),
 ('1','113','Jharkhand'),
 ('1','114','Karnataka'),
 ('1','115','Kerala'),
 ('1','116','Manipur'),
 ('1','117','Meghalaya'),
 ('1','118','Mizoram'),
 ('1','119','Nagaland'),
 ('1','120','Orissa'),
 ('1','121','Punjab'),
 ('1','122','Rajasthan'),
 ('1','123','Sikkim'),
 ('1','124','Tamil Nadu'),
 ('1','125','Telangana'),
 ('1','126','Tripura'),
 ('1','127','Uttarakhand'),
 ('1','128','West Bengal'),
 ('2','200','balochistan'),
 ('2','201','sindh'),
 ('2','202','Punjab');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;


--
-- Definition of table `studentdata`
--

DROP TABLE IF EXISTS `studentdata`;
CREATE TABLE `studentdata` (
  `enrollmentno` varchar(50) NOT NULL,
  `name` varchar(45) NOT NULL,
  `fathername` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `birthdate` datetime NOT NULL,
  `address` varchar(100) default NULL,
  `country` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `contactno` varchar(45) NOT NULL,
  `mobileno` varchar(45) NOT NULL,
  `stdemailid` varchar(45) NOT NULL,
  `fatheremailid` varchar(45) NOT NULL,
  `branch` varchar(45) NOT NULL,
  `sem` varchar(45) NOT NULL,
  `year` varchar(45) NOT NULL,
  `photograph` varchar(200) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`enrollmentno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentdata`
--

/*!40000 ALTER TABLE `studentdata` DISABLE KEYS */;
INSERT INTO `studentdata` (`enrollmentno`,`name`,`fathername`,`gender`,`birthdate`,`address`,`country`,`state`,`city`,`contactno`,`mobileno`,`stdemailid`,`fatheremailid`,`branch`,`sem`,`year`,`photograph`,`password`) VALUES 
 ('0905cs1232','Ranveer Singh','Akhil Singh','Male','1989-07-28 00:00:00','Prachi Apartment','1','102','1023','8305020989','8305020989','ranveer@gmail.com','akhil@gmail.com','1','6th','3rd','17.jpg','123'),
 ('0905cs1234','Arjun Kapoor','Boni Kapoor','Male','1989-05-05 00:00:00','Arjun Apartment','1','101','1013','38888888822','38888888822','arjun@gmail.com','boni@gmail.com','1','6th','3rd','25.jpg','123'),
 ('0905cs131001','Katrina Kaif','Saleem Kaif','Female','1985-05-16 00:00:00','Mrinal Apartment','2','201','2011','7392901849','4039382929','katrina@gmail.com','saleem@gmail.com','1','1st','3rd','1.jpg','123'),
 ('0905cs131100','Shraddha Kapoor','Shakti Kapoor','Female','1990-05-08 00:00:00','shakti Apartment','1','102','1022','720292022222','22222222222','shraddha@gmail.com','shakti@gmail.com','1','6th','3rd','12.jpg','123'),
 ('0905cs131102','Prachi Gautam','Lokesh Gautam','Female','1995-06-07 00:00:00','Suresh Nagar','1','100','1001','8905020989','9074576176','emailprachi786@gmail.com','lokeshgautam@gmail.com','1','6th','3rd','CYMERA_20151116_105437.jpg','123'),
 ('2121','Fawad Khan','Rasheel Khan','Male','1986-05-10 00:00:00','shaifudeen dargah','2','202','2021','8269584856','8269584856','fawadkhan123@gmail.com','rasheelkhan234@gmail.com','1','3rd','2nd','23.jpg','123');
/*!40000 ALTER TABLE `studentdata` ENABLE KEYS */;


--
-- Definition of table `subjectdata`
--

DROP TABLE IF EXISTS `subjectdata`;
CREATE TABLE `subjectdata` (
  `SubjectID` varchar(45) NOT NULL,
  `BranchID` varchar(45) NOT NULL,
  `SubjectName` varchar(45) NOT NULL,
  `Semester` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  PRIMARY KEY  (`SubjectID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjectdata`
--

/*!40000 ALTER TABLE `subjectdata` DISABLE KEYS */;
INSERT INTO `subjectdata` (`SubjectID`,`BranchID`,`SubjectName`,`Semester`,`Status`) VALUES 
 ('601','1','MicroProcessor','6th','theory'),
 ('602','1','Principles of Programming Lamguage','6th','theory'),
 ('603','1','Software Engineering','6th','theory');
/*!40000 ALTER TABLE `subjectdata` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
