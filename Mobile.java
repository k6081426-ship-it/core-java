class Mobile {

   
    String brand;
    String model;
    double price;
    int batteryCapacity;
    int ram;
    int storage;
    String processor;
    String color;
    boolean is5G;
    double screenSize;


    public static  String makeCall(String number) {
        System.out.println("Calling: " + number);
        return number;
    }

    public static String sendMessage(String message) {
        System.out.println("Message Sent: " + message);
        return message;
    }

    public static int chargeBattery(int percent) {
        System.out.println("Battery Charged: " + percent);
        return percent;
    }

    public static boolean enableWifi(boolean status) {
        System.out.println("WiFi Enabled: " + status);
        return status;
    }

    public static String openApp(String app) {
        System.out.println("App Opened: " + app);
        return app;
    }

    public static int increaseVolume(int level) {
        System.out.println("Volume Increased: " + level);
        return level;
    }

    public static int decreaseVolume(int level) {
        System.out.println("Volume Decreased: " + level);
        return level;
    }

    public static String takePhoto(String mode) {
        System.out.println("Photo Mode: " + mode);
        return mode;
    }

    public static boolean powerOff(boolean off) {
        System.out.println("Power Off: " + off);
        return off;
    }

    public static String deviceInfo(String info) {
        System.out.println("Device Info: " + info);
        return info;
    }
}