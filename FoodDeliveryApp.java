class FoodDeliveryApp {

    
    String appName;
    int numberOfUsers;
    int numberOfRestaurants;
    boolean hasOffers;
    boolean hasRatings;
    boolean hasLiveTracking;
    double averageDeliveryTime;
    int numberOfDeliveries;
    String CEOName;
    int establishedYear;

 
    public static boolean placeOrder(String orderName) {
        System.out.println("Order Placed: " + orderName);
        return true;
    }

    public static boolean cancelOrder(String orderName) {
        System.out.println("Order Cancelled: " + orderName);
        return true;
    }

    public static boolean trackOrder(String orderName) {
        System.out.println("Tracking Order: " + orderName);
        return true;
    }

    public static boolean rateRestaurant(String restaurantName, int rating) {
        System.out.println("Restaurant Rated: " + restaurantName + " Rating: " + rating);
        return true;
    }

    public static boolean addOffer(String offerName) {
        System.out.println("Offer Added: " + offerName);
        return true;
    }

    public static boolean removeOffer(String offerName) {
        System.out.println("Offer Removed: " + offerName);
        return true;
    }

    public boolean addRestaurant(String restaurantName) {
        System.out.println("Restaurant Added: " + restaurantName);
        return true;
    }

    public static boolean removeRestaurant(String restaurantName) {
        System.out.println("Restaurant Removed: " + restaurantName);
        return true;
    }

    public static boolean updateDeliveryTime(double newTime) {
        System.out.println("Average Delivery Time Updated: " + newTime + " mins");
        return true;
    }

    public static String notifyUser(String message) {
        System.out.println("Notification Sent: " + message);
        return message;
    }
}