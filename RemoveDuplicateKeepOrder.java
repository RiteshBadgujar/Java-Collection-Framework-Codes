import java.util.*;

public class RemoveDuplicateKeepOrder {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Amit", "Ravi", "Amit", "Ritesh", "Ravi");

        Set<String> set = new LinkedHashSet<>(list);

        System.out.println("After removing duplicates:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}