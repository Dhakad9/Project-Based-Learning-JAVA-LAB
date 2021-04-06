import java.util.*;

public class EmployeeDetails {
    ArrayList<Employee> employeelist;

    public EmployeeDetails() {
        employeelist = new ArrayList<>();
    }

    public void addEmployeeDetails(String name, int id, int age, int salary) {
        employeelist.add(new Employee(name, id, age, salary));
    }

    public void displayAllEmployees() {
        System.out.println("---Report---");
        employeelist.forEach((employee) -> employee.displayEmployee());
        System.out.println("---End of Report---");
    }

    public void showChoices() {
        System.out.println("Main menu");
        System.out.println("1. Add an Employee");
        System.out.println("2. Sort Employee list accorong to name");
        System.out.println("3. Sort Employee list accorong to id");
        System.out.println("4. Sort Employee list accorong to age");
        System.out.println("5. Sort Employee list accorong to salary");
        System.out.println("6. Display All");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EmployeeDetails obj = new EmployeeDetails();
        Boolean runner = true;
        int ch;
        while (runner) {
            obj.showChoices();
            ch = in.nextInt();
            switch (ch) {
            case 1:
                System.out.print("Enter Employee ID: ");
                int id = in.nextInt();
                in.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = in.nextLine();
                System.out.print("Enter Employee Age: ");
                int age = in.nextInt();
                System.out.print("Enter Employee Salary: ");
                int salary = in.nextInt();

                obj.addEmployeeDetails(name, id, age, salary);
                break;
            case 2:
                Collections.sort(obj.employeelist, Employee.employeeNameComparator);
                obj.displayAllEmployees();
                break;
            case 3:
                Collections.sort(obj.employeelist, Employee.employeeIdComparator);
                obj.displayAllEmployees();
                break;
            case 4:
                Collections.sort(obj.employeelist, Employee.employeeAgeComparator);
                obj.displayAllEmployees();
                break;
            case 5:
                Collections.sort(obj.employeelist, Employee.employeeSalaryComparator);
                obj.displayAllEmployees();
                break;
            case 6:
                obj.displayAllEmployees();
                break;
            case 7:
                runner = false;
                break;
            default:
                System.out.println("Wrong choice entered");
            }
        }
        in.close();
    }
}
