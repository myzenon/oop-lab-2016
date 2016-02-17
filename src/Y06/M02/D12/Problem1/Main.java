package Y06.M02.D12.Problem1;

import java.util.Scanner;

/**
 * Created by Zenon on 2/14/2016 AD.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        while(id < 1 || id  > 1000) {
            System.out.println("Please Input Your Employee ID : ");
            id = scanner.nextInt();
        }
        String name = "";
        while(name.equals("")) {
            System.out.println("Please Input Your Employee Name : ");
            name = scanner.next();
        }
        Employee employee = new Employee(id, name);
        System.out.println("Employee [" + employee.getId() + "] : " + employee.getName());
    }
}
