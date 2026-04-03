class Mobile2{

     String modelName;
	 String processor;
	 static int launchyear;
	 String chargeType;
	 int refreshRate;
	 float displaysize;
	 
	 
	 public Mobile2(){
		 
	 }
	
	 
	 public Mobile2(String modelName,String processor,int launchyear,String chargeType,int refreshRate,float displaysize){
	    this.modelName=modelName;
		this.processor=processor;
		this.launchyear=launchyear;
		this.chargeType=chargeType;
		this.refreshRate=refreshRate;
		this.displaysize=displaysize;
		
	 }
	 
	 public void displayMobileDetails(){
	   System.out.println("modelName:"+modelName);
	   System.out.println("processor:"+processor);
	   System.out.println("launchyear:"+launchyear);
	   System.out.println("chargeType:"+chargeType);
	   System.out.println("refreshRate:"+refreshRate);
	   System.out.println("displaysize:"+displaysize);
	   
	   
	   }
}