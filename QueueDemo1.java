import java.util.*;

public class QueueDemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("\nQueue Elements:");
        System.out.println(queue);

        // First element
        System.out.println("Front Element: " + queue.peek());

        // Remove first element
        System.out.println("Removed Element: " + queue.poll());

        System.out.println("Queue after removal:");
        System.out.println(queue);

        sc.close();
    }
}