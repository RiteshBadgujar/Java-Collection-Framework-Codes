import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Amit");
        list.add("Ravi");
        list.add("Ritesh");
        list.add("Jayesh");

        System.out.println("List: " + list);

        System.out.println("Element at index 2 : " + list.get(2));
    }
}