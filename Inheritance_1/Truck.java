public class Truck extends Vehicle {
    private double cargoCapacity;
    private double weightRating;

    public Truck() {
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargoCapacity=" + cargoCapacity +
                ", weightRating=" + weightRating +
                '}';
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getWeightRating() {
        return weightRating;
    }

    public void setWeightRating(double weightRating) {
        this.weightRating = weightRating;
    }
}