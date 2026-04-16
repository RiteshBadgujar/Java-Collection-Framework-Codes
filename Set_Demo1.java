import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_Demo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            set.add(name);
        }

        System.out.println("\nUnique Names:");
        for (String s : set) {
            System.out.println(s);
        }

        sc.close();
    }
}