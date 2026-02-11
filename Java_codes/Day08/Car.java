public class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running smoothly");
    }

    public static void main(String[] args) {
        Vehicle v = new Car(); // Polymorphism
        v.run();
    }
}
