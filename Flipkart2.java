class Flipkart2{

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
				
	public String search(String brandName){
	       System.out.println("Invoking search by brandName:"+brandName);
	             String message=null;
	
	            if(brandName!=null){
	            message="searching brandName is Available ";
		    }
		  return message;
		  }
		  
		  
		  public String search(String brandName,int storage){
		  System.out.println("Invoking search by brandName :"+brandName+ "and storage :"+storage);
		  String meassage=null;
		  if(brandName!=null && storage!=0){
		     meassage="searching  is available brandName: "+brandName+ "and storage:"+storage;
			 }
			 return meassage;
			 }
			 
	 public String search(String brandName,boolean emiAvailable,double price){
		  System.out.println("Invoking login using brandName:"+brandName+ "and emiAvailable :"+emiAvailable+" and price:"+price);
		  String message=null;
		  if(brandName!=null &&  emiAvailable!=false && price!=0.0){
		     message="searching brandName is available: brandName"+brandName+ "and emiAvailable :"+emiAvailable+" and price:"+price;
			 }
			 return message;
			 }
			
		public String search(String brandName,float screensize){
		  System.out.println("Invoking login using :brandName"+brandName+ "and screensize:"+screensize);
		  String message=null;
		  if(brandName!=null && screensize!=0.0f){
		     message="searching brandName is available: brandName"+brandName+ "and screensize:"+screensize;
			 }
			 return message;
		     }
		public String search(String brandName,String processor){
		  System.out.println("Invoking login using :brandName"+brandName+ "and processor:"+processor);
		  String message=null;
		  if(brandName!=null && processor!=null){
		     message="searching brandName is available: brandName"+brandName+ "and processor:"+processor;
			 }
			 return message;
			 }
}