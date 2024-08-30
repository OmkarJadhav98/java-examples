class Entity {
    private long id;
    private String name;
    private Contact contact;
    private String type; // Customer, Restaurant, DeliveryExecutive
    private String state; // occupied, available, open, close

    public Entity(long id, String name, Contact contact, String type, String state) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.type = type;
        this.state = state;
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Constructors, getters, setters
}
