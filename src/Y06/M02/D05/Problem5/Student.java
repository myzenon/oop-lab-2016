package Y06.M02.D05.Problem5;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Student {
    private int studentID;
    private String studentName;
    private double gpa;
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    void computeGpa(EnrollCourse[] enrollCourses) {
        double gradeWithCredit = 0;
        double allCredit = 0;
        for(int i = 0; i < enrollCourses.length; i++) {
            if(enrollCourses[i].getStudent() == this) {
                double grade = 0;
                if(enrollCourses[i].getGrade().equals("A")) {
                    grade = 4.0;
                }
                else if(enrollCourses[i].getGrade().equals("B+")) {
                    grade = 3.5;
                }
                else if(enrollCourses[i].getGrade().equals("B")) {
                    grade = 3.0;
                }
                else if(enrollCourses[i].getGrade().equals("C+")) {
                    grade = 2.5;
                }
                else if(enrollCourses[i].getGrade().equals("C")) {
                    grade = 2.0;
                }
                else if(enrollCourses[i].getGrade().equals("D+")) {
                    grade = 1.5;
                }
                else if(enrollCourses[i].getGrade().equals("D")) {
                    grade = 1.0;
                }
                gradeWithCredit += grade * enrollCourses[i].getCourse().getCredit();
                allCredit += enrollCourses[i].getCourse().getCredit();
            }
        }
        this.gpa = gradeWithCredit / allCredit;
    }
    public int getStudentID() {
        return studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public double getGpa() {
        return gpa;
    }
}
