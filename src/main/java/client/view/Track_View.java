/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import static client.Main.clinic_healthcare;
import static client.Main.current_user;
import static client.Main.manufacturerHomePage;
import static client.Main.update_production_status;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.ConfirmOrder;
import model.ConfirmShipping;
import model.Order;
import model.ShippingDetail;
import util.Block;
import util.Blockchain;
import util.Hasher;
import util.MerkleTree;
import util.MySignature;

/**
 * @author acer
 */
public class Track_View extends javax.swing.JFrame {

    /**
     * Creates new form Track_View
     */
    JFrame comeFromPage = new JFrame();
    boolean isManufacturer;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public String APPROVED_ORDER = "Approved Order";
    public String REJECTER_ORDER = "Rejected order";
    boolean isClinicVerifiedDistribution;

    public Track_View() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        statusTrackTextArea = new javax.swing.JTextArea();
        goBackLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        verifySignatureButton = new javax.swing.JButton();
        acceptOrderButton = new javax.swing.JButton();
        declineOrderButton = new javax.swing.JButton();
        updateTrackingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Track Record");

        statusTrackTextArea.setEditable(false);
        statusTrackTextArea.setColumns(20);
        statusTrackTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        statusTrackTextArea.setForeground(new java.awt.Color(255, 102, 102));
        statusTrackTextArea.setRows(5);
        jScrollPane1.setViewportView(statusTrackTextArea);

        goBackLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goBackLabel.setForeground(new java.awt.Color(153, 255, 255));
        goBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goBackIcon.png"))); // NOI18N
        goBackLabel.setText("Go back");
        goBackLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        goBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackLabelMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Track");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Info");

        infoTextArea.setEditable(false);
        infoTextArea.setColumns(20);
        infoTextArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        infoTextArea.setForeground(new java.awt.Color(51, 51, 255));
        infoTextArea.setRows(5);
        jScrollPane2.setViewportView(infoTextArea);

        verifySignatureButton.setBackground(new java.awt.Color(102, 102, 255));
        verifySignatureButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        verifySignatureButton.setText("Verify Signature");
        verifySignatureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifySignatureButtonActionPerformed(evt);
            }
        });

        acceptOrderButton.setBackground(new java.awt.Color(51, 255, 51));
        acceptOrderButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acceptOrderButton.setText("Accept Order");
        acceptOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderButtonActionPerformed(evt);
            }
        });

        declineOrderButton.setBackground(new java.awt.Color(255, 102, 102));
        declineOrderButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        declineOrderButton.setText("Decline Order");
        declineOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineOrderButtonActionPerformed(evt);
            }
        });

        updateTrackingButton.setBackground(new java.awt.Color(153, 255, 153));
        updateTrackingButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateTrackingButton.setText("Update Status");
        updateTrackingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTrackingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(updateTrackingButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(acceptOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(declineOrderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(verifySignatureButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))
                                                .addGap(42, 42, 42))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(goBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(123, 123, 123)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(goBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(acceptOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(updateTrackingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(declineOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(verifySignatureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackLabelMouseReleased
        this.setVisible(false);
        comeFromPage.setVisible(true);
    }//GEN-LAST:event_goBackLabelMouseReleased

    private void verifySignatureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifySignatureButtonActionPerformed
        if (!isClinicVerifiedDistribution) {
            if (verifyClinicOrderData()) {
                JOptionPane.showMessageDialog(null, "Order Transaction Data is correct!!");
            } else {
                JOptionPane.showMessageDialog(null, "Order Transaction Data has been altered", "Data Incorrect", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (verifyDistributionData()) {
                JOptionPane.showMessageDialog(null, "Distribution Transaction Data is correct!!");
            } else {
                JOptionPane.showMessageDialog(null, "Order Transaction Data has been altered", "Data Incorrect", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_verifySignatureButtonActionPerformed

    private void acceptOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure?", "Accept Order",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (JOptionPane.YES_OPTION == option) {

            //Create a new transaction for the confirm order process
            Date today = new Date();
            ConfirmOrder orderStatus = new ConfirmOrder(current_user.getUserName(),
                    APPROVED_ORDER,
                    "Order accepted. Preparing the vaccine.",
                    dateFormat.format(today));

            //Sign the transaction with the digital signature
            String hashUserName = Hasher.hash(current_user.getUserName(), "SHA-256");
            MySignature digitalSignature = new MySignature(hashUserName);
            orderStatus.setDigital_signature(digitalSignature.sign(orderStatus.toString()));

            //Add the transaction to the block
            updateBlockConfirmOrderTranx(
                    manufacturerHomePage.selectedBlock.getHeader().getBatch_id(),
                    orderStatus,
                    null
            );

            setButtonVisible(false);
            updateTrackingButton.setVisible(true);
            setStatusTrackText(statusTrackTextArea.getText() + "\n" + orderStatus.statusTrackToString());
        }
    }//GEN-LAST:event_acceptOrderButtonActionPerformed

    private void declineOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineOrderButtonActionPerformed
        String message = JOptionPane.showInputDialog("Why reject the order?");
        if (message != null) {
            if (message.isEmpty()) {
                message = "Order has been rejected";
            }
            Date today = new Date();
            ConfirmOrder orderStatus = new ConfirmOrder(current_user.getUserName(), REJECTER_ORDER, message, dateFormat.format(today));
            String hashUserName = Hasher.hash(current_user.getUserName(), "SHA-256");
            MySignature digitalSignature = new MySignature(hashUserName);
            orderStatus.setDigital_signature(digitalSignature.sign(orderStatus.toString()));
            updateBlockConfirmOrderTranx(manufacturerHomePage.selectedBlock.getHeader().getBatch_id(), orderStatus, null);
            setButtonVisible(false);
            updateTrackingButton.setVisible(false);
            setStatusTrackText(statusTrackTextArea.getText() + "\n" + orderStatus.statusTrackToString());
        }
    }//GEN-LAST:event_declineOrderButtonActionPerformed

    private void updateTrackingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTrackingButtonActionPerformed
        update_production_status.resetUpdateProductionPage();
        this.setVisible(false);
        update_production_status.setVisible(true);
    }//GEN-LAST:event_updateTrackingButtonActionPerformed

    public void updateBlockConfirmOrderTranx(long batch_ID, Object tranx, String distribution) {
        boolean isBlockFound = false;
        String previousHash = "";
        for (Block block : Blockchain.DB) {
            if (!isBlockFound) {
                if (batch_ID == block.getHeader().getBatch_id()) {
                    block.getTranx().getTranxLst().add(tranx);
                    block.getHeader().setTimeStamp(new Timestamp(System.currentTimeMillis()).getTime());
                    MerkleTree mt = MerkleTree.getInstance(block.getTranx().getTranxLst());
                    mt.build();
                    block.getHeader().setMerkleRootStr(mt.getRoot());
                    block.getHeader().setCurrentHash(null);
                    if (distribution != null) {
                        block.getHeader().getInvolvedPerson().add(distribution);
                    }
                    byte[] blockBytes = getBytes(block);
                    block.getHeader().setCurrentHash(Hasher.hash(blockBytes, "SHA-256"));

                    isBlockFound = true;
                    previousHash = block.getHeader().getCurrentHash();
                }
            } else {
                block.getHeader().setPreviousHash(previousHash);
                block.getHeader().setCurrentHash(null);
                byte[] blockBytes = getBytes(block);
                block.getHeader().setCurrentHash(Hasher.hash(blockBytes, "SHA-256"));
                previousHash = block.getHeader().getCurrentHash();
            }
        }
        Blockchain.persist();
        Blockchain.distribute();
    }

    private byte[] getBytes(Block block) {

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(baos);
        ) {
            out.writeObject(block);
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    private boolean verifyClinicOrderData() {
        boolean isDataCorrect = false;
        Block selectedBlock = manufacturerHomePage.selectedBlock;
        for (Object orderDetails : selectedBlock.getTranx().getTranxLst()) {
            if (orderDetails instanceof Order) {
                String hashUserName = Hasher.hash(((Order) orderDetails).getFrom(), "SHA-256");
                MySignature digitalSignature = new MySignature(hashUserName);
                isDataCorrect = digitalSignature.verify(orderDetails.toString(), ((Order) orderDetails).getDigital_signature());
                break;
            }
        }
        return isDataCorrect;
    }

    private boolean verifyDistributionData() {
        boolean isDataCorrect = false;
        Block selectedBlock = clinic_healthcare.selectedBlock;
        for (Object confirmShippingDetails : selectedBlock.getTranx().getTranxLst()) {
            if (confirmShippingDetails instanceof ConfirmShipping) {
                String hashUserName = Hasher.hash(((ConfirmShipping) confirmShippingDetails).getActor(), "SHA-256");
                MySignature digitalSignature = new MySignature(hashUserName);
                ConfirmShipping confirmShipping = ((ConfirmShipping) confirmShippingDetails);
                String signature = confirmShipping.getDigitalSignature();
                confirmShipping.setDigitalSignature(null);
                isDataCorrect = digitalSignature.verify(confirmShipping.toString(), signature);
                confirmShipping.setDigitalSignature(signature);
                if (!isDataCorrect) {
                    break;
                }
            }
            if (confirmShippingDetails instanceof ShippingDetail) {
                String hashUserName = Hasher.hash(((ShippingDetail) confirmShippingDetails).getActor(), "SHA-256");
                MySignature digitalSignature = new MySignature(hashUserName);
                ShippingDetail shippingDetail = ((ShippingDetail) confirmShippingDetails);
                String signature = shippingDetail.getDigitalSignature();
                shippingDetail.setDigitalSignature(null);
                isDataCorrect = digitalSignature.verify(confirmShippingDetails.toString(), signature);
                shippingDetail.setDigitalSignature(signature);
                if (!isDataCorrect) {
                    break;
                }
            }
        }
        return isDataCorrect;
    }

    public void setComeFromPage(JFrame comeFromPage, boolean isManufacturer) {
        this.comeFromPage = comeFromPage;
        this.isManufacturer = isManufacturer;
        setButtonVisible(isManufacturer);
    }

    public void setButtonVisible(boolean isVisible) {
        acceptOrderButton.setVisible(isVisible);
        declineOrderButton.setVisible(isVisible);
        verifySignatureButton.setVisible(isVisible);
        updateTrackingButton.setVisible(false);
    }

    public void setUpdateTrackButtonVisible(boolean isVisible) {
        updateTrackingButton.setVisible(isVisible);
    }

    public void setStatusTrackText(String data) {
        statusTrackTextArea.setText(data);
    }

    public void isClinicVerify(boolean visible) {
        verifySignatureButton.setVisible(visible);
        isClinicVerifiedDistribution = visible;
    }

    public String getStatusTrackText() {
        return statusTrackTextArea.getText();
    }

    public void setInfoTrackText(String data) {
        infoTextArea.setText(data);
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
            java.util.logging.Logger.getLogger(Track_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Track_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Track_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Track_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Track_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrderButton;
    private javax.swing.JButton declineOrderButton;
    private javax.swing.JLabel goBackLabel;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea statusTrackTextArea;
    private javax.swing.JButton updateTrackingButton;
    private javax.swing.JButton verifySignatureButton;
    // End of variables declaration//GEN-END:variables
}
