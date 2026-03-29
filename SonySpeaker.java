class SonySpeaker{

    //static variables
     static boolean isPlaying;
	 static int maxSound=80;
	 static int minSound=-10;
	 static int currentSound=35;
	 
	//static method
	public static boolean playMusic(){
	
	   System.out.println("playMusic method started");
	   
	   if (isPlaying==false){
	       isPlaying=true;
		   System.out.println("Music Playing ON:"+isPlaying);
		}
		else {
		       isPlaying=false;
			   System.out.println("Music Playing OFF:"+isPlaying);
	    }
			
	    System.out.println("playMusic method ended");
			
	    return isPlaying;
		
	    }
}		