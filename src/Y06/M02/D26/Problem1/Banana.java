package Y06.M02.D26.Problem1;

/**
 * Created by Zenon on 2/27/2016 AD.
 */
public class Banana extends Food {
    private int sweetLevel = 0;
    public Banana(int sweetLevel) {
        super(40, 1.2);
        this.sweetLevel = sweetLevel;
    }
    public void print() {
        super.print();
        System.out.println("Sweet level: " + sweetLevel);
    }
}