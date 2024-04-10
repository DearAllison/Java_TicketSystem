/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AirlineCompany;

import api.TravelSystem;
import api.DB4oUtil.DB4OUtil;
import api.employee.Employee;
import api.organization.AirlineCompany;
import api.organization.Organization;
import api.property.Airplane;

import java.awt.CardLayout;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.AirlineCompany.*;

/**
 *
 * @author Lynn Wei
 */
public class AddPlaneJPanel extends javax.swing.JPanel {

    private javax.swing.JPanel userProcessContainer;
    private TravelSystem system;
    private Employee employee;
    private Organization origanization;
    
    public AddPlaneJPanel(JPanel userProcessContainer, Employee employee, TravelSystem system, Organization origanization) {
        this.system = system;
        this.employee = employee;
        this.origanization = origanization;
        this.userProcessContainer = userProcessContainer;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlaneType = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtPlaneId = new javax.swing.JTextField();
        lblTitle6 = new javax.swing.JLabel();
        lblTitle7 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblTitle8 = new javax.swing.JLabel();
        lblTitle14 = new javax.swing.JLabel();
        lblTitle15 = new javax.swing.JLabel();
        txtSeatNum = new javax.swing.JTextField();
        txtEcoNum = new javax.swing.JTextField();
        txtBusiNum = new javax.swing.JTextField();
        lblTitle18 = new javax.swing.JLabel();
        txtFirstNum = new javax.swing.JTextField();
        lblTitle20 = new javax.swing.JLabel();
        lblTitle9 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPlaneType.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        add(txtPlaneType, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 167, 30));

        lblTitle.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblTitle.setText("Aircraft type:");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        btnAdd.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 149, 42));

        txtPlaneId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        add(txtPlaneId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 167, 30));

        lblTitle6.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblTitle6.setText("Aircraft number/ID:");
        add(lblTitle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        lblTitle7.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblTitle7.setText("Year:");
        add(lblTitle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        txtYear.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 167, 30));

        lblTitle8.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        lblTitle8.setText("Add Airplane");
        add(lblTitle8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        lblTitle14.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblTitle14.setText("Economy class seats number:");
        add(lblTitle14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        lblTitle15.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblTitle15.setText("Seats number:");
        add(lblTitle15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        txtSeatNum.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        add(txtSeatNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 167, 30));

        txtEcoNum.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        add(txtEcoNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 100, 30));

        txtBusiNum.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        add(txtBusiNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 100, 30));

        lblTitle18.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblTitle18.setText("Business class seats number:");
        add(lblTitle18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        txtFirstNum.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        add(txtFirstNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 100, 30));

        lblTitle20.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblTitle20.setText("First class seats number:");
        add(lblTitle20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        lblTitle9.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblTitle9.setText("Age:");
        add(lblTitle9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        txtAge.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 167, 30));

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AirlineCompany/Backbutton_3.png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AirlineCompany/earth_1.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AirlineCompany/findway.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 420, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String Id = txtPlaneId.getText();
        String type = txtPlaneType.getText();
        int year = Integer.parseInt(txtYear.getText());
        int age = Integer.parseInt(txtAge.getText());
        int seatNumber = Integer.parseInt(txtSeatNum.getText());
        int ecoSeatNumber = Integer.parseInt(txtEcoNum.getText());
        int busSeatNumber = Integer.parseInt(txtBusiNum.getText());
        int firstSeatNumber = Integer.parseInt(txtFirstNum.getText());
        AirlineCompany airLineCompany = (AirlineCompany)origanization;
        // check 
        List<Airplane> airplaneList = airLineCompany.getAirplaneList();
        for (Airplane airPlane : airplaneList) {
            if (airPlane.getId().equals(Id)) {
                JOptionPane.showMessageDialog(null, "Aircraft number/ID already exists!");
                return;
            }
        }
        Airplane airPlane = new Airplane(Id, type, year, age, seatNumber, ecoSeatNumber, busSeatNumber, firstSeatNumber);
        airLineCompany.addAirplane(airPlane);
        DB4OUtil.getInstance().storeSystem(system);
        // Information Added Succesfully!
        JOptionPane.showMessageDialog(null, "Information Added Succesfully!");
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ShowPlaneJPanel rwajp = new ShowPlaneJPanel(userProcessContainer, employee, system, origanization);
        userProcessContainer.add("ShowPlaneJPanel", rwajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle14;
    private javax.swing.JLabel lblTitle15;
    private javax.swing.JLabel lblTitle18;
    private javax.swing.JLabel lblTitle20;
    private javax.swing.JLabel lblTitle6;
    private javax.swing.JLabel lblTitle7;
    private javax.swing.JLabel lblTitle8;
    private javax.swing.JLabel lblTitle9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBusiNum;
    private javax.swing.JTextField txtEcoNum;
    private javax.swing.JTextField txtFirstNum;
    private javax.swing.JTextField txtPlaneId;
    private javax.swing.JTextField txtPlaneType;
    private javax.swing.JTextField txtSeatNum;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
