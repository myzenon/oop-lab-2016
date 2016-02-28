package Y06.M02.D26.Problem1;

/**
 * Created by Zenon on 2/27/2016 AD.
 */
public class Main {
    public static void main(String[] args) {
        Banana banana1 = new Banana(20);
        Banana banana2 = new Banana(30);
        Bone bone1 = new Bone(true);
        Bone bone2 = new Bone(false);
        Dog dog = new Dog();
        Monkey monkey = new Monkey();
        monkey.roar();
        dog.bark();
        monkey.eat(banana1);
        monkey.eat(bone1);
        dog.eat(bone2);
    }
}
