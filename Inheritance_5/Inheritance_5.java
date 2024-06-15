// Base class for a machine
class Machine {
    private final String brand;

    public Machine(String brand) {
        this.brand = brand;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }
}

// Subclass for a washing machine
class WashingMachine extends Machine {
    private final int capacityInKg;

    public WashingMachine(String brand, int capacityInKg) {
        super(brand);
        this.capacityInKg = capacityInKg;
    }

    // Getter for capacity
    public int getCapacityInKg() {
        return capacityInKg;
    }
}

// Subclass for a dishwasher
class DishWasher extends Machine {
    private final int placeSettings;

    public DishWasher(String brand, int placeSettings) {
        super(brand);
        this.placeSettings = placeSettings;
    }

    // Getter for place settings
    public int getPlaceSettings() {
        return placeSettings;
    }
}

// Subclass for a car washing machine
class CarWashingMachine extends Machine {
    private final boolean touchless;

    public CarWashingMachine(String brand, boolean touchless) {
        super(brand);
        this.touchless = touchless;
    }

    // Getter for touchless feature
    public boolean isTouchless() {
        return touchless;
    }
}

// Example usage
public class Inheritance_5 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("Samsung", 8);
        System.out.println("Washing Machine: " + washingMachine.getBrand() +
                ", Capacity: " + washingMachine.getCapacityInKg() + " kg");

        DishWasher dishWasher = new DishWasher("Bosch", 12);
        System.out.println("Dish Washer: " + dishWasher.getBrand() +
                ", Place Settings: " + dishWasher.getPlaceSettings());

        CarWashingMachine carWashingMachine = new CarWashingMachine("Kircher", true);
        System.out.println("Car Washing Machine: " + carWashingMachine.getBrand() +
                ", Touchless: " + carWashingMachine.isTouchless());
    }
}