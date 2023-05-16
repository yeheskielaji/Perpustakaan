/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import daobuku.BukuDAO;
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
}
