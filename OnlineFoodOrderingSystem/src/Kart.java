import java.util.ArrayList;
import java.util.List;

class Kart {
    private long id;
    private List<Menu> selectedMenus; // List of chosen food items
    private double finalPrice;
    private Entity customer; // Reference to the customer
    private Entity restaurant; // Reference to the restaurant

    private Kart(long id, List<Menu> selectedMenus, double finalPrice, Entity customer, Entity restaurant) {
        this.id = id;
        this.selectedMenus = selectedMenus;
        this.finalPrice = finalPrice;
        this.customer = customer;
        this.restaurant = restaurant;
    }

    public Kart(int id, List<Menu> selectedMenus, double finalPrice, Customer customer, Restaurant restaurant) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Menu> getSelectedMenus() {
        return selectedMenus;
    }

    public void setSelectedMenus(List<Menu> selectedMenus) {
        this.selectedMenus = selectedMenus;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Entity getCustomer() {
        return customer;
    }

    public void setCustomer(Entity customer) {
        this.customer = customer;
    }

    public Entity getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Entity restaurant) {
        this.restaurant = restaurant;
    }

    // Constructors, getters, setters
}
