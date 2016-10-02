-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 28, 2016 at 11:33 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `demolog`
--
CREATE DATABASE IF NOT EXISTS `demolog` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `demolog`;

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE IF NOT EXISTS `logs` (
  `USER_ID` varchar(20) NOT NULL,
  `DATED` date NOT NULL,
  `LOGGER` varchar(50) NOT NULL,
  `LEVEL` varchar(10) NOT NULL,
  `MESSAGE` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`USER_ID`, `DATED`, `LOGGER`, `LEVEL`, `MESSAGE`) VALUES
('', '2016-09-28', 'managecd.ManagementCDMain', 'INFO', 'all list:[id: 2 - name: CD 1 - singer: My Tam - 15 - 15000.0, id: 3 - name: CD 2 - singer: Dan Truong - 12 - 12000.0, id: 4 - name: That Tinh - singer: Le Quyen - 10 - 20000.0]'),
('', '2016-09-28', 'managecd.ManagementCDMain', 'ERROR', 'java.lang.NumberFormatException: For input string: "hu"'),
('', '2016-09-28', 'managecd.ManagementCDMain', 'INFO', 'all list:[id: 2 - name: CD 1 - singer: My Tam - 15 - 15000.0, id: 3 - name: CD 2 - singer: Dan Truong - 12 - 12000.0, id: 4 - name: That Tinh - singer: Le Quyen - 10 - 20000.0]');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
