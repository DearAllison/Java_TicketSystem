/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Airport;

import ui.captain.*;
import api.TravelSystem;
import api.employee.Employee;
import api.organization.*;
import api.property.*;
import api.property.Airplane;
import api.request.Flight;
import api.request.Landing;
import api.request.TrainLine;
import api.request.request;
import api.userAccount.UserAccount;
import ui.Airport.*;
import ui.AirlineCompany.*;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author wangqingtang
 */
public class LandingCommandPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlineCompanyJPanel
     */
    JPanel container;
    private TravelSystem system;
    private Employee account;
    private Airport airport;
    public LandingCommandPanel(JPanel container,Employee em,TravelSystem system, Organization o) {
        this.system = system;
        this.account = em;
        this.airport = (Airport) o;
        this.container = container;
        initComponents();
        populateTable();
    }
    
    private void populateTable() {
        
         DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
        List<request> requests = airport.getRequestDirectory().getRequestList();
        for (request request : requests) {
            Landing landing = (Landing)request;
            Flight flight = landing.getFlight();
            Object[] row = new Object[6];
            row[0] = landing;
            row[1] = landing.getId();
            row[2] = flight.getStartAirport();
            row[3] = flight.getCaptain().getName();
            row[4] = landing.getRoad()==null?0:landing.getRoad().getRoadNumber();
            row[5] = landing.getGate()==null?0:landing.getGate().getNumber();
            model.addRow(row);
            }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        lblTitle.setText("Flight Command");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jScrollPane1.setFont(new java.awt.Font("Gabriola", 0, 20)); // NOI18N

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "Filght Number", "Start Airport", "Airline Captain", "Road", "Gate "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(30);
        workRequestJTable.setSelectionForeground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setMinWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1003, 250));

        jButton4.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jButton4.setText("Agree");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 498, 149, 42));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Airport/Backbutton_3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 60));

        jButton5.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jButton5.setText("Disagree");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 498, 149, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Airport/airport2_副本.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 390, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Landing landing = (Landing) workRequestJTable.getValueAt(row, 0);
        LandingPanel editflightInfoPanel = new LandingPanel(container,airport, landing);
        container.add("LandingPanel", editflightInfoPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
