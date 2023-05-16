/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daobuku;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Connector;
import models.*;
import daoimplement.BukuImplement;

/**
 *
 * @author andra
 */
public class BukuDAO implements BukuImplement {

    Connection koneksi;

    final String read = "SELECT * FROM buku";
    final String insert = "INSERT INTO buku (Kode_buku, Judul, Pengarang, Jml_buku, Kode_penerbit) VALUES (?,?,?,?,?)";
    final String update = "UPDATE buku SET Judul=?,Pengarang=?,Jml_buku=?, Kode_penerbit=? WHERE Kode_buku=?";
    final String delete = "DELETE FROM buku WHERE Kode_buku=?";
    
    public BukuDAO() {
        koneksi = Connector.connection();
    }

    @Override
    public void insert(Buku b) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, b.getKode_buku());
            statement.setString(2, b.getJudul());
            statement.setString(3, b.getPengarang());
            statement.setInt(4, b.getJml_buku());
            statement.setString(5, b.getKode_Penerbit());
            statement.executeUpdate();
//            ResultSet rs = statement.getGeneratedKeys();

//            while (rs.next()) {
//                b.setKode_buku(rs.getInt(1));
//            }

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
    public void update(Buku b) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
            statement.setString(1, b.getJudul());
            statement.setString(2, b.getPengarang());
            statement.setInt(3, b.getJml_buku());
            statement.setString(4, b.getKode_Penerbit());
            statement.setString(5, b.getKode_buku());

            statement.executeUpdate();
//            ResultSet rs = statement.getGeneratedKeys();

//            while (rs.next()) {
//                b.setKode_buku(rs.getInt(1));
//            }

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
    public void delete(String kode) {
        PreparedStatement statement = null;
        
        try {
            statement = koneksi.prepareStatement(delete);
            
            statement.setString(1,kode);
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
    public List<Buku> getData() {
        List<Buku> b = null;
        try {
            b = new ArrayList<Buku>();
            Statement ss = koneksi.createStatement();
            ResultSet rs = ss.executeQuery(read);
            while (rs.next()) {
                Buku buku1 = new Buku();
                buku1.setKode_buku(rs.getString("Kode_buku"));
                buku1.setJudul(rs.getString("Judul"));
                buku1.setPengarang(rs.getString("Pengarang"));
                buku1.setJml_buku(rs.getInt("Jml_buku"));
                buku1.setKode_Penerbit(rs.getString("Kode_penerbit"));
                b.add(buku1);
            }

        } catch (SQLException e) {
            Logger.getLogger(BukuDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return b;
    }
}
