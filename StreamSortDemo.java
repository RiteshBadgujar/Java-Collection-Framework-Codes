import java.util.*;
import java.util.stream.*;

public class StreamSortDemo {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Ritesh", "Amit", "Ravi");

        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}