package oop.pillars.program;

/**
 *
 * @author Hp
 */
class StudentData {
    String name;
    int age;

    StudentData() {
        name = "Unknown";
        age = 0;
    }

    StudentData(String name) {
        this.name = name;
        age = 20;
    }

    StudentData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        StudentData student1 = new StudentData();
        StudentData student2 = new StudentData("Awais");
        StudentData student3 = new StudentData("Ali", 22);

        System.out.println("Student 1");
        student1.display();
        System.out.println("Student 2");
        student2.display();
        System.out.println("Student 3");
        student3.display();
    }
}
