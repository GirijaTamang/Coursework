-- MySQL dump 10.17  Distrib 10.3.15-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: hamrostore
-- ------------------------------------------------------
-- Server version	10.3.15-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author` (
  `authorid` varchar(5) NOT NULL,
  `firstname` varchar(15) NOT NULL,
  `lastname` varchar(15) NOT NULL,
  PRIMARY KEY (`authorid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES ('11NOT','Stephen','Covey'),('22DAL','Abraham','Lincoln'),('33MOC','Agatha','Christie'),('44LOC','Brother','Grimm'),('55MAC','J.R.R','Tolkien'),('66NOT','Napoleon','Hill');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `bookid` varchar(5) NOT NULL,
  `bookname` varchar(45) NOT NULL,
  `bookgenre` int(11) NOT NULL,
  `writerid` varchar(5) NOT NULL,
  PRIMARY KEY (`bookid`),
  KEY `bookgenre` (`bookgenre`),
  KEY `writerid` (`writerid`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`bookgenre`) REFERENCES `genre` (`genreid`),
  CONSTRAINT `book_ibfk_2` FOREIGN KEY (`writerid`) REFERENCES `author` (`authorid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('1111','The Hobbit',1,'55MAC'),('1122','Gettysburg Address',6,'22DAL'),('1133','And There Were None',2,'33MOC'),('1144','Rapunzel',3,'44LOC'),('1155','Think and Grow Rich',5,'66NOT'),('1166','The Lords of Rings',4,'55MAC'),('1177','THE 7 Habits Of Highly Effective People',5,'11NOT');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customerid` varchar(5) NOT NULL,
  `firstname` varchar(15) NOT NULL,
  `lastname` varchar(15) NOT NULL,
  `phoneno` varchar(10) NOT NULL,
  PRIMARY KEY (`customerid`),
  UNIQUE KEY `phoneno` (`phoneno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('CO1','Aayushi','Tamang','9811780224'),('CO2','Cezal','Gautam','9811780556'),('CO3','Arjun','Rai','9815112230'),('CO4','Ram','Thapa','9817716036'),('CO5','Ramesh','Giri','9804735723');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genre`
--

DROP TABLE IF EXISTS `genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genre` (
  `genreid` int(11) NOT NULL AUTO_INCREMENT,
  `bookgenre` varchar(30) NOT NULL,
  `booktype` varchar(15) NOT NULL,
  PRIMARY KEY (`genreid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genre`
--

LOCK TABLES `genre` WRITE;
/*!40000 ALTER TABLE `genre` DISABLE KEYS */;
INSERT INTO `genre` VALUES (1,'ActionandAdventure','Fiction'),(2,'Crime and Detective','Fiction'),(3,'Fairy Tale','Fiction'),(4,'Fantasy','Fiction'),(5,'Self-help Book','NonFiction'),(6,'Speech','NonFiction');
/*!40000 ALTER TABLE `genre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sale`
--

DROP TABLE IF EXISTS `sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sale` (
  `saleid` int(11) NOT NULL,
  `bookcode` varchar(5) NOT NULL,
  `customerinfo` varchar(5) NOT NULL,
  `saledate` date NOT NULL,
  PRIMARY KEY (`saleid`),
  KEY `bookcode` (`bookcode`),
  KEY `customerinfo` (`customerinfo`),
  CONSTRAINT `sale_ibfk_1` FOREIGN KEY (`bookcode`) REFERENCES `book` (`bookid`),
  CONSTRAINT `sale_ibfk_2` FOREIGN KEY (`customerinfo`) REFERENCES `customer` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale`
--

LOCK TABLES `sale` WRITE;
/*!40000 ALTER TABLE `sale` DISABLE KEYS */;
INSERT INTO `sale` VALUES (1,'1166','CO4','2018-02-23'),(2,'1111','CO2','2018-03-10'),(3,'1144','CO3','2018-03-20'),(4,'1155','CO1','2018-04-01'),(5,'1177','CO5','2018-04-28'),(6,'1122','CO1','2018-05-10'),(7,'1133','CO3','2018-05-15');
/*!40000 ALTER TABLE `sale` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-12 20:50:44
