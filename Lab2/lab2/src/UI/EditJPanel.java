/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Customer;
import Model.DeliveryPackage;
import Model.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nehar
 */
public class EditJPanel extends javax.swing.JPanel {

    private DeliveryPackage delPackage;
    private Product productViewed;

    /**
     * Creates new form EditJPanel
     */
    public EditJPanel() {
        initComponents();
    }

    EditJPanel(DeliveryPackage deliveryPackage) {
        initComponents();

        this.delPackage = deliveryPackage;

        displayProductList();
        
        displayPackageDetails();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageId = new javax.swing.JTextField();
        packageWt = new javax.swing.JTextField();
        custId = new javax.swing.JTextField();
        productId1 = new javax.swing.JTextField();
        productName1 = new javax.swing.JTextField();
        productPrice1 = new javax.swing.JTextField();
        custName1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        productComboBox = new javax.swing.JComboBox();
        btnShow = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(packageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, 30));
        add(packageWt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 130, 30));
        add(custId, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 130, 30));
        add(productId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 130, 30));
        add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 130, 30));
        add(productPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 130, 30));
        add(custName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 130, 30));

        jLabel1.setText("ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 20));

        jLabel2.setText("Package Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setText("weight");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setText("ProdId");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        jLabel5.setText("ProdName");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 20));

        jLabel6.setText("ProdPrice");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, 20));

        jLabel7.setText("Customer name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 20));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 90, 20));

        btnUpdateProduct.setText("UPDATE PRODUCT");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });
        add(btnUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        add(productComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 150, 30));

        btnShow.setText("SHOW");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        // get the data
        String id = packageId.getText();
        String weight = packageWt.getText();
//        String productId = productId1.getText();
//        String productName = productName1.getText();
//        String productPrice = productPrice1.getText();
        String customerId = custId.getText();
        String customername = custName1.getText();

        // store the data
        this.delPackage.setPackageId(Integer.valueOf(id));
        this.delPackage.setPackageWeight(Double.valueOf(weight));

        Customer customer = this.delPackage.getCustomer();
        customer.setCustomerId(Integer.valueOf(customerId));
        customer.setFullName(customername);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        // TODO add your handling code here:
        
        
        // update the product in the list
        this.productViewed.setProductName(productName1.getText());
        this.productViewed.setPrice(Double.valueOf(productPrice1.getText()));
        
        
        
        // Update the Product Selected
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:

        // to disable the field
        productId1.setEnabled(false);
        
        int pid = (int) productComboBox.getSelectedItem();

        // find the product in the arraylsit
        Product prod = this.delPackage.findProduct(pid);
         this.productViewed = prod;
        // display the product content

        if (!prod.equals(null)) {
            productId1.setText(String.valueOf(pid));
            productName1.setText(prod.getProductName());
            productPrice1.setText(String.valueOf(prod.getPrice()));
        } else {
            JOptionPane.showMessageDialog(null, "Product not found");
        }

    }//GEN-LAST:event_btnShowActionPerformed

    public void displayProductList() {

        for (Product p : this.delPackage.getProductList()) {
            productComboBox.addItem(p.getProductId());
        }

    }

    public void displayPackageDetails() {
        packageId.setText(String.valueOf(this.delPackage.getPackageId()));
        packageWt.setText(String.valueOf(this.delPackage.getPackageWeight()));

        Customer customer = this.delPackage.getCustomer();
        custId.setText(String.valueOf(customer.getCustomerId()));
        custName1.setText(customer.getFullName());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JTextField custId;
    private javax.swing.JTextField custName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageId;
    private javax.swing.JTextField packageWt;
    private javax.swing.JComboBox productComboBox;
    private javax.swing.JTextField productId1;
    private javax.swing.JTextField productName1;
    private javax.swing.JTextField productPrice1;
    // End of variables declaration//GEN-END:variables
}