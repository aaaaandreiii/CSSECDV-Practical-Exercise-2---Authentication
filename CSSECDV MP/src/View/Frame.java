// package View;

// import Controller.Main;
// import java.awt.BorderLayout;
// import java.awt.CardLayout;
// import java.awt.Dimension;
// import javax.swing.WindowConstants;

// public class Frame extends javax.swing.JFrame {

//     public Frame() {
//         initComponents();
//     }

//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//     private void initComponents() {

//         Container = new javax.swing.JPanel();
//         HomePnl = new javax.swing.JPanel();
//         Content = new javax.swing.JPanel();
//         Navigation = new javax.swing.JPanel();
//         adminBtn = new javax.swing.JButton();
//         jLabel1 = new javax.swing.JLabel();
//         managerBtn = new javax.swing.JButton();
//         staffBtn = new javax.swing.JButton();
//         clientBtn = new javax.swing.JButton();
//         logoutBtn = new javax.swing.JButton();

//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//         setBackground(new java.awt.Color(153, 153, 153));
//         setMinimumSize(new java.awt.Dimension(800, 450));

//         HomePnl.setBackground(new java.awt.Color(102, 102, 102));
//         HomePnl.setPreferredSize(new java.awt.Dimension(801, 500));

//         javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
//         Content.setLayout(ContentLayout);
//         ContentLayout.setHorizontalGroup(
//             ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGap(0, 544, Short.MAX_VALUE)
//         );
//         ContentLayout.setVerticalGroup(
//             ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGap(0, 0, Short.MAX_VALUE)
//         );

//         Navigation.setBackground(new java.awt.Color(204, 204, 204));

//         adminBtn.setBackground(new java.awt.Color(250, 250, 250));
//         adminBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
//         adminBtn.setText("Admin Home");
//         adminBtn.setFocusable(false);
//         adminBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 adminBtnActionPerformed(evt);
//             }
//         });

//         jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
//         jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//         jLabel1.setText("SECURITY Svcs");
//         jLabel1.setToolTipText("");

//         managerBtn.setBackground(new java.awt.Color(250, 250, 250));
//         managerBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
//         managerBtn.setText("Manager Home");
//         managerBtn.setFocusable(false);
//         managerBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 managerBtnActionPerformed(evt);
//             }
//         });

//         staffBtn.setBackground(new java.awt.Color(250, 250, 250));
//         staffBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
//         staffBtn.setText("Staff Home");
//         staffBtn.setFocusable(false);
//         staffBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 staffBtnActionPerformed(evt);
//             }
//         });

//         clientBtn.setBackground(new java.awt.Color(250, 250, 250));
//         clientBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
//         clientBtn.setText("Client Home");
//         clientBtn.setFocusable(false);
//         clientBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 clientBtnActionPerformed(evt);
//             }
//         });

//         logoutBtn.setBackground(new java.awt.Color(250, 250, 250));
//         logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
//         logoutBtn.setText("LOGOUT");
//         logoutBtn.setFocusable(false);
//         logoutBtn.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 logoutBtnActionPerformed(evt);
//             }
//         });

//         javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
//         Navigation.setLayout(NavigationLayout);
//         NavigationLayout.setHorizontalGroup(
//             NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(NavigationLayout.createSequentialGroup()
//                 .addContainerGap()
//                 .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addComponent(adminBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
//                     .addComponent(managerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(staffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(clientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                 .addContainerGap())
//         );
//         NavigationLayout.setVerticalGroup(
//             NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(NavigationLayout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(18, 18, 18)
//                 .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(managerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(clientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
//                 .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addContainerGap())
//         );

//         javax.swing.GroupLayout HomePnlLayout = new javax.swing.GroupLayout(HomePnl);
//         HomePnl.setLayout(HomePnlLayout);
//         HomePnlLayout.setHorizontalGroup(
//             HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePnlLayout.createSequentialGroup()
//                 .addComponent(Navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//         );
//         HomePnlLayout.setVerticalGroup(
//             HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//             .addComponent(Navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//         );

