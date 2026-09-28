package oop.pillars.program;

/**
 *
 * @author Hp
 */
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Tommy";

        System.out.println("Animal Information");
        System.out.println("------------------");
        System.out.println("Name: " + dog.name);
        dog.eat();
        dog.sleep();
        dog.walk();
        dog.bark();
    }
}
