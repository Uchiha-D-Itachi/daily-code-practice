import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // Array index error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (Exception e) {
            System.out.println("General exception occurred!");
        }
    }
}
