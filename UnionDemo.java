import java.util.*;

public class UnionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Set 1
        System.out.print("Enter number of elements in Set 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements for Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Set 2
        System.out.print("\nEnter number of elements in Set 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements for Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("\nUnion of Set 1 and Set 2:");
        System.out.println(union);

        sc.close();
    }
}