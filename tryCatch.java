// creating an employee class that stores name and salary if the salary entered is negative through the exception use try catch to handle the error and display corrected output

import java.util.Scanner;
class NegativeSalaryException extends Exception {
    public NegativeSalaryException(String message) {
        super(message);
    }
}
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) throws NegativeSalaryException {
        this.name = name;
        setSalary(salary);
    }

    public void setSalary(double salary) throws NegativeSalaryException {
        if (salary < 0) {
            throw new NegativeSalaryException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        try {
            Employee emp = new Employee(name, salary);
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee Salary: " + emp.getSalary());
        } catch (NegativeSalaryException e) {
            System.out.println(e.getMessage());
            System.out.print("Please enter a valid (non-negative) salary: ");
            double correctedSalary = scanner.nextDouble();
            try {
                Employee emp = new Employee(name, correctedSalary);
                System.out.println("Employee Name: " + emp.getName());
                System.out.println("Employee Salary: " + emp.getSalary());
            } catch (NegativeSalaryException ex) {
                System.out.println("Failed to set salary again: " + ex.getMessage());
            }
        } finally {
            scanner.close();
        }
    }
}