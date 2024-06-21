/*Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
Create two subclasses Bird and  Cat.
Override the Sound() method in each subclass to make a specific sound for each animal.*/

package Polymorphism._1;


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.makeSound(); // Output: The animal makes a sound
        bird.makeSound();   // Output: The bird chirps
        cat.makeSound();    // Output: The cat meows
    }
}

