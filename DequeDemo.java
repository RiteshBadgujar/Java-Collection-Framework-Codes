import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<Integer> dq = new ArrayDeque<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            dq.addLast(num); // insert at rear
        }

        System.out.println("\nDeque Elements:");
        System.out.println(dq);

        // Add at front
        dq.addFirst(100);

        // Add at rear
        dq.addLast(200);

        System.out.println("\nAfter adding elements:");
        System.out.println(dq);

        // Remove front
        System.out.println("Removed from front: " + dq.removeFirst());

        // Remove rear
        System.out.println("Removed from rear: " + dq.removeLast());

        System.out.println("\nFinal Deque:");
        System.out.println(dq);

        sc.close();
    }
}