class College {

    
    String collegeName;
    String location;
    int numberOfStudents;
    int numberOfLecturers;
    String principalName;
    double collegeFee;
    String universityName;
    boolean hasHostel;
    boolean hasLibrary;
    int establishedYear;


    public static String conductLecture(String subject) {
        System.out.println("Lecture Conducted: " + subject);
        return subject;
    }

    public static int admitStudent(int students) {
        System.out.println("Students Admitted: " + students);
        return students;
    }

    public static String assignLecturer(String lecturer) {
        System.out.println("Lecturer Assigned: " + lecturer);
        return lecturer;
    }

    public static double collectFee(double fee) {
        System.out.println("Fee Collected: " + fee);
        return fee;
    }

    public static boolean openLibrary(boolean status) {
        System.out.println("Library Status: " + status);
        return status;
    }

    public static boolean conductExam(boolean exam) {
        System.out.println("Exam Conducted: " + exam);
        return exam;
    }

    public static String announceHoliday(String holiday) {
        System.out.println("Holiday Announced: " + holiday);
        return holiday;
    }

    public static int totalStudents(int total) {
        System.out.println("Total Students: " + total);
        return total;
    }

    public static String organizeFest(String fest) {
        System.out.println("Fest Organized: " + fest);
        return fest;
    }

    public static boolean maintainRules(boolean rules) {
        System.out.println("Rules Maintained: " + rules);
        return rules;
    }
}