class Gym {

    String gymName;
    String location;
    int trainerCount;
    int memberCount;
    double monthlyFee;
    boolean hasCardioSection;
    boolean hasLocker;
    String ownerName;
    int openingYear;
    String gymType;

    public static String registerMember(String name) {
        System.out.println("Member Registered: " + name);
        return name;
    }

    public static double collectFee(double fee) {
        System.out.println("Fee Collected: " + fee);
        return fee;
    }

    public static String assignTrainer(String trainer) {
        System.out.println("Trainer Assigned: " + trainer);
        return trainer;
    }

    public static boolean openGym(boolean status) {
        System.out.println("Gym Open: " + status);
        return status;
    }

    public static String startWorkout(String workout) {
        System.out.println("Workout Started: " + workout);
        return workout;
    }

    public static int addEquipment(int count) {
        System.out.println("Equipment Added: " + count);
        return count;
    }

    public static boolean maintainCleanliness(boolean clean) {
        System.out.println("Cleanliness: " + clean);
        return clean;
    }

    public static String conductSession(String session) {
        System.out.println("Session: " + session);
        return session;
    }

    public static double checkBMI(double bmi) {
        System.out.println("BMI: " + bmi);
        return bmi;
    }

    public static String closeGym(String status) {
        System.out.println("Gym Closed: " + status);
        return status;
    }
}