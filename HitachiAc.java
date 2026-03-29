class HitachiAc{

    //static variables
     static boolean isSwitch;
	 static int maxTemperature=40;
	 static int minTemperature=15;
	 static int currentTemperature=21;
	 
	//static method
	public static boolean onOrOff(){
	
	   System.out.println("onOrOff method started");
	   
	   if (isSwitch==false){
	       isSwitch=true;
		   System.out.println("Ac is ON:"+isSwitch);
		}
		else {
		       isSwitch=false;
			   System.out.println("AC is OFF:"+isSwitch);
	    }
			
	    System.out.println("onOrOff method ended");
			
	    return isSwitch;
		
	    }
}		