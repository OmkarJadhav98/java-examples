/*Write a Java program to create a class called  Car with private instance variables company_name, model_name, year, and mileage.
Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.*/

package Incapsulation6;


public class Main {
    public static void main(String[] args) {
        // Create an instance of Car
        Car car = new Car();

        // Set the values using the setter methods
        car.setCompany_name("Chevrolet");
        car.setModel_name("Cruze");
        car.setYear(2009);
        car.setMileage(22);
        // mileage is not set using the setter method

        // Get the values using the getter methods
        String company_name = car.getCompany_name();
        String model_name = car.getModel_name();
        int year = car.getYear();
        double mileage = car.getMileage();

        // Print the values
        System.out.println("Company Name: " + company_name);
        System.out.println("Model Name: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}

