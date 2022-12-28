-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 28, 2022 at 11:36 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `salesperson`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `(PK)CNM.` int(11) NOT NULL,
  `CNAME` varchar(50) NOT NULL,
  `CITY` varchar(50) NOT NULL,
  `RATING` int(11) NOT NULL,
  `(FK)SNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`(PK)CNM.`, `CNAME`, `CITY`, `RATING`, `(FK)SNo`) VALUES
(201, 'Hoffman', 'London', 100, 1001),
(202, 'Giovanne', 'Roe', 200, 1003),
(203, 'Liu', 'San Jose', 300, 1002),
(204, 'Grass', 'Barcelona', 100, 1002),
(206, 'Clemens', 'London', 300, 1007),
(207, 'Pereira', 'Roe', 100, 1004);

-- --------------------------------------------------------

--
-- Table structure for table `salseperson`
--

CREATE TABLE `salseperson` (
  `(PK)SNo` int(11) NOT NULL,
  `SNAME` varchar(50) NOT NULL,
  `CITY` varchar(50) NOT NULL,
  `COMM` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salseperson`
--

INSERT INTO `salseperson` (`(PK)SNo`, `SNAME`, `CITY`, `COMM`) VALUES
(1001, 'Peel', 'London', '0.12'),
(1002, 'Serres', 'San Jose', '0.13'),
(1003, 'Alexrod', 'New York', '0.10'),
(1004, 'Motika', 'London', '0.11'),
(1007, 'Rafkin', 'Barcelona', '0.15');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`(PK)CNM.`),
  ADD KEY `Foreign Key` (`(FK)SNo`);

--
-- Indexes for table `salseperson`
--
ALTER TABLE `salseperson`
  ADD PRIMARY KEY (`(PK)SNo`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `Foreign Key` FOREIGN KEY (`(FK)SNo`) REFERENCES `salseperson` (`(PK)SNo`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
