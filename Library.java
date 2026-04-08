class Library {

  
    String libraryName;
    String location;
    int totalBooks;
    int totalMembers;
    String librarianName;
    double membershipFee;
    boolean hasDigitalAccess;
    boolean isOpen;
    int establishedYear;
    String libraryType;


    public static String issueBook(String bookName) {
        System.out.println("Book Issued: " + bookName);
        return bookName;
    }

    public static String returnBook(String bookName) {
        System.out.println("Book Returned: " + bookName);
        return bookName;
    }

    public static int addBooks(int books) {
        System.out.println("Books Added: " + books);
        return books;
    }

    public static double collectFee(double fee) {
        System.out.println("Membership Fee: " + fee);
        return fee;
    }

    public static boolean openLibrary(boolean status) {
        System.out.println("Library Open: " + status);
        return status;
    }

    public static String registerMember(String member) {
        System.out.println("Member Registered: " + member);
        return member;
    }

    public static int countBooks(int count) {
        System.out.println("Total Books: " + count);
        return count;
    }

    public static String searchBook(String book) {
        System.out.println("Searching Book: " + book);
        return book;
    }

    public static boolean maintainSilence(boolean silence) {
        System.out.println("Silence Maintained: " + silence);
        return silence;
    }

    public static String libraryInfo(String info) {
        System.out.println("Library Info: " + info);
        return info;
    }
}