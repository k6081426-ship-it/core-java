class PhilipsTVRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean TVStatus = PhilipsTV.switchTV();
	    System.out.println("Main Method TV Status: " + TVStatus);
	    
	    System.out.println("------Second Time Method Call------");
	    PhilipsTV.switchTV();
	   
	    System.out.println("------Third Time Method Call------");
        PhilipsTV.switchTV();
	    
	    System.out.println("------Fourt Time Method Call------");
        PhilipsTV.switchTV();
	  
	    System.out.println("------Fifth Time Method Call------");
	    PhilipsTV.switchTV();
	 }
	  
}