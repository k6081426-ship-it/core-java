class Bank {

   
    String bankName;
    String branch;
    String managerName;
    int numberOfEmployees;
    int numberOfCustomers;
    double totalBalance;
    String ifscCode;
    boolean hasLoanFacility;
    boolean hasATM;
    int establishedYear;

  
    public static String openAccount(String customerName) {
        System.out.println("Account Opened for: " + customerName);
        return customerName;
    }

    public static double depositAmount(double amount) {
        System.out.println("Amount Deposited: " + amount);
        return amount;
    }

    public static double withdrawAmount(double amount) {
        System.out.println("Amount Withdrawn: " + amount);
        return amount;
    }

    public static boolean provideLoan(boolean status) {
        System.out.println("Loan Provided: " + status);
        return status;
    }

    public static String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public static int addCustomer(int customers) {
        System.out.println("Customers Added: " + customers);
        return customers;
    }

    public static String generateStatement(String statement) {
        System.out.println("Statement Generated: " + statement);
        return statement;
    }

    public static boolean activateATM(boolean active) {
        System.out.println("ATM Activated: " + active);
        return active;
    }

    public static double checkBalance(double balance) {
        System.out.println("Balance: " + balance);
        return balance;
    }

    public static String bankInfo(String info) {
        System.out.println("Bank Info: " + info);
        return info;
    }
}