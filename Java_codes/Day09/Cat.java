class Cat implements AnimalInterface {

    @Override
    public void sound() {
        System.out.println("Cat says Meow");
    }

    public static void main(String[] args) {
        AnimalInterface a = new Cat();
        a.sound();
    }
}
