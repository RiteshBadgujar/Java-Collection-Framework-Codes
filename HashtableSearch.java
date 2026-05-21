import java.util.*;

public class HashtableSearch {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(101, "Jayesh");
        ht.put(102, "Ritesh");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No to Search: ");
        int roll = sc.nextInt();

        if (ht.containsKey(roll)) {

            System.out.println("Student Found");
            System.out.println(ht.get(roll));

        } else {

            System.out.println("Student Not Found");
        }

        sc.close();
    }
}