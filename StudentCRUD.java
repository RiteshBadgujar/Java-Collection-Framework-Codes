import java.util.*;

class Student {

    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentCRUD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n----- STUDENT MENU -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // ADD
                case 1:

                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    list.add(new Student(roll, name, marks));

                    System.out.println("Student Added");
                    break;

                // DISPLAY
                case 2:

                    System.out.println("\nStudent Records:");

                    for (Student s : list) {

                        System.out.println(
                                s.rollNo + " " +
                                s.name + " " +
                                s.marks
                        );
                    }

                    break;

                // SEARCH
                case 3:

                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (Student s : list) {

                        if (s.rollNo == searchRoll) {

                            System.out.println(
                                    s.rollNo + " " +
                                    s.name + " " +
                                    s.marks
                            );

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                // UPDATE
                case 4:

                    System.out.print("Enter Roll No to Update: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();

                    for (Student s : list) {

                        if (s.rollNo == updateRoll) {

                            System.out.print("Enter New Name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter New Marks: ");
                            s.marks = sc.nextDouble();

                            System.out.println("Student Updated");
                            break;
                        }
                    }

                    break;

                // DELETE
                case 5:

                    System.out.print("Enter Roll No to Delete: ");
                    int deleteRoll = sc.nextInt();

                    Iterator<Student> it = list.iterator();

                    boolean deleted = false;

                    while (it.hasNext()) {

                        Student s = it.next();

                        if (s.rollNo == deleteRoll) {

                            it.remove();

                            deleted = true;

                            System.out.println("Student Deleted");

                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student Not Found");
                    }

                    break;

                // EXIT
                case 6:

                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}