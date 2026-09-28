package oop.pillars.program;

/**
 *
 * @author Hp
 */
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    void showMessage() {
        System.out.println("Calculator Program");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.showMessage();
        System.out.println("Sum of two integers: " + calculator.add(10, 20));
        System.out.println("Sum of three integers: " + calculator.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + calculator.add(10.5, 20.5));
    }
}
