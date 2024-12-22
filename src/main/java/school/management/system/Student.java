package school.management.system;

//This calss is responsible for keeping the track of students fees,name,grade & fees paid
public class Student {


    private int studentId;
    private String studentname;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing
     *
     * @param studentId
     * @param studentname
     * @param grade
     */
    public Student(int studentId, String studentname, int grade) {
        this.feesPaid=0;
        this.studentId = studentId;
        this.studentname = studentname;
        this.grade = grade;
    }

    //Student grade might need to update
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyAfterEarned(fees);
    }
    public String getStudentname() {
        return studentname;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int getRemainingFees(){
        return (feesTotal-feesPaid);
    }

}
