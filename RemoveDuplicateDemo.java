import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Amit");
        list.add("Ravi");
        list.add("Amit");
        list.add("Ritesh");

        Set<String> set = new HashSet<>(list);

        System.out.println("After removing duplicates:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}