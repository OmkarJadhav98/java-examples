class Order {
    private long id;
    private Kart kart; // Reference to the associated kart
    private OrderStatus status; // Order status (e.g., RECEIVED, IN_PROGRESS, etc.)

    public Order(long id, Kart kart, OrderStatus status) {
        this.id = id;
        this.kart = kart;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Kart getKart() {
        return kart;
    }

    public void setKart(Kart kart) {
        this.kart = kart;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    // Constructors, getters, setters
}