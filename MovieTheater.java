class MovieTheatre {

    String theatreName;
    String location;
    int screens;
    int seatingCapacity;
    boolean has3D;
    boolean hasFoodCourt;
    String ownerName;
    double ticketPrice;
    int establishedYear;
    String soundSystem;

    public static String showMovie(String movie) {
        System.out.println("Now Showing: " + movie);
        return movie;
    }

    public static int bookTicket(int tickets) {
        System.out.println("Tickets Booked: " + tickets);
        return tickets;
    }

    public static double collectPayment(double amount) {
        System.out.println("Payment Received: " + amount);
        return amount;
    }

    public static boolean startShow(boolean status) {
        System.out.println("Show Started: " + status);
        return status;
    }

    public static String cancelShow(String movie) {
        System.out.println("Show Cancelled: " + movie);
        return movie;
    }

    public static boolean cleanHall(boolean clean) {
        System.out.println("Hall Cleaned: " + clean);
        return clean;
    }

    public static String sellSnacks(String snack) {
        System.out.println("Snack Sold: " + snack);
        return snack;
    }

    public static int addScreen(int count) {
        System.out.println("Screens Added: " + count);
        return count;
    }

    public static boolean openGate(boolean open) {
        System.out.println("Gate Open: " + open);
        return open;
    }

    public static String closeTheatre(String status) {
        System.out.println("Theatre Closed: " + status);
        return status;
    }
}