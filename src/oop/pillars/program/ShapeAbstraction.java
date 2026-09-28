package oop.pillars.program;

/**
 *
 * @author Hp
 */
abstract class ShapeAbstract {
    abstract void calculateArea();

    void display() {
        System.out.println("This is a shape.");
    }

    void information() {
        System.out.println("Every shape has an area.");
    }

    void message() {
        System.out.println("Shape calculation program.");
    }
}

class Circle extends ShapeAbstract {
    double radius = 5;

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class ShapeAbstraction {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Circle Information");
        System.out.println("------------------");
        circle.display();
        circle.information();
        circle.message();
        circle.calculateArea();
    }
}
