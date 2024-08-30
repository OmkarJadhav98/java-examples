class Users {
    private long id;
    private String username;
    private Entity entity; // Reference to the associated entity (Customer, Restaurant, etc.)
    private String password;

    public Users(long id, String username, Entity entity, String password) {
        this.id = id;
        this.username = username;
        this.entity = entity;
        this.password = password;
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

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Constructors, getters, setters
}
