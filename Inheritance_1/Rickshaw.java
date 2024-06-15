public class Rickshaw extends Vehicle {
    private int passengerCapacity;
    private String fareType;

    // Constructors, getters, setters, and other methods go here

    public Rickshaw() {
    }

    @Override
    public String toString() {
        return "Rickshaw{" +
                "passengerCapacity=" + passengerCapacity +
                ", fareType='" + fareType + '\'' +
                '}';
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }
}
