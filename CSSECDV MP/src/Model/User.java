// package Model;

// public class User {
//     private int id;
//     private String username;
//     private String password;
//     private int role = 2;
//     private int locked = 0;

//     public User(String username, String password){
//         this.username = username;
//         this.password = password;
//     }
    
//     public User(int id, String username, String password, int role, int locked){
//         this.id = id;
//         this.username = username;
//         this.password = password;
//         this.role = role;
//         this.locked = locked;
//     }
    
//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getUsername() {
//         return username;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

//     public int getRole() {
//         return role;
//     }

//     public void setRole(int role) {
//         this.role = role;
//     }

//     public int getLocked() {
//         return locked;
//     }

//     public void setLocked(int locked) {
//         this.locked = locked;
//     }
// }


package Model;

public class User {
    private int id;
    private String username;
    /** Stores PBKDF2 formatted hash string (not plaintext). */
    private String password;
    private int role;
    private boolean locked; // legacy/compat

    // New fields
    private int failedAttempts;
    private long lockedUntil; // epoch ms

    public User() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    /** Returns the stored PBKDF2 hash string. */
    public String getPassword() { return password; }
    /** Sets the stored PBKDF2 hash string. */
    public void setPassword(String password) { this.password = password; }

    public int getRole() { return role; }
    public void setRole(int role) { this.role = role; }

    /** Legacy getter expected by MgmtUser.java */
    public boolean getLocked() { return locked; }
    public boolean isLocked() { return locked; }
    public void setLocked(boolean locked) { this.locked = locked; }

    public int getFailedAttempts() { return failedAttempts; }
    public void setFailedAttempts(int failedAttempts) { this.failedAttempts = failedAttempts; }

    public long getLockedUntil() { return lockedUntil; }
    public void setLockedUntil(long lockedUntil) { this.lockedUntil = lockedUntil; }
}
