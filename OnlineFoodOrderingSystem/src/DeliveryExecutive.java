class DeliveryExecutive {
    private long id;
    private String name;
    private String vehicleInfo;
    private boolean available; // Indicates if the executive is available for new orders

    public DeliveryExecutive(long id, String name, String vehicleInfo, boolean available) {
        this.id = id;
        this.name = name;
        this.vehicleInfo = vehicleInfo;
        this.available = available;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(String vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Constructors, getters, setters
}