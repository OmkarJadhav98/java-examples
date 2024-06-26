package Polymorphism._7;

class Animal {
    public void move() {
        System.out.println("Animal moves");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

class Panther extends Animal {
    @Override
    public void move() {
        System.out.println("Panther walks");
    }

    @Override
    public void makeSound() {
        System.out.println("Panther roars");
    }
}
