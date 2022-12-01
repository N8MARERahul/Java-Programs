-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2022 at 06:22 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jdbc`
--

-- --------------------------------------------------------

--
-- Table structure for table `c_details`
--

CREATE TABLE `c_details` (
  `CID` int(10) NOT NULL,
  `C_NAME` varchar(30) NOT NULL,
  `C_ADDRESS` varchar(50) NOT NULL,
  `C_AGE` int(6) NOT NULL,
  `C_COUNTRY` varchar(15) NOT NULL,
  `P_NO` int(10) NOT NULL,
  `C_EMAIL` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `c_details`
--

INSERT INTO `c_details` (`CID`, `C_NAME`, `C_ADDRESS`, `C_AGE`, `C_COUNTRY`, `P_NO`, `C_EMAIL`) VALUES
(124598, 'Raj Kumar', '1/2 K J lane', 26, 'India', 12, 'Raj@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `regno` int(20) NOT NULL,
  `sname` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `contactno` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`regno`, `sname`, `city`, `contactno`) VALUES
(124598, 'Raj Kumar', 'kolkata', 11111),
(124598, 'Raj Kumar', 'kolkata', 1234567890),
(7890132, 'Raj Kumar', 'Delhi', 1234567890),
(124598, '', 'Delhi', 1234567890),
(124598, '', 'dhaka', 1234567890),
(124598, '', 'Delhi', 1234567890),
(567890, 'Raj Kumar', '', 67890);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
