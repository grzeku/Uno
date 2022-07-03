public class Triangle implements Shape{


    private double base;
    private double height;

    public Triangle (double a, double h) {
        this.base = a;
        this.height = h;
    }


    @Override
    public double getArea() {
        double area = 0.5 * base * height;

        return area;
    }

    @Override
    public double getPerimeter() {

        return 0;
    }
}
