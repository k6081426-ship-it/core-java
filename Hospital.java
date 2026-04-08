class Hospital {

    
    String hospitalName;
    String location;
    int numberOfDoctors;
    int numberOfBeds;
    String chiefDoctor;
    double consultationFee;
    boolean hasEmergency;
    boolean hasPharmacy;
    int establishedYear;
    String hospitalType;

    
    public static String admitPatient(String patientName) {
        System.out.println("Patient admitted: " + patientName);
        return patientName;
    }

    public static int dischargePatient(int patientId) {
        System.out.println("Patient discharged: " + patientId);
        return patientId;
    }

    public static String assignDoctor(String doctorName) {
        System.out.println("Doctor assigned: " + doctorName);
        return doctorName;
    }

    public static double collectFee(double amount) {
        System.out.println("Fee collected: " + amount);
        return amount;
    }

    public static boolean startEmergency(boolean status) {
        System.out.println("Emergency active: " + status);
        return status;
    }

    public static String scheduleAppointment(String date) {
        System.out.println("Appointment on: " + date);
        return date;
    }

    public static int availableBeds(int beds) {
        System.out.println("Available beds: " + beds);
        return beds;
    }

    public static String provideMedicine(String medicine) {
        System.out.println("Medicine given: " + medicine);
        return medicine;
    }

    public static boolean conductSurgery(boolean result) {
        System.out.println("Surgery completed: " + result);
        return result;
    }

    public static String hospitalInfo(String name) {
		System.out.println("hospital: " + result);
        return name;
    }
}