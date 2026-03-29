class PreethiMixer{

    
     static boolean isRunning;
	 static int maxSpeed=5;
	 static int minSpeed=1;
	 static int currentSpeed=2;
	 
	 
	public static boolean startStop(){
	
	   System.out.println("startStop method started");
	   
	   if (isRunning==false){
	       isRunning=true;
		   System.out.println("Mixer is ON:"+isRunning);
		}
		else {
		       isRunning=false;
			   System.out.println("Mixer is OFF:"+isRunning);
	    }
			
	    System.out.println("startStop method ended");
			
	    return isRunning;
		
	    }
}		