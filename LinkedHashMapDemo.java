import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Ritesh");
        map.put(1, "Amit");
        map.put(2, "Ravi");

        System.out.println("LinkedHashMap (insertion order):");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}