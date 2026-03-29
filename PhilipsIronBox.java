class PhilipsIronBox{

    
     static boolean isHeating;
	 static int maxTemperature=200;
	 static int minTemperature=50;
	 static int currentTemperature=120;
	 
	
	public static boolean heatSwitch(){
	
	   System.out.println("heatSwitch method started");
	   
	   if (isHeating==false){
	       isHeating=true;
		   System.out.println("IronBox is ON:"+isHeating);
		}
		else {
		       isHeating=false;
			   System.out.println("IronBox OFF:"+isHeating);
	    }
			
	    System.out.println("heatSwitch method ended");
			
	    return isHeating;
		
	    }
}		