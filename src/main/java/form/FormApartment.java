/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package form;

import apartment.Apartment.MyConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gink
 */
public class FormApartment extends javax.swing.JInternalFrame {
private DefaultTableModel modelApartment;
    private Connection conn = MyConnect.getConnection();
    /**
     * Creates new form FormApartment
     */
    public FormApartment() {
        initComponents();
        this.setTitle("อพาร์ทเมนต์");
        modelApartment = (DefaultTableModel)tableApart.getModel();
    }

    public void showData() {
        try {//clear data
            int totalRow = tableApart.getRowCount()  -1;
            
            while (totalRow > -1) {
                modelApartment.removeRow(totalRow);
                totalRow--;
            }// add record
//            String search = txtSearchApart.getText();
//            String sql = " SELECT * FROM db_apartment.tb_apartment " + " where " + " apart_name LIKE ('%" + search + "%' )" + " OR apart_address LIKE ('%" + search + "%')" + " OR apart_phone LIKE ('%" + search + "%')" + " OR build_year LIKE ('%" + search + "%')" + " OR begin_rate LIKE ('%" + search + "%')";
           String sql = " SELECT * FROM  db_apartment.tb_apartment";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            int row = 0;
            while (rs.next()) {
                modelApartment.addRow(new Object[0]);
                modelApartment.setValueAt(rs.getInt("apart_no"), row, 0);
                modelApartment.setValueAt(rs.getString("apart_name"), row, 1);
                modelApartment.setValueAt(rs.getString("apart_address"), row, 2);
                modelApartment.setValueAt(rs.getString("apart_phone"), row, 3);
                modelApartment.setValueAt(rs.getString("build_year"), row, 4);
                modelApartment.setValueAt(rs.getString("begin_rate"), row, 5);
                row++;
            }
            tableApart.setModel(modelApartment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtApartNo1 = new javax.swing.JLabel();
        txtApartNo = new javax.swing.JTextField();
        txtApartName1 = new javax.swing.JLabel();
        txtApartAddress1 = new javax.swing.JLabel();
        txtApartPhone1 = new javax.swing.JLabel();
        txtBuildYear1 = new javax.swing.JLabel();
        txtBeginRate1 = new javax.swing.JLabel();
        txtApartName = new javax.swing.JTextField();
        txtApartAddress = new javax.swing.JTextField();
        txtApartPhone = new javax.swing.JTextField();
        txtBuildYear = new javax.swing.JTextField();
        txtBeginRate = new javax.swing.JTextField();
        cmdSaveApart = new javax.swing.JButton();
        cmdUpdateApart = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableApart = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSeachApart = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("อพาร์ทเมนท์");
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        txtApartNo1.setText("เลขที่อพาร์ทเมนท์");

        txtApartNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApartNoActionPerformed(evt);
            }
        });

        txtApartName1.setText("ชื่ออพาร์ทเมนท์");

        txtApartAddress1.setText("ที่อยู่");

        txtApartPhone1.setText("เบอร์โทรศัพท์");

        txtBuildYear1.setText("ปีที่สร้าง");

        txtBeginRate1.setText("ราคาห้องเริ่มต้น");

        txtApartAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApartAddressActionPerformed(evt);
            }
        });

        txtBuildYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuildYearActionPerformed(evt);
            }
        });

        cmdSaveApart.setText("บันทึก");
        cmdSaveApart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveApartActionPerformed(evt);
            }
        });

        cmdUpdateApart.setText("แก้ไข");
        cmdUpdateApart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateApartActionPerformed(evt);
            }
        });

        cmdDelete.setText("ลบ");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        tableApart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "เลขที่", "ชื่ออพาร์ทเมนท์", "ที่อยู่", "เบอร์โทร", "ปีที่สร้าง", "ราคาเริ่มต้น"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableApart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableApartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableApart);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ค้นหาข้อมูล"));

        txtSeachApart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSeachApartKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSeachApart, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtSeachApart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApartName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApartNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtApartAddress1)
                            .addComponent(txtApartPhone1)
                            .addComponent(txtBuildYear1)
                            .addComponent(txtBeginRate1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdSaveApart)
                                .addGap(18, 18, 18)
                                .addComponent(cmdUpdateApart)
                                .addGap(18, 18, 18)
                                .addComponent(cmdDelete))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApartNo)
                                .addComponent(txtApartName)
                                .addComponent(txtApartAddress)
                                .addComponent(txtApartPhone)
                                .addComponent(txtBuildYear)
                                .addComponent(txtBeginRate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApartNo1)
                            .addComponent(txtApartNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApartName1)
                            .addComponent(txtApartName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApartAddress1)
                            .addComponent(txtApartAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApartPhone1)
                            .addComponent(txtApartPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuildYear1)
                            .addComponent(txtBuildYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBeginRate1)
                            .addComponent(txtBeginRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSaveApart)
                    .addComponent(cmdUpdateApart)
                    .addComponent(cmdDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorAdded

    private void txtApartNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApartNoActionPerformed
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_txtApartNoActionPerformed

    private void cmdSaveApartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveApartActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO db_apartment.tb_apartment(apart_no,apart_name,apart_address,apart_phone,build_year,begin_rate )"
                    + "Values(?,?,?,?,?,?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, txtApartNo.getText());
            pre.setString(2, txtApartName.getText());
            pre.setString(3, txtApartAddress.getText());
            pre.setString(4, txtApartPhone.getText());
            pre.setString(5, txtBuildYear.getText());
            pre.setString(6, txtBeginRate.getText());
            if (pre.executeUpdate()!= -1) {
                JOptionPane.showMessageDialog(this, "บันทึกรายการแล้ว", "ผลการบันทึกรายการ", JOptionPane.INFORMATION_MESSAGE);
                txtApartNo.setText("");
                txtApartName.setText("");
                txtApartAddress.setText("");
                txtApartPhone.setText("");
                txtBuildYear.setText("");
                txtBeginRate.setText("");
     showData();
            }
        }catch (Exception e){
            e.printStackTrace();
                        }         
    }//GEN-LAST:event_cmdSaveApartActionPerformed

    private void cmdUpdateApartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateApartActionPerformed
        // TODO add your handling code here:
        int index = tableApart.getSelectedRow();
        
        if (index != -1) {
            int pk = (Integer) tableApart.getValueAt(index, 0);
            String sql = "UPDATE db_apartment.tb_apartment SET  apart_name = ?, apart_address = ?, apart_phone = ?,build_year = ?,begin_rate = ? WHERE apart_no = "+pk ;
            try {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, txtApartName.getText());
                pre.setString(2, txtApartAddress.getText());
                pre.setString(3, txtApartPhone.getText());
                pre.setString(4, txtBuildYear.getText());
                pre.setString(5, txtBeginRate.getText());
                
                if (pre.executeUpdate() != -1) {
                }
                JOptionPane.showMessageDialog(this, "แก้ไขรายการแล้ว", "ผลการบันทึกรายการ", JOptionPane.INFORMATION_MESSAGE);
                txtApartNo.setText("");
                txtApartName.setText("");
                txtApartAddress.setText("");
                txtApartPhone.setText("");
                txtBuildYear.setText("");
                txtBeginRate.setText("");
                showData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cmdUpdateApartActionPerformed

    private void txtApartAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApartAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApartAddressActionPerformed

    private void txtBuildYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuildYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuildYearActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tableApartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableApartMouseClicked
        // TODO add your handling code here:
        int index = tableApart.getSelectedRow();
        txtApartNo.setText(tableApart.getValueAt(index, 0).toString());
        txtApartName.setText(tableApart.getValueAt(index, 1).toString());
        txtApartAddress.setText(tableApart.getValueAt(index, 2).toString());
        txtApartPhone.setText(tableApart.getValueAt(index, 3).toString());
        txtBuildYear.setText(tableApart.getValueAt(index, 4).toString());
        txtBeginRate.setText(tableApart.getValueAt(index, 5).toString());
    }//GEN-LAST:event_tableApartMouseClicked

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        int index = tableApart.getSelectedRow();
        if (index != -1) {
            int pk = (Integer) tableApart.getValueAt(index, 0);
            String sql = "Delete from db_apartment.tb_apartment where apart_no = " + pk;
            try {
                if (conn.createStatement().executeUpdate(sql) != -1) {
                    JOptionPane.showMessageDialog(this, "ลบรายการแล้ว", "ผลการลบรายการ", JOptionPane.INFORMATION_MESSAGE);
                    txtApartNo.setText("");
                    txtApartName.setText("");
                    txtApartAddress.setText("");
                    txtApartPhone.setText("");
                    txtBuildYear.setText("");
                    txtBeginRate.setText("");
                    showData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void txtSeachApartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeachApartKeyReleased
        // TODO add your handling code here:
//        String searchText = txtSearchApart.getText();
//        try {
//            if (!searchText.isEmpty()) {
//                showData();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
    }//GEN-LAST:event_txtSeachApartKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdSaveApart;
    private javax.swing.JButton cmdUpdateApart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableApart;
    private javax.swing.JTextField txtApartAddress;
    private javax.swing.JLabel txtApartAddress1;
    private javax.swing.JTextField txtApartName;
    private javax.swing.JLabel txtApartName1;
    private javax.swing.JTextField txtApartNo;
    private javax.swing.JLabel txtApartNo1;
    private javax.swing.JTextField txtApartPhone;
    private javax.swing.JLabel txtApartPhone1;
    private javax.swing.JTextField txtBeginRate;
    private javax.swing.JLabel txtBeginRate1;
    private javax.swing.JTextField txtBuildYear;
    private javax.swing.JLabel txtBuildYear1;
    private javax.swing.JTextField txtSeachApart;
    // End of variables declaration//GEN-END:variables
}
