package oop.pillars.program;

/**
 *
 * @author Hp
 */
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }

    void message() {
        System.out.println("Shapes have different forms.");
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    void calculateArea() {
        int area = length * width;
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}

public class ShapeInheritance {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println("Rectangle Information");
        System.out.println("---------------------");
        rectangle.display();
        rectangle.message();
        rectangle.calculateArea();
    }
}
