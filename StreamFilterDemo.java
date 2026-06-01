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

    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class StreamFilterDemo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(101, "Jayesh", 75));
        list.add(new Student(102, "Bhushan", 90));
        list.add(new Student(103, "Ritesh", 85));

        list.stream()
            .filter(s -> s.marks > 80)
            .forEach(System.out::println);
    }
}