package Y06.M02.D26.Problem2;

/**
 * Created by Zenon on 2/27/2016 AD.
 */
public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayGeneralInformation() {
        System.out.println("Name: " + this.getName());
        System.out.println("Salary: " + this.getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
