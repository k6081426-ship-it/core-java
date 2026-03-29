class Watch {

    static String watchName = "Titan";

    public static void getWatchDetails() {
        System.out.println("Watch: " + watchName);
    }

    public static void getWatchDetail(int price) {
        System.out.println("Watch: " + watchName + " Price: " + price);
    }

    public static String getWatchinfo() {
        System.out.println("Watch: " + watchName);
        return watchName;
    }

    public static String getWatchinf(int price) {
        System.out.println("Watch: " + watchName + " Price: " + price);
        return watchName;
    }
}