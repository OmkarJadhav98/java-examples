package Polymorphism._2;

class Car extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("\nCar speed increased by 22 units.");
    }
}
