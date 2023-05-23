/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daotabel;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Connector;
import models.*;
import daoimplement.PinjamImplement;
//import java.time.LocalDateTime;  
//import java.time.format.DateTimeFormatter;      

/**
 *
 * @author andra
 */
public class PinjamDAO implements PinjamImplement {

    Connection koneksi;

    final String read = "SELECT * FROM pinjam";
    final String insert = "INSERT INTO pinjam(Tgl_pinjam, Mhs_nim, Buk_kode_buku, Tgl_hrs_kembali) VALUES (?,?,?,?);";
    final String update = "UPDATE buku SET Jml_buku=Jml_buku-1 WHERE Kode_buku=?;";
    final String cariNim = "SELECT * FROM pinjam WHERE Mhs_nim = ?";
    final String cekBuku = "SELECT Jml_buku FROM buku WHERE Kode_buku = ?";
    final String cekNim = "SELECT COUNT(*) FROM pinjam WHERE Mhs_nim = ? AND Tgl_kembali IS NULL";
    final String cekdobel = "SELECT COUNT(*) FROM pinjam WHERE Mhs_nim=? AND Buk_kode_buku=? AND Tgl_kembali IS NULL";
    
    final String readkembali = "SELECT * FROM pinjam where Tgl_kembali IS NULL";
    final String insertkembali = "UPDATE pinjam SET Tgl_kembali=? WHERE Mhs_nim=? AND Buk_kode_buku = ? AND Tgl_kembali IS NULL";
    final String updatekembali = "UPDATE buku SET Jml_buku=Jml_buku+1 WHERE Kode_buku=?;";
    final String cek = "SELECT COUNT(*) FROM mahasiswa WHERE Nim = ?";

    public PinjamDAO() {
        koneksi = Connector.connection();
    }

    @Override
    public void insert(Pinjam p) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setDate(1, p.getTgl_pinjam());
            statement.setString(2, p.getMhs_nim());
            statement.setString(3, p.getBuk_kode_buku());
            statement.setDate(4, p.getTgl_hrs_kembali());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(Pinjam p) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
            statement.setString(1, p.getBuk_kode_buku());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
    
    @Override
    public boolean ceknim(Pinjam p) {
        try {
            PreparedStatement statement = koneksi.prepareStatement(cekNim);
            statement.setString(1, p.getMhs_nim());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count >= 2) {
                    return true;
                }
                System.out.println(count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean cekdobel(Pinjam p) {
        try {
            PreparedStatement statement = koneksi.prepareStatement(cekdobel);
            statement.setString(1, p.getMhs_nim());
            statement.setString(2, p.getBuk_kode_buku());
            
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count >= 1) {
                    return true;
                }
                System.out.println(count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean cekbuku(Pinjam p) {
        int count = 0;
        try {

            PreparedStatement statement = koneksi.prepareStatement(cekBuku);
            statement.setString(1, p.getBuk_kode_buku());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                count = resultSet.getInt("Jml_buku");
            }
//            System.out.println(count);

            if (count == 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Pinjam> carinim(Pinjam pp) {
        List<Pinjam> p = null;
        try {
            p = new ArrayList<Pinjam>();
            PreparedStatement statement = koneksi.prepareStatement(cariNim);
            statement.setString(1, pp.getMhs_nim());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Pinjam ppi = new Pinjam();
                ppi.setTgl_pinjam(resultSet.getDate("Tgl_pinjam"));
                ppi.setMhs_nim(resultSet.getString("Mhs_nim"));
                ppi.setBuk_kode_buku(resultSet.getString("Buk_kode_buku"));
                ppi.setTgl_hrs_kembali(resultSet.getDate("Tgl_hrs_kembali"));
                ppi.setTgl_kembali(resultSet.getDate("Tgl_kembali"));
                p.add(ppi);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            Logger.getLogger(PinjamDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return p;
    }

    @Override
    public List<Pinjam> getData() {
        List<Pinjam> p = null;
        try {
            p = new ArrayList<Pinjam>();
            Statement ss = koneksi.createStatement();
            ResultSet rs = ss.executeQuery(read);
            while (rs.next()) {
                Pinjam ppi = new Pinjam();
                ppi.setTgl_pinjam(rs.getDate("Tgl_pinjam"));
                ppi.setMhs_nim(rs.getString("Mhs_nim"));
                ppi.setBuk_kode_buku(rs.getString("Buk_kode_buku"));
                ppi.setTgl_hrs_kembali(rs.getDate("Tgl_hrs_kembali"));
                ppi.setTgl_kembali(rs.getDate("Tgl_kembali"));
                p.add(ppi);
            }

        } catch (SQLException e) {
            Logger.getLogger(PinjamDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return p;
    }

    @Override
    public void insertkembali(Pinjam p) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insertkembali);
            statement.setDate(1, p.getTgl_kembali());
            statement.setString(2, p.getMhs_nim());
            statement.setString(3, p.getBuk_kode_buku());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updatekembali(Pinjam p) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(updatekembali);
            statement.setString(1, p.getBuk_kode_buku());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public List<Pinjam> getDatakembali() {
        List<Pinjam> p = null;
        try {
            p = new ArrayList<Pinjam>();
            Statement ss = koneksi.createStatement();
            ResultSet rs = ss.executeQuery(readkembali);
            while (rs.next()) {
                Pinjam ppi = new Pinjam();
                ppi.setTgl_pinjam(rs.getDate("Tgl_pinjam"));
                ppi.setMhs_nim(rs.getString("Mhs_nim"));
                ppi.setBuk_kode_buku(rs.getString("Buk_kode_buku"));
                ppi.setTgl_hrs_kembali(rs.getDate("Tgl_hrs_kembali"));
                ppi.setTgl_kembali(rs.getDate("Tgl_kembali"));
                p.add(ppi);
            }

        } catch (SQLException e) {
            Logger.getLogger(PinjamDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return p;
    }
    
    @Override
    public boolean cekadanim(Pinjam p) {
        try{
            PreparedStatement statement = koneksi.prepareStatement(cek);
            statement.setString(1, p.getMhs_nim());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count==0) {
                    return true;
                }
//                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        System.out.println("aa");
        return false;

    }
    
}
