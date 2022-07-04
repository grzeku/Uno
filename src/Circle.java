public class Circle implements Shape {

    private double radius;
    final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return pi * radius * radius;
    }

    @Override
    public double getPerimeter() {

        return 2 * pi * radius;
    }
}
