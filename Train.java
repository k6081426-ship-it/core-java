class Train {

    String trainNumber;
    String trainName;
    int numberOfCoaches;
    int seatingCapacity;
    int numberOfPassengers;
    String route;
    boolean hasAC;
    boolean hasSleepingBerths;
    int speedLimit;
    int establishedYear;

  
    public static boolean startTrain(boolean status) {
        System.out.println("Train Started: " + status);
        return status;
    }

    public static boolean stopTrain(boolean status) {
        System.out.println("Train Stopped: " + status);
        return status;
    }

    public static boolean boardPassengers(int count) {
        System.out.println("Passengers Boarded: " + count);
        return true;
    }

    public static boolean deboardPassengers(int count) {
        System.out.println("Passengers Deboarded: " + count);
        return true;
    }

    public static boolean openCoachDoor(boolean status) {
        System.out.println("Coach Door Open: " + status);
        return status;
    }

    public static boolean closeCoachDoor(boolean status) {
        System.out.println("Coach Door Closed: " + status);
        return status;
    }

    public static boolean announceStation(String stationName) {
        System.out.println("Next Station: " + stationName);
        return true;
    }

    public static boolean maintainTrain(boolean status) {
        System.out.println("Train Maintained: " + status);
        return status;
    }

    public static boolean checkTickets(boolean status) {
        System.out.println("Tickets Checked: " + status);
        return status;
    }

    public static boolean serveFood(boolean status) {
        System.out.println("Food Served: " + status);
        return status;
    }
}