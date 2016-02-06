package Y06.M02.D05.Problem5;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Course {
    private int credit;
    private String courseName;
    public Course(String courseName, int credit) {
        this.courseName = courseName;
        this.credit = credit;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getCredit() {
        return credit;
    }
}
