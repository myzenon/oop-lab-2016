package Y06.M02.D12.Problem3;

/**
 * Created by Zenon on 2/14/2016 AD.
 */
public class User {
    private String name, secretKey;

    public User(String name, String secretKey) {
        this.name = name;
        this.secretKey = secretKey;
    }

    public String getName() {
        return name;
    }

    public boolean equals(User otherUser) {
        return this.secretKey.equals(otherUser.secretKey);
    }
}
