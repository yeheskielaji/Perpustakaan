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
public class BukuModel extends AbstractTableModel {

    List<Buku> buku;
    public BukuModel(List<Buku> buku) {
        this.buku = buku;
    }
    
    @Override
    public int getRowCount() {
        return buku.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                 return "Kode_buku";
            case 1:
                 return "Judul";
            case 2:
                 return "Pengarang";
            case 3:
                 return "Jml_buku";
            case 4:
                 return "Kode_Penerbit";
            default:
                return null;
        }
    } 
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
                case 0:
                     return buku.get(row).getKode_buku();
                case 1:
                     return buku.get(row).getJudul();
                case 2:
                     return buku.get(row).getPengarang();
                case 3:
                     return buku.get(row).getJml_buku();
                case 4:
                     return buku.get(row).getKode_Penerbit();
                default:
                    return null;
            }
    }
    
}
