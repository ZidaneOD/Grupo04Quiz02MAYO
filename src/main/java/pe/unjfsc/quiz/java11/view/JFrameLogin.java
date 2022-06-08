/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.unjfsc.quiz.java11.view;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author TATIANA
 */
public class JFrameLogin extends javax.swing.JFrame {

    JFrameMostrarInformacion mosIn;
    public JFrameLogin() {
        mosIn= new JFrameMostrarInformacion();
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 147, 136));
        jLabel2.setText("Iniciar Sesión");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 260, 80));

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Usuario:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, 30));

        jSeparator1.setBackground(new java.awt.Color(47, 147, 136));
        jSeparator1.setForeground(new java.awt.Color(47, 147, 136));
        jSeparator1.setAlignmentX(1.5F);
        jSeparator1.setAlignmentY(1.5F);
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 240, 10));

        txtsuario.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtsuario.setBorder(null);
        txtsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsuarioFocusLost(evt);
            }
        });
        jPanel1.add(txtsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 240, 40));

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Contraseña:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 140, 30));

        txtContra.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        txtContra.setForeground(new java.awt.Color(102, 102, 102));
        txtContra.setBorder(null);
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 230, 30));

        jSeparator2.setBackground(new java.awt.Color(47, 147, 136));
        jSeparator2.setForeground(new java.awt.Color(47, 147, 136));
        jSeparator2.setAlignmentX(1.5F);
        jSeparator2.setAlignmentY(1.5F);
        jSeparator2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 240, 10));

        jPanel2.setBackground(new java.awt.Color(24, 46, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingresar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 120, 30));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsuarioFocusGained
        if (txtsuario.getText().equals("Ingrese usuario")) {
            txtsuario.setText("");
            txtsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtsuarioFocusGained

    private void txtsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsuarioFocusLost
        if (txtsuario.getText().isEmpty()) {
            txtsuario.setForeground(Color.GRAY);
            txtsuario.setText("Ingrese usuario");
        }
    }//GEN-LAST:event_txtsuarioFocusLost

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String user = "Grupo04";
        String contraseña = "grupo04";

        String a = txtsuario.getText();
        String b = txtContra.getText();

        if(a.equals("") && b.equals("")){
            JOptionPane.showMessageDialog(null, "No registro datos", "Advertencia", JOptionPane.OK_OPTION);
        }

        else if (a.equals(user) && b.equals(contraseña)) {
            this.setVisible(false);
            mosIn.setVisible(true);


        } else {
            txtsuario.setText("");
            txtContra.setText("");
            txtsuario.requestFocus();

            int op = JOptionPane.showConfirmDialog(rootPane, "El usuario o Contraseña es invalido." + "\n"
                + "¿Desea continuar?", "Error", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

            if (op == JOptionPane.YES_NO_OPTION) {
                if (op == 0) {
                    txtsuario.setText("");
                    txtContra.setText("");
                    txtsuario.requestFocus();
                }
            } else {
                this.setVisible(false);
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtsuario;
    // End of variables declaration//GEN-END:variables
}
