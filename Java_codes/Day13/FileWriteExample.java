import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("sample.txt")) {
            writer.write("Hello, this is Day 13 of Java practice.\n");
            writer.write("Learning file handling.");
            System.out.println("Successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
