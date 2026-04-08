class Zoo {

   
    String zooName;
    String location;
    int numberOfAnimals;
    int numberOfVisitors;
    int numberOfStaff;
    boolean hasSafari;
    boolean hasAquarium;
    String managerName;
    int establishedYear;
    String zooType;

 
    public static boolean openZoo(boolean status) {
        System.out.println("Zoo Open: " + status);
        return status;
    }

    public static boolean closeZoo(boolean status) {
        System.out.println("Zoo Closed: " + status);
        return status;
    }

    public static String feedAnimals(String animalName) {
        System.out.println("Fed Animal: " + animalName);
        return animalName;
    }

    public static boolean maintainCleanliness(boolean status) {
        System.out.println("Zoo Cleaned: " + status);
        return status;
    }

    public static boolean organizeTour(String tourName) {
        System.out.println("Tour Organized: " + tourName);
        return true;
    }

    public static boolean ensureSecurity(boolean status) {
        System.out.println("Security Maintained: " + status);
        return status;
    }

    public static boolean admitVisitor(boolean status) {
        System.out.println("Visitor Admitted: " + status);
        return status;
    }

    public static String assignCaretaker(String caretakerName) {
        System.out.println("Caretaker Assigned: " + caretakerName);
        return caretakerName;
    }

    public static boolean conductShow(String showName) {
        System.out.println("Animal Show Conducted: " + showName);
        return true;
    }

    public static boolean manageTickets(boolean status) {
        System.out.println("Tickets Managed: " + status);
        return status;
    }
}