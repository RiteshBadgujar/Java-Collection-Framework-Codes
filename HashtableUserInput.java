import java.util.*;

public class HashtableUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hashtable<Integer, String> ht = new Hashtable<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            ht.put(roll, name);
        }

        System.out.println("\nHashtable Records:");

        for (Map.Entry<Integer, String> entry : ht.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                    entry.getValue()
            );
        }

        sc.close();
    }
}