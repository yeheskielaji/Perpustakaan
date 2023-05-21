/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.sql.*;

/**
 *
 * @author andra
 */
public class Pinjam {
    private Date Tgl_pinjam;
    private String Mhs_nim;
    private String Buk_kode_buku;
    private Date Tgl_hrs_kembali;
    private Date Tgl_kembali;

    public Date getTgl_pinjam() {
        return Tgl_pinjam;
    }

    public void setTgl_pinjam(Date Tgl_pinjam) {
        this.Tgl_pinjam = Tgl_pinjam;
    }

    public String getMhs_nim() {
        return Mhs_nim;
    }

    public void setMhs_nim(String Mhs_nim) {
        this.Mhs_nim = Mhs_nim;
    }

    public String getBuk_kode_buku() {
        return Buk_kode_buku;
    }

    public void setBuk_kode_buku(String Buk_kode_buku) {
        this.Buk_kode_buku = Buk_kode_buku;
    }

    public Date getTgl_hrs_kembali() {
        return Tgl_hrs_kembali;
    }

    public void setTgl_hrs_kembali(Date Tgl_hrs_kembali) {
        this.Tgl_hrs_kembali = Tgl_hrs_kembali;
    }

    public Date getTgl_kembali() {
        return Tgl_kembali;
    }

    public void setTgl_kembali(Date Tgl_kembali) {
        this.Tgl_kembali = Tgl_kembali;
    }

    
}

    