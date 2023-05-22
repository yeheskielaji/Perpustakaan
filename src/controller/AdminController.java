/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import daoimplement.LoginImplement;
import daotabel.LoginDAO;
import models.*;
import view.FrameLogin;
import view.FrameRegister;


/**
 *
 * @author andra
 */
public class AdminController {
    FrameLogin frame3;
    FrameRegister frame4;
    LoginImplement implementAdmin;
    List<Admin> a;
    
    public AdminController(FrameLogin frame3) {
        this.frame3 = frame3;
        implementAdmin = new LoginDAO();
        a = implementAdmin.getData();
    }
    
    public AdminController(FrameRegister frame4) {
        this.frame4 = frame4;
        implementAdmin = new LoginDAO();
        a = implementAdmin.getData();
    }
    
    public void insert() {
        Admin aa = new Admin();
        aa.setUser(frame4.getUsername().getText());
        aa.setPassword(frame4.getPassword().getText());
        
        
        implementAdmin.insert(aa);
    }
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
        aa.setUser(frame3.getUsername().getText());
        aa.setPassword(frame3.getPassword().getText());
        return implementAdmin.cek(aa);
    }
    public boolean cekr() {
        Admin aa = new Admin();
        aa.setUser(frame4.getUsername().getText());
        aa.setPassword(frame4.getPassword().getText());
        return implementAdmin.cekr(aa);
    }
}
