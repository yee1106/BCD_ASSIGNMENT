/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import static client.Main.clinic_healthcare;
import static client.Main.current_user;
import static client.Main.patient_info;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Patient;
import model.PatientVaccinated;
import model.ShippingDetail;
import util.AsymmCrypto;
import util.Block;
import util.Blockchain;
import util.Hasher;
import util.MerkleTree;
import util.MySignature;

/**
 *
 * @author acer
 */
public class Patient_Vaccination_Record extends javax.swing.JFrame {

  /**
   * Creates new form Patient_Vaccination_Record
   */
  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  public static String REGISTERED = "Registered";
  String VACCINATED = "Vaccinated";
  public Block selectedBlock;
  private int selectedBatchQuantity;
  public static String PATIENT_INFO_File_Path = "Patient_Info.txt";
  
  public Patient_Vaccination_Record() {
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
    goBackLable = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    dateVaccinatedDateChooser = new com.toedter.calendar.JDateChooser();
    typeVaccineTextField = new javax.swing.JTextField();
    batchIDTextField = new javax.swing.JTextField();
    witnessNameTextField = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    facilityTextArea = new javax.swing.JTextArea();
    icComboBox = new javax.swing.JComboBox<>();
    confirmButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(51, 51, 51));

    goBackLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    goBackLable.setForeground(new java.awt.Color(153, 255, 255));
    goBackLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goBackIcon.png"))); // NOI18N
    goBackLable.setText("Go back");
    goBackLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
    goBackLable.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        goBackLableMouseReleased(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(204, 204, 255));
    jLabel1.setText("Add Patient Vaccination Record");

