-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2023 at 08:05 PM
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
  `Judul` varchar(40) NOT NULL,
  `Pengarang` varchar(40) NOT NULL,
  `Jml_buku` int(11) NOT NULL,
  `Kode_penerbit` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`Kode_buku`, `Judul`, `Pengarang`, `Jml_buku`, `Kode_penerbit`) VALUES
('BD01', 'dBase III plus', 'Epsi B', 6, '1'),
('BD04', 'Clipper', 'Ahmad G', 8, '2'),
('BD44', 'Kama Sutra', 'Adlof Hitler', 5, '3'),
('FI01', 'Fisika', 'Sutrisno', 10, '4'),
('S001', 'DOS', 'M.Urip', 10, '1');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `Nim` varchar(9) NOT NULL,
  `Nama` varchar(40) DEFAULT NULL,
  `Alamat` varchar(40) DEFAULT NULL,
  `Kota` varchar(20) DEFAULT NULL,
  `TglLhr` date DEFAULT NULL,
  `Jenis_kel` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`Nim`, `Nama`, `Alamat`, `Kota`, `TglLhr`, `Jenis_kel`) VALUES
('123010001', 'Ifan', 'Jl Babarsari', 'Yogya', '1980-07-27', 'L'),
('123010002', 'Adi', 'Jl Janti', 'Yogya', '1979-06-28', 'L'),
('123010003', 'Ayu', 'Jl Pemuda', 'Klaten', '1981-05-10', 'P'),
('123010004', 'Yulia', 'Jl Veteran', 'Sleman', '1970-04-14', 'P');

-- --------------------------------------------------------

--
-- Table structure for table `penerbit`
--

CREATE TABLE `penerbit` (
  `Kode_penerbit` char(2) NOT NULL,
  `Nm_penerbit` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penerbit`
--

INSERT INTO `penerbit` (`Kode_penerbit`, `Nm_penerbit`) VALUES
('1', 'Piksi ITB'),
('2', 'Ghanesha'),
('3', 'Epsilon'),
('4', 'Gramedia');

-- --------------------------------------------------------

--
-- Table structure for table `pinjam`
--

CREATE TABLE `pinjam` (
  `id` int(11) NOT NULL,
  `Tgl_pinjam` date NOT NULL,
  `Mhs_nim` varchar(9) DEFAULT NULL,
  `Buk_kode_buku` varchar(4) DEFAULT NULL,
  `Tgl_hrs_kembali` date DEFAULT NULL,
  `Tgl_kembali` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pinjam`
--

INSERT INTO `pinjam` (`id`, `Tgl_pinjam`, `Mhs_nim`, `Buk_kode_buku`, `Tgl_hrs_kembali`, `Tgl_kembali`) VALUES
(1, '2023-05-22', '123010002', 'BD01', '2023-05-24', NULL),
(2, '2023-05-17', '123010004', 'BD04', '2023-05-17', '2023-05-24'),
(3, '2023-05-22', '123010004', 'BD01', '2023-05-25', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`Kode_buku`),
  ADD KEY `Kode_penerbit` (`Kode_penerbit`);

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

--
-- Indexes for table `pinjam`
--
ALTER TABLE `pinjam`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Mhs_nim` (`Mhs_nim`),
  ADD KEY `Buk_kode_buku` (`Buk_kode_buku`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pinjam`
--
ALTER TABLE `pinjam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `buku_ibfk_1` FOREIGN KEY (`Kode_penerbit`) REFERENCES `penerbit` (`Kode_penerbit`);

--
-- Constraints for table `pinjam`
--
ALTER TABLE `pinjam`
  ADD CONSTRAINT `pinjam_ibfk_1` FOREIGN KEY (`Mhs_nim`) REFERENCES `mahasiswa` (`Nim`),
  ADD CONSTRAINT `pinjam_ibfk_2` FOREIGN KEY (`Buk_kode_buku`) REFERENCES `buku` (`Kode_buku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
