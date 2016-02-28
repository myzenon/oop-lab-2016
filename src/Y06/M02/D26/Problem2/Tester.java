package Y06.M02.D26.Problem2;

/**
 * Created by Zenon on 2/27/2016 AD.
 */
public class Tester extends Employee {

    public Tester(String name) {
        super(name, 22000);
    }

    public void displayJobDescription() {
        System.out.println("My job is to verify the software to increase level of quality.");
    }

    public void test() {
        System.out.println("I am testing the software.");
    }
}
