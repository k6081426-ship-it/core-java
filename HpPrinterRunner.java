class HpPrinterRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean PrinterStatus = HpPrinter.printSwitch();
	    System.out.println("Main Method Printer Status: " + PrinterStatus);
	    
	    System.out.println("------Second Time Method Call------");
	    HpPrinter.printSwitch();
	   
	    System.out.println("------Third Time Method Call------");
        HpPrinter.printSwitch();
	    
	    System.out.println("------Fourt Time Method Call------");
        HpPrinter.printSwitch();
	  
	    System.out.println("------Fifth Time Method Call------");
	    HpPrinter.printSwitch();
	 }
	  
}