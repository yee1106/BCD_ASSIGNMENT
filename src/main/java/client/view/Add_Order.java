/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

/**
 * @author acer
 */

import static client.Main.clinic_healthcare;
import static client.Main.current_user;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import model.Order;
import util.Block;
import util.Block.Header;
import util.Blockchain;
import util.Hasher;
import util.MerkleTree;
import util.MySignature;
import util.Transaction;

public class Add_Order extends javax.swing.JFrame {

    /**
     * Creates new form Add_Order
     */
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Add_Order() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vaccineTypeComboBox = new javax.swing.JComboBox<>();
        manufacturerComboBox = new javax.swing.JComboBox<>();
        quantityTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        goBackLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Order Vaccine");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("Manufacturer:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setText("Vaccine Type: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setText("Quantity:");

        vaccineTypeComboBox.setBackground(new java.awt.Color(255, 204, 102));
        vaccineTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        vaccineTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinovac", "Pfizer", "Moderna", "AstraZeneca" }));

        manufacturerComboBox.setBackground(new java.awt.Color(255, 204, 102));
        manufacturerComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        quantityTextField.setBackground(new java.awt.Color(255, 204, 102));
        quantityTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quantityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityTextFieldKeyTyped(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(255, 153, 153));
        submitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(goBackLabel)
                .addGap(96, 96, 96)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vaccineTypeComboBox, 0, 291, Short.MAX_VALUE)
                            .addComponent(quantityTextField)
                            .addComponent(manufacturerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goBackLabel)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaccineTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackLabelMouseReleased
        this.setVisible(false);
        clinic_healthcare.setVisible(true);
    }//GEN-LAST:event_goBackLabelMouseReleased

    private void quantityTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextFieldKeyTyped
        char character = evt.getKeyChar();
        //input validation
        if (!(Character.isDigit(character) || (character == KeyEvent.VK_BACK_SPACE) || (character == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_quantityTextFieldKeyTyped

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (!quantityTextField.getText().isEmpty() && manufacturerComboBox.getSelectedItem() != null) {
            int option = JOptionPane.showConfirmDialog(null, "Confirm place order?", "Order Confirmation",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (JOptionPane.YES_OPTION == option) {
                configCreateBlock();
                JOptionPane.showMessageDialog(null, "Order Successful!!");
                quantityTextField.setText("");
                this.setVisible(false);
                clinic_healthcare.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantity or Manufacturer is empty!!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void configCreateBlock() {
        //Create a new order
        Order order = createOrder();

        //generate the digital signature by provide the hash user's name
        String hashUserName = Hasher.hash(current_user.getUserName(), "SHA-256");
        MySignature digitalSignature = new MySignature(hashUserName);
        order.setDigital_signature(digitalSignature.sign(order.toString()));

        //Generate the merkle root
        Transaction tranx = new Transaction();
        tranx.add(order);
        MerkleTree mt = MerkleTree.getInstance(tranx.getTranxLst());
        mt.build();

        //Create a new block
        Header lastBlockHeader = Blockchain.get().getLast().getHeader();
        Block blk = new Block(lastBlockHeader.getIndex() + 1,
                lastBlockHeader.getCurrentHash(),
                order.getOrder_batch_id(),
                order.getFrom(),
                order.getTo(),
                tranx,
                mt.getRoot());

        //Append the block to the blockchain
        Blockchain.nextBlock(blk);
        Blockchain.distribute();

        //Add the order data to the table
        clinic_healthcare.tableAddOrder(order.getOrder_batch_id(),
                order.getVaccineType(),
                order.getQuantity(),
                order.getTo(),
                blk);
    }

    public Order createOrder() {

        long new_batch_id = Blockchain.DB.getLast().getHeader().getBatch_id() + 1;
        Date today = new Date();
        Order order = new Order(new_batch_id, vaccineTypeComboBox.getSelectedItem().toString(), Integer.parseInt(quantityTextField.getText()), current_user.getUserName()
                , manufacturerComboBox.getSelectedItem().toString(), "Pending Order", dateFormat.format(today));
        return order;
    }

    public void setManufacturerComboBox(String item) {
        manufacturerComboBox.addItem(item);
    }

    public void resetManufacturerComboBox() {
        manufacturerComboBox.removeAllItems();
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
            java.util.logging.Logger.getLogger(Add_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel goBackLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> manufacturerComboBox;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> vaccineTypeComboBox;
    // End of variables declaration//GEN-END:variables


}
