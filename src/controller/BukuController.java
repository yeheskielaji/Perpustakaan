/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import daotabel.BukuDAO;
import daoimplement.BukuImplement;
import models.*;
import view.FrameBuku;

/**
 *
 * @author andra
 */
public class BukuController {
    FrameBuku frame1;
    BukuImplement implementBuku;
    List<Buku> b;
    
    public BukuController(FrameBuku frame1) {
        this.frame1 = frame1;
        implementBuku = new BukuDAO();
        b = implementBuku.getData();
    }
    
    public void isitabel() {
        b = implementBuku.getData();
        BukuModel bm = new BukuModel(b);
        frame1.getTabelBuku().setModel(bm);
    }
    
    public void insert() {
        Buku bk = new Buku();
        bk.setKode_buku(frame1.getKodebuku().getText());
        bk.setJudul(frame1.getJudul().getText());
        bk.setKode_Penerbit(frame1.getPenerbit().getText());
        bk.setPengarang(frame1.getPengarang().getText());
        bk.setJml_buku(Integer.valueOf(frame1.getJml().getText()));
        
        implementBuku.insert(bk);
    }
    
    public void update() {
        Buku bk = new Buku();
        bk.setKode_buku(frame1.getKodebuku().getText());
        bk.setJudul(frame1.getJudul().getText());
        bk.setKode_Penerbit(frame1.getPenerbit().getText());
        bk.setPengarang(frame1.getPengarang().getText());
        bk.setJml_buku(Integer.valueOf(frame1.getJml().getText()));
        
        implementBuku.update(bk);
    }
    
    public void delete() {
        String kode = frame1.getKodebuku().getText();
        implementBuku.delete(kode);
    }
}
