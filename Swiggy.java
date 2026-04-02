class Swiggy{

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
				
	public String search(String foodItem){
	       System.out.println("Invoking search by foodItem:"+foodItem);
	             String message=null;
	
	            if(foodItem!=null){
	            message="searching foodItem is Available ";
		    }
		  return message;
		  }
		  
		  
		  public String search(String foodItem,boolean isDelivered){
		  System.out.println("Invoking search by foodItem :"+foodItem+ "and isDelivered :"+isDelivered);
		  String meassage=null;
		  if(foodItem!=null && isDelivered!=false){
		     meassage="searching foodItem is available foodItem : "+foodItem+ "and isDelivered:"+isDelivered;
			 }
			 return meassage;
			 }
			 
	 public String search(String foodItem,double price,int quantity){
		  System.out.println("Invoking login using :foodItem"+foodItem+ "and price :"+price+" and quantity:"+quantity);
		  String message=null;
		  if(foodItem!=null && price!=0.0 && quantity!=0){
		     message="searching foodItem is available: foodItem"+foodItem+ "and price :"+price+" and quantity:"+quantity;
			 }
			 return message;
			 }
			
		public String search(String foodItem,String restaurantName){
		  System.out.println("Invoking login using :foodItem"+foodItem+ "and restaurantName:"+restaurantName);
		  String message=null;
		  if(foodItem!=null && restaurantName!=null){
		     message="searching foodItem is available: foodItem"+foodItem+ "and restaurantName:"+restaurantName;
			 }
			 return message;
		     }
		public String search(String foodItem,float rating){
		  System.out.println("Invoking login using :foodItem"+foodItem+ "and rating:"+rating);
		  String message=null;
		  if(foodItem!=null && rating!=0.0f){
		     message="searching foodItem is available: foodItem"+foodItem+ "and rating:"+rating;
			 }
			 return message;
			 }
}