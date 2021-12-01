/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Acer
 */
public class ViewAppointment extends javax.swing.JFrame {
    String id,date,time,status,dos,owner,centre,vaccine;   
    Vector originalTableModel;
    /**
     * Creates new form ViewAppointment
     */
    public ViewAppointment() {
        initComponents();          
        btnCancel.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void viewAppointment(People x){
        x.viewAppointment(jTable1);
        originalTableModel = (Vector) ((DefaultTableModel) jTable1.getModel()).getDataVector().clone();
    }
    
    public void updateTable(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.getDataVector().removeAllElements();      
        JavaAssignment.login.viewAppointment(jTable1);
        model.fireTableDataChanged();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 250));

        jPanel3.setBackground(new java.awt.Color(147, 213, 220));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setText("My Appointment");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    jTable1.getTableHeader().setReorderingAllowed(false);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    btnCancel.setText("Cancel");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCancelActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(337, 337, 337)
                            .addComponent(lblTitle))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(277, 277, 277)
                            .addComponent(btnCancel)
                            .addGap(167, 167, 167)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 304, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(lblTitle)
            .addGap(30, 30, 30)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(48, 48, 48)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCancel)
                .addComponent(btnExit))
            .addContainerGap(85, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        btnCancel.setEnabled(false);
        JavaAssignment.h.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int Astatus=0;
        if(status.equals("Pending")){
            Astatus=0;
        }else if(status.equals("Approved")){
            Astatus=1;
        }else if(status.equals("Cancelled")){
            Astatus=2;
        }else if(status.equals("Completed")){
            Astatus=3;
        }
        
        int Ados=0;
        if(dos.equals("DOS 1")){
            Ados=1;
        }else if(dos.equals("DOS 2")){
            Ados=2;
        }
        
        People p=null;
        for(int i=0; i<DataIO.allPeople.size(); i++){
            if(owner.equals(DataIO.allPeople.get(i).getName())){
              p = DataIO.allPeople.get(i);
            }
        }          
        Centre c = DataIO.checkCentre(centre);

        Vaccine v=null;                        
        for(int i=0;i<DataIO.allVaccine.size();i++){
            if(vaccine.equals(DataIO.allVaccine.get(i).getName()) && centre.equals(DataIO.allVaccine.get(i).getVaccineCentre().getHealthFacility())){
                v = DataIO.allVaccine.get(i);
            }
        }
        
        for (int i = 0; i < DataIO.allVaccine.size(); i++) {               
            if(v==DataIO.allVaccine.get(i)){
                v.cancelVaccine();
                JavaAssignment.login.updateVaccine(DataIO.allVaccine.get(i), v);     
                break;
            }
        }   
        
        for (int i = 0; i < DataIO.allAppointment.size(); i++) {               
            if(Integer.parseInt(id)==DataIO.allAppointment.get(i).getId()){
                Appointment a2 = new Appointment(Integer.parseInt(id),date,time,Astatus,Ados,p,c,v);
                a2.cancelAppointment();
                JavaAssignment.login.updateAppointment(DataIO.allAppointment.get(i), a2);
            }
        }  
        
        JOptionPane.showMessageDialog(this, "Cancelled Successfully");
        updateTable();        
        originalTableModel = (Vector) ((DefaultTableModel) jTable1.getModel()).getDataVector().clone();
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==1){
            int row = jTable1.getSelectedRow();
            id = (String) jTable1.getValueAt(row, 0);
            date = (String) jTable1.getValueAt(row, 1);
            time = (String) jTable1.getValueAt(row, 2);
            status = (String) jTable1.getValueAt(row, 3);
            dos = (String) jTable1.getValueAt(row, 4);
            owner = (String) jTable1.getValueAt(row, 5);
            centre = (String) jTable1.getValueAt(row, 6);
            vaccine = (String) jTable1.getValueAt(row, 7);
            
            if(status.equals("Pending") || status.equals("Approved")){
                btnCancel.setEnabled(true);
            }else{
                btnCancel.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
