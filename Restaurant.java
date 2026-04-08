class Restaurant {

    // Properties
    String restaurantName;
    String cuisineType;
    int numberOfChefs;
    int numberOfWaiters;
    int seatingCapacity;
    boolean hasDelivery;
    boolean hasTakeaway;
    double averageBill;
    String openingTime;
    String closingTime;

    // Behaviours
    public String takeOrder(String order) {
        System.out.println("Order taken: " + order);
        return order;
    }

    public double calculateBill(double amount) {
        System.out.println("Bill amount: " + amount);
        return amount;
    }

    public boolean serveFood(boolean served) {
        System.out.println("Food served: " + served);
        return served;
    }

    public boolean openRestaurant(boolean status) {
        System.out.println("Restaurant open: " + status);
        return status;
    }

    public boolean closeRestaurant(boolean status) {
        System.out.println("Restaurant closed: " + status);
        return status;
    }

    public String hireChef(String name) {
        System.out.println("Chef hired: " + name);
        return name;
    }

    public String fireStaff(String name) {
        System.out.println("Staff fired: " + name);
        return name;
    }

    public boolean startDelivery(boolean status) {
        System.out.println("Delivery started: " + status);
        return status;
    }

    public String createMenu(String menuName) {
        System.out.println("Menu created: " + menuName);
        return menuName;
    }

    public boolean maintainHygiene(boolean status) {
        System.out.println("Hygiene maintained: " + status);
        return status;
    }
}