-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 07:04 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `leania_creations`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_item`
--

CREATE TABLE `add_item` (
  `item` varchar(50) DEFAULT NULL,
  `price` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `add_item`
--

INSERT INTO `add_item` (`item`, `price`) VALUES
('abc', '400'),
('aa', '25'),
('cc', '254');

-- --------------------------------------------------------

--
-- Table structure for table `bill_price_save`
--

CREATE TABLE `bill_price_save` (
  `tot_price` varchar(50) DEFAULT NULL,
  `Discount` varchar(50) DEFAULT NULL,
  `Bill_no` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bill_price_save`
--

INSERT INTO `bill_price_save` (`tot_price`, `Discount`, `Bill_no`) VALUES
('Rs: 2125.00', 'Rs: 125.00', '10'),
('Rs: 2250.00', 'Rs: 50.00', '10'),
('Rs: 2375.00', 'Rs: 70.00', '10'),
('Rs: 4915.00', 'Rs: 15.00', '10'),
('Rs: 5040.00', 'Rs: 40.00', '10'),
('Rs: 5040.00', 'Rs: 40.00', '10'),
('Rs: 5165.00', 'Rs: 5.00', '10'),
('Rs: 27165.00', 'Rs: 1000.00', '10'),
('Rs: 29165.00', 'Rs: 65.00', '10');

-- --------------------------------------------------------

--
-- Table structure for table `bill_save`
--

CREATE TABLE `bill_save` (
  `Item` varchar(50) DEFAULT NULL,
  `price` varchar(50) DEFAULT NULL,
  `Quantity` varchar(50) DEFAULT NULL,
  `Total` varchar(50) DEFAULT NULL,
  `Date` varchar(50) DEFAULT NULL,
  `Time` varchar(50) DEFAULT NULL,
  `Bill_no` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bill_save`
--

INSERT INTO `bill_save` (`Item`, `price`, `Quantity`, `Total`, `Date`, `Time`, `Bill_no`) VALUES
('abc', '400', '5', '2000', '22-01-2024', '02:53:27', '1'),
('abc', '400', '2', '800', '22-01-2024', '02:59:59', '2'),
('abc', '400', '2', '800', '22-01-2024', '03:01:40', '3'),
('abc', '400', '2', '800', '22-01-2024', '03:09:13', '4'),
('abc', '400', '2', '800', '22-01-2024', '03:12:16', '5'),
('abc', '400', '2', '800', '22-01-2024', '03:13:24', '6'),
('abc', '400', '5', '2000', '22-01-2024', '03:14:09', '7'),
('abc', '400', '5', '2000', '22-01-2024', '03:15:05', '8'),
('abc', '400', '5', '2000', '22-01-2024', '03:46:50', '9'),
('aa', '25', '3', '75', '22-01-2024', '03:46:50', '9'),
('cc', '254', '10', '2540', '22-01-2024', '03:46:50', '9'),
('abc', '400', '5', '2000', '22-01-2024', '04:06:06', '10'),
('aa', '25', '5', '125', '22-01-2024', '04:06:06', '10'),
('aa', '25', '5', '125', '22-01-2024', '04:10:01', '10'),
('aa', '25', '5', '125', '22-01-2024', '04:11:48', '10'),
('cc', '254', '10', '2540', '22-01-2024', '04:16:01', '10'),
('aa', '25', '5', '125', '22-01-2024', '04:17:27', '10'),
('aa', '25', '5', '125', '22-01-2024', '04:22:37', '10'),
('abc', '400', '55', '22000', '22-01-2024', '04:26:57', '10'),
('abc', '400', '5', '2000', '22-01-2024', '04:33:03', '10');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
