/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerService;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;

import javax.swing.JPanel;

import api.TravelSystem;
import api.employee.Employee;
import api.organization.AirlineCompany;
import api.organization.Organization;
import api.request.Flight;
import api.request.FlightTicket;

/**
 *
 * @author Lynn Wei
 */
public class DetailAirCustomerJPanel extends javax.swing.JPanel {
    private javax.swing.JPanel userProcessContainer;
    private TravelSystem system;
    private Employee employee;
    private Organization origanization;
    private FlightTicket flight;
    private SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
    
    public DetailAirCustomerJPanel(JPanel userProcessContainer, Employee employee, TravelSystem system, Organization origanization,
        FlightTicket flight) {
        this.system = system;
        this.employee = employee;
        this.origanization = origanization;
        this.userProcessContainer = userProcessContainer;
        this.flight = flight;
        initComponents();
        
        txtRequestPersonId.setEditable(false);
        txtFlightId.setEditable(false);
        txtOrganizationId.setEditable(false);
        txtType.setEditable(false);
        txtStatus.setEditable(false);
        txtId.setEditable(false);
        txtStartDate.setEditable(false);
        txtendDate.setEditable(false);
        txtMessage.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        txtFlightId = new javax.swing.JTextField();
        lblRequestPersonId = new javax.swing.JLabel();
        txtRequestPersonId = new javax.swing.JTextField();
        txtOrganizationId = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        lblOrganizationId = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblFlightId = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        lblstartDate = new javax.swing.JLabel();
        lblendDate = new javax.swing.JLabel();
        txtendDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblId.setText("Id:");
        add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 39, 23));

        lblMessage.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage.setText("Message:");
        add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 85, 37));

        txtFlightId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtFlightId.setText(flight.getFlightId()+"");
        add(txtFlightId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 166, -1));

        lblRequestPersonId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblRequestPersonId.setText("Request PersonId:");
        add(lblRequestPersonId, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 146, 155, 52));

        txtRequestPersonId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtRequestPersonId.setText(flight.getRequestPersonId());
        add(txtRequestPersonId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 159, 166, -1));

        txtOrganizationId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtOrganizationId.setText(flight.getOrganizationId());
        add(txtOrganizationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 287, 166, -1));

        lblType.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblType.setText("Type:");
        add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 342, -1, 27));

        txtMessage.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtMessage.setText(flight.getMessage());
        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 166, 52));

        txtType.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtType.setText(flight.getType());
        add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 342, 166, -1));

        lblOrganizationId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblOrganizationId.setText("Organization Id:");
        add(lblOrganizationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 274, 150, 52));

        lblTitle.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        lblTitle.setText("AirCustomer Info Details");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 622, 82));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerService/Backbutton_3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 39, 60, 44));

        txtId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtId.setText(flight.getId()+"");
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 166, -1));

        lblFlightId.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblFlightId.setText("Flight Id:");
        add(lblFlightId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 52));

        lblStatus.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        lblStatus.setText("Status:");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, 27));

        txtStatus.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtStatus.setText(flight.getStatus());
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 166, -1));

        txtStartDate.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtStartDate.setText(sdf.format(flight.getStartDate())
        );
        add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 166, -1));

        lblstartDate.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblstartDate.setForeground(new java.awt.Color(240, 240, 240));
        lblstartDate.setText("Start Date:");
        add(lblstartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, 27));

        lblendDate.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblendDate.setForeground(new java.awt.Color(255, 255, 255));
        lblendDate.setText("End Date:");
        add(lblendDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, 27));

        txtendDate.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtendDate.setText(null == flight.getEndDate() ? "" : sdf.format(flight.getEndDate()));
        add(txtendDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 166, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerService/service.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 760, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (employee.getRole().getRole().equals("VIPCustomerService")) {
            VIPCustomerServicePanel showPlaneJPanel = new VIPCustomerServicePanel(userProcessContainer, employee, system, origanization);
            userProcessContainer.add("VIPCustomerServicePanel", showPlaneJPanel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            CustomerServicePanel showPlaneJPanel = new CustomerServicePanel(userProcessContainer, employee, system, origanization);
            userProcessContainer.add("CustomerServicePanel", showPlaneJPanel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFlightId;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblOrganizationId;
    private javax.swing.JLabel lblRequestPersonId;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblendDate;
    private javax.swing.JLabel lblstartDate;
    private javax.swing.JTextField txtFlightId;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtOrganizationId;
    private javax.swing.JTextField txtRequestPersonId;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtendDate;
    // End of variables declaration//GEN-END:variables
}
