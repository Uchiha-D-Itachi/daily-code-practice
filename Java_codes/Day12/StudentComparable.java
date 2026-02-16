import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id;  // Sort by ID
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class StudentComparable {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Rahul"));
        list.add(new Student(1, "Ankit"));
        list.add(new Student(2, "Meena"));

        Collections.sort(list);

        System.out.println("Sorted by ID:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
