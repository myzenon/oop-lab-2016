package Y06.M02.D05.Problem5;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Mr.A");
        Student s2 = new Student(2, "Mr.B");
        Course c1 = new Course("SE101", 3);
        Course c2 = new Course("SE102", 2);
        Course c3 = new Course("SE103", 1);
        EnrollCourse[] enroll = new EnrollCourse[5];
        enroll[0] = new EnrollCourse(s1, c1, "A");
        enroll[1] = new EnrollCourse(s1, c2, "B+");
        enroll[2] = new EnrollCourse(s1, c3, "C");
        enroll[3] = new EnrollCourse(s2, c1, "C");
        enroll[4] = new EnrollCourse(s2, c3, "D+");
        s1.computeGpa(enroll);
        s2.computeGpa(enroll);
        System.out.println("GPA of Student ID: " + s1.getStudentID() + " (" + s1.getStudentName() + ") = " + s1.getGpa());
        System.out.println("GPA of Student ID: " + s2.getStudentID() + " (" + s2.getStudentName() + ") = " + s2.getGpa());
    }
}