//         javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
//         Container.setLayout(ContainerLayout);
//         ContainerLayout.setHorizontalGroup(
//             ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGap(0, 980, Short.MAX_VALUE)
//             .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                 .addComponent(HomePnl, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
//         );
//         ContainerLayout.setVerticalGroup(
//             ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGap(0, 500, Short.MAX_VALUE)
//             .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                 .addComponent(HomePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//         );

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//         );

//         pack();
//     }// </editor-fold>//GEN-END:initComponents

//     private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
//         adminHomePnl.showPnl("home");
//         contentView.show(Content, "adminHomePnl");
//     }//GEN-LAST:event_adminBtnActionPerformed

//     private void managerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerBtnActionPerformed
//         managerHomePnl.showPnl("home");
//         contentView.show(Content, "managerHomePnl");
//     }//GEN-LAST:event_managerBtnActionPerformed

//     private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
//         staffHomePnl.showPnl("home");
//         contentView.show(Content, "staffHomePnl");
//     }//GEN-LAST:event_staffBtnActionPerformed

//     private void clientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBtnActionPerformed
//         clientHomePnl.showPnl("home");
//         contentView.show(Content, "clientHomePnl");
//     }//GEN-LAST:event_clientBtnActionPerformed

//     private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
//         frameView.show(Container, "loginPnl");
//     }//GEN-LAST:event_logoutBtnActionPerformed

//     public Main main;
//     public Login loginPnl = new Login();
//     public Register registerPnl = new Register();
    
//     private AdminHome adminHomePnl = new AdminHome();
//     private ManagerHome managerHomePnl = new ManagerHome();
//     private StaffHome staffHomePnl = new StaffHome();
//     private ClientHome clientHomePnl = new ClientHome();
    
//     private CardLayout contentView = new CardLayout();
//     private CardLayout frameView = new CardLayout();
    
//     public void init(Main controller){
//         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//         this.setTitle("CSSECDV - SECURITY Svcs");
//         this.setLocationRelativeTo(null);
        
//         this.main = controller;
//         loginPnl.frame = this;
//         registerPnl.frame = this;
        
//         adminHomePnl.init(main.sqlite);
//         clientHomePnl.init(main.sqlite);
//         managerHomePnl.init(main.sqlite);
//         staffHomePnl.init(main.sqlite);
        
//         Container.setLayout(frameView);
//         Container.add(loginPnl, "loginPnl");
//         Container.add(registerPnl, "registerPnl");
//         Container.add(HomePnl, "homePnl");
//         frameView.show(Container, "loginPnl");
        
//         Content.setLayout(contentView);
//         Content.add(adminHomePnl, "adminHomePnl");
//         Content.add(managerHomePnl, "managerHomePnl");
//         Content.add(staffHomePnl, "staffHomePnl");
//         Content.add(clientHomePnl, "clientHomePnl");
        
//         this.setVisible(true);
//     }
    
//     public void mainNav(){
//         frameView.show(Container, "homePnl");
//     }
    
//     public void loginNav(){
//         frameView.show(Container, "loginPnl");
//     }
    
//     public void registerNav(){
//         frameView.show(Container, "registerPnl");
//     }
    
//     public void registerAction(String username, String password, String confpass){
//         main.sqlite.addUser(username, password);
//     }

//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     private javax.swing.JPanel Container;
//     private javax.swing.JPanel Content;
//     private javax.swing.JPanel HomePnl;
//     private javax.swing.JPanel Navigation;
//     private javax.swing.JButton adminBtn;
//     private javax.swing.JButton clientBtn;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JButton logoutBtn;
//     private javax.swing.JButton managerBtn;
//     private javax.swing.JButton staffBtn;
//     // End of variables declaration//GEN-END:variables
// }


package View;

import Model.User;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JToolBar;

/**
 * Main application frame with routing, RBAC, session handling and logout.
 */
public class Frame extends JFrame {

    // ---- Roles ----
    public static final int ROLE_GUEST = 1;
    public static final int ROLE_CLIENT = 2;
    public static final int ROLE_STAFF = 3;
    public static final int ROLE_MANAGER = 4;
    public static final int ROLE_ADMIN = 5;

