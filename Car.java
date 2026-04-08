class Car {

    String brand;
    String model;
    String color;
    double price;
    int seatingCapacity;
    String fuelType;
    int mileage;
    boolean isAutomatic;
    int topSpeed;
    String engineType;

    public static String startCar(String status) {
        System.out.println("Car Started: " + status);
        return status;
    }

    public static String stopCar(String status) {
        System.out.println("Car Stopped: " + status);
        return status;
    }

    public static double accelerate(double speed) {
        System.out.println("Speed Increased: " + speed);
        return speed;
    }

    public static boolean applyBrake(boolean brake) {
        System.out.println("Brake Applied: " + brake);
        return brake;
    }

    public static String changeGear(String gear) {
        System.out.println("Gear Changed: " + gear);
        return gear;
    }

    public static double refuel(double fuel) {
        System.out.println("Fuel Added: " + fuel);
        return fuel;
    }

    public static boolean turnAC(boolean status) {
        System.out.println("AC Status: " + status);
        return status;
    }

    public static String playMusic(String song) {
        System.out.println("Playing: " + song);
        return song;
    }

    publicstatic boolean lockCar(boolean lock) {
        System.out.println("Car Locked: " + lock);
        return lock;
    }

    public static String navigate(String location) {
        System.out.println("Navigating to: " + location);
        return location;
    }
}