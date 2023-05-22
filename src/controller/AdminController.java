/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import daotabel.AdminDAO;
import daoimplement.AdminImplement;
import models.*;
import view.FrameLogin;


/**
 *
 * @author andra
 */
public class AdminController {
    FrameLogin frame3;
    AdminImplement implementAdmin;
    List<Admin> a;
    
    public AdminController(FrameLogin frame3) {
        this.frame3 = frame3;
        implementAdmin = new AdminDAO();
        a = implementAdmin.getData();
    }
//    
//    public void insert() {
//        Admin aa = new Admin();
//        aa.setKode_penerbit(frame3.getKodepenerbit().getText());
//        aa.setNm_penerbit(frame3.getNamapenerbit().getText());
//        
//        
//        implementAdmin.insert(pp);
//    }
//    
//    public void update() {
//        Admin aa = new Admin();
//        aa.setKode_penerbit(frame3.getKodepenerbit().getText());
//        aa.setNm_penerbit(frame3.getNamapenerbit().getText());
//        
//        implementAdmin.update(pp);
//    }
//    
//    public void delete() {
//        Admin aa = new Admin();
//        aa.setKode_penerbit(frame3.getKodepenerbit().getText());
//        implementAdmin.delete(aa);
//    }
    
    public boolean cek() {
        Admin aa = new Admin();
//        aa.setUser(frame3.getUsername().getText());
//        aa.setPassword(frame3.getPassword().getText());
        return implementAdmin.cek(aa);
    }
}
