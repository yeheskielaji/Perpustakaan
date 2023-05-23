/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import daotabel.PinjamDAO;
import daoimplement.PinjamImplement;
import models.*;
import view.PinjamBuku;

/**
 *
 * @author andra
 */
public class PinjamController {

    PinjamBuku frame4;
    PinjamImplement implementPinjam;
    List<Pinjam> pi;

    public PinjamController(PinjamBuku frame4) {
        this.frame4 = frame4;
        implementPinjam = new PinjamDAO();
        pi = implementPinjam.getData();
    }

    public void isitabel() {
        pi = implementPinjam.getData();
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

        implementPinjam.insert(pi);
    }

    public void update() {
        Pinjam pi = new Pinjam();
        pi.setBuk_kode_buku(frame4.getKode_buku().getText());
        implementPinjam.update(pi);
    }

    public boolean ceknim() {
        Pinjam pi = new Pinjam();
        pi.setMhs_nim(frame4.getNim().getText());
        return implementPinjam.ceknim(pi);
    }

    public boolean cekdobel() {
        Pinjam pi = new Pinjam();
        pi.setMhs_nim(frame4.getNim().getText());
        pi.setBuk_kode_buku(frame4.getKode_buku().getText());
        return implementPinjam.cekdobel(pi);
    }

    public boolean cekbuku() {
        Pinjam pi = new Pinjam();
        pi.setBuk_kode_buku(frame4.getKode_buku().getText());
        return implementPinjam.cekbuku(pi);
    }

    public void carinim() {
        Pinjam pip = new Pinjam();
        pip.setMhs_nim(frame4.getNim().getText());
        pi = implementPinjam.carinim(pip);
        PinjamModel pp = new PinjamModel(pi);
        frame4.getjTable1().setModel(pp);
    }
    
    public void isitabelkembali() {
        pi = implementPinjam.getDatakembali();
        PinjamModel pp = new PinjamModel(pi);
        frame4.getjTable1().setModel(pp);
    }
    
    public void insertkembali() {
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        
        Pinjam pi = new Pinjam();
        pi.setTgl_kembali(date);
        pi.setMhs_nim(frame4.getNim().getText());
        pi.setBuk_kode_buku(frame4.getKode_bukukembali().getText()); 
        
        implementPinjam.insertkembali(pi);
    }
    
    public void updatekembali() {
        Pinjam pi = new Pinjam();
        pi.setBuk_kode_buku(frame4.getKode_bukukembali().getText());

        implementPinjam.updatekembali(pi);
    }
    
    public boolean cekadanim() {
        Pinjam pi = new Pinjam();
        pi.setMhs_nim(frame4.getNim().getText());
        return implementPinjam.cekadanim(pi);
    }
}
