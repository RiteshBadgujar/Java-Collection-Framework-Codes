import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Amit");
        v.add("Ravi");
        v.add("Ritesh");

        System.out.println("Vector Elements:");

        for (String s : v) {
            System.out.println(s);
        }
    }
}