import java.util.*;

public class VectorUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<String> vector = new Vector<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {

            String name = sc.nextLine();

            vector.add(name);
        }

        System.out.println("\nVector Elements:");

        for (String s : vector) {
            System.out.println(s);
        }

        sc.close();
    }
}