class Facebook{
	
	
	
	public static String Register(long mobileNumber,String email,String password,String name){
	   System.out.println("Facebook Register method is started");
	   String registerStatus=null;
	   if(mobileNumber !=0 && email != null && password !=null && name !=null){
		   
		   if(email.contains("@") && password.length()>6 && name.length()>0){
			   
			   registerStatus="Welcome "+name+" Facebook account created succesfully";
			   
		   }else{
			   
			   registerStatus="Please check the Length Of email,paasword,Name";
			   
		    }
		   
	   }else{
		   
		   registerStatus="Please enter the Validate Data";
	    }
	    System.out.println("Facebook Register method is Ended");
		
		return registerStatus;
}
}