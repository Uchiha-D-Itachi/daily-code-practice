import java.util.ArrayList;
import java.util.Collections;

public class LambdaSortingExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);

        Collections.sort(list, (a, b) -> a - b);

        System.out.println("Sorted using Lambda: " + list);
    }
}
