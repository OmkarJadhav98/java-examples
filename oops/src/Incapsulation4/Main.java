/*Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.
Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.*/

package Incapsulation4;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee();

        // Set values using setter methods
        employee.setEmployeeId(15);
        employee.setEmployeeName("Omkar Jadhav");
        employee.setEmployeeSalary(4900.0);

        // Get values using getter methods
        int employeeId = employee.getEmployeeId();
        String employeeName = employee.getEmployeeName();
        String formattedSalary = employee.getFormattedSalary();

        // Print the values
        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);
    }
}

