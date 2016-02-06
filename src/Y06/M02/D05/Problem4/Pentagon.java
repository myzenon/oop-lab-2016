package Y06.M02.D05.Problem4;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Pentagon {
    Point points[] = new Point[5];
    Pentagon(Point newPoint1, Point newPoint2, Point newPoint3, Point newPoint4, Point newPoint5) {
        this.points[0] = newPoint1;
        this.points[1] = newPoint2;
        this.points[2] = newPoint3;
        this.points[3] = newPoint4;
        this.points[4] = newPoint5;
    }
    void print() {
        System.out.print("Pentagon (( (" + points[0].x + "," + points[0].y +")(" + points[1].x + "," + points[1].y +")(" + points[2].x + "," + points[2].y +")(" + points[3].x + "," + points[3].y +")(" + points[4].x + "," + points[4].y +") ))");
    }
    double area() {
        // Use area of polygon formula (http://www.mathopenref.com/coordpolygonarea2.html)
        double area = 0;
        int j = points.length - 1;
        for (int i = 0; i < points.length; i++) {
            area += (points[j].x + points[i].x) * (points[j].y - points[i].y);
            j = i;
        }
        return area / 2;
    }
}
