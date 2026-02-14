import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();

        System.out.println("Using Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
