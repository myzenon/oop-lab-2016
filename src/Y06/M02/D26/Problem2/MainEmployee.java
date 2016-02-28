package Y06.M02.D26.Problem2;

/**
 * Created by Zenon on 2/27/2016 AD.
 */
public class MainEmployee {
    public static void main(String[] args) {
        Developer developer = new Developer("John");
        developer.displayGeneralInformation();
        developer.displayJobDescription();
        developer.code();
        System.out.println("------------------------------------------");
        Tester tester = new Tester("Jane");
        tester.displayGeneralInformation();
        tester.displayJobDescription();
        tester.test();
    }
}
