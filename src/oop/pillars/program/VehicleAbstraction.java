package oop.pillars.program;

/**
 *
 * @author Hp
 */
abstract class VehicleSystem {
    abstract void start();

    void stop() {
        System.out.println("Vehicle has stopped.");
    }

    void fuel() {
        System.out.println("Vehicle needs fuel.");
    }

    void information() {
        System.out.println("Vehicle has four wheels.");
    }
}

class CarVehicle extends VehicleSystem {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class VehicleAbstraction {
    public static void main(String[] args) {
        CarVehicle car = new CarVehicle();

        System.out.println("Car Information");
        System.out.println("----------------");
        car.start();
        car.fuel();
        car.information();
        car.stop();
    }
}
