class LGFridge{

    //static variables
     static boolean isCooling;
	 static int maxTemperature=8;
	 static int minTemperature=-5;
	 static int currentTemperature=3;
	 
	//static method
	public static boolean startCooling(){
	
	   System.out.println("Cooling method started");
	   
	   if (isCooling==false){
	       isCooling=true;
		   System.out.println("Fridge Cooling ON:"+isCooling);
		}
		else {
		       isCooling=false;
			   System.out.println("Fridge Cooling OFF:"+isCooling);
	    }
			
	    System.out.println("Cooling method ended");
			
	    return isCooling;
		
	    }
}		