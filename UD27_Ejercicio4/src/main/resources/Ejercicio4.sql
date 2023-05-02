CREATE DATABASE  IF NOT EXISTS `ud27_ejercicio4` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ud27_ejercicio4`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 192.168.1.63    Database: ud27_ejercicio4
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipos` (
  `num_serie` char(4) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `facultad_id` int DEFAULT NULL,
  PRIMARY KEY (`num_serie`),
  KEY `facultad_id` (`facultad_id`),
  CONSTRAINT `equipos_ibfk_1` FOREIGN KEY (`facultad_id`) REFERENCES `facultad` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES ('AA','Equipo1',1),('BB','Equipo2',2),('CC','Equipo3',3),('DD','Equipo4',4),('EE','Equipo5',5),('FF','Equipo6',6),('GG','Equipo7',7),('LL','Equipo8',8),('MM','Equipo9',9),('NN','Equipo10',10);
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facultad`
--

DROP TABLE IF EXISTS `facultad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facultad` (
  `codigo` int NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facultad`
--

LOCK TABLES `facultad` WRITE;
/*!40000 ALTER TABLE `facultad` DISABLE KEYS */;
INSERT INTO `facultad` VALUES (1,'Fisica'),(2,'Matemáticas'),(3,'Química'),(4,'Psicología'),(5,'Derecho'),(6,'Biología'),(7,'Ingenieria Forestal'),(8,'Economía'),(9,'Ingeniería Informática'),(10,'Turismo');
/*!40000 ALTER TABLE `facultad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `investigadores`
--

DROP TABLE IF EXISTS `investigadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `investigadores` (
  `dni` varchar(8) NOT NULL,
  `nom_apels` varchar(255) DEFAULT NULL,
  `facultad_id` int DEFAULT NULL,
  PRIMARY KEY (`dni`),
  KEY `facultad_id` (`facultad_id`),
  CONSTRAINT `investigadores_ibfk_1` FOREIGN KEY (`facultad_id`) REFERENCES `facultad` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investigadores`
--

LOCK TABLES `investigadores` WRITE;
/*!40000 ALTER TABLE `investigadores` DISABLE KEYS */;
INSERT INTO `investigadores` VALUES ('1278997C','Dwight Schrute',7),('1456897D','Angela Martin',3),('1458789A','Kevin Malone',2),('2557888E','Jim Halpert',1),('4459898D','Pamela Beesly',10),('4555996C','Kelly Kapoor',10),('4557878B','Michael Scott',4),('4778863R','Ryan Howard',5),('4798863E','Phyllis Vance',6),('7889882T','Toby Flenderson',9);
/*!40000 ALTER TABLE `investigadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reserva` (
  `id` int NOT NULL AUTO_INCREMENT,
  `investigador_id` varchar(8) DEFAULT NULL,
  `equipo_id` char(4) DEFAULT NULL,
  `comienzo` datetime DEFAULT NULL,
  `fin` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `investigador_id` (`investigador_id`),
  KEY `equipo_id` (`equipo_id`),
  CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`investigador_id`) REFERENCES `investigadores` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`equipo_id`) REFERENCES `equipos` (`num_serie`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (1,'4557878B','AA','2020-03-15 00:00:00','2021-03-01 00:00:00'),(2,'1278997C','BB','2021-03-15 00:00:00','2021-04-01 00:00:00'),(3,'4459898D','DD','2022-05-02 00:00:00','2023-02-28 00:00:00'),(4,'4798863E','MM','2019-12-01 00:00:00','2020-07-10 00:00:00'),(5,'4778863R','AA','2020-03-15 00:00:00','2020-04-30 00:00:00'),(6,'1458789A','CC','2005-08-22 00:00:00','2005-12-01 00:00:00'),(7,'2557888E','DD','2022-05-02 00:00:00','2023-02-28 00:00:00'),(8,'4555996C','NN','2019-04-10 00:00:00','2021-03-01 00:00:00'),(9,'7889882T','LL','2020-01-01 00:00:00','2023-03-01 00:00:00'),(10,'1456897D','GG','2018-11-10 00:00:00','2021-05-01 00:00:00');
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(155) DEFAULT NULL,
  `password` varchar(155) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Palmira','$2a$10$ON3E1khCat8Q9V.6qmKSJuilVmc8zQeq8t/lBO/xNd298ISD0A1EO');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-02  2:52:00
