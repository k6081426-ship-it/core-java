class DellLaptop{

    
     static boolean isPower;
	 static int maxBattery=100;
	 static int minBattery=0;
	 static int currentBattery=60;
	 
	 
	public static boolean powerButton(){
	
	   System.out.println("powerButton method started");
	   
	   if (isPower==false){
	       isPower=true;
		   System.out.println("Laptop is ON:"+isPower);
		}
		else {
		       isPower=false;
			   System.out.println("Laptop is OFF:"+isPower);
	    }
			
	    System.out.println("powerButton method ended");
			
	    return isPower;
		
	    }
}		