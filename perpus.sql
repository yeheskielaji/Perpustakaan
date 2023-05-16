-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2023 at 12:28 PM
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
-- Database: `perpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `Kode_buku` varchar(4) NOT NULL,
  `Judul` varchar(20) DEFAULT NULL,
  `Pengarang` varchar(15) DEFAULT NULL,
  `Jml_buku` int(11) DEFAULT NULL,
  `Kode_penerbit` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`Kode_buku`, `Judul`, `Pengarang`, `Jml_buku`, `Kode_penerbit`) VALUES
('BD01', 'dBase III plus', 'Epsi B', 5, '01'),
('BD04', 'Clipper', 'Ahmad G', 4, '02'),
('FI01', 'Fisika', 'Sutrisno', 10, '04'),
('S001', 'DOS', 'M.Urip', 10, '01');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `Nim` char(9) NOT NULL,
  `Nama` char(20) DEFAULT NULL,
  `Alamat` char(20) DEFAULT NULL,
  `Kota` char(15) DEFAULT NULL,
  `TglLhr` datetime DEFAULT NULL,
  `Jenis_kel` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`Nim`, `Nama`, `Alamat`, `Kota`, `TglLhr`, `Jenis_kel`) VALUES
('123010001', 'Ifan', 'Jl Babarsari', 'Yogya', '1980-07-27 00:00:00', 'L'),
('123010002', 'Adi', 'Jl Janti', 'Yogya', '1979-06-28 00:00:00', 'L'),
('123010003', 'Ayu', 'Jl Pemuda', 'Klaten', '1981-05-10 00:00:00', 'P'),
('123010004', 'Yulia', 'Jl Veteran', 'Sleman', '1970-04-15 00:00:00', 'P');

-- --------------------------------------------------------

--
-- Table structure for table `penerbit`
--

CREATE TABLE `penerbit` (
  `Kode_penerbit` char(2) NOT NULL,
  `Nm_penerbit` char(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penerbit`
--

INSERT INTO `penerbit` (`Kode_penerbit`, `Nm_penerbit`) VALUES
('01', 'Piksi ITB'),
('02', 'Ganesha'),
('03', 'Epsilon'),
('04', 'Gramedia');

-- --------------------------------------------------------

--
-- Table structure for table `pinjam`
--

CREATE TABLE `pinjam` (
  `Tgl_pinjam` datetime NOT NULL,
  `Mhs_no_induk` char(9) DEFAULT NULL,
  `Buk_kode_buku` char(4) DEFAULT NULL,
  `Tgl_hrs_kembali` datetime DEFAULT NULL,
  `Tgl_kembali` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pinjam`
--

INSERT INTO `pinjam` (`Tgl_pinjam`, `Mhs_no_induk`, `Buk_kode_buku`, `Tgl_hrs_kembali`, `Tgl_kembali`) VALUES
('2003-04-20 00:00:00', '123010001', 'S001', '2003-04-23 00:00:00', '2003-04-23 00:00:00'),
('2003-04-20 00:00:00', '123010002', 'BD01', '2003-04-23 00:00:00', '2003-04-22 00:00:00'),
('2003-04-20 00:00:00', '123010003', 'BD04', '2003-04-23 00:00:00', '2003-04-24 00:00:00'),
('2003-04-21 00:00:00', '123010003', 'FI01', '2003-04-24 00:00:00', '2003-04-25 00:00:00'),
('2003-04-21 00:00:00', '123010004', 'S001', '2003-04-24 00:00:00', '2003-04-25 00:00:00'),
('2003-04-21 00:00:00', '123010001', 'BD01', '2003-04-24 00:00:00', '2003-04-24 00:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`Kode_buku`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`Nim`);

--
-- Indexes for table `penerbit`
--
ALTER TABLE `penerbit`
  ADD PRIMARY KEY (`Kode_penerbit`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
