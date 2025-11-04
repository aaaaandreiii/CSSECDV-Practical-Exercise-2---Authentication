
// package View;

// public class Register extends javax.swing.JPanel {

//     public Frame frame;
    
//     public Register() {
//         initComponents();
//     }

//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//     private void initComponents() {

//         registerBtn = new javax.swing.JButton();
//         passwordFld = new javax.swing.JTextField();
//         usernameFld = new javax.swing.JTextField();
//         jLabel1 = new javax.swing.JLabel();
//         confpassFld = new javax.swing.JTextField();
//         backBtn = new javax.swing.JButton();

//         registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
//         registerBtn.setText("REGISTER");
//         registerBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 registerBtnActionPerformed(evt);
//             }
//         });

//         passwordFld.setBackground(new java.awt.Color(240, 240, 240));
//         passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//         passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
//         passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

//         usernameFld.setBackground(new java.awt.Color(240, 240, 240));
//         usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//         usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
//         usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

//         jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
//         jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//         jLabel1.setText("SECURITY Svcs");
//         jLabel1.setToolTipText("");

//         confpassFld.setBackground(new java.awt.Color(240, 240, 240));
//         confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//         confpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
//         confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

//         backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
//         backBtn.setText("<Back");
//         backBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 backBtnActionPerformed(evt);
//             }
//         });

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
//         this.setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                 .addContainerGap(200, Short.MAX_VALUE)
//                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                     .addComponent(usernameFld)
//                     .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING)
//                     .addComponent(confpassFld, javax.swing.GroupLayout.Alignment.LEADING))
//                 .addContainerGap(200, Short.MAX_VALUE))
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                 .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//             .addGroup(layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(backBtn)
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(backBtn)
//                 .addGap(24, 24, 24)
//                 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(40, 40, 40)
//                 .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(confpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(18, 18, 18)
//                 .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addContainerGap(64, Short.MAX_VALUE))
//         );
//     }// </editor-fold>//GEN-END:initComponents

//     private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
//         frame.registerAction(usernameFld.getText(), passwordFld.getText(), confpassFld.getText());
//         frame.loginNav();
//     }//GEN-LAST:event_registerBtnActionPerformed

//     private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
//         frame.loginNav();
//     }//GEN-LAST:event_backBtnActionPerformed


//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     private javax.swing.JButton backBtn;
//     private javax.swing.JTextField confpassFld;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JTextField passwordFld;
//     private javax.swing.JButton registerBtn;
//     private javax.swing.JTextField usernameFld;
//     // End of variables declaration//GEN-END:variables
// }


package View;

import Controller.SQLite;
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

/**
 * Registration panel that enforces a strong password policy and stores
 * only PBKDF2-HMAC-SHA256 password hashes (no plaintext).
 *
 * <p><b>PBKDF2 parameters:</b>
 * iterations = 310,000; key length = 32 bytes (256 bits); salt = 16 bytes.
 * The hash format stored in the DB is:
 * <pre>pbkdf2-sha256$&lt;base64(salt)&gt;$&lt;iterations&gt;$&lt;base64(derivedKey)&gt;</pre>
 *
 * <p><b>Why char[] instead of String?</b> Java {@code String} objects are
 * immutable and may linger in memory until GC, risking exposure. {@code char[]}
 * can be zeroed after use (see wipes in this class).
 *
 * <p><b>No extra libraries:</b> Uses only JDK/JCA ({@code PBKDF2WithHmacSHA256}),
 * so NetBeans compiles/runs without additional jars.
 */
public class Register extends JPanel {

    private final JTextField txtUsername;
    private final JPasswordField txtPassword;
    private final JPasswordField txtConfirm;
    private final JButton btnRegister;
    private final JButton btnBackToLogin;

    public Register() {
        setLayout(new BorderLayout());
        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(6, 6, 6, 6);
        gc.anchor = GridBagConstraints.WEST;

        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        txtConfirm = new JPasswordField(20);
        btnRegister = new JButton("Register");
        btnBackToLogin = new JButton("Back to Login");

        int row = 0;

        gc.gridx = 0; gc.gridy = row; form.add(new JLabel("Username:"), gc);
        gc.gridx = 1; form.add(txtUsername, gc); row++;

        gc.gridx = 0; gc.gridy = row; form.add(new JLabel("Password:"), gc);
        gc.gridx = 1; form.add(txtPassword, gc); row++;

        gc.gridx = 0; gc.gridy = row; form.add(new JLabel("Confirm Password:"), gc);
        gc.gridx = 1; form.add(txtConfirm, gc); row++;

        gc.gridx = 0; gc.gridy = row; form.add(btnBackToLogin, gc);
        gc.gridx = 1; form.add(btnRegister, gc); row++;

        add(form, BorderLayout.CENTER);

        btnBackToLogin.addActionListener(e -> {
            java.awt.Window w = SwingUtilities.getWindowAncestor(this);
            if (w instanceof Frame) {
                ((Frame) w).showLogin();
            }
        });

        btnRegister.addActionListener(e -> onRegister());
    }

    private void onRegister() {
        String username = txtUsername.getText().trim();
        char[] pass = txtPassword.getPassword();
        char[] conf = txtConfirm.getPassword();

        try {
            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username is required.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!Arrays.equals(pass, conf)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            validatePassword(pass);

            if (SQLite.isUsernameTaken(username)) {
                JOptionPane.showMessageDialog(this, "Username unavailable.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Hash, wipe, and store only the hash
            String hash = SQLite.hashPassword(pass); // method wipes input internally as well
            Arrays.fill(conf, '\0'); // wipe confirmation immediately
            // role 2 = Client
            boolean ok = SQLite.insertUser(username, hash, 2);
            if (ok) {
                JOptionPane.showMessageDialog(this, "Account created. You can login now.", "Success", JOptionPane.INFORMATION_MESSAGE);
                txtUsername.setText("");
                txtPassword.setText("");
                txtConfirm.setText("");
                java.awt.Window w = SwingUtilities.getWindowAncestor(this);
                if (w instanceof Frame) {
                    ((Frame) w).showLogin();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Could not create account.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Belt-and-suspenders wipe (in case hashPassword had an early exit)
            Arrays.fill(pass, '\0');
            Arrays.fill(conf, '\0');
        }
    }

    /**
     * Enforces password policy:
     * length ≥ 10; at least one upper, one lower, one digit, one symbol; rejects blank/common.
     */
    private static void validatePassword(char[] pass) throws Exception {
        if (pass == null || pass.length < 10) {
            throw new Exception("Password must be at least 10 characters.");
        }
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSymbol = false;
        for (char c : pass) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSymbol = true;
        }
        if (!(hasUpper && hasLower && hasDigit && hasSymbol)) {
            throw new Exception("Password must include upper, lower, digit, and symbol.");
        }
        String s = new String(pass).toLowerCase();
        // reject blank/common
        String[] common = {
            "password", "1234567890", "qwerty", "letmein", "admin", "welcome"
        };
        if (s.trim().isEmpty()) throw new Exception("Password cannot be blank.");
        for (String bad : common) {
            if (s.contains(bad)) throw new Exception("Password is too common.");
        }
    }
}
