import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "python", "c++");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
