package school.management.system;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating teacher objects with their unique ID, name, and salary
        Teacher teacher1 = new Teacher(1, "Mr. John", 50000);
        Teacher teacher2 = new Teacher(2, "Ms. Emma", 55000);
        Teacher teacher3 = new Teacher(3, "Mr. Smith", 52000);

        // Creating a list to store all teachers in the school
        List<Teacher> teacherList = new ArrayList<>();

        // Adding teacher objects to the list
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        // Creating student objects with their unique ID, name, and grade
        Student student1 = new Student(1, "Alice", 10);
        Student student2 = new Student(2, "Bob", 9);
        Student student3 = new Student(3, "Charlie", 12);

        // Creating a list to store all students in the school
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        // Creating a School object with the list of teachers and students
        School GHS = new School(teacherList, studentList);

        // Printing the total money earned by the school initially (should be 0)
        System.out.println("Total money earned by the school: $" + GHS.getTotalMoneyEarned());

        // Simulating Alice paying 1000 USD in school fees
        System.out.println("Alice is paying $1000.");
        student1.payFees(1000); // Alice pays fees
        System.out.println("Alice has paid: $" + student1.getFeesPaid());
        System.out.println("GHS school total earned: $" + GHS.getTotalMoneyEarned()); // Updated total earnings

        // Simulating Bob paying 2000 USD in school fees
        System.out.println("Bob is paying $2000.");
        student2.payFees(2000); // Bob pays fees
        System.out.println("Bob has paid: $" + student2.getFeesPaid());
        System.out.println("GHS school total earned: $" + GHS.getTotalMoneyEarned()); // Updated total earnings

        // Paying teacher salary
        System.out.println("Paying salary to Mr. John:");
        teacher1.receivesalary(teacher1.getSalary());
        System.out.println("Mr. John has been paid: $" + teacher1.getSalary());
        System.out.println("GHS school total spent: $" + GHS.getTotalMoneySpend());
        System.out.println("GHS school current balance: $" + (GHS.getTotalMoneyEarned() - GHS.getTotalMoneySpend()));
    }
}
