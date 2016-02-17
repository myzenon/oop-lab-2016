package Y06.M02.D12.Problem2;

/**
 * Created by Zenon on 2/14/2016 AD.
 */
public class Circle {
    private int x, y, radius;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        setRadius(radius);
    }

    public boolean isIntersected(Circle otherCircle) {
        double distance = Math.sqrt(Math.pow(this.x - otherCircle.getX(),2) + Math.pow(this.y - otherCircle.getY(),2));
        if(distance < this.radius + otherCircle.getRadius()) {
            return true;
        }
        return false;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius < 0) {
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }

}