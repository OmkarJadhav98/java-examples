public class Car extends Vehicle {
    private int EngineDisplacement;
    private String fuelType;

    public Car() {
    }

    public int getEngineDisplacement() {
        return EngineDisplacement;
    }

    public void setEngineDisplacement(int EngineDisplacement) {
        this.EngineDisplacement = EngineDisplacement;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "EngineDisplacement=" + EngineDisplacement +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

}
