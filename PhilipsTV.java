class PhilipsTV{

    
     static boolean isTVOn;
	 static int brightness= 60;
	 
	public static boolean switchTV(){
	
	   System.out.println("SwitchTV method started");
	   
	   if (isTVOn==false){
	       isTVOn=true;
		   System.out.println("TV state is ON:"+isTVOn);
		}
		else {
		       isTVOn=false;
			   System.out.println("TV state is OFF:"+isTVOn);
	    }
			
	    System.out.println("switchTV method ended");
			
	    return isTVOn;
		
	    }
}		