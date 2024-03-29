/*
 *This is a pizzaria selling GUI program
 * Sept 20 2019
 */

/**
 *
 * @author arkir7294
 */
public class PutridPizza extends javax.swing.JFrame {

    /**
     * Creates new form PutridPizza
     */
    public PutridPizza() {
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
        Diameterlbl = new javax.swing.JLabel();
        Diametertxt = new javax.swing.JTextField();
        OrderButton = new javax.swing.JButton();
        Subtotaltxt = new javax.swing.JTextField();
        Subtotallbl = new javax.swing.JLabel();
        HSTlbl = new javax.swing.JLabel();
        Totallbl = new javax.swing.JLabel();
        HSTtxt = new javax.swing.JTextField();
        Totaltxt = new javax.swing.JTextField();
        Numlbl = new javax.swing.JLabel();
        NumTxt = new javax.swing.JTextField();
        Displaytxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 40, 190));
        jLabel1.setText("Putrid Pizzaria!");

        Diameterlbl.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        Diameterlbl.setText("Diameter of Pizza (cm): ");

        OrderButton.setText("Order");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        Subtotallbl.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Subtotallbl.setText("Subtotal ($):");

        HSTlbl.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        HSTlbl.setText("HST ($):");

        Totallbl.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Totallbl.setText("Total ($):");

        Totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltxtActionPerformed(evt);
            }
        });

        Numlbl.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Numlbl.setText("Amount of pizzas:");

        Displaytxt.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Displaytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplaytxtActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ajayk\\Downloads\\img_6941_6018.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(OrderButton)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Diameterlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Numlbl)
                                                    .addGap(18, 18, 18))))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NumTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(Diametertxt))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(HSTlbl)
                                            .addComponent(Subtotallbl)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Totallbl)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Subtotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HSTtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(Displaytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numlbl)
                            .addComponent(NumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subtotallbl)
                            .addComponent(Subtotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Diameterlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diametertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HSTlbl)
                    .addComponent(HSTtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderButton)
                    .addComponent(Totallbl)
                    .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(Displaytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed

        //Variable Declaration Area
        final double LABOUR = 0.75;
        final double RENT = 1.00;
        final double DIAMETER_COST = 0.50;
        final double HST = 0.13;
        double diameter;
        double numpizza;
        double labourprice;
        double rentprice;
        double diameterprice;
        double total;
        double hsttotal;
        double totalprice;
        
        diameter = Double.parseDouble(Diametertxt.getText());
        numpizza = Double.parseDouble(NumTxt.getText());
        
        if (diameter >= 1 && diameter <=15) {
            Displaytxt.setText(String.valueOf("We are going to make you a cute little pizza!"));
            
        } 
        else if (diameter >= 20 && diameter <= 40) {
            Displaytxt.setText(String.valueOf("This will be delicious!"));

        }
        else if (diameter > 40) {
            Displaytxt.setText(String.valueOf("WHOA that's a big pizza!!"));
        }
        
        labourprice = numpizza * LABOUR;
        rentprice = numpizza * RENT;
      
        diameterprice = diameter * DIAMETER_COST;
        total = diameterprice + labourprice + rentprice;
        total = Math.round(total * 100.00) / 100.00;
        Subtotaltxt.setText(String.valueOf(total + "$"));
        
        hsttotal = total * HST;
        hsttotal = Math.round(hsttotal * 100.00) / 100.00;
        HSTtxt.setText(String.valueOf(hsttotal + "$"));
        
        totalprice = total * 1.13;
        totalprice = Math.round(totalprice * 100.00) / 100.00;
        Totaltxt.setText(String.valueOf(totalprice + "$"));
        
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void DisplaytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplaytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplaytxtActionPerformed

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
            java.util.logging.Logger.getLogger(PutridPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PutridPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PutridPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PutridPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PutridPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Diameterlbl;
    private javax.swing.JTextField Diametertxt;
    private javax.swing.JTextField Displaytxt;
    private javax.swing.JLabel HSTlbl;
    private javax.swing.JTextField HSTtxt;
    private javax.swing.JTextField NumTxt;
    private javax.swing.JLabel Numlbl;
    private javax.swing.JButton OrderButton;
    private javax.swing.JLabel Subtotallbl;
    private javax.swing.JTextField Subtotaltxt;
    private javax.swing.JLabel Totallbl;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
