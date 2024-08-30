import java.util.ArrayList;
import java.util.List;
/*2
// Custom exceptions (you can define more specific ones)
class NotFoundException extends RuntimeException {
    // Custom exception for not found scenarios
}
class InvalidException extends RuntimeException {
    // Custom exception for invalid data scenarios
}
class MenuNotInStockException extends RuntimeException {
    // Custom exception for menu out of stock scenarios
}*/


public class Main {
    public static void main(String[] args) {
        // Create sample instances for demonstration purposes
        Address customerAddress = new Address(1, "Omkar Jadhav", "Apt 123", "Sunrise Towers", "Pune");
        Contact customerContact = new Contact(1, customerAddress, "Omkar@example.com", "123-456-7890");
        Customer customer = new Customer(1, "Omkar Jadhav", "secret_password", customerContact);

        Address restaurantAddress = new Address(2, "Tasty Bites", "Shop 5", "Central Plaza", "Pune");
        Contact restaurantContact = new Contact(2, restaurantAddress, "info@tastybites.com", "987-654-3210");
        Restaurant restaurant = new Restaurant(1, "Tasty Bites", restaurantContact, new ArrayList<>()); // Initialize with an empty menu items list

        Menu menu1 = new Menu(101, "Margherita Pizza", "Classic tomato and cheese pizza", 12.99, restaurant, "InStock");
        Menu menu2 = new Menu(102, "Pasta Alfredo", "Creamy fettuccine with Alfredo sauce", 9.99, restaurant, "InStock");

        // Create a list of selected menu items
        List<Menu> selectedMenus = new ArrayList<>();
        selectedMenus.add(menu1);
        selectedMenus.add(menu2);

        // Create a Kart (cart) for the customer
        Kart cart = new Kart(1,selectedMenus, 22.98, customer, restaurant);

        DeliveryExecutive deliveryExecutive = new DeliveryExecutive(1, "Yash", "Bike", true);

        Order order = new Order(1, cart, OrderStatus.RECEIVED);

        // Simulate order assignment
        OrderAssignment orderAssignment = new OrderAssignment(1, order, deliveryExecutive);

        // Print some details for demonstration
        System.out.println("Customer: " + customer.getUsername());
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("Selected Menu Items: " + cart.getSelectedMenus());
        System.out.println("Assigned Delivery Executive: " + orderAssignment.getAssignedExecutive().getName());
        System.out.println("Order Status: " + order.getStatus());
    }
}