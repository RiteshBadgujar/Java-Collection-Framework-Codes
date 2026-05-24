import java.util.*;

public class PropertiesUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Properties p = new Properties();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        p.setProperty("username", username);
        p.setProperty("password", password);

        System.out.println("\nStored Properties:");

        System.out.println("Username: " +
                p.getProperty("username"));

        System.out.println("Password: " +
                p.getProperty("password"));

        sc.close();
    }
}