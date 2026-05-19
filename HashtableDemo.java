import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "Amit");
        ht.put(2, "Ravi");
        ht.put(3, "Ritesh");

        System.out.println("Hashtable Elements:");

        for (Map.Entry<Integer, String> entry : ht.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                    entry.getValue()
            );
        }
    }
}