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
public class MahasiswaModel extends AbstractTableModel {

    List<Mahasiswa> Mahasiswa;
    public MahasiswaModel(List<Mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }
    
    @Override
    public int getRowCount() {
        return Mahasiswa.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                 return "Nim";
            case 1:
                 return "Nama";
            case 2:
                 return "Alamat";
            case 3:
                 return "Kota";
            case 4:
                 return "TglLhr";
            case 5:
                 return "Jenis_kel";
            default:
                return null;
        }
    } 
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
                case 0:
                     return Mahasiswa.get(row).getNim();
                case 1:
                     return Mahasiswa.get(row).getNama();
                case 2:
                     return Mahasiswa.get(row).getAlamat();
                case 3:
                     return Mahasiswa.get(row).getKota();
                case 4:
                     return Mahasiswa.get(row).getTglLhr();
                case 5:
                     return Mahasiswa.get(row).getJenis_kel();
                default:
                    return null;
            }
    }
    
}
