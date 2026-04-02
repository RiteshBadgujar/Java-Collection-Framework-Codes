
// 3. Write a program to create a new tree set, add some colors (string) and print out the tree set.
import java.util.Scanner;
import java.util.TreeSet;

class Tree_Set_Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<String> colors = new TreeSet<>();

        System.out.println("Enter How many Colours :");
        int no = sc.nextInt();

        System.out.println("Enter the " + no + " Colours :");
        sc.nextLine();

        for (int i = 0; i < no; i++) {
            String c = sc.nextLine();
            colors.add(c);
        }
        System.out.println("Colours :" + colors);
        sc.close();
    }
}