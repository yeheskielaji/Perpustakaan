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
    
    public BukuDAO() {
        koneksi = Connector.connection();
    }

    @Override
    public void create(Buku b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Buku b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Buku b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
