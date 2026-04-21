import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, String> map = new java.util.TreeMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            if (map.containsKey(roll)) {
                System.out.println("Roll number already exists! Try again.");
                i--;
                continue;
            }

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            map.put(roll, name);
        }

        System.out.println("\nSorted Student List (by roll no):");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}