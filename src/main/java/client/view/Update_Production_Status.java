/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import static client.Main.DISTRIBUTION;
import static client.Main.current_user;
import static client.Main.manufacturerHomePage;
import static client.Main.track_view;
import static client.Main.userList;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import model.ReadyShippingDetails;
import util.Hasher;
import util.MySignature;

/**
 *
 * @author acer
 */
public class Update_Production_Status extends javax.swing.JFrame {

  /**
   * Creates new form Update_Production_Status
   */
  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  String READY_SHIPPING = "Ready Shipping";
  public Update_Production_Status() {
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
    goBackLable = new javax.swing.JLabel();
    productionDateDateChooser = new com.toedter.calendar.JDateChooser();
    jLabel2 = new javax.swing.JLabel();
    examinerTextField = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    temperatureTextField = new javax.swing.JTextField();
    distributionComboBox = new javax.swing.JComboBox<>();
    comfirmButton = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    addressTextPane = new javax.swing.JTextPane();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(51, 51, 51));

    jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 204, 204));
    jLabel1.setText("Update Production Status");

    goBackLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    goBackLable.setForeground(new java.awt.Color(255, 153, 153));
    goBackLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goBackIcon.png"))); // NOI18N
    goBackLable.setText("Go back");
    goBackLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
    goBackLable.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        goBackLableMouseReleased(evt);
      }
    });

    productionDateDateChooser.setDateFormatString("yyyy-MM-dd");
    productionDateDateChooser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 255, 153));
    jLabel2.setText("Examiner: ");

    examinerTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 255, 153));
    jLabel3.setText("Production Date: ");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 255, 153));
    jLabel4.setText("Storing Temperature: ");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 255, 153));
    jLabel5.setText("Production Address: ");

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 255, 153));
    jLabel6.setText("Distribution Company: ");

    temperatureTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
    temperatureTextField.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        temperatureTextFieldKeyTyped(evt);
      }
    });

    distributionComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    comfirmButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    comfirmButton.setForeground(new java.awt.Color(153, 153, 255));
    comfirmButton.setText("Comfirm Update");
    comfirmButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comfirmButtonActionPerformed(evt);
      }
    });

    addressTextPane.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
    addressTextPane.setMaximumSize(new java.awt.Dimension(257, 257));
    jScrollPane1.setViewportView(addressTextPane);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(115, 115, 115)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(goBackLable)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(56, 56, 56)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(productionDateDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
              .addComponent(examinerTextField)))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addComponent(jLabel5)
              .addComponent(jLabel6))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(comfirmButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(temperatureTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                  .addComponent(distributionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addGap(99, 99, 99))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(goBackLable)
        .addGap(20, 20, 20)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(examinerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(productionDateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3))
            .addGap(91, 91, 91))
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(temperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(33, 33, 33)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(88, 88, 88)))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(distributionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6))
        .addGap(18, 18, 18)
        .addComponent(comfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void goBackLableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackLableMouseReleased
    this.setVisible(false);
    track_view.setVisible(true);
  }//GEN-LAST:event_goBackLableMouseReleased

  private void temperatureTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temperatureTextFieldKeyTyped
     char character = evt.getKeyChar();
    //input validation
    if(!(Character.isDigit(character) || (character == KeyEvent.VK_BACK_SPACE) || (character == KeyEvent.VK_DELETE ) || (character == KeyEvent.VK_MINUS ) || (character == KeyEvent.VK_PERIOD ) )){
      evt.consume();
    }
  }//GEN-LAST:event_temperatureTextFieldKeyTyped

  private void comfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comfirmButtonActionPerformed
    if(!isTextFieldEmpty()){
      ReadyShippingDetails readyShippingDeatils = new ReadyShippingDetails(examinerTextField.getText(), dateFormat.format(productionDateDateChooser.getDate()), temperatureTextField.getText(), addressTextPane.getText(), current_user.getUserName() ,distributionComboBox.getItemAt(0), READY_SHIPPING ,dateFormat.format(new Date()));
    String hashUserName = Hasher.hash(current_user.getUserName(), "SHA-256");
     MySignature digitalSignature = new MySignature(hashUserName);
     readyShippingDeatils.setDigital_signature(digitalSignature.sign(readyShippingDeatils.toString()));
     track_view.updateBlockComfOrderTranx(manufacturerHomePage.selectedBlock.getHeader().getBatch_id(), readyShippingDeatils, readyShippingDeatils.getTo());
     track_view.setUpdateTrackButtonVisible(false);
     track_view.setVisible(true);
     this.setVisible(false);
     track_view.setStatusTrackText(track_view.getStatusTrackText() + "\n" + readyShippingDeatils.readyShippingStepTrackToString());
    }
    else{
      JOptionPane.showMessageDialog(null, "Please fill up all the information!!", "Empty message", JOptionPane.ERROR_MESSAGE); 
    }
  }//GEN-LAST:event_comfirmButtonActionPerformed

  private boolean isTextFieldEmpty(){
    return (examinerTextField.getText().isEmpty() || dateFormat.format(productionDateDateChooser.getDate()).isEmpty() || distributionComboBox.getSelectedItem() == null
             || temperatureTextField.getText().isEmpty() || addressTextPane.getText().isEmpty());
  }
  public void resetUpdateProductionPage(){
    examinerTextField.setText("");
    productionDateDateChooser.setDate(new Date());
    temperatureTextField.setText("");
    addressTextPane.setText("");
    setDistributionComboBox();
  }
  
  private void setDistributionComboBox(){
    distributionComboBox.removeAllItems();
    for (Map.Entry<String, String> user: userList.entrySet()){
      if(DISTRIBUTION.equals(user.getValue())){
         distributionComboBox.addItem(user.getKey());
       }
    }
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
      java.util.logging.Logger.getLogger(Update_Production_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Update_Production_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Update_Production_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Update_Production_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Update_Production_Status().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextPane addressTextPane;
  private javax.swing.JButton comfirmButton;
  private javax.swing.JComboBox<String> distributionComboBox;
  private javax.swing.JTextField examinerTextField;
  private javax.swing.JLabel goBackLable;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private com.toedter.calendar.JDateChooser productionDateDateChooser;
  private javax.swing.JTextField temperatureTextField;
  // End of variables declaration//GEN-END:variables
}