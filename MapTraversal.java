import java.util.HashMap;
import java.util.Map;

public class MapTraversal {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Amit");
        map.put(2, "Ravi");
        map.put(3, "Ritesh");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}