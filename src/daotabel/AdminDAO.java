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
import daoimplement.AdminImplement;

/**
 *
 * @author andra
 */
public class AdminDAO implements AdminImplement {

    Connection koneksi;

    final String read = "SELECT * FROM admin";
    final String insert = "INSERT INTO admin(user, password) VALUES (?,?)";
    final String update = "UPDATE admin SET user=? WHERE password=?";
    final String delete = "DELETE FROM admin WHERE user=?";
    final String cek = "SELECT COUNT(*) FROM admin WHERE user = ? AND password = ?";

    public AdminDAO() {
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
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
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
    public void delete(Admin a) {
        PreparedStatement statement = null;

        try {
            statement = koneksi.prepareStatement(delete);

            statement.setString(1, a.getUser());
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
    public boolean cek(Admin a) {
        try{
            PreparedStatement statement = koneksi.prepareStatement(cek);
            statement.setString(1, a.getUser());
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
    public List<Admin> getData() {
        List<Admin> a = null;
        try {
            a = new ArrayList<Penerbit>();
            Statement ss = koneksi.createStatement();
            ResultSet rs = ss.executeQuery(read);
            while (rs.next()) {
                Admin admin1 = new Admin();
                admin1.setUser(rs.getString("user"));
                admin1.setPassword(rs.getString("password"));
               
                a.add(admin1);
            }

        } catch (SQLException e) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return a;
    }
}