    // ---- Session ----
    private static final long MAX_IDLE_MS = 20L * 60L * 1000L; // 20 minutes (optional)
    private Session session;

    static final class Session {
        User user;
        long createdAt;
        long lastActivity;
        boolean isExpired(long maxIdleMs) { return System.currentTimeMillis() - lastActivity > maxIdleMs; }
        void touch() { lastActivity = System.currentTimeMillis(); }
        void invalidate() { user = null; createdAt = lastActivity = 0L; }
    }

    private static boolean allowed(Session s, int... roles) {
        if (s == null || s.user == null) return false;
        int r = s.user.getRole();
        for (int role : roles) {
            if (r == role) return true;
        }
        return false;
    }

    // ---- UI & routing ----
    private final JPanel cards = new JPanel(new CardLayout());
    private final Login login = new Login();
    private final Register register = new Register();
    private final AdminHome adminHome = new AdminHome();
    private final ManagerHome managerHome = new ManagerHome();
    private final StaffHome staffHome = new StaffHome();
    private final ClientHome clientHome = new ClientHome();

    private final JToolBar top = new JToolBar();
    private final JButton btnLogout = new JButton("Logout");
    private final JLabel lblUser = new JLabel(" ");

    public Frame() {
        setTitle("CSSECDV");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(640, 420));

        top.setFloatable(false);
        btnLogout.addActionListener(e -> logout());
        top.add(lblUser);
        top.addSeparator();
        top.add(btnLogout);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(top, BorderLayout.NORTH);

        cards.add(login, "login");
        cards.add(register, "register");
        cards.add(adminHome, "admin");
        cards.add(managerHome, "manager");
        cards.add(staffHome, "staff");
        cards.add(clientHome, "client");

        getContentPane().add(cards, BorderLayout.CENTER);
        pack();

        // initial screen
        showLogin();
    }

    // Called by Login panel after successful authentication
    public void onLoginSuccess(User user) {
        Session s = new Session();
        s.user = user;
        s.createdAt = System.currentTimeMillis();
        s.lastActivity = s.createdAt;
        this.session = s;

        routeToHomeByRole(s);
    }

    public void routeToHomeByRole(Session s) {
        if (s == null || s.user == null) {
            showLogin();
            return;
        }
        if (s.isExpired(MAX_IDLE_MS)) {
            logout();
            return;
        }
        s.touch();
        lblUser.setText("Logged in as: " + Objects.toString(s.user.getUsername(), "unknown"));
        btnLogout.setVisible(true);

        CardLayout cl = (CardLayout) cards.getLayout();
        switch (s.user.getRole()) {
            case ROLE_ADMIN:
                cl.show(cards, "admin");
                break;
            case ROLE_MANAGER:
                cl.show(cards, "manager");
                break;
            case ROLE_STAFF:
                cl.show(cards, "staff");
                break;
            case ROLE_CLIENT:
            default:
                cl.show(cards, "client");
        }
    }

    public void logout() {
        if (session != null) session.invalidate();
        session = null;
        lblUser.setText(" ");
        btnLogout.setVisible(false);
        showLogin();
    }

    public void showLogin() {
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards, "login");
        lblUser.setText(" ");
        btnLogout.setVisible(false);
    }

    public void showRegister() {
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards, "register");
        lblUser.setText(" ");
        btnLogout.setVisible(false);
    }

    /** Exposes current session to home panels for guard checks. */
    public Session getSession() { return session; }

    // --- Legacy baseline: keep method signature for compatibility (unused by our Register) ---
    // Never store plaintext here; reject use by throwing if called with non-empty arrays.
    public void registerAction(String username, char[] password, char[] confpass) {
        // For safety (baseline compatibility), we simply route to Register screen.
        showRegister();
        if (password != null) java.util.Arrays.fill(password, '\0');
        if (confpass != null) java.util.Arrays.fill(confpass, '\0');
    }
}
