/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author SystellCOM
 */
public class GestionTableauxBord extends javax.swing.JFrame {

    /**
     * Creates new form GestionTableauxBord
     */
    public GestionTableauxBord() {
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
        btn_retour_connexion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_gest_devis = new javax.swing.JButton();
        btn_gest_clients = new javax.swing.JButton();
        btn_gest_produits = new javax.swing.JButton();
        btn_gest_factures = new javax.swing.JButton();
        myButton1 = new composants.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1130, 562));

        btn_retour_connexion.setText("Retour");
        btn_retour_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retour_connexionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 24)); // NOI18N
        jLabel1.setText("TABLEAU DE BORD");

        btn_gest_devis.setText("DEVIS");
        btn_gest_devis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gest_devisActionPerformed(evt);
            }
        });

        btn_gest_clients.setText("CLIENTS");
        btn_gest_clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gest_clientsActionPerformed(evt);
            }
        });

        btn_gest_produits.setText("PRODUITS");
        btn_gest_produits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gest_produitsActionPerformed(evt);
            }
        });

        btn_gest_factures.setText("FACTURES");
        btn_gest_factures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gest_facturesActionPerformed(evt);
            }
        });

        myButton1.setText("Comptes de connexion");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_retour_connexion)
                .addContainerGap(658, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 300, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_gest_devis, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btn_gest_factures, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btn_gest_produits, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btn_gest_clients, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(myButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(278, 278, 278))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_gest_clients)
                .addGap(18, 18, 18)
                .addComponent(btn_gest_produits)
                .addGap(28, 28, 28)
                .addComponent(btn_gest_factures)
                .addGap(18, 18, 18)
                .addComponent(btn_gest_devis)
                .addGap(29, 29, 29)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btn_retour_connexion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_retour_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retour_connexionActionPerformed
        //Revenir vers l'écran de connexion
        new GestionConnexion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_retour_connexionActionPerformed

    private void btn_gest_clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gest_clientsActionPerformed
        // TODO add your handling code here:
        //Acceder à l'interface de gestion des clients
        new GestionClients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_gest_clientsActionPerformed

    private void btn_gest_produitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gest_produitsActionPerformed
        // TODO add your handling code here:
        //Acceder à l'interface affichant un message d'interdiction d'accès
        new AccesInterdit().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_gest_produitsActionPerformed

    private void btn_gest_facturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gest_facturesActionPerformed
        // TODO add your handling code here:
        //Acceder à l'interface affichant un message d'interdiction d'accès

        new AccesInterdit().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_gest_facturesActionPerformed

    private void btn_gest_devisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gest_devisActionPerformed
        // TODO add your handling code here:
        //Acceder à l'interface affichant un message d'interdiction d'accès

        new AccesInterdit().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_gest_devisActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        new GestionComptes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionTableauxBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTableauxBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTableauxBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTableauxBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTableauxBord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gest_clients;
    private javax.swing.JButton btn_gest_devis;
    private javax.swing.JButton btn_gest_factures;
    private javax.swing.JButton btn_gest_produits;
    private javax.swing.JButton btn_retour_connexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private composants.MyButton myButton1;
    // End of variables declaration//GEN-END:variables
}
