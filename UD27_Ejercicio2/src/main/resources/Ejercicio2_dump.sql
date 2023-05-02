CREATE DATABASE  IF NOT EXISTS `ud27_ejercicio2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ud27_ejercicio2`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 192.168.1.63    Database: ud27_ejercicio2
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
-- Table structure for table `asignado_a`
--

DROP TABLE IF EXISTS `asignado_a`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignado_a` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cientifico_id` varchar(8) DEFAULT NULL,
  `proyecto_id` char(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cientifico_id` (`cientifico_id`),
  KEY `proyecto_id` (`proyecto_id`),
  CONSTRAINT `asignado_a_ibfk_1` FOREIGN KEY (`cientifico_id`) REFERENCES `cientificos` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `asignado_a_ibfk_2` FOREIGN KEY (`proyecto_id`) REFERENCES `proyecto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignado_a`
--

LOCK TABLES `asignado_a` WRITE;
/*!40000 ALTER TABLE `asignado_a` DISABLE KEYS */;
INSERT INTO `asignado_a` VALUES (1,'0000000S','03R0'),(2,'1111111S','0000'),(3,'2222222S','8000'),(4,'3333333S','005Y'),(5,'4444444S','9000'),(6,'5555555S','0001'),(7,'6666666S','6000'),(8,'7777777S','0400'),(9,'8888888S','RY00'),(10,'9999999S','0020');
/*!40000 ALTER TABLE `asignado_a` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cientificos`
--

DROP TABLE IF EXISTS `cientificos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cientificos` (
  `dni` varchar(8) NOT NULL,
  `nom_apels` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cientificos`
--

LOCK TABLES `cientificos` WRITE;
/*!40000 ALTER TABLE `cientificos` DISABLE KEYS */;
INSERT INTO `cientificos` VALUES ('0000000S','Gordon Freeman'),('1111111S','Michael Newman'),('2222222S','Rogrigo García'),('3333333S','Redbull Daalas'),('4444444S','Maravillas Martínez'),('5555555S','Núria Style'),('6666666S','Arrebato Liendre'),('7777777S','Xavier Cassanyes'),('8888888S','Razones Grandes'),('9999999S','Remiendos Menta');
/*!40000 ALTER TABLE `cientificos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyecto` (
  `id` char(4) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `horas` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyecto`
--

LOCK TABLES `proyecto` WRITE;
/*!40000 ALTER TABLE `proyecto` DISABLE KEYS */;
INSERT INTO `proyecto` VALUES ('0000','Métodos numéricos',8),('0001','Métodos Algebraicos',10),('0020','Motor Wanker',250),('005Y','Motores de combustión híbrida',40),('03R0','Radioactividad en portales',4),('0400','Las posibilidades de Rust en industria aeroespacial',8),('6000','Explosivos de tierra',8),('8000','La lluvia de ácido',8),('9000','La lluvia de oro',8),('RY00','Motores de combustión externa',80);
/*!40000 ALTER TABLE `proyecto` ENABLE KEYS */;
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
INSERT INTO `usuarios` VALUES (1,'Palmira','$2a$10$CA5fD7/VLgDrMXG0fCktEeboS7YyAvapPSz4sPdVT6bBqv2dsfPfq');
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

-- Dump completed on 2023-05-02  2:26:04
