import java.util.*;

class Employee {
    // id ,anme, age, salary
    String name;
    int id;
    int age;
    int salary;

    public Employee(String name, int id, int age, int salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return this.id;
    }

    public String getEmployeeName() {
        return this.name;
    }

    public int getEmployeeAge() {
        return this.age;
    }

    public int getEmployeeSalary() {
        return this.salary;
    }

    public void displayEmployee() {
        System.out.println(id + "\t" + name + '\t' + age + '\t' + salary);
    }

    public static final Comparator<Employee> employeeNameComparator = (e1, e2) -> e1.getEmployeeName().toUpperCase()
            .compareTo(e2.getEmployeeName().toUpperCase());

    public static final Comparator<Employee> employeeIdComparator = (e1, e2) -> e1.getEmployeeId() - e2.getEmployeeId();

    public static final Comparator<Employee> employeeAgeComparator = (e1, e2) -> e1.getEmployeeAge()
            - e2.getEmployeeAge();

    public static final Comparator<Employee> employeeSalaryComparator = (e1, e2) -> e1.getEmployeeSalary()
            - e2.getEmployeeSalary();
}