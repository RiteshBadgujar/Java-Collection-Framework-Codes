
//1.	Write a java program to accept names of ‘n’ cities, insert same into array list collection and display the contents of same array list, also remove all these elements.
import java.util.Scanner;
import java.util.ArrayList;

public class Array_List_Demo {


    public Array_List_Demo(){
         ArrayList<String> cities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int no;
        String c;
        System.out.println("Enter the No of cities:");

        no = sc.nextInt();

        System.out.println("Enter the cities :");
        System.out.println("Enter the No of cities:");

        for (int i = 0; i <= no; i++) {

            c = sc.nextLine();
            cities.add(c);
        }
        System.out.println("Cities " + cities);

        System.out.println("After the remove element:");
        cities.clear();
        System.out.println("Cities " + cities);
        sc.close();
    }

    

    public static void main(String[] args) {

         new Array_List_Demo();
       
    }
}