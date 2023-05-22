/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author andra
 */
public class AdminModel extends AbstractTableModel {

    List<Admin> admin;
    public AdminModel(List<Admin> admin) {
        this.admin = admin;
    }
    
    @Override
    public int getRowCount() {
        return admin.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                 return "user";
            case 1:
                 return "password";
            default:
                return null;
        }
    } 
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
                case 0:
                     return admin.get(row).getUser();
                case 1:
                     return admin.get(row).getPassword();
                default:
                    return null;
            }
    }
    
}
