package Y06.M02.D26.Problem1;

/**
 * Created by Zenon on 2/27/2016 AD.
 */
public class Animal {
    private int countBanana, countBone;
    public Animal() {
        this.countBanana = 0;
        this.countBone = 0;
    }
    public void eat(Banana banana) {
        if(countBanana > 0) {
            System.out.println("I can't eat banana anymore.");
        }
        else {
            countBanana++;
        }
    }
    public void eat(Bone bone) {
        if (countBone > 0) {
            System.out.println("I can't eat bone anymore.");
        } else {
            countBone++;
        }
    }
}
