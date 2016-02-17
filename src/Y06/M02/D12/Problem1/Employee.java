package Y06.M02.D12.Problem1;

/**
 * Created by Zenon on 2/14/2016 AD.
 */
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        if(id > 0 && id <= 1000) {
            this.id = id;
        }
        this.id = id;
        setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("")) {
            this.name = name;
        }
    }
}
