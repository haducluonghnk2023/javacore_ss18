package Ex.Ex10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Employee> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- employee manager ---");
            System.out.println("1. add employee");
            System.out.println("2. display employees");
            System.out.println("3. total salary");
            System.out.println("4. avg salary");
            System.out.println("5. find employee salary highest");
            System.out.println("6. find employee salary lowest");
            System.out.println("7. exit");
            System.out.print("choose function: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addEmployee(map, sc);
                    break;
                case 2:
                    displayEmployees(map);
                    break;
                case 3:
                    calculateTotalSalary(map);
                    break;
                case 4:
                    calculateAverageSalary(map);
                    break;
                case 5:
                    findMaxSalaryEmployee(map);
                    break;
                case 6:
                    findMinSalaryEmployee(map);
                    break;
                case 7:
                    System.out.println("exit the program.");
                    return;
                default:
                    System.out.println("choice not valid.");
            }
        }
    }
    public static void addEmployee(Map<Integer,Employee> map, Scanner sc) {
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter employee salary: ");
        int salary = sc.nextInt();
        sc.nextLine();
        Employee employee = new Employee(name,salary);
        map.put(employee.getId(), employee);
        System.out.println("add employee successful.");
    }
    public static void displayEmployees(Map<Integer,Employee> map) {
        if (map.isEmpty()) {
            System.out.println("No employees in map.");
        }else {
            for (Employee employee : map.values()) {
                System.out.println(employee);
            }
        }
    }
    public static void calculateTotalSalary(Map<Integer,Employee> map) {
        double sum = 0;
        for (Employee employee : map.values()) {
            sum += employee.getSalary();
        }
        System.out.println("Total salary: " + sum);
    }
    public static void calculateAverageSalary(Map<Integer,Employee> map) {
        if (map.isEmpty()) {
            System.out.println("No employees in map.");
        }else{
            double sum = 0;
            for (Employee employee : map.values()) {
                sum += employee.getSalary();
            }
            double avgSalary = sum / map.size();
            System.out.println("avg salary: " + avgSalary);
        }
    }
    public static void findMaxSalaryEmployee(Map<Integer,Employee> map) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : map.values()) {
            if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        if (maxSalaryEmployee != null) {
            System.out.println("employee have salary highest: " + maxSalaryEmployee);
        } else {
            System.out.println("no employee.");
        }
    }
    public static void findMinSalaryEmployee(Map<Integer,Employee> map) {
        Employee minSalaryEmployee = null;
        for (Employee employee : map.values()) {
            if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        if (minSalaryEmployee != null) {
            System.out.println("employee have salary lowest: " + minSalaryEmployee);
        } else {
            System.out.println("no employee.");
        }
    }
}
