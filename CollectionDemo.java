import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();

        c.add("Amit");
        c.add("Ravi");
        c.add("Ritesh");

        System.out.println("Collection: " + c);

        c.remove("Ravi");

        System.out.println("After remove: " + c);
    }
}
