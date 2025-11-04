
// package View;

// public class Login extends javax.swing.JPanel {

//     public Frame frame;
    
//     public Login() {
//         initComponents();
//     }

//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//     private void initComponents() {

//         jLabel1 = new javax.swing.JLabel();
//         usernameFld = new javax.swing.JTextField();
//         passwordFld = new javax.swing.JTextField();
//         registerBtn = new javax.swing.JButton();
//         loginBtn = new javax.swing.JButton();

//         jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
//         jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//         jLabel1.setText("SECURITY Svcs");
//         jLabel1.setToolTipText("");

//         usernameFld.setBackground(new java.awt.Color(240, 240, 240));
//         usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//         usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
//         usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

//         passwordFld.setBackground(new java.awt.Color(240, 240, 240));
//         passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//         passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
//         passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

//         registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
//         registerBtn.setText("REGISTER");
//         registerBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 registerBtnActionPerformed(evt);
//             }
//         });

//         loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
//         loginBtn.setText("LOGIN");
//         loginBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 loginBtnActionPerformed(evt);
//             }
//         });

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
//         this.setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                 .addContainerGap(200, Short.MAX_VALUE)
//                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                     .addGroup(layout.createSequentialGroup()
//                         .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                         .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
//                     .addComponent(usernameFld)
//                     .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING))
//                 .addContainerGap(200, Short.MAX_VALUE))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addContainerGap(88, Short.MAX_VALUE)
//                 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(50, 50, 50)
//                 .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
//                 .addContainerGap(126, Short.MAX_VALUE))
//         );
//     }// </editor-fold>//GEN-END:initComponents
//     private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
//         frame.mainNav();
//     }//GEN-LAST:event_loginBtnActionPerformed

//     private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
//         frame.registerNav();
//     }//GEN-LAST:event_registerBtnActionPerformed


//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JButton loginBtn;
//     private javax.swing.JTextField passwordFld;
//     private javax.swing.JButton registerBtn;
//     private javax.swing.JTextField usernameFld;
//     // End of variables declaration//GEN-END:variables
// }


package View;

import Controller.SQLite;
import Model.User;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Login extends JPanel {

    private final JTextField txtUsername;
    private final JPasswordField txtPassword;
    private final JButton btnLogin;
    private final JButton btnRegisterLink;

    public Login() {
        setLayout(new BorderLayout());
        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(6, 6, 6, 6);
        gc.anchor = GridBagConstraints.WEST;

        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        btnLogin = new JButton("Login");
        btnRegisterLink = new JButton("Create account");

        int row = 0;
        gc.gridx = 0; gc.gridy = row; form.add(new JLabel("Username:"), gc);
        gc.gridx = 1; form.add(txtUsername, gc); row++;
        gc.gridx = 0; gc.gridy = row; form.add(new JLabel("Password:"), gc);
        gc.gridx = 1; form.add(txtPassword, gc); row++;
        gc.gridx = 0; gc.gridy = row; form.add(btnRegisterLink, gc);
        gc.gridx = 1; form.add(btnLogin, gc); row++;

        add(form, BorderLayout.CENTER);

        btnRegisterLink.addActionListener(e -> {
            java.awt.Window w = SwingUtilities.getWindowAncestor(this);
            if (w instanceof Frame) {
                ((Frame) w).showRegister();
            }
        });

        btnLogin.addActionListener(e -> onLogin());
    }

    private void onLogin() {
        // 1–2s cooldown to equalize timing & discourage spamming
        btnLogin.setEnabled(false);
        new Timer(1500, ev -> btnLogin.setEnabled(true)).start();

        String username = txtUsername.getText().trim();
        char[] pass = txtPassword.getPassword();
        try {
            long now = System.currentTimeMillis();
            User user = SQLite.getUserByUsername(username);

            boolean locked = user != null && user.getLockedUntil() > now;
            boolean ok = false;
            if (!locked && user != null) {
                ok = SQLite.verifyPassword(pass, user.getPassword());
            } else {
                // still wipe pass via verify (wipes input); for uniformity we call it
                SQLite.verifyPassword(pass, (user != null) ? user.getPassword() : "pbkdf2-sha256$AAAAAAAAAAAAAAAAAAAAAA==$1$AAAAAAAAAAAAAAAAAAAAAA==");
            }

            if (!ok) {
                // record failure (even if user not found—safe no-op)
                SQLite.incrementFailedAttempt(username);
                // if we can see attempts, enforce lock at N=5
                if (user != null) {
                    int attempts = user.getFailedAttempts() + 1;
                    if (attempts >= 5) {
                        long fifteenMin = 15L * 60L * 1000L;
                        SQLite.setLock(username, System.currentTimeMillis() + fifteenMin);
                    }
                }
                JOptionPane.showMessageDialog(this, "Invalid credentials.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // success
            SQLite.resetFailedAttempts(username);
            SQLite.setLock(username, 0L); // clear lock if any

            java.awt.Window w = SwingUtilities.getWindowAncestor(this);
            if (w instanceof Frame) {
                ((Frame) w).onLoginSuccess(user);
            }
        } finally {
            Arrays.fill(pass, '\0'); // wipe
        }
    }
}
