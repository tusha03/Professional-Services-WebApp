-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2024 at 07:24 AM
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
-- Database: `services_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(4);

-- --------------------------------------------------------

--
-- Table structure for table `ordertable`
--

CREATE TABLE `ordertable` (
  `id` int(11) NOT NULL,
  `serviceDate` varchar(255) DEFAULT NULL,
  `serviceProviderCont` varchar(255) DEFAULT NULL,
  `serviceProviderName` varchar(255) DEFAULT NULL,
  `serviceStatus` varchar(255) DEFAULT NULL,
  `serviceTime` varchar(255) DEFAULT NULL,
  `serviceType` varchar(255) DEFAULT NULL,
  `userAddress` varchar(255) DEFAULT NULL,
  `userCont` varchar(255) DEFAULT NULL,
  `userEmail` varchar(255) DEFAULT NULL,
  `userGen` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ordertable`
--

INSERT INTO `ordertable` (`id`, `serviceDate`, `serviceProviderCont`, `serviceProviderName`, `serviceStatus`, `serviceTime`, `serviceType`, `userAddress`, `userCont`, `userEmail`, `userGen`, `userName`) VALUES
(1, '2024-02-15', '1012', 'Prasanna Jain', 'Disapproved', '10:49', 'Carpet Cleaning', 'Dhule', '12345', 't@gmail.com', 'male', 'Tushar'),
(2, '2024-02-16', '1012', 'Prasanna Jain', 'Approved', '23:42', 'Carpet Cleaning', 'Dhule', '12345', 't@gmail.com', 'male', 'Tushar'),
(3, '2024-03-01', '1012', 'Prasanna Jain', 'Pending', '01:09', 'Carpet Cleaning', 'Dhule', '12345', 't@gmail.com', 'male', 'Tushar');

-- --------------------------------------------------------

--
-- Table structure for table `serviceprovider`
--

