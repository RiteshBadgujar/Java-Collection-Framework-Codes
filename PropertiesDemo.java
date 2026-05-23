import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) {

        Properties p = new Properties();

        // Add properties
        p.setProperty("username", "ritesh");
        p.setProperty("password", "1234");
        p.setProperty("city", "Nashik");

        // Display all properties
        System.out.println("Properties:");

        System.out.println(p);

        // Get specific property
        System.out.println("\nUsername: " +
                p.getProperty("username"));

        System.out.println("Password: " +
                p.getProperty("password"));
    }
}