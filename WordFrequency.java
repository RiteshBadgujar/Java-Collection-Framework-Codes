import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine().toLowerCase();

        String[] words = input.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        sc.close();
    }
}