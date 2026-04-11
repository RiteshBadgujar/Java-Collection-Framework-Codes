import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class RemoveDuplicateStudent {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ritesh"));
        list.add(new Student("Amit"));
        list.add(new Student("Ritesh"));

        Set<String> seen = new HashSet<>();
        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
            Student s = it.next();

            if (seen.contains(s.name)) {
                it.remove();
            } else {
                seen.add(s.name);
            }
        }

        for (Student s : list) {
            System.out.println(s.name);
        }
    }
}