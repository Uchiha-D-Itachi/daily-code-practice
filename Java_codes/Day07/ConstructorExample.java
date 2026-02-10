public class ConstructorExample {
    int value;

    ConstructorExample(int v) {
        value = v;
    }

    void show() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(50);
        obj.show();
    }
}
