class Customer {
    private long id;
    private String username;
    private String password;
    private Contact contact; // Reference to Contact class

    public Customer(long id, String username, String password, Contact contact) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.contact = contact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    // Constructors, getters, setters
}