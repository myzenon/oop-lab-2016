package Y06.M02.D05.Problem4;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Ex4 {
    public static void main(String[] args) {
        Pentagon pentagon = new Pentagon(new Point(15, 40), new Point(25, 30), new Point(25, 5), new Point(5 ,5), new Point(5, 30));
        pentagon.print();
        System.out.println("\nArea " + pentagon.area());
    }
}
