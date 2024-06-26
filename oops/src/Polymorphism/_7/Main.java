/*Write a Java program to create a base class Animal with methods move() and makeSound().
Create two subclasses Bird and Panther.
Override the move() method in each subclass to describe how each animal moves.
Also, override the makeSound() method in each subclass to make a specific sound for each animal.*/

package Polymorphism._7;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal panther = new Panther();

        performAction(bird);
        performAction(panther);
    }

    public static void performAction(Animal animal) {
        animal.move();
        animal.makeSound();
    }
}

