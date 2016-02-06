package Y06.M02.D05.Problem3;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Ex3 {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(5,5), new Point(5,30));
        Line l2 = new Line(new Point(5,30), new Point(25,30));
        Line l3 = new Line(new Point(25,30), new Point(25,5));
        Line l4 = new Line(new Point(25,5), new Point(5,5));

        Rectangle rect = new Rectangle(l1, l2, l3, l4);
        rect.print();
        System.out.println("\nArea " + rect.area());
    }
}
