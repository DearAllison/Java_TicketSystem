/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import api.TravelSystem;
import api.DB4oUtil.DB4OUtil;
import api.employee.Employee;

import api.organization.Organization;
import api.enterprise.Enterprise;
import api.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Container;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.FrameBorderStyle;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private TravelSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame(){
        try
        {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }
        catch(Exception e)
        {
            //TODO exception
            System.out.println("加载炫彩皮肤失败！");
        }
        initComponents();
        try {
            system = dB4OUtil.retrieveSystem();
        } catch (ParseException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CbxEnter.removeAllItems();
        for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()){
            CbxEnter.addItem(e.getName());
        }
        CbxOr.removeAllItems();
        for(Organization o : system.getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList()){
            CbxOr.addItem(o.getName());
        }
        CbxRole.removeAllItems();
        CbxRole.addItem("AirportControl");
        container.add("blank",new JPanel());  
        this.setSize(1680, 1050);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        CbxRole = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CbxOr = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CbxEnter = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        CbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("login as");

        CbxOr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbxOr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxOrItemStateChanged(evt);
            }
        });

        jLabel4.setText("login to");

        CbxEnter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbxEnter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxEnterItemStateChanged(evt);
            }
        });

        jLabel5.setText("Your Enterprise");

        jLabel6.setText("TravelSystem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CbxRole, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CbxOr, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserName)
                    .addComponent(passwordField)
                    .addComponent(CbxEnter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginJLabel)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbxEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbxOr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(loginJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutJButton)
                .addGap(23, 23, 23))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = txtUserName.getText();
        String password = new String (passwordField.getPassword());
        Boolean flag = false;
        if(system.getAdmin().getEmployeeAccount().equals(userName) && system.getAdmin().getEmployeePassword().equals(password)){
            jSplitPane1.setRightComponent(system.getAdmin().getRole().createWorkArea(system.getAdmin(), system, null));
            flag = true;
        }
        else{
            for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(CbxEnter.getSelectedItem().toString())){
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                        if(o.getName().equals(CbxOr.getSelectedItem().toString())){
                            if(CbxRole.getSelectedItem().toString().equals("Customer")){
                                for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                                    if(u.getUsername().equals(userName) && u.getPassword().equals(password) && u.getStatus().equals("Activated")){
                                       jSplitPane1.setRightComponent(u.getRole().createWorkArea(u, system, o));
                                       flag = true;
                                    }
                                }
                            }
                            else{
                                for(Employee em : o.getEmployeeDirectory().getEmployeeList()){
                                    if(em.getEmployeeAccount().equals(userName) && em.getEmployeePassword().equals(password) && em.getStatus().equals("Activated")){
                                        JPanel showPlaneJPanel = em.getRole().createWorkArea(container, em, system, o);
                                        container.add("showPlaneJPanel",showPlaneJPanel);
                                        CardLayout layout = (CardLayout)  container.getLayout();
                                        layout.last(container);
                                        // jSplitPane1.setRightComponent(em.getRole().createWorkArea(em, system, o));
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(this, "userName or password wrong");
        }else{
        logoutJButton.setEnabled(true);
        txtUserName.setEnabled(false);
        passwordField.setEnabled(false);
        loginJButton.setEnabled(false);
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        txtUserName.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        txtUserName.setText("");
        passwordField.setText("");
        //JPanel blankJP = new JPanel();
        //jSplitPane1.setRightComponent(blankJP);
         CardLayout layout = (CardLayout)  container.getLayout();
         layout.show(container, "blank");
        jSplitPane1.setRightComponent(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void CbxEnterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxEnterItemStateChanged
        // TODO add your handling code here:
         if(CbxEnter.getSelectedItem() != null){
            if(CbxEnter.getSelectedItem().equals("Airport")){
                CbxOr.removeAllItems();
                for(Organization o : system.getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList()){
                    CbxOr.addItem(o.getName());
                }
                CbxRole.removeAllItems();
                CbxRole.addItem("AirportControl");
            }
            else if(CbxEnter.getSelectedItem().equals("Station")){
                CbxOr.removeAllItems();
                for(Organization o : system.getEnterpriseDirectory().getEnterpriseList().get(1).getOrganizationDirectory().getOrganizationList()){
                    CbxOr.addItem(o.getName());
                }
                CbxRole.removeAllItems();
                CbxRole.addItem("StationControl");
            }
            else if(CbxEnter.getSelectedItem().equals("AirlineCompany")){
                CbxOr.removeAllItems();
                for(Organization o : system.getEnterpriseDirectory().getEnterpriseList().get(2).getOrganizationDirectory().getOrganizationList()){
                    CbxOr.addItem(o.getName());
                }
                CbxRole.removeAllItems();
                CbxRole.addItem("Customer");
                CbxRole.addItem("Employee");
            }
            else if(CbxEnter.getSelectedItem().equals("RailwayCompany")){
                CbxOr.removeAllItems();
                for(Organization o : system.getEnterpriseDirectory().getEnterpriseList().get(3).getOrganizationDirectory().getOrganizationList()){
                    CbxOr.addItem(o.getName());
                }
                CbxRole.removeAllItems();
                CbxRole.addItem("Customer");
                CbxRole.addItem("Employee");
            }
        }
    }//GEN-LAST:event_CbxEnterItemStateChanged

    private void CbxOrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxOrItemStateChanged

    }//GEN-LAST:event_CbxOrItemStateChanged

    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxEnter;
    private javax.swing.JComboBox<String> CbxOr;
    private javax.swing.JComboBox<String> CbxRole;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
