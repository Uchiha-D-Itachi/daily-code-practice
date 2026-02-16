import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class StudentComparatorExample {
    public static void main(String[] args) {

        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2(3, "Rahul"));
        list.add(new Student2(1, "Ankit"));
        list.add(new Student2(2, "Meena"));

        Collections.sort(list, new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s1.name.compareTo(s2.name); // Sort by name
            }
        });

        System.out.println("Sorted by Name:");
        for (Student2 s : list) {
            System.out.println(s);
        }
    }
}
