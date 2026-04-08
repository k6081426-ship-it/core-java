class Hotel {

  
    String hotelName;
    String location;
    int numberOfRooms;
    int numberOfStaff;
    double rating;
    boolean hasRestaurant;
    boolean hasPool;
    String managerName;
    int establishedYear;
    String hotelType;

  
    public static String bookRoom(String guestName) {
        System.out.println("Room Booked for: " + guestName);
        return guestName;
    }

    public static String checkIn(String guestName) {
        System.out.println("Guest Checked In: " + guestName);
        return guestName;
    }

    public static String checkOut(String guestName) {
        System.out.println("Guest Checked Out: " + guestName);
        return guestName;
    }

    public static boolean serveFood(boolean status) {
        System.out.println("Food Served: " + status);
        return status;
    }

    public static boolean cleanRoom(boolean status) {
        System.out.println("Room Cleaned: " + status);
        return status;
    }

    public static boolean openPool(boolean status) {
        System.out.println("Pool Opened: " + status);
        return status;
    }

    public static boolean closePool(boolean status) {
        System.out.println("Pool Closed: " + status);
        return status;
    }

    public static String hireStaff(String staffName) {
        System.out.println("Staff Hired: " + staffName);
        return staffName;
    }

    public static boolean organizeEvent(boolean status) {
        System.out.println("Event Organized: " + status);
        return status;
    }

    public static double collectBill(double amount) {
        System.out.println("Bill Collected: " + amount);
        return amount;
    }
}