    jPanel2.setBackground(new java.awt.Color(51, 51, 51));

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 204, 204));
    jLabel2.setText("UserName:");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 204, 204));
    jLabel3.setText("Type Of Vaccine:");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 204, 204));
    jLabel4.setText("Date Vaccinated:");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 204, 204));
    jLabel5.setText("Batch ID:");

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 204, 204));
    jLabel6.setText("Witness Name:");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 204, 204));
    jLabel7.setText("Facility:");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
      .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6)
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 67, Short.MAX_VALUE))
    );

    jPanel3.setBackground(new java.awt.Color(51, 51, 51));

    dateVaccinatedDateChooser.setDateFormatString("yyyy-MM-dd HH:mm:ss");
    dateVaccinatedDateChooser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    typeVaccineTextField.setEditable(false);
    typeVaccineTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    batchIDTextField.setEditable(false);
    batchIDTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    witnessNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    facilityTextArea.setColumns(20);
    facilityTextArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
    facilityTextArea.setLineWrap(true);
    facilityTextArea.setRows(5);
    jScrollPane2.setViewportView(facilityTextArea);

    icComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(dateVaccinatedDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(typeVaccineTextField)
      .addComponent(batchIDTextField)
      .addComponent(witnessNameTextField)
      .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
      .addComponent(icComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(icComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(dateVaccinatedDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(typeVaccineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(batchIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(witnessNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
    );

    confirmButton.setBackground(new java.awt.Color(255, 153, 153));
    confirmButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    confirmButton.setText("Confirm");
    confirmButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        confirmButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addComponent(goBackLable, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
            .addGap(43, 43, 43)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(27, 27, 27))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(176, 176, 176))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(goBackLable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(39, Short.MAX_VALUE))
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

  private void goBackLableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackLableMouseReleased
    clinic_healthcare.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_goBackLableMouseReleased

  private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
    if(!isTextFieldEmpty()){
      if(isReached(Long.valueOf(batchIDTextField.getText()))){
        if(!isOutOfQuantity(Long.valueOf(batchIDTextField.getText()))){
          
            Patient addPatient = new Patient();
            for(Patient patient : patient_info){
              if(patient.getUserName().equals(icComboBox.getSelectedItem().toString())){
                patient.setBatch_id(Long.valueOf(batchIDTextField.getText()));
                patient.setStatus(VACCINATED);
                patient.setDateVaccination(dateFormat.format(dateVaccinatedDateChooser.getDate()));
                patient.setTypeOfVaccine(typeVaccineTextField.getText());
                patient.setWitnessesName(witnessNameTextField.getText());
                patient.setVaccinationFacility(facilityTextArea.getText());
                addPatient = patient;
              }
            }
            String hashUserName = Hasher.hash(addPatient.getUserName(), "SHA-256");
            MySignature digitalSignature = new MySignature(hashUserName);
            addPatient.setDigital_signature(digitalSignature.sign(addPatient.addTrackTextAreaSetText()));
            try {
            AsymmCrypto asymmCrypto = new AsymmCrypto();
            String cipherText = asymmCrypto.encrypt(addPatient.addTrackTextAreaSetText(), hashUserName);
//            String plantext = asymmCrypto.decrypt(cipherText, hashUserName);
//            System.out.println(cipherText);
//            System.out.println(plantext);
            updatePatientDetailsInFile(PATIENT_INFO_File_Path, patient_info);
            updateBlockComfOrderTranx(Long.valueOf(batchIDTextField.getText()), icComboBox.getSelectedItem().toString(), cipherText);
            JOptionPane.showMessageDialog(null, "Add patient data successful"); 
            clinic_healthcare.setVisible(true);
            this.setVisible(false);
          } catch (Exception ex) {
            Logger.getLogger(Patient_Vaccination_Record.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
        else{
          JOptionPane.showMessageDialog(null, "This batch of vaccine for patient is full", "Error Message", JOptionPane.ERROR_MESSAGE); 
        }
      }
      else{
        JOptionPane.showMessageDialog(null, "Vaccine have not reached clinic/Healthcare", "Empty or Not Valid", JOptionPane.ERROR_MESSAGE); 
      }
    }
    else{
      JOptionPane.showMessageDialog(null, "Please fill up all the information correctly!!", "Empty or Not Valid", JOptionPane.ERROR_MESSAGE); 
    }
  }//GEN-LAST:event_confirmButtonActionPerformed

  private boolean isTextFieldEmpty(){
    return (icComboBox.getSelectedItem() == null || typeVaccineTextField.getText().isBlank() || batchIDTextField.getText().isBlank() || witnessNameTextField.getText().isBlank() || facilityTextArea.getText().isBlank() || !dateVaccinatedDateChooser.isValid() || dateFormat.format(dateVaccinatedDateChooser.getDate()).isBlank());
  }
  
  private void updatePatientDetailsInFile(String fileName, ArrayList<Patient> patientList){
    try {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        for(Patient patient : patientList){
          out.write(patient.getUserName() + "\n");            //username
          out.write(patient.getStatus() + "\n");                            //status
          out.write(patient.getBatch_id() + "\n");                                         //for the batch id
          out.write(patient.getFullName() + "\n");                  //full name
          out.write(patient.getAge() + "\n");                       //age
          out.write(patient.getGender() + "\n");  //gender
          out.write(patient.getIc() + "\n");                        //ic
          out.write(patient.getContactNumber() + "\n");                   //contact number
          out.write(patient.getAddress() + "\n");                    //address
          out.write("\n"); 
        }
        out.close();
      } catch (Exception ex) {} 
  }
  
  private boolean isOutOfQuantity(long batch_ID){
    for(Block block : Blockchain.DB){
      if(batch_ID == block.getHeader().getBatch_id()){
        selectedBlock = block;
        for(Object tranxItem : block.getTranx().getTranxLst()){
          if(tranxItem instanceof PatientVaccinated){
            return selectedBatchQuantity <= ((PatientVaccinated) tranxItem).getPatient_vaccinated_list().size();
          }
        }
        break;
      }
    }
    return false;
  }
  
  private boolean isReached(long batch_ID){
    for(Block block : Blockchain.DB){
      if(batch_ID == block.getHeader().getBatch_id()){
        selectedBlock = block;
        for(Object tranxItem : block.getTranx().getTranxLst()){
          if(tranxItem instanceof ShippingDetail){
            return true;
          }
        }
        break;
      }
    }
    return false;
  }
  
  public void updateBlockComfOrderTranx(long batch_ID, String username, String encryptedPatientDetails){
    boolean isBlockFound = false;
    String previousHash = "";
    boolean isPatientVaccinatedListExist = false;
    for(Block block : Blockchain.DB){
      if(!isBlockFound){
        if(batch_ID == block.getHeader().getBatch_id()){
          for(Object tranxObject : block.getTranx().getTranxLst()){
            if(tranxObject instanceof PatientVaccinated){
              ((PatientVaccinated) tranxObject).getPatient_vaccinated_list().put(username, encryptedPatientDetails);
              isPatientVaccinatedListExist = true;
              break;
            }
          }
          if(!isPatientVaccinatedListExist){
            PatientVaccinated patientVaccinatedInfo = new PatientVaccinated();
            patientVaccinatedInfo.getPatient_vaccinated_list().put(username, encryptedPatientDetails);
            block.getTranx().getTranxLst().add(patientVaccinatedInfo);
          }
//          block.getTranx().getTranxLst().add(tranx);
          block.getHeader().setTimeStamp(new Timestamp( System.currentTimeMillis() ).getTime());
          MerkleTree mt = MerkleTree.getInstance( block.getTranx().getTranxLst() );
          mt.build();
          block.getHeader().setMerkleRootStr(mt.getRoot());
          block.getHeader().setCurrentHash(null);
          block.getHeader().getInvolvedPerson().add(username);
          byte[] blockBytes = getBytes( block );
          block.getHeader().setCurrentHash(new String(Hasher.hash( blockBytes, "SHA-256" )));
          
          isBlockFound = true;
          previousHash = block.getHeader().getCurrentHash();
        }
      }
      else{
        block.getHeader().setPreviousHash(previousHash);
        block.getHeader().setTimeStamp(new Timestamp( System.currentTimeMillis() ).getTime());
        block.getHeader().setCurrentHash(null);
        byte[] blockBytes = getBytes( block );
        block.getHeader().setCurrentHash(new String(Hasher.hash( blockBytes, "SHA-256" )));
        previousHash = block.getHeader().getCurrentHash();
      }
    }
    Blockchain.persist();
    Blockchain.distribute();
  }
  
  private byte[] getBytes( Block block ){

        try( ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream( baos );
        ) {
            out.writeObject( block );
            return baos.toByteArray();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
  
  public void configureAddPatietRecordPage(long batch_id, String typeOfVaccine, int quantity){
    icComboBox.removeAllItems();
    dateVaccinatedDateChooser.setDate(new Date());
    typeVaccineTextField.setText(typeOfVaccine);
    batchIDTextField.setText(String.valueOf(batch_id));
    selectedBatchQuantity = quantity;
    witnessNameTextField.setText("");
    facilityTextArea.setText("");
    for(Patient patient : patient_info){
      if(REGISTERED.equals(patient.getStatus())){
        icComboBox.addItem(patient.getUserName());
      }
    }
  }
  
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
      java.util.logging.Logger.getLogger(Patient_Vaccination_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Patient_Vaccination_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Patient_Vaccination_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Patient_Vaccination_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Patient_Vaccination_Record().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField batchIDTextField;
  private javax.swing.JButton confirmButton;
  private com.toedter.calendar.JDateChooser dateVaccinatedDateChooser;
  private javax.swing.JTextArea facilityTextArea;
  private javax.swing.JLabel goBackLable;
  private javax.swing.JComboBox<String> icComboBox;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTextField typeVaccineTextField;
  private javax.swing.JTextField witnessNameTextField;
  // End of variables declaration//GEN-END:variables
}
