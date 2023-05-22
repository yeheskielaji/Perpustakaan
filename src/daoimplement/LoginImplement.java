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
public interface LoginImplement {
    public void insert(Admin a);
    public void update(Admin a);
    public void delete(Admin a);
    public boolean cek(Admin a);
    public List<Admin> getData();
}
