package Y06.M02.D05.Problem3;

/**
 * Created by Zenon on 2/6/2016 AD.
 */
public class Rectangle {
    Line line1,line2,line3,line4;
    Rectangle(Line newLine1, Line newLine2, Line newLine3, Line newLine4) {
        // (newLine1.point2.equal(newLine2.point1) && newLine2.point2.equal(newLine3.point1) && newLine3.point2.equal(newLine4.point1) && newLine4.point2.equal(newLine1.point1) // To check whether Point is correct pattern or not
        // (newLine1.length() == newLine3.length()) && (newLine2.length() == newLine4.length()) // To check both of each 2 side is parallel lines.
        if(newLine1.point2.equal(newLine2.point1) && newLine2.point2.equal(newLine3.point1) && newLine3.point2.equal(newLine4.point1) && newLine4.point2.equal(newLine1.point1) && (newLine1.length() == newLine3.length()) && (newLine2.length() == newLine4.length())) {
            this.line1 = newLine1;
            this.line2 = newLine2;
            this.line3 = newLine3;
            this.line4 = newLine4;
        }
        else {
            System.out.println("Error : Wrong Input Point");
            this.line1 = new Line(new Point(0,0), new Point(0,0));
            this.line2 = new Line(new Point(0,0), new Point(0,0));
            this.line3 = new Line(new Point(0,0), new Point(0,0));
            this.line4 = new Line(new Point(0,0), new Point(0,0));
        }
    }
    void print() {
        System.out.print("Rectangle (( (" + line1.point1.x + "," + line1.point1.y + ")(" + line1.point2.x + "," + line1.point2.y + ")(" + line2.point1.x + "," + line2.point1.y + ")(" + line2.point2.x + "," + line2.point2.y + ")(" + line3.point1.x + "," + line3.point1.y + ")(" + line3.point2.x + "," + line3.point2.y + ")(" + line4.point1.x + "," + line4.point1.y + ")(" + line4.point2.x + "," + line4.point2.y + ") ))");
    }
    double area() {
        return line1.length() * line2.length();
    }
    double length() {
        return line1.length()*2 + line2.length()*2;
    }
}
