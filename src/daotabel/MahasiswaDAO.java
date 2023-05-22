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
import daoimplement.MahasiswaImplement;

/**
 *
 * @author andra
 */
public class MahasiswaDAO implements MahasiswaImplement {

    Connection koneksi;

    final String read = "SELECT * FROM mahasiswa";
    final String insert = "INSERT INTO mahasiswa(Nim, Nama, Alamat, Kota, TglLhr, Jenis_kel) VALUES (?,?,?,?,?,?)";
    final String update = "UPDATE mahasiswa SET Nama=?,Alamat=?,Kota=?,TglLhr=?,Jenis_kel=? WHERE Nim=?";
    final String delete = "DELETE FROM mahasiswa WHERE Nim=?";
    final String cek = "SELECT COUNT(*) FROM mahasiswa WHERE Nim = ?";

    public MahasiswaDAO() {
        koneksi = Connector.connection();
    }

    @Override
    public void insert(Mahasiswa m) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, m.getNim());
            statement.setString(2, m.getNama());
            statement.setString(3, m.getAlamat());
            statement.setString(4, m.getKota());
//            statement.setString(5, m.getTglLhr());
            statement.setDate(5, m.getTglLhr());
            statement.setString(6, m.getJenis_kel());
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
    public void update(Mahasiswa m) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
            statement.setString(1, m.getNama());
            statement.setString(2, m.getAlamat());
            statement.setString(3, m.getKota());
            statement.setDate(4, m.getTglLhr());
            statement.setString(5, m.getJenis_kel());
            statement.setString(6, m.getNim());

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
    public void delete(String nim) {
        PreparedStatement statement = null;

        try {
            statement = koneksi.prepareStatement(delete);

            statement.setString(1, nim);
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
    public boolean cek(String nim) {
        try{
            PreparedStatement statement = koneksi.prepareStatement(cek);
            statement.setString(1, nim);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count!=0) {
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
    public List<Mahasiswa> getData() {
        List<Mahasiswa> m = null;
        try {
            m = new ArrayList<Mahasiswa>();
            Statement ss = koneksi.createStatement();
            ResultSet rs = ss.executeQuery(read);
            while (rs.next()) {
                Mahasiswa mhs1 = new Mahasiswa();
                mhs1.setNim(rs.getString("Nim"));
                mhs1.setNama(rs.getString("Nama"));
                mhs1.setAlamat(rs.getString("Alamat"));
                mhs1.setKota(rs.getString("Kota"));
                mhs1.setTglLhr(rs.getDate("TglLhr"));
                mhs1.setJenis_kel(rs.getString("Jenis_kel"));
                m.add(mhs1);
            }

        } catch (SQLException e) {
            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return m;
    }
}
