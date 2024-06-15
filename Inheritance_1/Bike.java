public class Bike extends Vehicle {
    private double engineDisplacement;
    private String bikeType;

    public Bike() {
    }

    @Override
    public String toString() {
        return "Bike{" +
                "engineDisplacement=" + engineDisplacement +
                ", bikeType='" + bikeType + '\'' +
                '}';
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

}
