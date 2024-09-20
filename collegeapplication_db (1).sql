-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 26, 2024 at 12:18 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `collegeapplication_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `collected_fees`
--

CREATE TABLE `collected_fees` (
  `id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `amount_paid` int(5) NOT NULL,
  `comments` varchar(100) DEFAULT NULL,
  `balance` int(5) NOT NULL,
  `collected_at` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `collected_fees`
--

INSERT INTO `collected_fees` (`id`, `student_id`, `amount_paid`, `comments`, `balance`, `collected_at`) VALUES
(3, 2, 20000, 'test', 380000, '2024-08-16'),
(4, 3, 2000, '', 298000, '2024-08-16'),
(5, 2, 20000, '', 380000, '2024-08-16'),
(6, 3, 30000, 'sem3', 270000, '2024-08-16'),
(7, 3, 20000, '', 248000, '2024-08-16');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `course_id` int(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `description` varchar(10000) NOT NULL,
  `duration` varchar(100) NOT NULL,
  `total_fee` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`course_id`, `name`, `description`, `duration`, `total_fee`) VALUES
(2, 'BBA ..', 'BBA is a terminal degree. A Bachelor of Business Administration (BBA) degree is a course that mostly deals with business administration and management. This course is also a good option for students to develop their leadership skills, where they can get training as well as a degree.', '3 Years', 300000),
(3, 'B.Tech CSE ', 'Undergraduate engineering degree program. It focuses on the design, development, and implementation of computer software and hardware. It also combines theoretical knowledge with practical skills in programming, algorithms, data structures, and more', '4 Years', 450000),
(4, 'B.Tech CSE (AI-ML)', 'The B. Tech in Artificial Intelligence and Machine Learning program emphasizes on the applications of AIML, followed by statistics, discrete mathematics, and probability to understand the core of artificial intelligence and machine learning.', '4 Years', 400000),
(6, 'B.Tech ECE', 'A four-year undergraduate program that combines electrical engineering and communication systems principles. The course covers a range of topics related to the design, development, and application of electronic circuits and communication systems,', '4 Years', 400000),
(7, 'MBA', 'A master of business administration (MBA) is a graduate degree that provides theoretical and practical training for business or investment management. An MBA is designed to help graduates gain a better understanding of business management functions.', '2 Years ', 250000),
(8, 'B.Tech Civil ..', 'building materials, construction, and planning is called a BTech in civil engineering. Following their BTech in Civil Engineering, students work on the planning, designing, and erecting of various structures, including roads, bridges, canals, and buildings.', '4 Years ', 500000),
(9, 'B.Tech Machenical', 'core subjects like Engineering Mathematics, Thermodynamics, Fluid Mechanics, Machine Design, and CAD. Students choose electives such as Robotics, Automotive Engineering, and Renewable Energy systems.', '4 Years ', 400000);

-- --------------------------------------------------------

--
-- Table structure for table `studentlist`
--

CREATE TABLE `studentlist` (
  `ID` int(10) NOT NULL,
  `course_id` varchar(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `DOB` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `phone_number` int(10) NOT NULL,
  `adhaar` int(12) NOT NULL,
  `address` varchar(40) NOT NULL,
  `date joined` timestamp NOT NULL DEFAULT current_timestamp(),
  `fee_applicable` int(6) NOT NULL,
  `fee_paid` int(6) NOT NULL DEFAULT 0,
  `fee_pending` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `studentlist`
--

INSERT INTO `studentlist` (`ID`, `course_id`, `name`, `DOB`, `email`, `phone_number`, `adhaar`, `address`, `date joined`, `fee_applicable`, `fee_paid`, `fee_pending`) VALUES
(2, '4', 's2', '21 Aug 2000', 's2@gmail.com', 98765410, 35435, 'Jalandhar', '2024-08-16 06:03:45', 400000, 40000, 380000),
(3, '2', 's3', '21 Aug 2000', 's3@gmail.com', 98765410, 35435, 'Jalandhar', '2024-08-16 07:22:32', 300000, 52000, 248000);

-- --------------------------------------------------------

--
-- Table structure for table `userlist`
--

CREATE TABLE `userlist` (
  `id` int(5) NOT NULL,
  `name` varchar(20) NOT NULL,
  `usertype` varchar(20) NOT NULL,
  `email` varchar(25) NOT NULL,
  `contact` int(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `date_time` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `userlist`
--

INSERT INTO `userlist` (`id`, `name`, `usertype`, `email`, `contact`, `password`, `date_time`) VALUES
(719, 'Accountant', 'Accountant', 'acc1@gmail.com', 98765410, '12345', '2024-08-16 11:54:39'),
(720, 'Accountant 2', 'Accountant', 'acc2@gmail.com', 98765478, '12345', '2024-08-16 11:54:53'),
(721, 'teach1', 'Teacher', 'teach123@gmail.com', 2345342, '123', '2024-08-26 14:48:23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `collected_fees`
--
ALTER TABLE `collected_fees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`);

--
-- Indexes for table `studentlist`
--
ALTER TABLE `studentlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `userlist`
--
ALTER TABLE `userlist`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `collected_fees`
--
ALTER TABLE `collected_fees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `course_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `studentlist`
--
ALTER TABLE `studentlist`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `userlist`
--
ALTER TABLE `userlist`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=722;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
