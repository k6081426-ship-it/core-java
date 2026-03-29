class OlaElectricScooter{

    
     static boolean isPower;
	 static int maxSpeed=90;
	 static int minSpeed=10;
	 static int currentSpeed=40;
	 
	 
	public static boolean powerSwitch(){
	
	   System.out.println("powerSwitch method started");
	   
	   if (isPower==false){
	       isPower=true;
		   System.out.println("Scooter is ON:"+isPower);
		}
		else {
		       isPower=false;
			   System.out.println("Scooter is OFF:"+isPower);
	    }
			
	    System.out.println("powerSwitch method ended");
			
	    return isPower;
		}
		}