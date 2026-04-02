class Amazon{

    public boolean login(String userName,String psw){
		  System.out.println("Invoking login using userName: "+userName+ "and psw :"+psw);
		       String reguserName="keerthi";
			   String regpsw="Keerthi@123";
			   boolean islogin=false;
			   
			   if(userName==reguserName && psw==regpsw){
				   islogin=true;
				   
			   }else{
				   islogin=false;
			   }
			   return islogin;
			   
			   }
			   
	public String login(long phoneNumber,int otp){
		System.out.println("Invoking login using phoneNumber: "+phoneNumber+" and otp :"+otp);
				long regphoneNumber=9763290086653l;
			    int regotp=89898;
			    String islogin=null;
			    if(phoneNumber==regphoneNumber && otp==regotp){
				   islogin="Login successsfully";
				}else{
					islogin="Login failed";
				}
				return islogin;
	}
				
	public String search(String productName){
	       System.out.println("Invoking search by productName:"+productName);
	             String message=null;
	
	            if(productName!=null){
	            message="searching productName is Available ";
		    }
		  return message;
		  }
		  
		  
		  public String search(String productName,double price){
		  System.out.println("Invoking search by productName :"+productName+ "and price :"+price);
		  String meassage=null;
		  if(productName!=null && price!=0.0){
		     meassage="searching productName is available: "+productName+ "and price:"+price;
			 }
			 return meassage;
			 }
			 
	 public String search(String productName,String color,int mileage){
		  System.out.println("Invoking login using :productName"+productName+ "and color :"+color+" and mileage:"+mileage);
		  String message=null;
		  if(productName!=null &&  color!=null && mileage!=0){
		     message="searching productName is available: productName"+productName+ "and color :"+color+" and mileage:"+mileage;
			 }
			 return message;
			 }
			
		public String search(String productName,float fuelCapacity){
		  System.out.println("Invoking login using :productName"+productName+ "and fuelCapacity:"+fuelCapacity);
		  String message=null;
		  if(productName!=null && fuelCapacity!=0.0f){
		     message="searching productName is available: productName"+productName+ "and fuelCapacity:"+fuelCapacity;
			 }
			 return message;
		     }
		public String search(String productName,int rating){
		  System.out.println("Invoking login using :productName"+productName+ "and rating:"+rating);
		  String message=null;
		  if(productName!=null && rating!=0){
		     message="searching productName is available: productName"+productName+ "and rating:"+rating;
			 }
			 return message;
			 }
}