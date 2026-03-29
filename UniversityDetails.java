class UniversityDetails{

    static String studentNames[] = {"Arun","Varun","Sneha","Pooja","Ramesh","Kavya","Manoj","Teja","keerthi","punya"};
    static int studentIds[] = {101,102,103,104,105,106,107,108,109,110};
    static byte studentMarks[] = {85,90,88,76,92,80,79,87,86,96};
    static String courses[] = {"Java","Python","AI","ML","Cloud","Cyber","Data","DevOps","Software Testing","Digital Marketing"};

    public static void getStudentDetails(){

        for(int i=0;i<studentNames.length;i++){

            System.out.println("Student Name: "+studentNames[i]);
            System.out.println("Student ID: "+studentIds[i]);
            System.out.println("Marks: "+studentMarks[i]);
            System.out.println("Course: "+courses[i]);
			}
			}
}