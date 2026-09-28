package oop.pillars.program;

/**
 *
 * @author Hp
 */
class AnimalParent {
    void sound() {
        System.out.println("Animal makes a sound.");
    }

    void eat() {
        System.out.println("Animal eats food.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Cat extends AnimalParent {
    @Override
    void sound() {
        System.out.println("Cat says Meow.");
    }

    void play() {
        System.out.println("Cat is playing.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println("Cat Information");
        System.out.println("----------------");
        cat.sound();
        cat.eat();
        cat.sleep();
        cat.play();
    }
}
