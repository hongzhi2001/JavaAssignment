/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class PeopleMyProfile extends javax.swing.JFrame {

    /**
     * Creates new form PeopleMyProfile
     */
    public PeopleMyProfile() {
        initComponents();
    }
    
    public void getProfile(People user){
        user = JavaAssignment.login;
        txtName.setText(user.getName());
        txtIdenNo.setText(user.getIdentityNo());
        txtDOB.setText(user.getDob());
        txtPhoneNo.setText(user.getPhoneNo());
        txtEmail.setText(user.getEmail());
        txtAddress.setText(user.getAddress());

        if(user.getName().equals(txtName.getText()) && user.getPhoneNo().equals(txtPhoneNo.getText()) 
                && user.getEmail().equals(txtEmail.getText()) && user.getAddress().equals(txtAddress.getText())){
            btnUpdate.setEnabled(false);
        }else{
            btnUpdate.setEnabled(true);
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

        jPanel1 = new javax.swing.JPanel();
        lblDOB = new javax.swing.JLabel();
        lblPhoneNO = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        lblTitile = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblIdentNo = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtIdenNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 300));

        jPanel1.setBackground(new java.awt.Color(196, 215, 214));

        lblDOB.setText("Date of Birth:");

        lblPhoneNO.setText("Phone Number:");

        lblEmail.setText("Email:");

        lblAddress.setText("Address:");

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        txtDOB.setEditable(false);

        lblTitile.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitile.setText("My Profile");

        txtPhoneNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneNoFocusLost(evt);
            }
        });

        lblName.setText("Name:");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        lblIdentNo.setText("Identity Number:");

        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtIdenNo.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdentNo)
                    .addComponent(lblName)
                    .addComponent(lblDOB)
                    .addComponent(lblPhoneNO)
                    .addComponent(lblEmail)
                    .addComponent(lblAddress)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(17, 17, 17)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtDOB)
                            .addComponent(txtPhoneNo)
                            .addComponent(txtEmail)
                            .addComponent(txtAddress))
                        .addComponent(btnExit))
                    .addComponent(txtIdenNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lblTitile)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitile)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentNo)
                    .addComponent(txtIdenNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNO)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtIdenNo.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //not done 
        People user = JavaAssignment.login;  
        String name = txtName.getText();
        String identityNo = txtIdenNo.getText();
        String dob = txtDOB.getText();
        String phoneNo = txtPhoneNo.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();

        if(user!=null){
            if(name.trim().isEmpty() || phoneNo.trim().isEmpty() || email.trim().isEmpty() || address.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please ensure all required fields have been fill and tick the correct identity!!!");
            return;
            }

            if(!(name.trim().matches("^[A-Za-z]{1,}$"))){
                JOptionPane.showMessageDialog(this, "Invalid Name");
                return;
            }                          

            if(!(phoneNo.trim().matches("^[0-9]{10,}$"))){
                JOptionPane.showMessageDialog(this, "Invalid Phone Number");
                return;
            }

            if(!(email.trim().matches("^[a-zA-Z0-9]{1,}@[a-z]{4,}.com$"))){
                JOptionPane.showMessageDialog(this, "Invalid Email");
                return;
            }
            
            People p = new People(user.getId(),name,identityNo,dob,phoneNo,email,address,user.getStatus(),user.getType());
            
            for(int i=0;i<DataIO.allPeople.size();i++){
                if(user.getIdentityNo().equals(DataIO.allPeople.get(i).getIdentityNo())){
                    DataIO.allPeople.remove(i);
                    DataIO.allPeople.add(i, p);
                    DataIO.write();
                    break;
                }       
            }
            
            JOptionPane.showMessageDialog(this,"Update Successfully");
            JavaAssignment.login = p;
            getProfile(p);
        }else{
            JOptionPane.showMessageDialog(this,"Invalid User!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        People user = JavaAssignment.login;
        txtName.setText(user.getName());
        txtIdenNo.setText(user.getIdentityNo());
        txtDOB.setText(user.getDob());
        txtPhoneNo.setText(user.getPhoneNo());
        txtEmail.setText(user.getEmail());
        txtAddress.setText(user.getAddress());

        btnUpdate.setEnabled(false);
        this.setVisible(false);
        JavaAssignment.h.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        People user = JavaAssignment.login;
        if(user.getName().equals(txtName.getText()) && user.getPhoneNo().equals(txtPhoneNo.getText()) 
                && user.getEmail().equals(txtEmail.getText()) && user.getAddress().equals(txtAddress.getText())){
            btnUpdate.setEnabled(false);
        }else{
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtPhoneNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNoFocusLost
        People user = JavaAssignment.login;
        if(user.getName().equals(txtName.getText()) && user.getPhoneNo().equals(txtPhoneNo.getText()) 
                && user.getEmail().equals(txtEmail.getText()) && user.getAddress().equals(txtAddress.getText())){
            btnUpdate.setEnabled(false);
        }else{
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_txtPhoneNoFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        People user = JavaAssignment.login;
        if(user.getName().equals(txtName.getText()) && user.getPhoneNo().equals(txtPhoneNo.getText()) 
                && user.getEmail().equals(txtEmail.getText()) && user.getAddress().equals(txtAddress.getText())){
            btnUpdate.setEnabled(false);
        }else{
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        People user = JavaAssignment.login;
        if(user.getName().equals(txtName.getText()) && user.getPhoneNo().equals(txtPhoneNo.getText()) 
                && user.getEmail().equals(txtEmail.getText()) && user.getAddress().equals(txtAddress.getText())){
            btnUpdate.setEnabled(false);
        }else{
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_txtAddressFocusLost

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
            java.util.logging.Logger.getLogger(PeopleMyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleMyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleMyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleMyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleMyProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdentNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNO;
    private javax.swing.JLabel lblTitile;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdenNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