CREATE TABLE `serviceprovider` (
  `serCont` varchar(255) NOT NULL,
  `serAdd` varchar(255) DEFAULT NULL,
  `serAge` varchar(255) DEFAULT NULL,
  `serArea` varchar(255) DEFAULT NULL,
  `serCat` varchar(255) DEFAULT NULL,
  `serCity` varchar(255) DEFAULT NULL,
  `serClose` varchar(255) DEFAULT NULL,
  `serEmail` varchar(255) DEFAULT NULL,
  `serGen` varchar(255) DEFAULT NULL,
  `serLat` varchar(255) DEFAULT NULL,
  `serLong` varchar(255) DEFAULT NULL,
  `serName` varchar(255) DEFAULT NULL,
  `serOpen` varchar(255) DEFAULT NULL,
  `serPass` varchar(255) DEFAULT NULL,
  `serPin` varchar(255) DEFAULT NULL,
  `serSer` varchar(255) DEFAULT NULL,
  `serStatus` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `serviceprovider`
--

INSERT INTO `serviceprovider` (`serCont`, `serAdd`, `serAge`, `serArea`, `serCat`, `serCity`, `serClose`, `serEmail`, `serGen`, `serLat`, `serLong`, `serName`, `serOpen`, `serPass`, `serPin`, `serSer`, `serStatus`) VALUES
('1011', 'Erandol', '21', 'Near Bus Stand', 'Home Cleaning', 'Erandol', '01:00', 'laksh@gmail.com', 'Male', '1234', '1234', 'Lakshya Chaudhari', '12:00', '12345', '425409', 'Deep Cleaning', 'Disapproved'),
('1012', 'Dhule', '22', 'Mohadi', 'Home Cleaning', 'Dhule', '13:05', 'prasanna@gmail.com', 'Male', '1234', '1234', 'Prasanna Jain', '12:00', '12345', '425405', 'Carpet Cleaning', 'Approved'),
('1014', 'Nandurbar', '24', 'Nandurbar', 'Home Cleaning', 'Nadurbar', '11:00', 'pankaj@gmail.com', 'Male', '1234', '1234', 'Pankaj Dhangar', '01:00', '12345', '425478', 'Window Cleaning', 'Approved'),
('1015', 'Shirpur', '23', 'Karavand Naka', 'Home Cleaning', 'Shirpur', '06:00', 'vedant@gmail.com', 'Male', '1234', '1234', 'Vedant Deshmukh', '12:00', '12345', '425405', 'Regular Cleaning', 'Approved'),
('1016', 'Shirpur', '23', 'Karavand Naka', 'Home Cleaning', 'Shirpur', '12:00', 'vedant@gmail.com', 'Male', '1234', '1234', 'Vedant Deshmukh', '12:00', '12345', '425405', 'Deep Cleaning', 'Approved'),
('1017', 'Shahada', '21', 'Ganesh Nagar', 'Electrical', 'Shahada', '01:00', 'ojas@gmail.com', 'Male', '1234', '1234', 'Ojas Patil', '12:00', '12345', '425485', 'Installation', 'Approved'),
('1021', 'Shirpur', '21', 'Nimzari Naka', 'Home Cleaning', 'Shirpur', '02:10', 'tushar@gmail.com', 'Male', '1234', '1234', 'Tushar Deore', '12:05', '12345', '425405', 'Regular Cleaning', 'Approved'),
('1022', 'Shirpur', '22', 'Patil Wada', 'Electrical', 'Shirpur', '09:00', 'yash@gmail.com', 'Male', '1234', '1234', 'Yash Chaudhari', '01:00', '12345', '425405', 'Repair', 'Approved'),
('1023', 'Dhule', '25', 'Mohadi', 'Electrical', 'Dhule', '01:10', 'nayan@gmail.com', 'Male', '1234', '1234', 'Nayan Patil', '11:00', '12345', '478452', 'Wiring', 'Approved'),
('1024', 'Shirpur', '21', 'Ganesh Colony', 'Electrical', 'Shirpur', '02:00', 'dev@gmail.com', 'Male', '1234', '1234', 'Devendra Patil', '11:00', '12345', '425405', 'Fixture Installation', 'Approved'),
('1025', 'Sakri', '21', 'Sakri', 'Carpentry', 'Dhule', '06:00', 'smit@gmail.com', 'Male', '1234', '1234', 'Sumit Thakare', '12:00', '12345', '425406', 'Furniture Repair', 'Approved'),
('1026', 'Chalisgaon', '23', 'near Railway Station', 'Carpentry', 'Chalisgaon', '03:00', 'piyush@gmail.com', 'Male', '1234', '1234', 'Piyush Khairnar', '11:00', '12345', '452485', 'Cabinet Installation', 'Approved'),
('1027', 'Nandurbar', '25', 'Nandurbar', 'Carpentry', 'Nandurbar', '04:55', 'vijay@gmail.com', 'Male', '1234', '1234', 'Vijay Shah', '11:00', '12345', '452485', 'Door Repair', 'Approved'),
('1028', 'Dhule', '26', 'Dhule', 'Carpentry', 'Dhule', '09:00', 'saurabh@gmail.com', 'Male', '1234', '1234', 'Saurabh Desle', '11:00', '12345', '789632', 'Woodworking', 'Disapproved'),
('1029', 'Shindkheda', '26', 'varpade', 'Carpentry', 'Shindkheda', '04:00', 'yash@gmail.com', 'Male', '1234', '1234', 'Yash Patil', '11:00', '12345', '425465', 'Woodworking', 'Approved'),
('1030', 'Shindkheda', '26', 'varpade', 'Lock Installation', 'Shindkheda', '16:00', 'yash@gmail.com', 'Male', '1234', '1234', 'Yash Mahajan', '11:00', '', '425465', 'Door Lock Installation', 'Approved'),
('1031', 'Nashik', '22', 'Nashik', 'Lock Installation', 'Nashik', '08:00', 'jatin@gmail.com', 'Male', '1234', '1234', 'Jatin Patil', '10:00', '12345', '425456', 'Window Lock Installation', 'Approved'),
('1032', 'Shirpur', '26', 'Shirpur', 'Lock Installation', 'Shirpur', '09:00', 'jidnyesh@gmail.com', 'Male', '1234', '1234', 'Jidnyesh Deore', '06:00', '12345', '425405', 'Safe Installation', 'Pending'),
('1033', 'Junnar', '24', 'Junnar', 'Security System', 'Pune', '18:00', 'sid@gmail.com', 'Male', '1234', '1234', 'Siddheya Sonawane', '06:00', '12345', '425465', 'Alarm System Installation', 'Approved'),
('1034', 'Sakri', '22', 'Sakri', 'Security System', 'Dhule', '16:20', 'dinesh@gmail.com', 'Male', '1234', '1234', 'Dinesh Bachhav', '11:00', '12345', '425456', 'CCTV Installation', 'Pending'),
('1035', 'Chalisgaon', '26', 'Chalisgaon', 'Security System', 'Chalisgaon', '06:00', 'jayesh@gmail.com', 'Male', '1234', '1234', 'Jayesh Chaudhari', '10:00', '12345', '789654', 'Access Control System', 'Pending'),
('1036', 'Jalgaon', '25', 'Shivaji Nagar', 'Security System', 'Jalgaon', '05:00', 'dashan@gmail.com', 'Male', '12345', '12345', 'Darshan Patil', '10:00', '12345', '425405', 'Access Control System', 'Pending'),
('1037', 'Amalner', '25', 'Amalner', 'Plumbing', 'Amalner', '17:00', 'vabhav@gmail.com', 'Male', '1234', '1234', 'Vaibhav Kasar', '10:00', '12345', '425407', 'Pipe Repair', 'Pending'),
('1038', 'Chopda', '23', 'Chopda', 'Plumbing', 'Chopda', '18:00', 'harsh@gmail.com', 'Male', '1234', '1234', 'Harsh Jain', '12:00', '12345', '425405', 'Drain Cleaning', 'Pending'),
('1039', 'Shirpur', '26', 'Shirpur', 'Plumbing', 'Shirpur', '04:00', 'Harshal@gmail.com', 'Male', '1234', '1234', 'Harshal Rajput', '02:59', '12345', '425405', 'Water Heater Installation', 'Approved');

-- --------------------------------------------------------

--
-- Table structure for table `usercustomer`
--

CREATE TABLE `usercustomer` (
  `cont` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gen` varchar(255) DEFAULT NULL,
  `lat` varchar(255) DEFAULT NULL,
  `log` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `pin` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usercustomer`
--

INSERT INTO `usercustomer` (`cont`, `address`, `area`, `city`, `dob`, `email`, `gen`, `lat`, `log`, `name`, `pass`, `pin`) VALUES
('12345', 'Dhule', 'Ganesh Colony', 'Dhule', '2015-07-09', 't@gmail.com', 'male', '12', '12', 'Tushar', '12345', '424001');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ordertable`
--
ALTER TABLE `ordertable`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `serviceprovider`
--
ALTER TABLE `serviceprovider`
  ADD PRIMARY KEY (`serCont`);

--
-- Indexes for table `usercustomer`
--
ALTER TABLE `usercustomer`
  ADD PRIMARY KEY (`cont`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
