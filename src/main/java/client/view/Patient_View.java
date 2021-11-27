/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import static client.Main.current_user;
import static client.Main.patient_appointment_info;
import static client.Main.patient_info;
import static client.Main.patient_track;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ComfirmOrder;
import model.ConfirmShipping;
import model.Order;
import model.Patient;
import model.PatientVaccinated;
import model.ReadyShippingDetails;
import model.ShippingDetail;
import util.AsymmCrypto;
import util.Block;
import util.Blockchain;
import util.Hasher;
/**
 *
 * @author acer
 */
public class Patient_View extends javax.swing.JFrame {

  /**
   * Creates new form Patient_View
   */
  String APPOINT_VACCINATION = "Appoint Vaccination";
  String TRACK = "Track";
  String REGISTERED = "Registered";
  String VACCINATED = "Vaccinated";
  String current_user_status;
  public Patient current_patient_info = new Patient();
  String trackData = "";
  String plaintext = "";
  
  public Patient_View() {
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

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    appointTracktButton = new javax.swing.JButton();
    logOutButton = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    messageTextPane = new javax.swing.JTextPane();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(51, 51, 51));

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 204, 204));
    jLabel1.setText("Hi");

    appointTracktButton.setBackground(new java.awt.Color(102, 255, 204));
    appointTracktButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    appointTracktButton.setText("Appoint Vaccination");
    appointTracktButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        appointTracktButtonActionPerformed(evt);
      }
    });

    logOutButton.setBackground(new java.awt.Color(255, 102, 102));
    logOutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoutIcon.png"))); // NOI18N
    logOutButton.setText(" Log Out");
    logOutButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        logOutButtonActionPerformed(evt);
      }
    });

    messageTextPane.setEditable(false);
    messageTextPane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jScrollPane1.setViewportView(messageTextPane);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
    );

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(153, 255, 153));
    jLabel2.setText("Message");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(61, 61, 61)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(appointTracktButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(63, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(34, 34, 34)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(14, 14, 14)
        .addComponent(appointTracktButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(109, 109, 109))
    );

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
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
   System.exit(0);
  }//GEN-LAST:event_logOutButtonActionPerformed

  private void appointTracktButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointTracktButtonActionPerformed
    if(APPOINT_VACCINATION.equals(appointTracktButton.getText())){
      patient_appointment_info.setVisible(true);
      this.setVisible(false);
    }
    else if(TRACK.equals(appointTracktButton.getText())){
      getVaccineProcessData();
      patient_track.setVisible(true);
      patient_track.setInfoTextArea(current_patient_info.infoTextAreaSetText() + "\n" + plaintext);
      patient_track.setTrackTextArea(trackData);
      this.setVisible(false);
    }
  }//GEN-LAST:event_appointTracktButtonActionPerformed

  private void getVaccineProcessData(){
    for(Block block : Blockchain.DB){
      if(block.getHeader().getInvolvedPerson() != null){
        if(block.getHeader().getInvolvedPerson().contains(current_user.getUserName())){
          String data = "";
          for(Object statusTranx : block.getTranx().getTranxLst()){
            if(statusTranx instanceof Order){
              data = data + ((Order) statusTranx).statusTrackToString() + "\n";
            }
            else if(statusTranx instanceof ComfirmOrder){
              data = data + ((ComfirmOrder) statusTranx).statusTrackToString() + "\n";
            }
            else if(statusTranx instanceof ReadyShippingDetails){
               data = data + ((ReadyShippingDetails) statusTranx).readyShippingStepTrackToString() + "\n";
            }
            else if(statusTranx instanceof ConfirmShipping){
               data = data + ((ConfirmShipping)statusTranx).statusTrackToString()+"\n";
            } else if(statusTranx instanceof  ShippingDetail){
               data = data + ((ShippingDetail)statusTranx).statusTrackToString()+"\n";   
           }
            else if(statusTranx instanceof PatientVaccinated){
              HashMap<String,String> patient = ((PatientVaccinated) statusTranx).getPatient_vaccinated_list();
              for(Map.Entry<String, String> set : patient.entrySet()){
                if(set.getKey().equals(current_user.getUserName())){
                  String hashUserName = Hasher.hash(current_user.getUserName(), "SHA-256");
                  AsymmCrypto asymmCrypto = new AsymmCrypto();
                  try {
                    plaintext = asymmCrypto.decrypt(set.getValue(), hashUserName);
                  } catch (Exception ex) {
                    Logger.getLogger(Patient_View.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  break;
                }
              }
            }
          }
          trackData = data;
          break;
        }
      }
    }
  }
  
  public void configurePatientPage(){
    if(isCurrentPatientRegistered()){
      appointTracktButton.setText(TRACK);
      if(REGISTERED.equals(current_user_status)){
        messageTextPane.setText("Please wait for vaccination!!");
      }
      else{
        messageTextPane.setText("You can track your vaccine suppy chain process!!");
      }
    }
    else{
      messageTextPane.setText("Please add your personal details for vaccination appointment!! You will get appointment after fill up all personal details");
    }
  }
  
  private boolean isCurrentPatientRegistered(){
    for(Patient patient: patient_info){
      if(patient.getUserName().equals(current_user.getUserName())){
        if(REGISTERED.equals(patient.getStatus()) || VACCINATED.equals(patient.getStatus())){
          current_user_status = patient.getStatus();
          current_patient_info = patient;
          return true;
        }
      }
    }
     return false;
  }
  
  public void setMessageTextPane(String text){
    messageTextPane.setText(text);
  }
  
  public void setAppointTracktButton(String label){
    appointTracktButton.setText(label);
  }
  
  
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
      java.util.logging.Logger.getLogger(Patient_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Patient_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Patient_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Patient_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Patient_View().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton appointTracktButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton logOutButton;
  private javax.swing.JTextPane messageTextPane;
  // End of variables declaration//GEN-END:variables
}
