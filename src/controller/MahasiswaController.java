/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import daotabel.MahasiswaDAO;
import daoimplement.MahasiswaImplement;
import models.*;
import view.FrameMahasiswa;

/**
 *
 * @author andra
 */
public class MahasiswaController {

    FrameMahasiswa frame2;
    MahasiswaImplement implementMahasiswa;
    List<Mahasiswa> m;

    public MahasiswaController(FrameMahasiswa frame2) {
        this.frame2 = frame2;
        implementMahasiswa = new MahasiswaDAO();
        m = implementMahasiswa.getData();
    }

    public void isitabel() {
        m = implementMahasiswa.getData();
        MahasiswaModel mm = new MahasiswaModel(m);
        frame2.getTabelMahasiswa().setModel(mm);
    }

    public void insert() {
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date sqldate = new java.sql.Date(frame2.getTglLhr().getDate().getTime());

        Mahasiswa mm = new Mahasiswa();
        mm.setNim(frame2.getNim().getText());
        mm.setNama(frame2.getNama().getText());
        mm.setAlamat(frame2.getAlamat().getText());
        mm.setKota(frame2.getKota().getText());
        mm.setTglLhr(sqldate);
        mm.setJenis_kel(frame2.getJenis_kel());

        implementMahasiswa.insert(mm);
    }

    public void update() {
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date sqldate = new java.sql.Date(frame2.getTglLhr().getDate().getTime());

        Mahasiswa mm = new Mahasiswa();
        mm.setNim(frame2.getNim().getText());
        mm.setNama(frame2.getNama().getText());
        mm.setAlamat(frame2.getAlamat().getText());
        mm.setKota(frame2.getKota().getText());
        mm.setTglLhr(sqldate);
        mm.setJenis_kel(frame2.getJenis_kel());

        implementMahasiswa.update(mm);
    }

    public void delete() {
        Mahasiswa mm = new Mahasiswa();
        mm.setNim(frame2.getNim().getText());
        implementMahasiswa.delete(mm);
    }

    public boolean cek() {
        Mahasiswa mm = new Mahasiswa();
        mm.setNim(frame2.getNim().getText());
        return implementMahasiswa.cek(mm);
    }
}
