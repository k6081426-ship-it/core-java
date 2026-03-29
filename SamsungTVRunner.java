class SamsungTVRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean TVStatus = SamsungTV.powerToggle();
	    System.out.println("Main Method TV Status: " + TVStatus);
	    
	    System.out.println("------Second Time Method Call------");
	    SamsungTV.powerToggle();
	   
	    System.out.println("------Third Time Method Call------");
        SamsungTV.powerToggle();
	    
	    System.out.println("------Fourt Time Method Call------");
        SamsungTV.powerToggle();
	  
	    System.out.println("------Fifth Time Method Call------");
	    SamsungTV.powerToggle();
	 }
	  
}