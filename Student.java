class Student {

    static String studentName = "Rahul";

    public static void getStudentDetails() {
        System.out.println("Student Name: " + studentName);
    }

    public static void getStudentDetails(int age) {
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
    }

    public static String getStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
		return StudentNames;
	}
		
	public static String getStudentDetails(int age) {
        return StudentName;
    }

    }