package Y06.M02.D26.Problem1;

/**
 * Created by Zenon on 2/27/2016 AD.
 */
public class Bone extends Food {
    private boolean badSmell;
    public Bone(boolean badSmell) {
        super(0, 3.0);
        this.badSmell = badSmell;
    }
    public void print() {
        super.print();
        System.out.println("Smell: " + (badSmell ? "bad" : "good"));
    }
}
