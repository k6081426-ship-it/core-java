class LGFridgeRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean FridgeStatus = LGFridge.startCooling();
	    System.out.println("Main Method Fridge Status: " + FridgeStatus);
	  
	    System.out.println("------Second Time Method Call------");
	    LGFridge.startCooling();
	   
	    System.out.println("------Third Time Method Call------");
	    LGFridge.startCooling();
	    
	    System.out.println("------Fourt Time Method Call------");
	    LGFridge.startCooling();
	  
	    System.out.println("------Fifth Time Method Call------");
	    LGFridge.startCooling();
	 }
	  
}