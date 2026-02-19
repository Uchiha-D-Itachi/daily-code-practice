import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class StreamWithObjects {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Rahul", 75),
                new Student(2, "Ankit", 45),
                new Student(3, "Meena", 85)
        );

        List<Student> topStudents = students.stream()
                .filter(s -> s.marks > 60)
                .collect(Collectors.toList());

        topStudents.forEach(System.out::println);
    }
}
