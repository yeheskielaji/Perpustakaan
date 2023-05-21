/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daoimplement;
import java.util.List;
import models.*;

/**
 *
 * @author andra
 */
public interface PinjamImplement {
    public void insert(Pinjam p);
    public void update(Pinjam p);
//    public void delete(String nim);
    public boolean cek(String nim, String kode);
    public boolean cekbuku(String kode);
    public List<Pinjam> carinim(Pinjam pp);
    public List<Pinjam> getData();
}
