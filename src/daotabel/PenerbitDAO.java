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
import daoimplement.PenerbitImplement;

/**
 *
 * @author andra
 */
public class PenerbitDAO implements PenerbitImplement {

    Connection koneksi;

    final String read = "SELECT * FROM penerbit";
    final String insert = "INSERT INTO penerbit(Kode_penerbit, Nm_penerbit) VALUES (?,?)";
    final String update = "UPDATE penerbit SET Nm_penerbit=? WHERE Kode_penerbit=?";
    final String delete = "DELETE FROM penerbit WHERE Kode_penerbit=?";
    final String cek = "SELECT COUNT(*) FROM penerbit WHERE Kode_penerbit = ?";

    public PenerbitDAO() {
        koneksi = Connector.connection();
    }

    @Override
    public void insert(Penerbit p) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getKode_penerbit());
            statement.setString(2, p.getNm_penerbit());
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
    public void update(Penerbit p) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
            statement.setString(1, p.getNm_penerbit());
            statement.setString(2, p.getKode_penerbit());
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
    public void delete(String id) {
        PreparedStatement statement = null;

        try {
            statement = koneksi.prepareStatement(delete);

            statement.setString(1, id);
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
    public boolean cek(String id) {
        try{
            PreparedStatement statement = koneksi.prepareStatement(cek);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count!=0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public List<Penerbit> getData() {
        List<Penerbit> p = null;
        try {
            p = new ArrayList<Penerbit>();
            Statement ss = koneksi.createStatement();
            ResultSet rs = ss.executeQuery(read);
            while (rs.next()) {
                Penerbit penerbit1 = new Penerbit();
                penerbit1.setKode_penerbit(rs.getString("Kode_penerbit"));
                penerbit1.setNm_penerbit(rs.getString("Nm_penerbit"));
               
                p.add(penerbit1);
            }

        } catch (SQLException e) {
            Logger.getLogger(PenerbitDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return p;
    }
}
