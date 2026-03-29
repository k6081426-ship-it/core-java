class SamsungTV{

    //static variables
     static boolean isPowerOn;
	 static int maxVolume=100;
	 static int minVolume=0;
	 static int currentVolume=40;
	 
	//static method
	public static boolean powerToggle(){
	
	   System.out.println("powerToggle method started");
	   
	   if (isPowerOn==false){
	       isPowerOn=true;
		   System.out.println("TV is ON:"+isPowerOn);
		}
		else {
		       isPowerOn=false;
			   System.out.println("powerToggle OFF:"+isPowerOn);
	    }
			
	    System.out.println("powerToggle method ended");
			
	    return isPowerOn;
		
	    }
}		