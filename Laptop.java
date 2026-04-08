class Laptop {

    String brand;
    String model;
    int ram;
    int storage;
    String processor;
    double screenSize;
    double price;
    String operatingSystem;
    boolean hasSSD;
    String color;

    public static boolean powerOn(boolean status) {
        System.out.println("Laptop Power: " + status);
        return status;
    }

    public static String openSoftware(String software) {
        System.out.println("Opening: " + software);
        return software;
    }

    public static String typeText(String text) {
        System.out.println("Typing: " + text);
        return text;
    }

    public static boolean connectWifi(boolean wifi) {
        System.out.println("WiFi Connected: " + wifi);
        return wifi;
    }

    public static double chargeBattery(double percent) {
        System.out.println("Charging: " + percent);
        return percent;
    }

    public static String playVideo(String video) {
        System.out.println("Playing Video: " + video);
        return video;
    }

    public static boolean shutdown(boolean off) {
        System.out.println("Shutdown: " + off);
        return off;
    }

    public static String installSoftware(String software) {
        System.out.println("Installed: " + software);
        return software;
    }

    public static int increaseBrightness(int level) {
        System.out.println("Brightness Level: " + level);
        return level;
    }

    public static String checkUpdates(String update) {
        System.out.println("Update Status: " + update);
        return update;
    }
}