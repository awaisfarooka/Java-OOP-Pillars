package oop.pillars.program;

/**
 *
 * @author Hp
 */
public class StudentEncapsulation {

    class Student {
        private String name;
        private int age;
        private double marks;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getMarks() {
            return marks;
        }
    }

    public static void main(String[] args) {
        StudentEncapsulation obj = new StudentEncapsulation();
        Student s = obj.new Student();

        s.setName("Awais");
        s.setAge(22);
        s.setMarks(88.5);

        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
        System.out.println("Student Marks: " + s.getMarks());
    }
}
