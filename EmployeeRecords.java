package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Employee {
    String name;
    int id;
    String department;

   
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee[Name: " + name + ", ID: " + id + ", Department: " + department + "]";
    }
}

public class EmployeeRecords {

    public static void main(String[] args) {
    
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Adding some employee records
        employeeMap.put(101, new Employee("Alice", 101, "HR"));
        employeeMap.put(102, new Employee("Bob", 102, "Engineering"));
        employeeMap.put(103, new Employee("Charlie", 103, "Marketing"));

        // Display menu to search employee by ID
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Employee ID to search (or 0 to exit): ");
            int id = scanner.nextInt();

            if (id == 0) {
                break;
            }

            // Search for employee by ID
            Employee employee = employeeMap.get(id);
            if (employee != null) {
                System.out.println("Employee found: " + employee);
            } else {
                System.out.println("Employee with ID " + id + " not found.");
            }
        }

        scanner.close();
    }
}

