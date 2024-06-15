
public class _1 {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Car myCar = new Car();
        myCar.setMake("Hyundai");
        myCar.setModel("i20");
        myCar.setYear(2022);
        myCar.setEngineDisplacement(200);
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
        System.out.println("Engine Displacement : " + myCar.getEngineDisplacement());
        System.out.println("Fuel Type: " + myCar.getFuelType());
        System.out.println("===================================");

        System.out.println("Bike Details:");
        System.out.println("Make: " + myBike.getMake());
        System.out.println("Model: " + myBike.getModel());
        System.out.println("Year: " + myBike.getYear());
        System.out.println("Engine Displacement: " + myBike.getEngineDisplacement());
        System.out.println("Bike Type: " + myBike.getBikeType());
        System.out.println("===================================");

        System.out.println("Truck Details:");
        System.out.println("Make: " + myTruck.getMake());
        System.out.println("Model: " + myTruck.getModel());
        System.out.println("Year: " + myTruck.getYear());
        System.out.println("Cargo Capacity: " + myTruck.getCargoCapacity());
        System.out.println("Weight Rating: " + myTruck.getWeightRating());
        System.out.println("===================================");

        System.out.println("Rickshaw Details:");
        System.out.println("Make: " + myRickshaw.getMake());
        System.out.println("Model: " + myRickshaw.getModel());
        System.out.println("Year: " + myRickshaw.getYear());
        System.out.println("Passenger Capacity: " + myRickshaw.getPassengerCapacity());
        System.out.println("Fare Type: " + myRickshaw.getFareType());
        System.out.println("===================================");


    }
}
