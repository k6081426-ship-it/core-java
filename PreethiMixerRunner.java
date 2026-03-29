class PreethiMixerRunner{

    public static void main(String []args){
	
        System.out.println("------First Time Method Call------");
	    boolean MixerStatus = PreethiMixer.startStop();
	    System.out.println("Main Method Mixer Status: " + MixerStatus);
	    
	    System.out.println("------Second Time Method Call------");
	    PreethiMixer.startStop();
	   
	    System.out.println("------Third Time Method Call------");
        PreethiMixer.startStop();
	    
	    System.out.println("------Fourt Time Method Call------");
        PreethiMixer.startStop();
	  
	    System.out.println("------Fifth Time Method Call------");
	    PreethiMixer.startStop();
	 }
	  
}