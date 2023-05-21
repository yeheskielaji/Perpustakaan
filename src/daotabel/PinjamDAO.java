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
    final String update = "UPDATE buku SET Jml_buku=Jml_buku+1 WHERE Kode_buku=?;";
//    final String update = "UPDATE pinjam SET Tgl_pinjam=?,Mhs_nim=?,Buk_kode_buku=?,Tgl_hrs_kembali=?,Tgl_kembali=? WHERE Nim=?";
//    final String delete = "DELETE FROM mahasiswa WHERE Nim=?";
    final String cek = "SELECT COUNT(*) FROM pinjam WHERE Mhs_nim = ? AND Buk_kode_buku=?";
    final String cekBuku = "SELECT Jml_buku FROM buku WHERE Kode_buku = ?";
    final String cekNim = "SELECT * FROM pinjam WHERE Mhs_nim = ?";
    final String cekdobel = "SELECT COUNT(*) FROM pinjam WHERE Mhs_nim=? AND Tgl_kembali IS NULL";

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
//            statement.setDate(5, p.getTgl_kembali());
//            statement.setString(5, m.getTglLhr());
//            statement.setString(5, p.getBuk_kode_buku());
            statement.executeUpdate();

//            statement = koneksi.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
//            statement.setString(1, p.getBuk_kode_buku());
//            statement.executeUpdate();
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
//
//    @Override
//    public void delete(String nim) {
//        PreparedStatement statement = null;
//
//        try {
//            statement = koneksi.prepareStatement(delete);
//
//            statement.setString(1, nim);
//            statement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    @Override
    public boolean cek(String nim, String kode) {
        try {
            PreparedStatement statement = koneksi.prepareStatement(cek);
            statement.setString(1, nim);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count != 0) {
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

    @Override
    public boolean cekbuku(String kode) {
        try {
            PreparedStatement statement = koneksi.prepareStatement(cek);
            statement.setString(1, kode);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count != 0) {
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

    @Override
    public List<Pinjam> carinim(Pinjam pp) {
        List<Pinjam> p = null;
        try {
            p = new ArrayList<Pinjam>();
            PreparedStatement statement = koneksi.prepareStatement(cekNim);
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
//        System.out.println("aa");
        return p;
    }

//    private List getTopics(Connection conn, String searchCriteria)
//            throws SQLException {
//        List blogs = new LinkedList();
//        String query = "SELECT id, text FROM blogs WHERE UPPER(text) LIKE ?";
//        try {
//            // going to do a search using "upper"
//            searchCriteria = searchCriteria.toUpperCase();
//
//            // create the preparedstatement and add the criteria
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, "%" + searchCriteria + "%");
//
//            // process the results
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Blog blog = new Blog();
//                blog.setID(rs.getInt("id"));
//                blog.setText(rs.getString("text"));
//                blogs.add(blog);
//            }
//            rs.close();
//            ps.close();
//        } catch (SQLException se) {
//            // log exception;
//            throw se;
//        }
//        return blogs;
//    }

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

}
