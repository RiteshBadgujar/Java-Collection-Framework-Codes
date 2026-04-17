import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Amit");
        map.put(2, "Ravi");
        map.put(3, "Ritesh");

        System.out.println("Map: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(1);

        System.out.println("After removal : " + map);
    }
}