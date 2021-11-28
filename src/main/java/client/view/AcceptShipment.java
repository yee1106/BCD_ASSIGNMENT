/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client.view;

import model.ConfirmShipping;
import model.Order;
import model.ReadyShippingDetails;
import util.Constant;
import util.Hasher;
import util.MySignature;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static client.Main.*;

/**
 *
 * @author yeech
 */
public class AcceptShipment extends javax.swing.JFrame {

    /**
     * Creates new form AcceptShipment
     */
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public String APPROVED_SHIPMENT = "Approved Shipment";
    public AcceptShipment() {
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
        goBackLabel = new javax.swing.JLabel();
        shipmentDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        personInChargeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        shipmentMethodTextField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        estimatedReceivedDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Enter Shipping Detail");

        goBackLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goBackLabel.setForeground(new java.awt.Color(255, 153, 153));
        goBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goBackIcon.png"))); // NOI18N
        goBackLabel.setText("Go back");
        goBackLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        goBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackLabelMouseReleased(evt);
            }
        });

        shipmentDateChooser.setDateFormatString("yyyy-MM-dd");
        shipmentDateChooser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setText("Person In Charge:");

        personInChargeTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 153));
        jLabel3.setText("Shipment Date: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 153));
        jLabel4.setText("Shipment Method:");

        shipmentMethodTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        confirmButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(153, 153, 255));
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 153));
        jLabel5.setText("Estimated Received Date:");

        estimatedReceivedDateChooser.setDateFormatString("yyyy-MM-dd");
        estimatedReceivedDateChooser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(goBackLabel)
                .addContainerGap(641, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(123, 123, 123)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shipmentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(personInChargeTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(estimatedReceivedDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(shipmentMethodTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goBackLabel)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personInChargeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(shipmentDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipmentMethodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estimatedReceivedDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void goBackLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackLabelMouseReleased
        this.setVisible(false);
        distributorViewOrderPage.setVisible(true);
    }//GEN-LAST:event_goBackLabelMouseReleased

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if(!isInputEmpty()){
            int option = JOptionPane.showConfirmDialog(null, "Are you sure?", "Accept Order",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (JOptionPane.YES_OPTION == option) {
                Date today = new Date();
                Order currentOrder = getCurrentOrder();
                ReadyShippingDetails currentReadyShippingDetail = getCurrentReadyShippingDetail();
                ConfirmShipping shippingStatus = new ConfirmShipping(
                        current_user.getUserName(),
                        personInChargeTextField.getText(),
                        currentOrder.getDate(),
                        currentOrder.getOrder_batch_id(),
                        currentReadyShippingDetail.getStoringTemperature(),
                        dateFormat.format(shipmentDateChooser.getDate()),
                        shipmentMethodTextField.getText(),
                        dateFormat.format(estimatedReceivedDateChooser.getDate()),
                        Constant.SHIPMENT_APPROVED,
                        "Order accepted, Preparing the shipment.",
                        dateFormat.format(today)
                        );
                String hashUserName = Hasher.hash(current_user.getUserName(), "SHA-256");
                MySignature digitalSignature = new MySignature(hashUserName);
                shippingStatus.setDigitalSignature(digitalSignature.sign(shippingStatus.toString()));
                distributorViewOrderPage.updateShippingToBlock(distributorPage.selectedBlock.getHeader().getBatch_id(),shippingStatus,null);
                distributorViewOrderPage.setStatusTrackTextArea(
                        distributorViewOrderPage.statusTrackTextArea.getText() + "\n"
                        + shippingStatus.statusTrackToString()
                );
                resetPage();
                setVisible(false);
                distributorViewOrderPage.declineOrderButton.setVisible(false);
                distributorViewOrderPage.acceptOrderButton.setVisible(false);
                distributorViewOrderPage.verifySignatureButton.setVisible(false);
                distributorViewOrderPage.updateTrackingButton.setVisible(true);
                distributorViewOrderPage.setVisible(true);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Please fill up all the information!!", "Empty message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    public Order getCurrentOrder(){
        List<Object> transactionList =  distributorPage.selectedBlock.getTranx().getTranxLst();
        Order currentOrder = null;
        for (Object tranx: transactionList ){
            if(tranx instanceof Order){
                currentOrder = (Order) tranx;
                break;
            }
        }
        return currentOrder;
    }

    public ReadyShippingDetails getCurrentReadyShippingDetail(){
        List<Object> transactionList =  distributorPage.selectedBlock.getTranx().getTranxLst();
        ReadyShippingDetails currentReadyShipping = null;
        for (Object tranx: transactionList ){
            if(tranx instanceof ReadyShippingDetails){
                currentReadyShipping = (ReadyShippingDetails) tranx;
                break;
            }
        }
        return currentReadyShipping;
    }

    public void resetPage(){
        personInChargeTextField.setText("");
        shipmentDateChooser.setDate(new Date());
        shipmentMethodTextField.setText("");
        estimatedReceivedDateChooser.setDate(new Date());
    }

    public boolean isInputEmpty(){
        return (personInChargeTextField.getText().isEmpty()||
                dateFormat.format(shipmentDateChooser.getDate()).isEmpty()||
                shipmentMethodTextField.getText().isEmpty()||
                dateFormat.format(estimatedReceivedDateChooser.getDate()).isEmpty()
                );
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
            java.util.logging.Logger.getLogger(AcceptShipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcceptShipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcceptShipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcceptShipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcceptShipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private com.toedter.calendar.JDateChooser estimatedReceivedDateChooser;
    private javax.swing.JLabel goBackLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField personInChargeTextField;
    private com.toedter.calendar.JDateChooser shipmentDateChooser;
    private javax.swing.JTextField shipmentMethodTextField;
    // End of variables declaration//GEN-END:variables
}