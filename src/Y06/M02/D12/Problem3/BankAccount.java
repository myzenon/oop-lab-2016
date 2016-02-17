package Y06.M02.D12.Problem3;

/**
 * Created by Zenon on 2/14/2016 AD.
 */
public class BankAccount {
    private double money;
    private User user;

    public BankAccount(double money, User user) {
        if(money >= 0) {
            this.money = money;
        }
        this.user = user;
    }

    public void withdraw(User user, double amount) {
        if(amount > 0 && user.equals(this.user)) {
            if(money < amount) {
                System.out.println("Error : Cannot withdraw, your balance is not enough");
            }
            else {
                money -= amount;
            }
        }
    }

    public void deposit(User user, double amount) {
        if(amount > 0 && user.equals(this.user)) {
            money += amount;
        }
    }

    public void showAccountInfo() {
        System.out.println(user.getName() + " have money " + money);
    }

}
