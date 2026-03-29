class DellLaptopRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean LaptopStatus = DellLaptop.powerButton();
	    System.out.println("Main Method Laptop Status: " + LaptopStatus);
	    
	    System.out.println("------Second Time Method Call------");
	    DellLaptop.powerButton();
	   
	    System.out.println("------Third Time Method Call------");
        DellLaptop.powerButton();
	    
	    System.out.println("------Fourt Time Method Call------");
        DellLaptop.powerButton();
	  
	    System.out.println("------Fifth Time Method Call------");
	    DellLaptop.powerButton();
	 }
	  
}