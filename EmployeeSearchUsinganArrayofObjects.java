import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int employeeNumber;
    String name;
    double salary;

    public Employee(int employeeNumber, String name, double salary) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees = 3;
        ArrayList<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.print("Enter Employee Number: ");
            int employeeNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            Employee newEmployee = new Employee(employeeNumber, name, salary);
            employeeList.add(newEmployee);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        for (Employee employee : employeeList) {
            if (employee.employeeNumber == searchNumber) {
                employee.displayEmployeeDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with Employee Number " + searchNumber + " not found.");
        }

        scanner.close();
    }
}
