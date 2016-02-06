package Y06.M02.D05.Problem5;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class EnrollCourse {
    private Student student;
    private Course course;
    private String grade;
    public EnrollCourse(Student student, Course course, String grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }
}
