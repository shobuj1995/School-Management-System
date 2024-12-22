package school.management.system;

public class Teacher {
    /**
     *
     */
    private int teacherId;
    private String name;
    private  int salary;
    private static int paidSalary;

    public Teacher(int teacherId, String name, int salary) {
        this.teacherId = teacherId;
        this.name = name;
        this.salary = salary;
        this.paidSalary=0;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }
    public void receivesalary(int salary){
        paidSalary=salary;
        School.updateTotalMoneyAfterSpend(paidSalary);
        School.setTotalMoneySpend(paidSalary);
    }

}
