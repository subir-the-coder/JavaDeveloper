import java.util.Scanner;

class SecurityDemo {

    // Hardcoded username & password (for demo only)
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "Simplia123";

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Simple Security Login System ===");
            
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
            
            // Basic security checks
            if (user.isEmpty() || pass.isEmpty()) {
                System.out.println("Error: Username or password cannot be empty!");
                return;
            }
            
            // Authentication check
            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                System.out.println("Access Granted! Welcome " + user + " ✔");
            } else {
                System.out.println("Access Denied! Invalid credentials ❌");
            }
        }
    }
}
