/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Signup() {
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

        signup_img = new javax.swing.JLabel();
        signup_title = new javax.swing.JLabel();
        signup_userlabel = new javax.swing.JLabel();
        signup_passlabel = new javax.swing.JLabel();
        signup_userinput = new javax.swing.JTextField();
        signup_passinput = new javax.swing.JPasswordField();
        signup_btn = new javax.swing.JButton();
        signup_title1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signup_img.setIcon(new javax.swing.ImageIcon("E:\\Document\\Projects\\rz_repo_java\\pbo_kel5_laundry\\src\\main\\java\\2150.png")); // NOI18N
        signup_img.setText("jLabel1");

        signup_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signup_title.setText("LAUNDRY MANAGEMENT");

        signup_userlabel.setText("Username :");

        signup_passlabel.setText("Password  :");

        signup_userinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_userinputActionPerformed(evt);
            }
        });

        signup_btn.setText("DAFTAR");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });

        signup_title1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signup_title1.setText("MENU DAFTAR AKUN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(signup_img, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signup_title)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(signup_passlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signup_userlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signup_userinput)
                            .addComponent(signup_passinput))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signup_btn)
                .addGap(173, 173, 173))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signup_title1)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(signup_img, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signup_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signup_title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup_userlabel)
                    .addComponent(signup_userinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup_passlabel)
                    .addComponent(signup_passinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signup_btn)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_userinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_userinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_userinputActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:
        try {
            String user = signup_userinput.getText();
            String pass = signup_passinput.getText();
            String sql = "INSERT INTO `users`(`name`, `password`, `date`) VALUES ('"+user+"','"+pass+"', NOW())";
            Connection hubung = (Connection)Dbconn.configDB();
            java.sql.PreparedStatement pst = hubung.prepareStatement(sql);
            if (user.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Username dan Password tidak boleh kosong");
            } else {
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil mendaftar");
                new Login().setVisible(true);
                this.dispose();
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_signup_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton signup_btn;
    private javax.swing.JLabel signup_img;
    private javax.swing.JPasswordField signup_passinput;
    private javax.swing.JLabel signup_passlabel;
    private javax.swing.JLabel signup_title;
    private javax.swing.JLabel signup_title1;
    private javax.swing.JTextField signup_userinput;
    private javax.swing.JLabel signup_userlabel;
    // End of variables declaration//GEN-END:variables
}
