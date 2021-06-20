-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: bus_details
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bus_details`
--

DROP TABLE IF EXISTS `bus_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bus_details` (
  `busID` varchar(45) NOT NULL,
  `startPlace` varchar(45) DEFAULT NULL,
  `endPlace` varchar(45) DEFAULT NULL,
  `departureTime` varchar(45) DEFAULT NULL,
  `arrivalTime` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `numOfSeats` int DEFAULT NULL,
  `fare` float DEFAULT NULL,
  `userName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`busID`),
  KEY `userName_fk` (`userName`),
  CONSTRAINT `userName` FOREIGN KEY (`userName`) REFERENCES `owner_details` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bus_details`
--

LOCK TABLES `bus_details` WRITE;
/*!40000 ALTER TABLE `bus_details` DISABLE KEYS */;
INSERT INTO `bus_details` VALUES ('BN00890','Negembo','galle','2.00pm','12.am','Non/Ac',120,156,'ID002'),('LB8970','Dehivala','Thanamalwila','12.00AM','4.00PM','Non/Ac',60,125,'ID002'),('SP2099','Anuradhapura','Emilipitiya','2.00AM','2.00PM','Ac',60,560,'ID003');
/*!40000 ALTER TABLE `bus_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-20  9:42:25
