import java.util.LinkedList;
import java.util.Scanner;

class Linked_List_Demo
{
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int no = 0;
        String fi;
       

        System.out.println("Enter Friend name  :");
         no = sc.nextInt();
        System.out.println("Enter the " + no + "Name");

        for (int i = 0; i <= no; i++) {
            fi = sc.nextLine();
            ll.add(fi);

        }
        System.out.println("Friends :" + ll);
        sc.close();

    }

}