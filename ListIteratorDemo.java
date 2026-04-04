import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ritesh");
        list.add("Shubham");
        list.add("Ravi");

        ListIterator<String> it = list.listIterator();

        System.out.println("Forward Traversal:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nBackward Traversal:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}