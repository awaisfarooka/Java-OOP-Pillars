package oop.pillars.program;

/**
 *
 * @author Hp
 */
public class EmployeeEncapsulation {

    class EmployeeData {
        private String name;
        private int id;
        private double salary;

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        EmployeeEncapsulation obj = new EmployeeEncapsulation();
        EmployeeData employee = obj.new EmployeeData();

        employee.setName("Ali");
        employee.setId(101);
        employee.setSalary(60000);

        System.out.println("Employee Information");
        System.out.println("--------------------");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: " + employee.getSalary());
    }
}
