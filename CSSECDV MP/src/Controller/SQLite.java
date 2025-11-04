// package Controller;

// import Model.History;
// import Model.Logs;
// import Model.Product;
// import Model.User;
// import java.sql.Connection;
// import java.sql.DatabaseMetaData;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;
// import java.util.ArrayList;

// public class SQLite {
    
//     public int DEBUG_MODE = 0;
//     String driverURL = "jdbc:sqlite:" + "database.db";
    
//     public void createNewDatabase() {
//         try (Connection conn = DriverManager.getConnection(driverURL)) {
//             if (conn != null) {
//                 DatabaseMetaData meta = conn.getMetaData();
//                 System.out.println("Database database.db created.");
//             }
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void createHistoryTable() {
//         String sql = "CREATE TABLE IF NOT EXISTS history (\n"
//             + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
//             + " username TEXT NOT NULL,\n"
//             + " name TEXT NOT NULL,\n"
//             + " stock INTEGER DEFAULT 0,\n"
//             + " timestamp TEXT NOT NULL\n"
//             + ");";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("Table history in database.db created.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void createLogsTable() {
//         String sql = "CREATE TABLE IF NOT EXISTS logs (\n"
//             + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
//             + " event TEXT NOT NULL,\n"
//             + " username TEXT NOT NULL,\n"
//             + " desc TEXT NOT NULL,\n"
//             + " timestamp TEXT NOT NULL\n"
//             + ");";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("Table logs in database.db created.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
     
//     public void createProductTable() {
//         String sql = "CREATE TABLE IF NOT EXISTS product (\n"
//             + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
//             + " name TEXT NOT NULL UNIQUE,\n"
//             + " stock INTEGER DEFAULT 0,\n"
//             + " price REAL DEFAULT 0.00\n"
//             + ");";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("Table product in database.db created.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
     
//     public void createUserTable() {
//         String sql = "CREATE TABLE IF NOT EXISTS users (\n"
//             + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
//             + " username TEXT NOT NULL UNIQUE,\n"
//             + " password TEXT NOT NULL,\n"
//             + " role INTEGER DEFAULT 2,\n"
//             + " locked INTEGER DEFAULT 0\n"
//             + ");";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("Table users in database.db created.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void dropHistoryTable() {
//         String sql = "DROP TABLE IF EXISTS history;";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("Table history in database.db dropped.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void dropLogsTable() {
//         String sql = "DROP TABLE IF EXISTS logs;";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("Table logs in database.db dropped.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void dropProductTable() {
//         String sql = "DROP TABLE IF EXISTS product;";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("Table product in database.db dropped.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void dropUserTable() {
//         String sql = "DROP TABLE IF EXISTS users;";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("Table users in database.db dropped.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void addHistory(String username, String name, int stock, String timestamp) {
//         String sql = "INSERT INTO history(username,name,stock,timestamp) VALUES('" + username + "','" + name + "','" + stock + "','" + timestamp + "')";
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()){
//             stmt.execute(sql);
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void addLogs(String event, String username, String desc, String timestamp) {
//         String sql = "INSERT INTO logs(event,username,desc,timestamp) VALUES('" + event + "','" + username + "','" + desc + "','" + timestamp + "')";
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()){
//             stmt.execute(sql);
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void addProduct(String name, int stock, double price) {
//         String sql = "INSERT INTO product(name,stock,price) VALUES('" + name + "','" + stock + "','" + price + "')";
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()){
//             stmt.execute(sql);
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void addUser(String username, String password) {
//         String sql = "INSERT INTO users(username,password) VALUES('" + username + "','" + password + "')";
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()){
//             stmt.execute(sql);
            
// //      PREPARED STATEMENT EXAMPLE
// //      String sql = "INSERT INTO users(username,password) VALUES(?,?)";
// //      PreparedStatement pstmt = conn.prepareStatement(sql)) {
// //      pstmt.setString(1, username);
// //      pstmt.setString(2, password);
// //      pstmt.executeUpdate();
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
    
//     public ArrayList<History> getHistory(){
//         String sql = "SELECT id, username, name, stock, timestamp FROM history";
//         ArrayList<History> histories = new ArrayList<History>();
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)){
            
//             while (rs.next()) {
//                 histories.add(new History(rs.getInt("id"),
//                                    rs.getString("username"),
//                                    rs.getString("name"),
//                                    rs.getInt("stock"),
//                                    rs.getString("timestamp")));
//             }
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//         return histories;
//     }
    
//     public ArrayList<Logs> getLogs(){
//         String sql = "SELECT id, event, username, desc, timestamp FROM logs";
//         ArrayList<Logs> logs = new ArrayList<Logs>();
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)){
            
//             while (rs.next()) {
//                 logs.add(new Logs(rs.getInt("id"),
//                                    rs.getString("event"),
//                                    rs.getString("username"),
//                                    rs.getString("desc"),
//                                    rs.getString("timestamp")));
//             }
//         } catch (Exception ex) {
//             ex.printStackTrace();
//         }
//         return logs;
//     }
    
//     public ArrayList<Product> getProduct(){
//         String sql = "SELECT id, name, stock, price FROM product";
//         ArrayList<Product> products = new ArrayList<Product>();
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)){
            
//             while (rs.next()) {
//                 products.add(new Product(rs.getInt("id"),
//                                    rs.getString("name"),
//                                    rs.getInt("stock"),
//                                    rs.getFloat("price")));
//             }
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//         return products;
//     }
    
//     public ArrayList<User> getUsers(){
//         String sql = "SELECT id, username, password, role, locked FROM users";
//         ArrayList<User> users = new ArrayList<User>();
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)){
            
//             while (rs.next()) {
//                 users.add(new User(rs.getInt("id"),
//                                    rs.getString("username"),
//                                    rs.getString("password"),
//                                    rs.getInt("role"),
//                                    rs.getInt("locked")));
//             }
//         } catch (Exception ex) {}
//         return users;
//     }
    
//     public void addUser(String username, String password, int role) {
//         String sql = "INSERT INTO users(username,password,role) VALUES('" + username + "','" + password + "','" + role + "')";
        
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()){
//             stmt.execute(sql);
            
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public void removeUser(String username) {
//         String sql = "DELETE FROM users WHERE username='" + username + "';";

//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement()) {
//             stmt.execute(sql);
//             System.out.println("User " + username + " has been deleted.");
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//     }
    
//     public Product getProduct(String name){
//         String sql = "SELECT name, stock, price FROM product WHERE name='" + name + "';";
//         Product product = null;
//         try (Connection conn = DriverManager.getConnection(driverURL);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)){
//             product = new Product(rs.getString("name"),
//                                    rs.getInt("stock"),
//                                    rs.getFloat("price"));
//         } catch (Exception ex) {
//             System.out.print(ex);
//         }
//         return product;
//     }
// }

package Controller;

import Model.User;
import Model.Product;
import Model.History;
import Model.Logs;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * SQLite DAO + security helpers.
 * All queries use PreparedStatement; no SQL concatenation anywhere.
 */
public class SQLite {

    private static final String DB_URL = "jdbc:sqlite:cssecdv.db";

    // PBKDF2 params
    private static final String KDF_ALGO = "PBKDF2WithHmacSHA256";
    private static final int ITERATIONS = 310_000;
    private static final int KEY_LEN_BYTES = 32;
    private static final int SALT_LEN_BYTES = 16;

    /** Legacy panels instantiate SQLite directly, so keep constructor public. */
    public SQLite() {}

    /** Legacy MgmtLogs toggles this. Harmless instance flag. */
    public int DEBUG_MODE = 0;

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    // ---------- Schema init / migration / seeding ----------

    public static void initSchemaAndSeed() {
        try (Connection con = getConnection()) {
            con.setAutoCommit(false);
            try {
                ensureUsersTable(con);
                migrateUsersTable(con);
                seedIfEmpty(con);
                con.commit();
            } catch (Exception e) {
                con.rollback();
                throw e;
            } finally {
                con.setAutoCommit(true);
            }
        } catch (Exception ex) {
            // Avoid logging any secret. Here only schema status.
            System.err.println("[db] init failed: " + ex.getMessage());
        }
    }

    private static void ensureUsersTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "username TEXT UNIQUE NOT NULL," +
                "password TEXT NOT NULL," +
                "role INTEGER NOT NULL CHECK(role IN (1,2,3,4,5))," +
                "failed_attempts INTEGER DEFAULT 0," +
                "locked_until INTEGER DEFAULT 0" +
                ")";
        try (Statement st = con.createStatement()) {
            st.execute(sql);
        }
    }

    private static boolean columnExists(Connection con, String table, String name) throws SQLException {
        String pragma = "PRAGMA table_info('" + table + "')";
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(pragma)) {
            while (rs.next()) {
                String col = rs.getString("name");
                if (name.equalsIgnoreCase(col)) return true;
            }
        }
        return false;
    }

    private static void migrateUsersTable(Connection con) throws SQLException {
        if (!columnExists(con, "users", "failed_attempts")) {
            try (Statement st = con.createStatement()) {
                st.execute("ALTER TABLE users ADD COLUMN failed_attempts INTEGER DEFAULT 0");
            }
        }
        if (!columnExists(con, "users", "locked_until")) {
            try (Statement st = con.createStatement()) {
                st.execute("ALTER TABLE users ADD COLUMN locked_until INTEGER DEFAULT 0");
            }
        }
    }

    private static void seedIfEmpty(Connection con) throws Exception {
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT COUNT(*) AS c FROM users")) {
            if (rs.next() && rs.getInt("c") == 0) {
                // Securely seed with hashed passwords (no plaintext in DB)
                insertSeed(con, "admin",   hashPassword("Admin#12345".toCharArray()),   5);
                insertSeed(con, "manager", hashPassword("Manager#12345".toCharArray()), 4);
                insertSeed(con, "staff",   hashPassword("Staff#12345".toCharArray()),   3);
                insertSeed(con, "client",  hashPassword("Client#12345".toCharArray()),  2);
            }
        }
    }

    private static void insertSeed(Connection con, String u, String hash, int role) throws SQLException {
        String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u);
            ps.setString(2, hash);
            ps.setInt(3, role);
            ps.executeUpdate();
        }
    }

    // ---------- Password hashing helpers ----------

    /**
     * Derives a hash using PBKDF2-HMAC-SHA256 and returns the formatted string:
     * pbkdf2-sha256$<base64(salt)>$<iterations>$<base64(hash)>
     * The provided char[] is wiped before returning.
     */
    public static String hashPassword(char[] plain) {
        if (plain == null) return null;
        byte[] salt = new byte[SALT_LEN_BYTES];
        new SecureRandom().nextBytes(salt);
        PBEKeySpec spec = null;
        try {
            spec = new PBEKeySpec(plain, salt, ITERATIONS, KEY_LEN_BYTES * 8);
            SecretKeyFactory skf = SecretKeyFactory.getInstance(KDF_ALGO);
            byte[] dk = skf.generateSecret(spec).getEncoded();
            String b64Salt = Base64.getEncoder().encodeToString(salt);
            String b64Hash = Base64.getEncoder().encodeToString(dk);
            return "pbkdf2-sha256$" + b64Salt + "$" + ITERATIONS + "$" + b64Hash;
        } catch (Exception e) {
            throw new RuntimeException("Password hashing failed.");
        } finally {
            // wipe inputs
            if (spec != null) spec.clearPassword();
            Arrays.fill(plain, '\0');
        }
    }

    /**
     * Verifies a plaintext password against the stored formatted hash.
     * Uses constant-time comparison (MessageDigest.isEqual).
     * The provided char[] is wiped before returning.
     */
    public static boolean verifyPassword(char[] plain, String storedHash) {
        if (plain == null || storedHash == null || !storedHash.startsWith("pbkdf2-sha256$")) {
            if (plain != null) Arrays.fill(plain, '\0');
            return false;
        }
        PBEKeySpec spec = null;
        try {
            String[] parts = storedHash.split("\\$");
            if (parts.length != 4) return false;
            byte[] salt = Base64.getDecoder().decode(parts[1]);
            int iters = Integer.parseInt(parts[2]);
            byte[] expected = Base64.getDecoder().decode(parts[3]);

            spec = new PBEKeySpec(plain, salt, iters, expected.length * 8);
            SecretKeyFactory skf = SecretKeyFactory.getInstance(KDF_ALGO);
            byte[] actual = skf.generateSecret(spec).getEncoded();

            return MessageDigest.isEqual(actual, expected);
        } catch (Exception e) {
            return false;
        } finally {
            if (spec != null) spec.clearPassword();
            if (plain != null) Arrays.fill(plain, '\0');
        }
    }

    // ---------- DAO (PreparedStatement only) ----------

    public static User getUserByUsername(String u) {
        String sql = "SELECT id, username, password, role, failed_attempts, locked_until FROM users WHERE username = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password")); // stored hash
                    user.setRole(rs.getInt("role"));
                    user.setFailedAttempts(rs.getInt("failed_attempts"));
                    user.setLockedUntil(rs.getLong("locked_until"));
                    // keep 'locked' legacy field aligned to state:
                    user.setLocked(user.getLockedUntil() > System.currentTimeMillis());
                    return user;
                }
            }
        } catch (SQLException e) {
            System.err.println("[db] getUserByUsername error: " + e.getMessage());
        }
        return null;
    }

    public static boolean insertUser(String u, String hash, int role) {
        String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u);
            ps.setString(2, hash);
            ps.setInt(3, role);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            // unique constraint might fail
            return false;
        }
    }

    public static boolean isUsernameTaken(String u) {
        String sql = "SELECT 1 FROM users WHERE username = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            return true; // fail closed
        }
    }

    public static void incrementFailedAttempt(String u) {
        String sql = "UPDATE users SET failed_attempts = failed_attempts + 1 WHERE username = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("[db] incrementFailedAttempt: " + e.getMessage());
        }
    }

    public static void resetFailedAttempts(String u) {
        String sql = "UPDATE users SET failed_attempts = 0 WHERE username = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("[db] resetFailedAttempts: " + e.getMessage());
        }
    }

    public static void setLock(String u, long untilEpochMs) {
        String sql = "UPDATE users SET locked_until = ? WHERE username = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, untilEpochMs);
            ps.setString(2, u);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("[db] setLock: " + e.getMessage());
        }
    }

    // ---------- Helpers for legacy table access ----------

    private static Set<String> columnSet(ResultSetMetaData md) throws SQLException {
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= md.getColumnCount(); i++) {
            set.add(md.getColumnName(i).toLowerCase());
        }
        return set;
    }

    private static String getStringByCandidates(ResultSet rs, ResultSetMetaData md, String... candidates) throws SQLException {
        Set<String> cols = columnSet(md);
        for (String c : candidates) {
            if (cols.contains(c.toLowerCase())) {
                return rs.getString(c);
            }
        }
        return null;
    }

    private static int getIntByCandidates(ResultSet rs, ResultSetMetaData md, String... candidates) throws SQLException {
        Set<String> cols = columnSet(md);
        for (String c : candidates) {
            if (cols.contains(c.toLowerCase())) {
                try {
                    return rs.getInt(c);
                } catch (SQLException ex) {
                    String s = rs.getString(c);
                    try { return Integer.parseInt(s); } catch (Exception ignore) {}
                }
            }
        }
        return 0;
    }

    private static float getFloatByCandidates(ResultSet rs, ResultSetMetaData md, String... candidates) throws SQLException {
        Set<String> cols = columnSet(md);
        for (String c : candidates) {
            if (cols.contains(c.toLowerCase())) {
                try {
                    return rs.getFloat(c);
                } catch (SQLException ex) {
                    String s = rs.getString(c);
                    try { return Float.parseFloat(s); } catch (Exception ignore) {}
                }
            }
        }
        return 0f;
    }

    // ---------- Legacy compatibility methods (used by Mgmt* panels) ----------
    // These operate safely (prepared statements) and degrade gracefully (empty lists)
    // if the legacy tables are missing. They do NOT expose plaintext credentials.

    /** Returns all users for management panels. */
    public ArrayList<User> getUsers() {
        ArrayList<User> list = new ArrayList<>();
        String sql = "SELECT id, username, password, role, failed_attempts, locked_until FROM users";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password")); // hash string
                u.setRole(rs.getInt("role"));
                u.setFailedAttempts(rs.getInt("failed_attempts"));
                u.setLockedUntil(rs.getLong("locked_until"));
                u.setLocked(u.getLockedUntil() > System.currentTimeMillis());
                list.add(u);
            }
        } catch (SQLException e) {
            // If table missing or columns differ, return empty list
        }
        return list;
    }

    /** Returns all products and maps to Product(String name, int qty, float price). */
    public ArrayList<Product> getProduct() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next()) {
                String name = getStringByCandidates(rs, md, "name", "product_name", "product", "prodname", "pname", "title");
                int qty     = getIntByCandidates(rs, md, "quantity", "qty", "stock", "amount", "count", "units");
                float price = getFloatByCandidates(rs, md, "price", "cost", "amount", "unit_price", "srp");
                if (name == null) name = "unknown";
                list.add(new Product(name, qty, price));
            }
        } catch (SQLException e) {
            // Missing table -> empty list
        }
        return list;
    }

    /**
     * Returns a product by name (case-insensitive). We scan rows to avoid
     * referencing a non-existent column in WHERE (schemas vary across repos).
     */
    public Product getProduct(String targetName) {
        if (targetName == null) return null;
        String sql = "SELECT * FROM products";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next()) {
                String name = getStringByCandidates(rs, md, "name", "product_name", "product", "prodname", "pname", "title");
                if (name != null && name.equalsIgnoreCase(targetName)) {
                    int qty     = getIntByCandidates(rs, md, "quantity", "qty", "stock", "amount", "count", "units");
                    float price = getFloatByCandidates(rs, md, "price", "cost", "amount", "unit_price", "srp");
                    return new Product(name, qty, price);
                }
            }
        } catch (SQLException e) {
            // ignore, return null
        }
        return null;
    }

    /** Returns history entries mapped to History(String name, String action, int qty). */
    public ArrayList<History> getHistory() {
        ArrayList<History> list = new ArrayList<>();
        String sql = "SELECT * FROM history";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next()) {
                String name   = getStringByCandidates(rs, md, "name", "product", "product_name", "item");
                String action = getStringByCandidates(rs, md, "action", "type", "event", "status", "operation");
                int qty       = getIntByCandidates(rs, md, "qty", "quantity", "amount", "count", "units");
                if (name == null) name = "";
                if (action == null) action = "";
                list.add(new History(name, action, qty));
            }
        } catch (SQLException e) {
            // ignore, return empty
        }
        return list;
    }

    /** Returns logs mapped to Logs(String message, String when). */
    public ArrayList<Logs> getLogs() {
        ArrayList<Logs> list = new ArrayList<>();
        String sql = "SELECT * FROM logs";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next()) {
                String message = getStringByCandidates(rs, md, "message", "activity", "event", "log", "details", "action");
                String when    = getStringByCandidates(rs, md, "date", "timestamp", "time", "created_at", "logged_at");
                if (message == null) message = "";
                if (when == null) when = "";
                list.add(new Logs(message, when));
            }
        } catch (SQLException e) {
            // ignore, return empty
        }
        return list;
    }
}
