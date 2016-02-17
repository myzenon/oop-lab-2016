package Y06.M02.D12.Problem3;

/**
 * Created by Zenon on 2/14/2016 AD.
 */
public class Main {
    public static void main(String[] args) {
        User realUser = new User("Zenon 'SI", "myzenon");
        BankAccount bankAccount = new BankAccount(1000, realUser);
        User user = new User("Zenon", "myzenon");
        bankAccount.withdraw(user, 10);
        bankAccount.showAccountInfo();
    }
}
