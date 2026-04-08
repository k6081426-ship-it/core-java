class Drone {

 
    String droneModel;
    double batteryLife;
    double maxSpeed;
    double weight;
    double payloadCapacity;
    boolean hasCamera;
    boolean hasGPS;
    String manufacturer;
    int flightHours;
    boolean isAutonomous;
	
    public static boolean takeOff(boolean status) {
        System.out.println("Drone Takeoff: " + status);
        return status;
    }

    public static boolean land(boolean status) {
        System.out.println("Drone Landed: " + status);
        return status;
    }

    public static boolean flyToCoordinates(String coordinates) {
        System.out.println("Flying To: " + coordinates);
        return true;
    }

    public static boolean capturePhoto(String photoName) {
        System.out.println("Photo Captured: " + photoName);
        return true;
    }

    public static boolean recordVideo(String videoName) {
        System.out.println("Video Recorded: " + videoName);
        return true;
    }

    public static boolean returnToBase(boolean status) {
        System.out.println("Returned To Base: " + status);
        return status;
    }

    public static boolean rechargeBattery(double hours) {
        System.out.println("Battery Recharged for: " + hours + " hours");
        return true;
    }

    public static boolean avoidObstacle(boolean status) {
        System.out.println("Obstacle Avoided: " + status);
        return status;
    }

    public static boolean enableAutopilot(boolean status) {
        System.out.println("Autopilot Enabled: " + status);
        return status;
    }

    public String sendTelemetry(String data) {
        System.out.println("Telemetry Sent: " + data);
        return data;
    }
}