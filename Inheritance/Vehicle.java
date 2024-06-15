public class Vehicle {
    private String make;
    private String model;
    private int year;

    // Constructors, getters, setters, and other methods go here
}

public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    // Constructors, getters, setters, and other methods go here
}

public class Bike extends Vehicle {
    private double engineDisplacement;
    private String bikeType;

    // Constructors, getters, setters, and other methods go here
}

public class Truck extends Vehicle {
    private double cargoCapacity;
    private double weightRating;

    // Constructors, getters, setters, and other methods go here
}

public class Rickshaw extends Vehicle {
    private int passengerCapacity;
    private String fareType;

    // Constructors, getters, setters, and other methods go here
}

public class _1
{
    public static void main(String[] args) {
        // Create instances of different vehicles
        Car myCar = new Car();
        myCar.setMake("Toyota");
        myCar.setModel("Camry");
        myCar.setYear(2022);
        myCar.setNumberOfDoors(4);
        myCar.setFuelType("Petrol");

        Bike myBike = new Bike();
        myBike.setMake("Honda");
        myBike.setModel("CBR 250R");
        myBike.setYear(2021);
        myBike.setEngineDisplacement(249.6);
        myBike.setBikeType("Sport");

        Truck myTruck = new Truck();
        myTruck.setMake("Ford");
        myTruck.setModel("F-150");
        myTruck.setYear(2020);
        myTruck.setCargoCapacity(1500.0);
        myTruck.setWeightRating(7000.0);

        Rickshaw myRickshaw = new Rickshaw();
        myRickshaw.setMake("Bajaj");
        myRickshaw.setModel("Auto Rickshaw");
        myRickshaw.setYear(2019);
        myRickshaw.setPassengerCapacity(3);
        myRickshaw.setFareType("Metered");

        // Display information about the vehicles
        System.out.println("Car Details:");
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Doors: " + myCar.getNumberOfDoors());
        System.out.println("Fuel Type: " + myCar.getFuelType());
        System.out.println();

        // Similar code for other vehicle types...

        // You can add more vehicles and customize their properties as needed.
    }
}
