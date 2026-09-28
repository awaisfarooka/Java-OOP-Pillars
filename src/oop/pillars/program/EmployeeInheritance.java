package oop.pillars.program;

/**
 *
 * @author Hp
 */
class EmployeeBase {
    String name;
    double salary;

    void showEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends EmployeeBase {
    String department;

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Hanzala";
        manager.salary = 100000;
        manager.department = "IT";

        System.out.println("Manager Information");
        System.out.println("-------------------");
        manager.showEmployee();
        manager.showDepartment();
        manager.work();
    }
}
