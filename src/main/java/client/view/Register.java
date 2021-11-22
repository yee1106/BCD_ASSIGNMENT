/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import static client.Main.login;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.Hasher;
import util.KeyCreator.KeyAccess;
import util.KeyCreator.KeyPairMaker;

/**
 *
 * @author acer
 */
public class Register extends javax.swing.JFrame {
  /**
   * Creates new form Register
   */
  public Register() {
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
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    userNameTextField = new javax.swing.JTextField();
    roleComboBox = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    registerButton = new javax.swing.JButton();
    loginLabel = new javax.swing.JLabel();
    passwordTextField = new javax.swing.JPasswordField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(51, 51, 51));

    jLabel2.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(102, 255, 204));
    jLabel2.setText("Register");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(204, 255, 255));
    jLabel3.setText("Username: ");

    jLabel4.setBackground(new java.awt.Color(255, 255, 255));
    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(204, 255, 255));
    jLabel4.setText("Password:");

    userNameTextField.setBackground(new java.awt.Color(204, 204, 255));
    userNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    roleComboBox.setBackground(new java.awt.Color(255, 204, 204));
    roleComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacinator", "Manufacturer", "Distribution", "Clinic / Healthcare" }));

    jLabel5.setBackground(new java.awt.Color(255, 255, 255));
    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(204, 255, 255));
    jLabel5.setText("Role:");

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userIcon.png"))); // NOI18N

    registerButton.setBackground(new java.awt.Color(255, 153, 153));
    registerButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    registerButton.setText("Register");
    registerButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        registerButtonActionPerformed(evt);
      }
    });

    loginLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
    loginLabel.setForeground(new java.awt.Color(255, 204, 204));
    loginLabel.setText("*Switch to login");
    loginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        loginLabelMousePressed(evt);
      }
    });

    passwordTextField.setBackground(new java.awt.Color(204, 204, 255));
    passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(150, 150, 150)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel4)
                  .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(roleComboBox, 0, 226, Short.MAX_VALUE)
                  .addComponent(passwordTextField)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(registerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(182, 182, 182)
            .addComponent(jLabel1)))
        .addContainerGap(40, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(141, 141, 141))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addGap(8, 8, 8)))
        .addGap(31, 31, 31)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4)
          .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5))
        .addGap(31, 31, 31)
        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(loginLabel)
        .addContainerGap(48, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void loginLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMousePressed
    login.setVisible(true);
    this.setVisible(false);
    resetRegister();
  }//GEN-LAST:event_loginLabelMousePressed

  private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
    if(!userNameTextField.getText().isEmpty() && !String.valueOf(passwordTextField.getPassword()).isEmpty()){
      if(createRegisterData(userNameTextField.getText(), String.valueOf(passwordTextField.getPassword()),roleComboBox.getSelectedItem().toString())){
        JOptionPane.showMessageDialog(null, "Register Successfull!!");
        //generate key pair for register user
        String hashUserName = Hasher.hash(userNameTextField.getText(), "SHA-256");
        KeyPairMaker.create(hashUserName);
        try {
          System.out.println(Base64.getEncoder().encodeToString( KeyAccess.getPrivateKey(hashUserName).getEncoded() ) );
          System.out.println(Base64.getEncoder().encodeToString( KeyAccess.getPublicKey(hashUserName).getEncoded() ));
        } catch (Exception ex) {
          Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetRegister();
        login.setVisible(true);
        this.setVisible(false);
      }
      else{
        JOptionPane.showMessageDialog(null, "UserName Exist, please enter other username!!","Error",JOptionPane.ERROR_MESSAGE);
      };
    }
    else{
      JOptionPane.showMessageDialog(null, "Username or Password is empty","Error",JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_registerButtonActionPerformed

  public void resetRegister(){
    userNameTextField.setText("");
    passwordTextField.setText("");
    roleComboBox.setSelectedIndex(0);
  }
  
  public static boolean createRegisterData(String userName, String password, String role){
    boolean userNameExist = false;
    FileInputStream fileinput;
    try {
      fileinput = new FileInputStream("register.txt");
      Scanner fileRow = new Scanner(fileinput);
      while(fileRow.hasNext()){
       String[] split_name = fileRow.nextLine().split(" \\|\\| ");
       if(split_name[0].equals(userName)){
         userNameExist = true;
         break;
       }
      }
    } catch (FileNotFoundException ex) {}
    if(!userNameExist){    
      try {
        String hashPassword = Hasher.hash(password, "SHA-512");
        BufferedWriter out = new BufferedWriter(new FileWriter("register.txt",true));
        out.write(userName + " || " + role + " || " + hashPassword + "\n");
        out.close();
        return true;
      } catch (Exception ex) {} 
    }
    return false;
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
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Register().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel loginLabel;
  private javax.swing.JPasswordField passwordTextField;
  private javax.swing.JButton registerButton;
  private javax.swing.JComboBox<String> roleComboBox;
  private javax.swing.JTextField userNameTextField;
  // End of variables declaration//GEN-END:variables
}
