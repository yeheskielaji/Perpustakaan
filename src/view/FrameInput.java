/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.BukuController;
import controller.PenerbitController;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author andra
 */
public class FrameInput extends javax.swing.JFrame {

    /**
     * Creates new form FrameUtama
     */
    BukuController bc;
    PenerbitController pc;
    public FrameInput() {
        initComponents();
        bc = new BukuController(this);
        bc.isitabel();
        pc = new PenerbitController(this);
        pc.isitabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        kodebuku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        penerbit = new javax.swing.JTextField();
        jml = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        pengarang = new javax.swing.JTextField();
        judul = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        namapenerbit = new javax.swing.JTextField();
        btnDelete1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPenerbit = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        kodepenerbit = new javax.swing.JTextField();
        btnSimpan1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jTabbedPane2.setBackground(new java.awt.Color(0, 102, 51));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setDoubleBuffered(true);
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane2.setInheritsPopupMenu(true);

        jPanel1.setBackground(new java.awt.Color(127, 144, 147));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/icon/delete.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JUDUL                    :");

        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBuku);

        btnUpdate.setBackground(new java.awt.Color(0, 102, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/icon/edit.png"))); // NOI18N
        btnUpdate.setText(" EDIT ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KODE BUKU          :");

        btnSimpan.setBackground(new java.awt.Color(0, 102, 51));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/icon/save.png"))); // NOI18N
        btnSimpan.setText("SAVE");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        kodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodebukuActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JUMLAH                 :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PENGARANG         :");

        jml.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KODE PENERBIT   :");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INPUT DATA BUKU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kodebuku)
                            .addComponent(judul)
                            .addComponent(pengarang)
                            .addComponent(penerbit)
                            .addComponent(jml, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        kodebuku.setDocument(new JTextFieldLimit(4));
        penerbit.setDocument(new JTextFieldLimit(2));
        pengarang.setDocument(new JTextFieldLimit(40));
        judul.setDocument(new JTextFieldLimit(40));

        jTabbedPane2.addTab("INPUT DATA BUKU", jPanel1);

        jPanel2.setBackground(new java.awt.Color(100, 149, 237));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnUpdate1.setBackground(new java.awt.Color(0, 136, 255));
        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/icon/edit.png"))); // NOI18N
        btnUpdate1.setText(" EDIT ");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NAMA PENERBIT  :");

        btnDelete1.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/icon/delete.png"))); // NOI18N
        btnDelete1.setText("DELETE");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        tabelPenerbit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabelPenerbit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPenerbitMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelPenerbit);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KODE PENERBIT   :");

        kodepenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodepenerbitActionPerformed(evt);
            }
        });

        btnSimpan1.setBackground(new java.awt.Color(50, 205, 50));
        btnSimpan1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan1.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/icon/save.png"))); // NOI18N
        btnSimpan1.setText("SAVE");
        btnSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpan1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INPUT DATA PENERBIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kodepenerbit)
                            .addComponent(namapenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSimpan1)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate1)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDelete1)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodepenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namapenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan1)
                            .addComponent(btnUpdate1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete1)))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        namapenerbit.setDocument(new JTextFieldLimit(20));
        kodepenerbit.setDocument(new JTextFieldLimit(2));

        jTabbedPane2.addTab("INPUT DATA PENERBIT", jPanel2);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(180, 140, 790, 460);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/icon/home.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 620, 80, 50);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/backgound/backgroundlogoatas.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(1090, 670));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1090, 670);

        setSize(new java.awt.Dimension(1108, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if (kodebuku.getText().equals("")||jml.getText().equals("")||judul.getText().equals("")||penerbit.getText().equals("")||pengarang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Input blm lengkap", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (bc.cek()) {
                    JOptionPane.showMessageDialog(null, "Kode Sudah Ada", "Error", JOptionPane.ERROR_MESSAGE);
            } else  bc.insert();
        }
        bc.isitabel();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void kodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodebukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodebukuActionPerformed

    private void tabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuMouseClicked
        // TODO add your handling code here:
        int baris = tabelBuku.getSelectedRow();
        kodebuku.setText(tabelBuku.getValueAt(baris, 0).toString());
        judul.setText(tabelBuku.getValueAt(baris, 1).toString());
        pengarang.setText(tabelBuku.getValueAt(baris, 2).toString());
        jml.setText(tabelBuku.getValueAt(baris, 3).toString());
        penerbit.setText(tabelBuku.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tabelBukuMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        bc.update();
        bc.isitabel();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        bc.delete();
        bc.isitabel();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlActionPerformed

    private void tabelPenerbitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPenerbitMouseClicked
        // TODO add your handling code here:
        int baris = tabelPenerbit.getSelectedRow();
        kodepenerbit.setText(tabelPenerbit.getValueAt(baris, 0).toString());
        namapenerbit.setText(tabelPenerbit.getValueAt(baris, 1).toString());
        penerbit.setText(tabelPenerbit.getValueAt(baris, 0).toString());
    }//GEN-LAST:event_tabelPenerbitMouseClicked

    private void kodepenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodepenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodepenerbitActionPerformed

    private void btnSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan1ActionPerformed
        // TODO add your handling code here:
        if (kodepenerbit.getText().equals("")||namapenerbit.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Input blm lengkap", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (pc.cek()) {
                    JOptionPane.showMessageDialog(null, "Kode Sudah Ada", "Error", JOptionPane.ERROR_MESSAGE);
            } else  pc.insert();
        }
        
        pc.isitabel();
    }//GEN-LAST:event_btnSimpan1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        pc.update();
        pc.isitabel();
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        pc.delete();
        pc.isitabel();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Dashbord frame = new Dashbord();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSimpan1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JFormattedTextField jml;
    private javax.swing.JTextField judul;
    private javax.swing.JTextField kodebuku;
    private javax.swing.JTextField kodepenerbit;
    private javax.swing.JTextField namapenerbit;
    private javax.swing.JTextField penerbit;
    private javax.swing.JTextField pengarang;
    private javax.swing.JTable tabelBuku;
    private javax.swing.JTable tabelPenerbit;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelBuku() {
        return tabelBuku;
    }

    public void setTabelBuku(JTable tabelBuku) {
        this.tabelBuku = tabelBuku;
    }

    public JFormattedTextField getJml() {
        return jml;
    }

    public void setJml(JFormattedTextField jml) {
        this.jml = jml;
    }

    public JTextField getJudul() {
        return judul;
    }

    public void setJudul(JTextField judul) {
        this.judul = judul;
    }

    public JTextField getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(JTextField kodebuku) {
        this.kodebuku = kodebuku;
    }

    public JTextField getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(JTextField penerbit) {
        this.penerbit = penerbit;
    }

    public JTextField getPengarang() {
        return pengarang;
    }

    public void setPengarang(JTextField pengarang) {
        this.pengarang = pengarang;
    }

    public JTextField getKodepenerbit() {
        return kodepenerbit;
    }

    public void setKodepenerbit(JTextField kodepenerbit) {
        this.kodepenerbit = kodepenerbit;
    }

    public JTextField getNamapenerbit() {
        return namapenerbit;
    }

    public void setNamapenerbit(JTextField namapenerbit) {
        this.namapenerbit = namapenerbit;
    }

    public JTable getTabelPenerbit() {
        return tabelPenerbit;
    }

    public void setTabelPenerbit(JTable tabelPenerbit) {
        this.tabelPenerbit = tabelPenerbit;
    }
    
    

}
