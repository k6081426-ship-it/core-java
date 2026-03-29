class PhilipsIronBoxRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean IronBoxStatus = PhilipsIronBox.heatSwitch();
	    System.out.println("Main Method IronBox Status: " + IronBoxStatus);
	    
	    System.out.println("------Second Time Method Call------");
	    PhilipsIronBox.heatSwitch();
	   
	    System.out.println("------Third Time Method Call------");
        PhilipsIronBox.heatSwitch();
	    
	    System.out.println("------Fourt Time Method Call------");
        PhilipsIronBox.heatSwitch();
	  
	    System.out.println("------Fifth Time Method Call------");
	    PhilipsIronBox.heatSwitch();
	}

}