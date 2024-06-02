-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 05:13 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cloth`
--

-- --------------------------------------------------------

--
-- Table structure for table `barcode_print`
--

CREATE TABLE `barcode_print` (
  `bp_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `Barcode` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barcode_print`
--

INSERT INTO `barcode_print` (`bp_id`, `date`, `time`, `Barcode`, `Name`, `Qty`) VALUES
(2, '2024-02-14', '12:18:35', '000000001', 'test', 1),
(3, '2024-02-14', '12:20:07', '000000002', '2', 5),
(4, '2024-02-14', '12:22:16', '000000003', '3', 5),
(5, '2024-02-14', '12:22:38', '000000001', 'test', 1),
(6, '2024-02-14', '12:23:13', '000000002', '2', 1),
(7, '2024-05-13', '23:14:24', '000000001', 'test', 1),
(8, '2024-05-13', '23:47:01', '000000011', '454', 5),
(9, '2024-05-13', '23:47:14', '000000011', '454', 2),
(10, '2024-05-13', '23:49:13', '000000011', '454', 1),
(11, '2024-05-13', '23:50:01', '000000011', '454', 4),
(12, '2024-05-13', '23:54:22', '000000011', '454', 5),
(13, '2024-05-13', '23:56:51', '000000011', '454', 5),
(14, '2024-05-13', '23:58:22', '000000011', '454', 1),
(15, '2024-05-14', '00:00:37', '000000444', '4111', 5),
(16, '2024-05-14', '00:02:59', '000000444', '4111', 5),
(17, '2024-05-14', '00:04:13', '000000011', '454', 5),
(18, '2024-05-14', '00:04:55', '000000002', '2', 5),
(19, '2024-05-14', '00:09:35', '000000011', '454', 10),
(20, '2024-05-14', '00:10:47', '001236547', 'bruno mass', 5),
(21, '2024-05-14', '00:37:05', '000000001', 'test', 1),
(22, '2024-05-14', '00:47:40', '000000001', 'test', 2),
(23, '2024-05-14', '00:51:26', '000000011', '454', 1),
(24, '2024-05-14', '00:52:38', '000000444', '4111', 2),
(25, '2024-05-14', '06:49:32', '000000002', '2', 1),
(26, '2024-05-14', '06:51:12', '000000001', 'test', 1),
(27, '2024-05-14', '06:52:17', '000000011', '454', 1),
(28, '2024-05-14', '06:57:58', '000000011', '454', 1),
(29, '2024-05-14', '07:00:19', '000000001', 'test', 1),
(30, '2024-05-14', '07:00:30', '000000011', '454', 1),
(31, '2024-05-14', '07:00:55', '000000011', '454', 1),
(32, '2024-05-14', '07:02:52', '000000002', '2', 1),
(33, '2024-05-14', '13:10:12', '000000002', '2', 1),
(34, '2024-05-14', '13:11:15', '000000444', '4111', 1),
(35, '2024-05-14', '13:12:08', '000000444', '4111', 1);

-- --------------------------------------------------------

--
-- Table structure for table `bill_no`
--

CREATE TABLE `bill_no` (
  `b_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bill_no`
--

INSERT INTO `bill_no` (`b_id`, `date`, `time`) VALUES
(175, '2024-02-14', '12:24:49'),
(176, '2024-02-14', '12:25:49'),
(177, '2024-02-14', '12:27:22'),
(178, '2024-02-14', '12:27:55'),
(179, '2024-02-14', '12:29:08'),
(180, '2024-02-14', '20:42:52'),
(181, '2024-02-14', '21:30:28'),
(182, '2024-02-14', '21:32:58'),
(183, '2024-02-14', '21:34:13'),
(184, '2024-02-14', '21:34:59'),
(185, '2024-02-14', '21:36:21'),
(186, '2024-02-14', '21:51:05'),
(187, '2024-05-04', '13:03:09'),
(188, '2024-05-04', '13:23:31'),
(189, '2024-05-30', '19:31:26'),
(190, '2024-05-30', '19:32:06'),
(191, '2024-05-30', '22:28:29'),
(192, '2024-05-30', '22:36:15'),
(193, '2024-05-31', '07:29:11'),
(194, '2024-05-31', '07:31:07'),
(195, '2024-05-31', '07:31:55'),
(196, '2024-05-31', '07:49:01'),
(197, '2024-05-31', '23:32:57'),
(198, '2024-05-31', '23:48:36'),
(199, '2024-05-31', '23:49:30');

-- --------------------------------------------------------

--
-- Table structure for table `cheque`
--

CREATE TABLE `cheque` (
  `ch_id` int(11) NOT NULL,
  `b_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `customer` varchar(50) NOT NULL,
  `Telephone` int(11) NOT NULL,
  `nic` varchar(25) NOT NULL,
  `ch_date` date NOT NULL,
  `ch_no` varchar(30) NOT NULL,
  `bank` varchar(50) NOT NULL,
  `amount` float(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loan`
--

CREATE TABLE `loan` (
  `l_id` int(11) NOT NULL,
  `b_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `customer` varchar(50) NOT NULL,
  `Telephone` int(11) NOT NULL,
  `nic` varchar(25) NOT NULL,
  `status` varchar(20) NOT NULL,
  `amount` float(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `p_id` int(11) NOT NULL,
  `barcode` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `bprice` float(8,2) NOT NULL,
  `wprice` float(8,2) NOT NULL,
  `rprice` float(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`p_id`, `barcode`, `name`, `quantity`, `bprice`, `wprice`, `rprice`) VALUES
(1, '000000001', 'test', -8, 1000.00, 1200.00, 1500.00),
(2, '000000002', '2', 5, 900.00, 1000.00, 1100.00),
(4, '000000011', '454', 5, 500.00, 600.00, 700.00),
(5, '000000444', '4111', 5, 0.00, 0.00, 0.00),
(6, '001236547', 'bruno mass', 1, 4000.00, 4500.00, 5500.00),
(7, '000014654', 'Sdfsd', 0, 0.00, 0.00, 0.00);

-- --------------------------------------------------------

--
-- Table structure for table `product_income`
--

CREATE TABLE `product_income` (
  `pi_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `year` int(11) NOT NULL,
  `month` int(11) NOT NULL,
  `barcode` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `income` float(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product_income`
--

INSERT INTO `product_income` (`pi_id`, `date`, `year`, `month`, `barcode`, `name`, `income`) VALUES
(88, '2024-02-14', 2024, 2, '000000001', 'test', 500.00),
(89, '2024-02-14', 2024, 2, '000000001', 'test', -500.00),
(90, '2024-02-14', 2024, 2, '000000001', 'test', 500.00),
(91, '2024-02-14', 2024, 2, '000000001', 'test', 500.00),
(92, '2024-02-14', 2024, 2, '000000001', 'test', 500.00),
(93, '2024-02-14', 2024, 2, '000000001', 'test', 500.00),
(94, '2024-02-14', 2024, 2, '000000001', 'test', 500.00),
(95, '2024-02-14', 2024, 2, '000000001', 'test', 500.00),
(96, '2024-02-14', 2024, 2, '000000001', 'test', 500.00),
(97, '2024-02-14', 2024, 2, '000000001', 'test', -500.00),
(98, '2024-05-04', 2024, 5, '000000001', 'test', 1000.00),
(99, '2024-05-04', 2024, 5, '000000001', 'test', 500.00),
(100, '2024-05-30', 2024, 5, '000000002', '2', 200.00),
(101, '2024-05-30', 2024, 5, '000000002', '2', -200.00),
(102, '2024-05-30', 2024, 5, '001236547', 'bruno mass', -1500.00),
(103, '2024-05-30', 2024, 5, '001236547', 'bruno mass', -1500.00),
(104, '2024-05-31', 2024, 5, '001236547', 'bruno mass', 3000.00),
(105, '2024-05-31', 2024, 5, '000000002', '2', 200.00),
(106, '2024-05-31', 2024, 5, '000000002', '2', -200.00),
(107, '2024-05-31', 2024, 5, '001236547', 'bruno mass', 3000.00),
(108, '2024-05-31', 2024, 5, '001236547', 'bruno mass', 2000.00),
(109, '2024-05-31', 2024, 5, '000000002', '2', 200.00);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `s_id` int(11) NOT NULL,
  `b_id` int(11) NOT NULL,
  `Cashier` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `item` int(11) NOT NULL,
  `customer` varchar(50) NOT NULL,
  `type` varchar(20) NOT NULL,
  `total` float(8,2) NOT NULL,
  `discount` float(8,2) NOT NULL,
  `payment` float(8,2) NOT NULL,
  `balance` float(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`s_id`, `b_id`, `Cashier`, `date`, `time`, `item`, `customer`, `type`, `total`, `discount`, `payment`, `balance`) VALUES
(76, 175, 'admin', '2024-02-14', '12:25:49', 1, 'Customer', 'Cash', 1500.00, 0.00, 1500.00, 0.00),
(77, 176, 'admin', '2024-02-14', '12:27:22', 1, 'Customer', 'Return', -1500.00, 0.00, -1500.00, 0.00),
(78, 177, 'admin', '2024-02-14', '12:27:55', 0, 'Customer', 'Cash', -1500.00, 0.00, -1500.00, 0.00),
(79, 178, 'admin', '2024-02-14', '12:29:08', 1, 'Customer', 'Loan', 1500.00, 0.00, 1500.00, 0.00),
(80, 179, 'admin', '2024-02-14', '20:42:51', 1, 'Customer', 'Cash', 1500.00, 0.00, 1500.00, 0.00),
(81, 180, 'admin', '2024-02-14', '21:30:28', 1, 'Customer', 'Cash', 1500.00, 0.00, 1500.00, 0.00),
(82, 181, 'admin', '2024-02-14', '21:32:58', 1, 'Customer', 'Cash', 1500.00, 0.00, 1500.00, 0.00),
(83, 182, 'admin', '2024-02-14', '21:34:12', 1, 'Customer', 'Cash', 1500.00, 0.00, 1500.00, 0.00),
(84, 183, 'admin', '2024-02-14', '21:34:59', 1, 'Customer', 'Cash', 1500.00, 0.00, 1500.00, 0.00),
(85, 184, 'admin', '2024-02-14', '21:36:20', 1, 'Customer', 'Cash', 1500.00, 0.00, 1500.00, 0.00),
(86, 185, 'admin', '2024-02-14', '21:51:05', 1, 'Customer', 'Return', -1500.00, 0.00, -1500.00, 0.00),
(87, 186, 'admin', '2024-05-04', '13:03:08', 2, 'Customer', 'Cash', 3000.00, 0.00, 5000.00, 2000.00),
(88, 187, 'admin', '2024-05-04', '13:23:31', 1, 'Customer', 'Cash', 1500.00, 0.00, 2000.00, 500.00),
(89, 188, 'admin', '2024-05-30', '19:31:25', 1, 'Customer', 'Cash', 1100.00, 0.00, 2000.00, 900.00),
(90, 189, 'admin', '2024-05-30', '19:32:06', 1, 'Customer', 'Return', -1100.00, 0.00, -1100.00, 0.00),
(91, 190, 'admin', '2024-05-30', '22:28:29', 1, 'Customer', 'Return', -5500.00, 0.00, -5500.00, 0.00),
(92, 191, 'admin', '2024-05-30', '22:36:15', 1, 'Customer', 'Return', -5500.00, 0.00, -5500.00, 0.00),
(93, 192, 'admin', '2024-05-31', '07:29:11', 3, 'Customer', 'Cash', 12100.00, 0.00, 15000.00, 2900.00),
(94, 193, 'admin', '2024-06-01', '07:31:07', 1, 'Customer', 'Return', -1100.00, 0.00, -1100.00, 0.00),
(95, 194, 'admin', '2024-06-01', '07:31:55', 2, 'Customer', 'Cash', 9900.00, 0.00, 10000.00, 100.00),
(96, 195, 'admin', '2024-06-01', '07:49:01', 3, 'Customer', 'Card', 11100.00, 1000.00, 12000.00, 900.00),
(97, 196, 'admin', '2024-06-01', '23:32:57', 1, 'Customer', 'Cheque', 1000.00, 0.00, 1000.00, 0.00),
(98, 197, 'admin', '2024-05-31', '23:48:36', 0, 'test', 'Expence', 1000.00, 0.00, 1000.00, 0.00),
(99, 198, 'admin', '2024-06-01', '23:49:30', 0, 'test1', 'Expence', 999.00, 0.00, 999.00, 0.00);

-- --------------------------------------------------------

--
-- Table structure for table `sales_product`
--

CREATE TABLE `sales_product` (
  `sp_id` int(11) NOT NULL,
  `b_id` int(11) NOT NULL,
  `barcode` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `price` float(8,2) NOT NULL,
  `quantity` int(11) NOT NULL,
  `discount` float(8,2) NOT NULL,
  `total` float(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sales_product`
--

INSERT INTO `sales_product` (`sp_id`, `b_id`, `barcode`, `name`, `price`, `quantity`, `discount`, `total`) VALUES
(83, 175, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(84, 176, '000000001', 'test', 1500.00, -1, 0.00, -1500.00),
(85, 178, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(86, 179, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(87, 180, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(88, 181, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(89, 182, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(90, 183, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(91, 184, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(92, 185, '000000001', 'test', 1500.00, -1, 0.00, -1500.00),
(93, 186, '000000001', 'test', 1500.00, 2, 0.00, 3000.00),
(94, 187, '000000001', 'test', 1500.00, 1, 0.00, 1500.00),
(95, 188, '000000002', '2', 1100.00, 1, 0.00, 1100.00),
(96, 189, '000000002', '2', 1100.00, -1, 0.00, -1100.00),
(97, 190, '001236547', 'bruno mass', 5500.00, -1, 0.00, -5500.00),
(98, 191, '001236547', 'bruno mass', 5500.00, -1, 0.00, -5500.00),
(99, 192, '001236547', 'bruno mass', 5500.00, 2, 0.00, 11000.00),
(100, 192, '000000002', '2', 1100.00, 1, 0.00, 1100.00),
(101, 193, '000000002', '2', 1100.00, -1, 0.00, -1100.00),
(102, 194, '001236547', 'bruno mass', 5500.00, 2, 0.00, 11000.00),
(103, 195, '001236547', 'bruno mass', 5500.00, 2, 1000.00, 10000.00),
(104, 195, '000000002', '2', 1100.00, 1, 0.00, 1100.00),
(105, 196, '999999', '123', 1000.00, 1, 0.00, 1000.00);

-- --------------------------------------------------------

--
-- Table structure for table `shop_details`
--

CREATE TABLE `shop_details` (
  `sh_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone1` varchar(20) NOT NULL,
  `phone2` varchar(20) NOT NULL,
  `printfolderpath` varchar(200) NOT NULL,
  `jrxml` varchar(200) NOT NULL,
  `backup` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `shop_details`
--

INSERT INTO `shop_details` (`sh_id`, `name`, `address`, `phone1`, `phone2`, `printfolderpath`, `jrxml`, `backup`) VALUES
(1, 'shop ABC', 'No.237, Hiripitiya Road, Wellawa, Kurunegala', '+94 77 123 1234', '+94 77 765 1234', 'C:/Users/PANDA_BOI/OneDrive/Documents/Backup', 'E:\\\\M.Samly\\\\Clothing Management System\\\\Cloth_System\\\\src\\\\print', 'C:\\\\Users\\\\PANDA_BOI\\\\OneDrive\\\\Documents\\\\Backup');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_croatian_ci NOT NULL,
  `role` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_croatian_ci NOT NULL,
  `nic` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_croatian_ci NOT NULL,
  `address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_croatian_ci NOT NULL,
  `telephone` int(11) NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_croatian_ci NOT NULL,
  `user_status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `role`, `nic`, `address`, `telephone`, `password`, `user_status`) VALUES
(1, 'admin', 'admin', '1236457890', 'test', 123456789, '123', 1),
(2, 'admin1', 'user', '1236457890', 'test', 123456789, '123', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barcode_print`
--
ALTER TABLE `barcode_print`
  ADD PRIMARY KEY (`bp_id`);

--
-- Indexes for table `bill_no`
--
ALTER TABLE `bill_no`
  ADD PRIMARY KEY (`b_id`);

--
-- Indexes for table `cheque`
--
ALTER TABLE `cheque`
  ADD PRIMARY KEY (`ch_id`),
  ADD KEY `b_id` (`b_id`);

--
-- Indexes for table `loan`
--
ALTER TABLE `loan`
  ADD PRIMARY KEY (`l_id`),
  ADD KEY `b_id` (`b_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `product_income`
--
ALTER TABLE `product_income`
  ADD PRIMARY KEY (`pi_id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`s_id`),
  ADD KEY `b_id` (`b_id`);

--
-- Indexes for table `sales_product`
--
ALTER TABLE `sales_product`
  ADD PRIMARY KEY (`sp_id`),
  ADD KEY `b_id` (`b_id`);

--
-- Indexes for table `shop_details`
--
ALTER TABLE `shop_details`
  ADD PRIMARY KEY (`sh_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barcode_print`
--
ALTER TABLE `barcode_print`
  MODIFY `bp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `bill_no`
--
ALTER TABLE `bill_no`
  MODIFY `b_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=200;

--
-- AUTO_INCREMENT for table `cheque`
--
ALTER TABLE `cheque`
  MODIFY `ch_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `loan`
--
ALTER TABLE `loan`
  MODIFY `l_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `p_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `product_income`
--
ALTER TABLE `product_income`
  MODIFY `pi_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `s_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;

--
-- AUTO_INCREMENT for table `sales_product`
--
ALTER TABLE `sales_product`
  MODIFY `sp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;

--
-- AUTO_INCREMENT for table `shop_details`
--
ALTER TABLE `shop_details`
  MODIFY `sh_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cheque`
--
ALTER TABLE `cheque`
  ADD CONSTRAINT `cheque_ibfk_1` FOREIGN KEY (`b_id`) REFERENCES `bill_no` (`b_id`);

--
-- Constraints for table `loan`
--
ALTER TABLE `loan`
  ADD CONSTRAINT `loan_ibfk_1` FOREIGN KEY (`b_id`) REFERENCES `bill_no` (`b_id`);

--
-- Constraints for table `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`b_id`) REFERENCES `bill_no` (`b_id`);

--
-- Constraints for table `sales_product`
--
ALTER TABLE `sales_product`
  ADD CONSTRAINT `sales_product_ibfk_1` FOREIGN KEY (`b_id`) REFERENCES `bill_no` (`b_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
