package Y06.M02.D05.Problem1;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Ex1 {
    public static void main(String[] args) {
        Point point = new Point(1, 3);
        System.out.print("Point is at ");
        point.print();
        System.out.println();

        Point point2 = new Point(1,3);
        System.out.print("Point is at ");
        point2.print();
        System.out.println();

        if(point.equal(point2)) {
            System.out.println("Point 1 and Point 2 are the same.");
        }
        else {
            System.out.println("Point 1 and Point 2 are difference.");
        }
    }
}