class SmartTv1{

     String modelName;
	 int operatingSystem;
	 static int storage;
	 String color;
	 String warrantly;
	 String soundType;
	 
	 public SmartTv1(){
		 
	 }
	
	 
	 public SmartTv1(String modelName,int operatingSystem,int storage,String color,String warrantly,String soundType){
	    this.modelName=modelName;
		this.operatingSystem=operatingSystem;
		this.storage=storage;
		this.color=color;
		this.warrantly=warrantly;
		this.soundType=soundType;
		
	 }
	 
	 public void displayTvDetails(){
	   System.out.println("modelName:"+modelName);
	   System.out.println("operatingSystem:"+operatingSystem);
	   System.out.println("storage:"+storage);
	   System.out.println("color:"+color);
	   System.out.println("warrantly:"+warrantly);
	   System.out.println("soundType:"+soundType);
	   
	   
	   }
}