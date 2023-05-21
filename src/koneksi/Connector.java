/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Yeheskiel Aji
 */
public class Connector {
    static Connection koneksi;
    
    public static Connection connection() {
        if (koneksi==null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("perpus");
            data.setUser("root");
            data.setPassword("");
            
            try{
                koneksi = data.getConnection();
                System.out.println("Koneksi Berhasil");
            }catch(SQLException eksepsi) {
                eksepsi.printStackTrace();
                System.out.println("Koneksi Gagal");
                System.exit(0);
            }
            
        }
        return koneksi;
    }
}

