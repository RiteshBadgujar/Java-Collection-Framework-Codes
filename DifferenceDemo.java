import java.util.*;

public class DifferenceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Input Set 1
        System.out.print("Enter number of elements in Set 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements for Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Input Set 2
        System.out.print("\nEnter number of elements in Set 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements for Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        // Difference logic (Set1 - Set2)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("\nDifference (Set1 - Set2):");
        System.out.println(difference);

        sc.close();
    }
}