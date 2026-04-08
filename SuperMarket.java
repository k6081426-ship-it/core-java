class SuperMarket {

    String marketName;
    String location;
    int productCount;
    int staffCount;
    String managerName;
    boolean hasParking;
    boolean hasOnlineDelivery;
    double dailyRevenue;
    int establishedYear;
    String category;

    public static String addProduct(String product) {
        System.out.println("Product Added: " + product);
        return product;
    }

    publicstatic String sellProduct(String product) {
        System.out.println("Product Sold: " + product);
        return product;
    }

    public static double generateBill(double amount) {
        System.out.println("Bill Amount: " + amount);
        return amount;
    }

    public static boolean openStore(boolean open) {
        System.out.println("Store Open: " + open);
        return open;
    }

    public static String hireStaff(String staff) {
        System.out.println("Staff Hired: " + staff);
        return staff;
    }

    public int restockItems(int items) {
        System.out.println("Items Restocked: " + items);
        return items;
    }

    public static boolean checkInventory(boolean status) {
        System.out.println("Inventory Checked: " + status);
        return status;
    }

    public static String offerDiscount(String offer) {
        System.out.println("Offer: " + offer);
        return offer;
    }

    public static double collectPayment(double payment) {
        System.out.println("Payment Received: " + payment);
        return payment;
    }

    public static String closeStore(String status) {
        System.out.println("Store Closed: " + status);
        return status;
    }
}