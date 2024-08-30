class OrderAssignment {
    private long id;
    private Order order; // Reference to the assigned order
    private DeliveryExecutive assignedExecutive; // Reference to the assigned delivery executive

    public OrderAssignment(long id, Order order, DeliveryExecutive assignedExecutive) {
        this.id = id;
        this.order = order;
        this.assignedExecutive = assignedExecutive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DeliveryExecutive getAssignedExecutive() {
        return assignedExecutive;
    }

    public void setAssignedExecutive(DeliveryExecutive assignedExecutive) {
        this.assignedExecutive = assignedExecutive;
    }

    // Constructors, getters, setters
}