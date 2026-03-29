class Watsapp{
	
	
	
	public static String Register(long mobileNumber,String userName,String password,String fullname){
	   System.out.println("Watsapp Register method is started");
	   String registerStatus=null;
	   if(mobileNumber !=0 && userName != null && password !=null && fullname !=null){
		   
		   if(userName.length()>4 && password.length()>6 && fullname.length()>0){
			   
			   registerStatus="Welcome "+userName+" Watsapp account created succesfully";
			   
		   }else{
			   
			   registerStatus="please check the Length of userName,password,fullname";
			   
		    }
		   
	   }else{
		   
		   registerStatus="Please enter the Validate Data";
	    }
	    System.out.println("Watsapp Register method is Ended");
		
		return registerStatus;
}
}