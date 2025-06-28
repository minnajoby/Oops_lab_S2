package graphics;

public class TestGraphics {
    public static void main(String[] args) {
        GeometricFigure rectangle = new Rectangle(5, 10);
        GeometricFigure triangle = new Triangle(6, 8);
        GeometricFigure square = new Square(4);
        GeometricFigure circle = new Circle(7);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
