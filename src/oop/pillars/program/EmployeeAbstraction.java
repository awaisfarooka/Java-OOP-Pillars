package oop.pillars.program;

/**
 *
 * @author Hp
 */
abstract class EmployeeSystem {
    String name;

    abstract void calculateSalary();

    void showName() {
        System.out.println("Employee Name: " + name);
    }

    void company() {
        System.out.println("Company: ABC Software House");
    }

    void department() {
        System.out.println("Department: Development");
    }
}

class Developer extends EmployeeSystem {
    double salary = 75000;

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary: " + salary);
    }
}

public class EmployeeAbstraction {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.name = "Awais";

        System.out.println("Employee Information");
        System.out.println("--------------------");
        developer.showName();
        developer.company();
        developer.department();
        developer.calculateSalary();
    }
}
