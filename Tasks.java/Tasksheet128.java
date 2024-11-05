public class Tasksheet128 {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 5);
        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle("Red", 4, 7);
        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}
class Circle extends AbstractShape {
    double radius;
    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width are not used for circles
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
