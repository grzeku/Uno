public class Main {

    public static void main(String[] args) {

        Shape test = new Rectangle(12, 12);
        System.out.println("Recnangle perimeter: " + test.getPerimeter());
        System.out.println("Rectangle area: " + test.getArea());

        Shape test2 = new Square(11);
        System.out.println("Square perimeter: " + test2.getPerimeter());
        System.out.println("Square area: " + test2.getArea());

        Shape test3 = new Circle(22);
        System.out.println("Circle perimeter: " + test3.getPerimeter());
        System.out.println("Circle area: " + test3.getArea());


    }
}
