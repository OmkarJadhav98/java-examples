/*Write a Java program to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer.
In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.*/

package Polymorphism._4;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Lilo Heidi", 7500.0, 1500.0);
        Employee emp2 = new Programmer("Margrit Cathrin", 5000.0, 600.0);

        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
        System.out.println("\nProgrammer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());
    }
}

