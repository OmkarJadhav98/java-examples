/*Write a Java program to create a class called Person with private instance variables name, age. and country.
Provide public getter and setter methods to access and modify these variables.*/

package Incapsulation1;

public class Person1 {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();

        // Set values using setter methods
        person.setName("Omkar B Jadhav");
        person.setAge(25);
        person.setCountry("INDIA");

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

}
