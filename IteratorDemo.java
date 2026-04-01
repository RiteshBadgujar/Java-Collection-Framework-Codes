import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ritesh");
        list.add("Amit");
        list.add("Ravi");
        list.add("Amit");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();

            if (name.equals("Amit")) {
                it.remove();
            }
        }

        System.out.println("After removal:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}