class Canoncamera{

    
     static boolean isPower;
	 static int maxZoom=50;
	 static int minZoom=1;
	 static int currentZoom=10;
	 
	 
	public static boolean powerButton(){
	
	   System.out.println("powerButton method started");
	   
	   if (isPower==false){
	       isPower=true;
		   System.out.println("camera is ON:"+isPower);
		}
		else {
		       isPower=false;
			   System.out.println("camera is OFF:"+isPower);
	    }
			
	    System.out.println("powerButton method ended");
			
	    return isPower;
		
	    }
}		