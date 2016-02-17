package Y06.M02.D12.Problem2;

/**
 * Created by Zenon on 2/14/2016 AD.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0,0,2);
        Circle circle2 = new Circle(1,2,3);
        Circle circle3 = new Circle(3,5);
        Circle circle4 = new Circle(-1, -10, -1);

        System.out.println("Origin (" + circle1.getX() + ", " + circle1.getY() + ") Radius : " + circle1.getRadius() + " | Area : " + circle1.getArea() + " | Circumference : " + circle1.getCircumference());
        System.out.println("Origin (" + circle2.getX() + ", " + circle2.getY() + ") Radius : " + circle2.getRadius() + " | Area : " + circle2.getArea() + " | Circumference : " + circle2.getCircumference());
        System.out.println("Origin (" + circle3.getX() + ", " + circle3.getY() + ") Radius : " + circle3.getRadius() + " | Area : " + circle3.getArea() + " | Circumference : " + circle3.getCircumference());
        System.out.println("Origin (" + circle4.getX() + ", " + circle4.getY() + ") Radius : " + circle4.getRadius() + " | Area : " + circle4.getArea() + " | Circumference : " + circle4.getCircumference());

        System.out.println("Is circle 1 and circle 2 intersected ? : " + circle1.isIntersected(circle2));
        System.out.println("Is circle 1 and circle 3 intersected ? : " + circle1.isIntersected(circle3));
    }
}
