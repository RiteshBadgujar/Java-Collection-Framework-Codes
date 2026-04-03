import java.util.Hashtable;
import java.util.Scanner;

class Contact {
    String name;
    String phoneNo;

    public Contact(String name, String phoneNo) {

        this.name = name;
        this.phoneNo = phoneNo;

    }

    @Override
    public String toString() {

        return "Name: " + name + ", Phone Number: " + phoneNo;
    }

}

public class Hash_Table_Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Contact> hashtable = new Hashtable<String, Contact>();

        int no;
        String name;
        String phoneNO;

        System.out.println("Enter the No Record :");
        no = sc.nextInt();

        for (int i = 0; i < no; i++) {

            System.out.println("Enter the name :");
            name = sc.nextLine();

            System.out.println("Enter the phone Number :");
            phoneNO = sc.nextLine();

            hashtable.put(name, new Contact(name, phoneNO));

        }
        sc.close();
        

    }

}
