class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.info();
        s.draw();
    }
}
