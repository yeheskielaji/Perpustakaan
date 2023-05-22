/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import daotabel.PenerbitDAO;
import daoimplement.PenerbitImplement;
import models.*;
//import view.FramePenerbit;
import view.FrameInput;


/**
 *
 * @author andra
 */
public class PenerbitController {
    FrameInput frame3;
    PenerbitImplement implementPenerbit;
    List<Penerbit> p;
    
    public PenerbitController(FrameInput frame3) {
        this.frame3 = frame3;
        implementPenerbit = new PenerbitDAO();
        p = implementPenerbit.getData();
    }
    
    public void isitabel() {
        p = implementPenerbit.getData();
        PenerbitModel pp = new PenerbitModel(p);
        frame3.getTabelPenerbit().setModel(pp);
    }
    
    public void insert() {
        Penerbit pp = new Penerbit();
        pp.setKode_penerbit(frame3.getKodepenerbit().getText());
        pp.setNm_penerbit(frame3.getNamapenerbit().getText());
        
        
        implementPenerbit.insert(pp);
    }
    
    public void update() {
        Penerbit pp = new Penerbit();
        pp.setKode_penerbit(frame3.getKodepenerbit().getText());
        pp.setNm_penerbit(frame3.getNamapenerbit().getText());
        
        implementPenerbit.update(pp);
    }
    
    public void delete() {
        Penerbit pp = new Penerbit();
        pp.setKode_penerbit(frame3.getKodepenerbit().getText());
        implementPenerbit.delete(pp);
    }
    
    public boolean cek() {
        Penerbit pp = new Penerbit();
        pp.setKode_penerbit(frame3.getKodepenerbit().getText());
        return implementPenerbit.cek(pp);
    }
}
