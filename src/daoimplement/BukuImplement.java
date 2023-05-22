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
public interface BukuImplement {
    public void insert(Buku b);
    public void update(Buku b);
    public void delete(Buku b);
    public boolean cek(Buku b);
    public List<Buku> getData();
}
