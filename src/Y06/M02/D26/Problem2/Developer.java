package Y06.M02.D26.Problem2;

/**
 * Created by Zenon on 2/27/2016 AD.
 */
public class Developer extends Employee {

    public Developer(String name) {
        super(name, 22500);
    }

    public void displayJobDescription() {
        System.out.println("My job is to develop, maintain and provide enhancement for our software.");
    }

    public void code() {
        System.out.println("I am producing code.");
    }
}
