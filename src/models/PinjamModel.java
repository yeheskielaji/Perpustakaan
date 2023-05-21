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
public class PinjamModel extends AbstractTableModel {

    List<Pinjam> Pinjam;
    public PinjamModel(List<Pinjam> Pinjam) {
        this.Pinjam = Pinjam;
    }
    
    @Override
    public int getRowCount() {
        return Pinjam.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                 return "Tanggal Pinjam";
            case 1:
                 return "NIM Mahasiswa";
            case 2:
                 return "Kode Buku";
            case 3:
                 return "Tanggal Harus Kembali";
            case 4:
                 return "Tanggal Kembali";
            default:
                return null;
        }
    } 
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
                case 0:
                     return Pinjam.get(row).getTgl_pinjam();
                case 1:
                     return Pinjam.get(row).getMhs_nim();
                case 2:
                     return Pinjam.get(row).getBuk_kode_buku();
                case 3:
                     return Pinjam.get(row).getTgl_hrs_kembali();
                case 4:
                     return Pinjam.get(row).getTgl_kembali();
                default:
                    return null;
            }
    }
    
}
