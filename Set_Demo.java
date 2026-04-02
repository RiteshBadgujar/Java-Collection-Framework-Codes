import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Set_Demo {

    public Set_Demo() {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        System.out.println("Enter the Set A Element Size :-");
        int no = sc.nextInt();
        System.out.println("Enter element Value");
        for (int i = 0; i < no; i++) {

            int in = sc.nextInt();
            a.add(in);

        }
        System.out.println("Enter the Set A Element Size :-");
        int no1 = sc.nextInt();
        System.out.println("Enter element Value");
        for (int i = 0; i < no1; i++) {

            int in = sc.nextInt();
            a.add(in);

        }
        Set<Integer> u = new HashSet<>(a);
        u.addAll(b);
        System.out.println("union (A U B)" + u);

        Set<Integer> i = new HashSet<>(a);
        i.retainAll(b);
        System.out.println("InterSeation (A N B)" + i);

        Set<Integer> complementA = new HashSet<>(a);
        complementA.removeAll(b);
        System.out.println("Complement (A-B)" + complementA);

        Set<Integer> complementB = new HashSet<>(b);
        complementB.removeAll(a);
        System.out.println("Complement (B-A)" + complementB);
        sc.close();

    }

    public static void main(String[] args) {
        new Set_Demo();
    }
}
