package chatGPT_2_160問;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class Q159_DepartmentFilter {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("田中", "営業"));
        employees.add(new Employee("佐藤", "開発"));
        employees.add(new Employee("鈴木", "営業"));
        employees.add(new Employee("山本", "人事"));

        Scanner sc = new Scanner(System.in);
        System.out.print("表示したい部署名を入力: ");
        String dept = sc.nextLine();

        System.out.println("部署「" + dept + "」の社員:");
        for (Employee e : employees) {
            if (e.department.equals(dept)) {
                System.out.println("- " + e.name);
            }
        }
    }
}
