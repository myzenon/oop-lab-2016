package Y06.M02.D05.Problem1;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Point {
    int x,y;
    Point(int pointX, int pointY) {
        this.x = pointX;
        this.y = pointY;
    }
    void print() {
        System.out.print("(" + this.x + "," + this.y + ")");
    }
    boolean equal(Point otherPoint) {
        if((this.x == otherPoint.x) && (this.y == otherPoint.y)) {
            return true;
        }
        return false;
    }
}
