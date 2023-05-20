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
public class PenerbitModel extends AbstractTableModel {

    List<Penerbit> penerbit;
    public PenerbitModel(List<Penerbit> penerbit) {
        this.penerbit = penerbit;
    }
    
    @Override
    public int getRowCount() {
        return penerbit.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                 return "Kode Penerbit";
            case 1:
                 return "Nama Penerbit";
            default:
                return null;
        }
    } 
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
                case 0:
                     return penerbit.get(row).getKode_penerbit();
                case 1:
                     return penerbit.get(row).getNm_penerbit();
                default:
                    return null;
            }
    }
    
}
