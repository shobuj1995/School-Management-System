package school.management.system;

import java.util.List;

public class School {
    private List <Teacher> teacher;
    private List <Student> student;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned=0;
        totalMoneySpend=0;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public List<Student> getStudent() {
        return student;
    }

    /**
     * Add teacher to the school
     * @param teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        this.teacher.add(teacher);
    }

    /**
     * Add new student in the school
     * @param student
     */

    public void addStudent(Student student) {
        this.student.add(student);
    }

    public static void updateTotalMoneyAfterEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static void updateTotalMoneyAfterSpend(int MoneySpend) {
            totalMoneyEarned -= MoneySpend;
    }
    public static void setTotalMoneySpend(int MoneySpend) {
        totalMoneySpend +=MoneySpend;
    }
}
