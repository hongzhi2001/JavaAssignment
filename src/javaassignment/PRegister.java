/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

//import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author hongz
 */
public class PRegister extends javax.swing.JFrame {

    /**
     * Creates new form PRegister
     */
    public PRegister() {
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

        txtEmail = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblIdenNo = new javax.swing.JLabel();
        txtIdenNo = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        lblLogin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 300));

        lblName.setText("Name:");

        lblIdenNo.setText("Identity Number:");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblDOB.setText("Date of Birth");

        lblPhoneNo.setText("Phone Number:");

        lblEmail.setText("Email:");

        lblReg.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblReg.setText("Personnel Register");

        lblLogin1.setText("Already have an account? Login here");
        lblLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogin1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(lblReg)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblLogin1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblIdenNo)
                        .addComponent(lblName)
                        .addComponent(lblDOB)
                        .addComponent(lblPhoneNo)
                        .addComponent(lblEmail))
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(txtIdenNo)
                        .addComponent(txtDOB)
                        .addComponent(txtPhoneNo)
                        .addComponent(txtName))
                    .addGap(32, 32, 32)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnRegister))
                .addGap(67, 67, 67)
                .addComponent(lblLogin1)
                .addGap(57, 57, 57))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblName))
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblIdenNo))
                        .addComponent(txtIdenNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblDOB))
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblPhoneNo))
                        .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblEmail))
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(203, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        String Name = txtName.getText();
        String IdentityNo = txtIdenNo.getText();
        String DOB = txtDOB.getText();
        String PhoneNo = txtPhoneNo.getText();
        String Email = txtEmail.getText();
        
        //String pattern = "dd-MM-yyyy";
        //SimpleDateFormat date = new SimpleDateFormat(pattern);
        
        if(Name.trim().isEmpty()|| IdentityNo.trim().isEmpty() || DOB.trim().isEmpty() || PhoneNo.trim().isEmpty() || Email.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please ensure all required fields have been fill");
            return;
        }
        
        if(!(Name.trim().matches("^[A-Za-z]{1,}$"))){
            JOptionPane.showMessageDialog(this, "Invalid Name");
            return;
        }
        
        if(!(IdentityNo.trim().matches("^[0-9]{12}|[A-Za-z][0-9]{8,}$"))){
            JOptionPane.showMessageDialog(this, "Invalid Identity Number");
            return;
        }
        
        /*if(!DOB.equals(date.format(DOB))){
            JOptionPane.showMessageDialog(this, "Invalid DOB");
            return;
        }*/
        
        if(!(PhoneNo.trim().matches("^[0-9]{10,}$"))){
            JOptionPane.showMessageDialog(this, "Invalid Phone Number");
            return;
        }
        
        if(!(Email.trim().matches("^[a-zA-Z0-9]{1,}@[a-z]{4,}.com$"))){
            JOptionPane.showMessageDialog(this, "Invalid Email");
            return;
        }

        Personnel found = DataIO.checkPersonnel(IdentityNo);
        if(found!=null){
            JOptionPane.showMessageDialog(this,"The identity number has been used!");
        }else{
            int Id = 1+DataIO.allPersonnel.size();
            Personnel x = new Personnel(Id,Name,IdentityNo,DOB,PhoneNo,Email);
            x.registerNew(x);
            JOptionPane.showMessageDialog(this,"Register Succesfully");
            txtName.setText("");
            txtIdenNo.setText("");
            txtDOB.setText("");
            txtPhoneNo.setText("");
            txtEmail.setText("");
            this.setVisible(false);
            JavaAssignment1.pLogin.setVisible(true);
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lblLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogin1MouseClicked
        this.setVisible(false);
        JavaAssignment1.pLogin.setVisible(true);
    }//GEN-LAST:event_lblLogin1MouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtIdenNo.setText("");
        txtDOB.setText("");
        txtPhoneNo.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(PRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdenNo;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblReg;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdenNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
