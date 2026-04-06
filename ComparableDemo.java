import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Ritesh", 85));
        list.add(new Student(2, "Amit", 92));
        list.add(new Student(3, "Ravi", 78));

        Collections.sort(list);

        System.out.println("Sorted by marks (ascending):");
        for (Student s : list) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}