-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2023 at 05:44 AM
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
-- Database: `rdbms`
--

-- --------------------------------------------------------

--
-- Table structure for table `depttable`
--

CREATE TABLE `depttable` (
  `Deptno` int(2) NOT NULL,
  `Dname` varchar(14) DEFAULT NULL,
  `Loc` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `depttable`
--

INSERT INTO `depttable` (`Deptno`, `Dname`, `Loc`) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

-- --------------------------------------------------------

--
-- Table structure for table `emptabledata`
--

CREATE TABLE `emptabledata` (
  `Empno` int(2) NOT NULL,
  `ename` varchar(10) DEFAULT NULL,
  `job` varchar(9) DEFAULT NULL,
  `mgr` int(4) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` decimal(7,2) DEFAULT NULL,
  `comm` decimal(7,2) DEFAULT NULL,
  `deptno` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `emptabledata`
--

INSERT INTO `emptabledata` (`Empno`, `ename`, `job`, `mgr`, `hiredate`, `sal`, `comm`, `deptno`) VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', '800.00', NULL, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', '1600.00', '300.00', 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', '1250.00', '500.00', 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', '2975.00', NULL, 30),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', '1250.00', '1400.00', 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', '2850.00', NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', '2450.00', NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-06-11', '3000.00', NULL, 20),
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', '5000.00', NULL, 10),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-08-09', '1500.00', '0.00', 30),
(7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', '1100.00', NULL, 20),
(7900, 'JAMES', 'CLERK', 7698, '1981-03-12', '950.00', NULL, 30),
(7902, 'FORD', 'ANALYST', 7566, '1981-03-12', '3000.00', NULL, 20),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', '1300.00', NULL, 10);

-- --------------------------------------------------------

--
-- Table structure for table `emp_logtable`
--

CREATE TABLE `emp_logtable` (
  `Emp_id` int(5) NOT NULL,
  `Log_date` date DEFAULT NULL,
  `New_salary` int(10) DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `studenttable`
--

CREATE TABLE `studenttable` (
  `Rno` int(2) NOT NULL,
  `Sname` varchar(14) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `State` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `depttable`
--
ALTER TABLE `depttable`
  ADD PRIMARY KEY (`Deptno`);

--
-- Indexes for table `emptabledata`
--
ALTER TABLE `emptabledata`
  ADD PRIMARY KEY (`Empno`),
  ADD KEY `MUL` (`deptno`);

--
-- Indexes for table `studenttable`
--
ALTER TABLE `studenttable`
  ADD PRIMARY KEY (`Rno`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `emptabledata`
--
ALTER TABLE `emptabledata`
  ADD CONSTRAINT `emptabledata_ibfk_1` FOREIGN KEY (`deptno`) REFERENCES `depttable` (`Deptno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
