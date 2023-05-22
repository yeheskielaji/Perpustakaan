/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import daotabel.KembaliDAO;
import daoimplement.KembaliImplement;
import models.*;
import view.FrameKembali;


/**
 *
 * @author andra
 */
public class KembaliController {
    FrameKembali frame4;
    KembaliImplement implementKembali;
    List<Pinjam> pi;
    
    
    public KembaliController(FrameKembali frame4) {
        this.frame4 = frame4;
        implementKembali = new KembaliDAO();
        pi = implementKembali.getData();
    }
    
    public void isitabel() {
        pi = implementKembali.getData();
        PinjamModel pp = new PinjamModel(pi);
        frame4.getjTable1().setModel(pp);
    }
    
    public void insert() {
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date sqldate = new java.sql.Date(frame4.getTgl_kembali().getDate().getTime());
        
        Pinjam pi = new Pinjam();
        pi.setTgl_pinjam(date);
        pi.setMhs_nim(frame4.getNim().getText());
        pi.setBuk_kode_buku(frame4.getKode_buku().getText());
        pi.setTgl_hrs_kembali(sqldate);
        
        implementKembali.insert(pi);
    }
    
    public void update() {
        Pinjam pi = new Pinjam();
        pi.setBuk_kode_buku(frame4.getKode_buku().getText());

        
        implementKembali.update(pi);
    }
    
    public boolean ceknim() {
        Pinjam pi = new Pinjam();
        pi.setMhs_nim(frame4.getNim().getText());        
        return implementKembali.ceknim(pi);
    }
    
    public boolean cekbuku() {
        Pinjam pi = new Pinjam();
        pi.setBuk_kode_buku(frame4.getKode_buku().getText()); 
        return implementKembali.cekbuku(pi);
    }
    
    public void carinim() {
        Pinjam pip = new Pinjam();
        pip.setMhs_nim(frame4.getNim().getText());
        pi = implementKembali.carinim(pip);
        PinjamModel pp = new PinjamModel(pi);
        frame4.getjTable1().setModel(pp);
    }
    
}
