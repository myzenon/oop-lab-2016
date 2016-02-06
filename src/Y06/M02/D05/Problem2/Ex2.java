package Y06.M02.D05.Problem2;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Ex2 {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(3, 4));
        line.print();
        System.out.println("\nLength is " + line.length());

        Line line2 = new Line(0, 0, 4, 5);
        line2.print();
        System.out.println("\nLength is " + line2.length());
    }
}
