class FoodOrder {

    String restaurant;
    int orderId;
    int quantity;

    public FoodOrder() {
        this("Dominos", 301, 2);
        System.out.println("Default Constructor");
    }

    public FoodOrder(String restaurant) {
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Constructor 2");
    }

    public FoodOrder(String restaurant, int orderId) {
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Order ID: " + orderId);
        System.out.println("Constructor 3");
    }

    public FoodOrder(String restaurant, int orderId, int quantity) {
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Order ID: " + orderId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Constructor 4");
    }
}