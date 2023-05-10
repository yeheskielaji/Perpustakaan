-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Bulan Mei 2023 pada 18.53
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.10

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
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `Kode_buku` char(4) NOT NULL,
  `Judul` char(20) DEFAULT NULL,
  `Pengarang` char(15) DEFAULT NULL,
  `Jml_buku` int(11) DEFAULT NULL,
  `Kode_penerbit` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`Kode_buku`, `Judul`, `Pengarang`, `Jml_buku`, `Kode_penerbit`) VALUES
('BD01', 'dBase III plus', 'Epsi B', 5, '01'),
('BD04', 'Clipper', 'Ahmad G', 4, '02'),
('FI01', 'Fisika', 'Sutrisno', 10, '04'),
('S001', 'DOS', 'M.Urip', 10, '01');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `Nim` char(9) NOT NULL,
  `Nama` char(20) DEFAULT NULL,
  `Alamat` char(20) DEFAULT NULL,
  `Kota` char(15) DEFAULT NULL,
  `TglLhr` datetime DEFAULT NULL,
  `Jenis_kel` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`Nim`, `Nama`, `Alamat`, `Kota`, `TglLhr`, `Jenis_kel`) VALUES
('123010001', 'Ifan', 'Jl Babarsari', 'Yogya', '1980-07-27 00:00:00', 'L'),
('123010002', 'Adi', 'Jl Janti', 'Yogya', '1979-06-28 00:00:00', 'L'),
('123010003', 'Ayu', 'Jl Pemuda', 'Klaten', '1981-05-10 00:00:00', 'P'),
('123010004', 'Yulia', 'Jl Veteran', 'Sleman', '1970-04-15 00:00:00', 'P');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penerbit`
--

CREATE TABLE `penerbit` (
  `Kode_penerbit` char(2) NOT NULL,
  `Nm_penerbit` char(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penerbit`
--

INSERT INTO `penerbit` (`Kode_penerbit`, `Nm_penerbit`) VALUES
('01', 'Piksi ITB'),
('02', 'Ganesha'),
('03', 'Epsilon'),
('04', 'Gramedia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pinjam`
--

CREATE TABLE `pinjam` (
  `Tgl_pinjam` datetime NOT NULL,
  `Mhs_no_induk` char(9) DEFAULT NULL,
  `Buk_kode_buku` char(4) DEFAULT NULL,
  `Tgl_hrs_kembali` datetime DEFAULT NULL,
  `Tgl_kembali` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pinjam`
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
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`Kode_buku`);

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`Nim`);

--
-- Indeks untuk tabel `penerbit`
--
ALTER TABLE `penerbit`
  ADD PRIMARY KEY (`Kode_penerbit`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
