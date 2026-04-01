import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Ritesh", 85));
        list.add(new Student(2, "Amit", 92));
        list.add(new Student(3, "Ravi", 78));

        // Sort by marks (descending)
        Collections.sort(list, (a, b) -> b.marks - a.marks);

        System.out.println("Sorted by marks (high to low):");
        for (Student s : list) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}