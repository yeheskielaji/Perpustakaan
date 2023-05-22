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
    public boolean ceknim(Pinjam p);
    public boolean cekdobel(Pinjam p);
    public boolean cekbuku(Pinjam p);
    public List<Pinjam> carinim(Pinjam pp);
    public List<Pinjam> getData();
}
