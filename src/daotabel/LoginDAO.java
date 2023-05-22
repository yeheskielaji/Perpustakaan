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
import daoimplement.LoginImplement;
//import java.time.LocalDateTime;  
//import java.time.format.DateTimeFormatter;      

/**
 *
 * @author andra
 */
public class LoginDAO implements LoginImplement {

    Connection koneksi;

    final String read = "SELECT * FROM admin";
    final String insert = "INSERT INTO admin(user, password) VALUES (?,?)";
    final String update = "UPDATE admin SET password=? WHERE user=?";
    final String cek = "SELECT COUNT(*) FROM admin WHERE user = ? AND password=?";
    final String cekr = "SELECT COUNT(*) FROM admin WHERE user = ?";

    public LoginDAO() {
        koneksi = Connector.connection();
    }

    @Override
    public void insert(Admin a) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, a.getUser());
            statement.setString(2, a.getPassword());
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
    public void update(Admin a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Admin a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean cek(Admin a) {
        try {
            PreparedStatement statement = koneksi.prepareStatement(cek);
            statement.setString(1, a.getUser());
            statement.setString(2, a.getPassword());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean cekr(Admin a) {
        try {
            PreparedStatement statement = koneksi.prepareStatement(cekr);
            statement.setString(1, a.getUser());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Admin> getData() {
        List<Admin> p = null;
        try {
            p = new ArrayList<Admin>();
            Statement ss = koneksi.createStatement();
            ResultSet rs = ss.executeQuery(read);
            while (rs.next()) {
                Admin penerbit1 = new Admin();
                penerbit1.setUser(rs.getString("user"));
                penerbit1.setPassword(rs.getString("password"));

                p.add(penerbit1);
            }

        } catch (SQLException e) {
            Logger.getLogger(PenerbitDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return p;
    }

}
