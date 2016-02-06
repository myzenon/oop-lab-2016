package Y06.M02.D05.Problem2;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Line {
    Point point1, point2;

    Line(Point newPoint1, Point newPoint2) {
        this.point1 = newPoint1;
        this.point2 = newPoint2;
    }

    Line(int point1X, int point1Y, int point2X, int point2Y) {
        this(new Point(point1X, point1Y), new Point(point2X, point2Y));
    }

    void print() {
        System.out.print("Line [ (" + point1.x  + "," + point1.y + ") and (" + point2.x + "," + point2.y + ") ]");
    }

    double length() {
        double differenceOfXSquare = Math.pow(point2.x - point1.x, 2);
        double differenceOfYSquare = Math.pow(point2.y - point1.y, 2);
        double distance = Math.sqrt(differenceOfXSquare + differenceOfYSquare);
        return distance;
    }

}
