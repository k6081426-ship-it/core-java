class SonySpeakerRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean SpeakerStatus = SonySpeaker.playMusic();
	    System.out.println("Main Method Speaker Status: " + SpeakerStatus);
	  
	    System.out.println("------Second Time Method Call------");
	    SonySpeaker.playMusic();
	   
	    System.out.println("------Third Time Method Call------");
        SonySpeaker.playMusic();
	    
	    System.out.println("------Fourt Time Method Call------");
        SonySpeaker.playMusic();
	  
	    System.out.println("------Fifth Time Method Call------");
	    SonySpeaker.playMusic();
	 }
	  
}