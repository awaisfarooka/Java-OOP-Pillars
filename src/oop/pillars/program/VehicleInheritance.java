package oop.pillars.program;

/**
 *
 * @author Hp
 */
class Vehicle {
    String brand;
    int speed;

    void start() {
        System.out.println("Vehicle is starting.");
    }

    void stop() {
        System.out.println("Vehicle is stopping.");
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    void showCar() {
        System.out.println("Number of Doors: " + doors);
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 180;
        car.doors = 4;

        System.out.println("Car Information");
        System.out.println("----------------");
        car.start();
        car.showDetails();
        car.showCar();
        car.stop();
    }
}
