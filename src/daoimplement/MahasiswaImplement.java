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
public interface MahasiswaImplement {
    public void insert(Mahasiswa m);
    public void update(Mahasiswa m);
    public void delete(String nim);
    public boolean cek(String nim);
    public List<Mahasiswa> getData();
}
