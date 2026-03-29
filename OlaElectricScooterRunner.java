class OlaElectricScooterRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean ScooterStatus = OlaElectricScooter.powerSwitch();
	    System.out.println("Main Method Scooter Status: " + ScooterStatus);
	    
	    System.out.println("------Second Time Method Call------");
	    OlaElectricScooter.powerSwitch();
	   
	    System.out.println("------Third Time Method Call------");
        OlaElectricScooter.powerSwitch();
	    
	    System.out.println("------Fourt Time Method Call------");
        OlaElectricScooter.powerSwitch();
	  
	    System.out.println("------Fifth Time Method Call------");
	    OlaElectricScooter.powerSwitch();
	 }
	  
}