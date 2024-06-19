/*Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However,
provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.*/

package Incapsulation7;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student();

        // Set the values using the setter methods
        student.setStudent_id(1);
        student.setStudent_name("Omkar Jadhav");

        // Add grades using the addGrade() method
        student.addGrade(92.5);
        student.addGrade(89.0);
        student.addGrade(90.3);

        // Get the values using the getter methods
        int student_id = student.getStudent_id();
        String student_name = student.getStudent_name();
        List < Double > grades = student.getGrades();

        // Print the values
        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grades: " + grades);
    }
}

