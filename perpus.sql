-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 22 Bulan Mei 2023 pada 16.02
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

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
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `user` int(11) NOT NULL,
  `password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `Kode_buku` varchar(4) NOT NULL,
  `Judul` varchar(40) NOT NULL,
  `Pengarang` varchar(40) NOT NULL,
  `Jml_buku` int(11) NOT NULL,
  `Kode_penerbit` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`Kode_buku`, `Judul`, `Pengarang`, `Jml_buku`, `Kode_penerbit`) VALUES
('BD01', 'dBase III plus', 'Epsi B', 5, '1'),
('BD04', 'Clipper', 'Ahmad G', 4, '2'),
('BD44', 'Kama Sutra', 'Adlof Hitler', 5, '3'),
('FI01', 'Fisika', 'Sutrisno', 10, '4'),
('S001', 'DOS', 'M.Urip', 10, '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
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
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`Nim`, `Nama`, `Alamat`, `Kota`, `TglLhr`, `Jenis_kel`) VALUES
('123010001', 'Ifan', 'Jl Babarsari', 'Yogya', '1980-07-27', 'L'),
('123010002', 'Adi', 'Jl Janti', 'Yogya', '1979-06-28', 'L'),
('123010003', 'Ayu', 'Jl Pemuda', 'Klaten', '1981-05-10', 'P'),
('123010004', 'Yulia', 'Jl Veteran', 'Sleman', '1970-04-15', 'P');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penerbit`
--

CREATE TABLE `penerbit` (
  `Kode_penerbit` char(2) NOT NULL,
  `Nm_penerbit` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `penerbit`
--

INSERT INTO `penerbit` (`Kode_penerbit`, `Nm_penerbit`) VALUES
('1', 'Piksi ITB'),
('2', 'Ghanesha'),
('3', 'Epsilon'),
('4', 'Gramedia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pinjam`
--

CREATE TABLE `pinjam` (
  `Tgl_pinjam` date NOT NULL,
  `Mhs_nim` varchar(9) DEFAULT NULL,
  `Buk_kode_buku` varchar(4) DEFAULT NULL,
  `Tgl_hrs_kembali` date DEFAULT NULL,
  `Tgl_kembali` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pinjam`
--

INSERT INTO `pinjam` (`Tgl_pinjam`, `Mhs_nim`, `Buk_kode_buku`, `Tgl_hrs_kembali`, `Tgl_kembali`) VALUES
('2003-04-20', '123010001', 'S001', '2003-04-23', '2003-04-23'),
('2003-04-20', '123010002', 'BD01', '2003-04-23', '2003-04-22'),
('2003-04-20', '123010003', 'BD04', '2003-04-23', '2003-04-24'),
('2003-04-21', '123010003', 'FI01', '2003-04-24', '2003-04-25'),
('2003-04-21', '123010004', 'S001', '2003-04-24', '2003-04-25'),
('2003-04-21', '123010001', 'BD01', '2003-04-24', '2003-04-24');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`user`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`Kode_buku`),
  ADD KEY `Kode_penerbit` (`Kode_penerbit`);

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

--
-- Indeks untuk tabel `pinjam`
--
ALTER TABLE `pinjam`
  ADD KEY `Mhs_nim` (`Mhs_nim`),
  ADD KEY `Buk_kode_buku` (`Buk_kode_buku`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `buku_ibfk_1` FOREIGN KEY (`Kode_penerbit`) REFERENCES `penerbit` (`Kode_penerbit`);

--
-- Ketidakleluasaan untuk tabel `pinjam`
--
ALTER TABLE `pinjam`
  ADD CONSTRAINT `pinjam_ibfk_1` FOREIGN KEY (`Mhs_nim`) REFERENCES `mahasiswa` (`Nim`),
  ADD CONSTRAINT `pinjam_ibfk_2` FOREIGN KEY (`Buk_kode_buku`) REFERENCES `buku` (`Kode_buku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
