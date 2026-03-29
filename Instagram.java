class Facebook{
	
	
	
	public static String Register(long mobileNumber,String email,String password,String name){
	   System.out.println("Facebook Register method is started");
	   String registerStatus=null;
	   if(mobileNumber !=0 && email != null && password !=null && name !=null){
		   
		   if(psw.length()>6 && fullName.length()>4 && userName.length()>4){
			   
			   registerStatus="Thank You "+fullName+" Registered succesfully";
			   
		   }else{
			   
			   registerStatus="Please check the Length Of PSW,FullName,User Name";
			   
		    }
		   
	   }else{
		   
		   registerStatus="Please enter the Validate Data";
	    }
	    System.out.println("validateAndRegister method is Ended");
		
		return registerStatus;
}
}