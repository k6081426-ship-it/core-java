class Airline {

    String airlineName;
    String headquarters;
    int totalFlights;
    int staffCount;
    String CEO;
    boolean hasInternationalFlights;
    int fleetSize;
    double ticketPrice;
    int establishedYear;
    String airlineCode;

    public static String bookTicket(String passenger) {
        System.out.println("Ticket Booked for: " + passenger);
        return passenger;
    }

    public static String cancelTicket(String passenger) {
        System.out.println("Ticket Cancelled: " + passenger);
        return passenger;
    }

    public static boolean startFlight(boolean status) {
        System.out.println("Flight Started: " + status);
        return status;
    }

    public static String assignPilot(String pilot) {
        System.out.println("Pilot Assigned: " + pilot);
        return pilot;
    }

    public  static double collectFare(double fare) {
        System.out.println("Fare Collected: " + fare);
        return fare;
    }

    public static int addFlight(int flights) {
        System.out.println("Flights Added: " + flights);
        return flights;
    }

    public static boolean checkSafety(boolean safe) {
        System.out.println("Safety Check: " + safe);
        return safe;
    }

    public static String announceFlight(String flight) {
        System.out.println("Announcement: " + flight);
        return flight;
    }

    public static boolean landFlight(boolean landed) {
        System.out.println("Flight Landed: " + landed);
        return landed;
    }

    public static String closeBoarding(String status) {
        System.out.println("Boarding Closed: " + status);
        return status;
    }
}