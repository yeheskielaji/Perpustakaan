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
public class KembaliDAO implements PinjamImplement {

    Connection koneksi;

    final String read = "SELECT * FROM pinjam where Tgl_kembali IS NOT NULL";
    final String insert = "UPDATE pinjam SET Tgl_kembali=? WHERE Mhs_nim=? AND Buk_kode_buku = ? AND Tgl_kembali IS NULL";
    final String update = "UPDATE buku SET Jml_buku=Jml_buku+1 WHERE Kode_buku=?;";
//    final String update = "UPDATE pinjam SET Tgl_pinjam=?,Mhs_nim=?,Buk_kode_buku=?,Tgl_hrs_kembali=?,Tgl_kembali=? WHERE Nim=?";
//    final String delete = "DELETE FROM mahasiswa WHERE Nim=?";
    final String cariNim = "SELECT * FROM pinjam WHERE Mhs_nim = ? AND Tgl_kembali IS NULL";
    public KembaliDAO() {
        koneksi = Connector.connection();
    }

    @Override
    public void insert(Pinjam p) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert);
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
            Logger.getLogger(KembaliDAO.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(KembaliDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return p;
    }

    @Override
    public boolean cekdobel(Pinjam p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean ceknim(Pinjam p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean cekbuku(Pinjam p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
