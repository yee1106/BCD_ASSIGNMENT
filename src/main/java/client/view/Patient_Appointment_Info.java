/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import static client.Main.current_user;
import static client.Main.patient_info;
import static client.Main.patient_view;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import model.Patient;

/**
 *
 * @author acer
 */
public class Patient_Appointment_Info extends javax.swing.JFrame {

  public static String REGISTERED = "Registered";
  public static String PATIENT_INFO_File_Path = "Patient_Info.txt";
  public static String TRACK = "Track";
  
  public Patient_Appointment_Info() {
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
        goBackLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fullNameTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        ageTextField = new javax.swing.JTextField();
        icTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextPane = new javax.swing.JTextPane();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        goBackLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goBackLabel.setForeground(new java.awt.Color(204, 255, 204));
        goBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goBackIcon.png"))); // NOI18N
        goBackLabel.setText("Go back");
        goBackLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        goBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackLabelMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Register & Appointment");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Full Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("IC:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Contact Number:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Gender:");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        fullNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        genderComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        ageTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyTyped(evt);
            }
        });

        icTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        icTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                icTextFieldKeyTyped(evt);
            }
        });

        contactTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contactTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactTextFieldKeyTyped(evt);
            }
        });

        addressTextPane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(addressTextPane);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullNameTextField)
            .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ageTextField, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(icTextField)
            .addComponent(contactTextField)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        );

        confirmButton.setBackground(new java.awt.Color(102, 255, 102));
        confirmButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmButton.setText("Confirm ");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)
                        .addGap(0, 140, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goBackLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(67, 67, 67))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goBackLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

  private void goBackLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackLabelMouseReleased
    this.setVisible(false);
    patient_view.setVisible(true);
    clearTextField();
  }//GEN-LAST:event_goBackLabelMouseReleased

  private void ageTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyTyped
    char character = evt.getKeyChar();
    //input validation
    if(!(Character.isDigit(character) || (character == KeyEvent.VK_BACK_SPACE) || (character == KeyEvent.VK_DELETE ))){
      evt.consume();
    }
  }//GEN-LAST:event_ageTextFieldKeyTyped

  private void icTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_icTextFieldKeyTyped
    char character = evt.getKeyChar();
    //input validation
    if(!(Character.isDigit(character) || (character == KeyEvent.VK_BACK_SPACE) || (character == KeyEvent.VK_DELETE ))){
      evt.consume();
    }
  }//GEN-LAST:event_icTextFieldKeyTyped

  private void contactTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactTextFieldKeyTyped
    char character = evt.getKeyChar();
    //input validation
    if(!(Character.isDigit(character) || (character == KeyEvent.VK_BACK_SPACE) || (character == KeyEvent.VK_DELETE ))){
      evt.consume();
    }
  }//GEN-LAST:event_contactTextFieldKeyTyped

  private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comfirmButtonActionPerformed
      if(!isTextFieldEmpty()){
        updatePatientDetailsInFile(PATIENT_INFO_File_Path);
        patient_view.setVisible(true);
        this.setVisible(false);
        patient_view.setAppointTrackButton(TRACK);
        patient_view.setMessageTextPane("Please wait for vaccination!!");
      }
      else{
        JOptionPane.showMessageDialog(null, "Please fill up all the information!!", "Empty message", JOptionPane.ERROR_MESSAGE); 
      }
  }//GEN-LAST:event_comfirmButtonActionPerformed

  public void updatePatientDetailsInFile(String fileName){
    Patient patient = new Patient(current_user.getUserName(), fullNameTextField.getText(), ageTextField.getText(), icTextField.getText(), contactTextField.getText(), genderComboBox.getSelectedItem().toString(), addressTextPane.getText(), REGISTERED, -1);
    patient_info.add(patient);
    patient_view.current_patient_info = patient;
    try {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName,true));
        out.append(current_user.getUserName() + "\n");            //username
        out.append(REGISTERED + "\n");                            //status
        out.append("-1\n");                                         //for the batch id
        out.append(fullNameTextField.getText() + "\n");                  //full name
        out.append(ageTextField.getText() + "\n");                       //age
        out.append(genderComboBox.getSelectedItem().toString() + "\n");  //gender
        out.append(icTextField.getText() + "\n");                        //ic
        out.append(contactTextField.getText() + "\n");                   //contact number
        out.append(addressTextPane.getText() + "\n");                    //address
        out.append("\n"); 
        out.close();
      } catch (Exception ex) {} 
  }
  
  private void clearTextField(){
    fullNameTextField.setText("");
    ageTextField.setText("");
    icTextField.setText("");
    contactTextField.setText("");
    addressTextPane.setText("");
  }
  
  private boolean isTextFieldEmpty(){
    return (fullNameTextField.getText().isEmpty() || ageTextField.getText().isEmpty() || genderComboBox.getSelectedItem() == null || icTextField.getText().isEmpty() || contactTextField.getText().isEmpty() || addressTextPane.getText().isEmpty());
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
      java.util.logging.Logger.getLogger(Patient_Appointment_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Patient_Appointment_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Patient_Appointment_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Patient_Appointment_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Patient_Appointment_Info().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane addressTextPane;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel goBackLabel;
    private javax.swing.JTextField icTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
