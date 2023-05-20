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
public interface PenerbitImplement {
    public void insert(Penerbit p);
    public void update(Penerbit p);
    public void delete(String id);
    public boolean cek(String id);
    public List<Penerbit> getData();
}
