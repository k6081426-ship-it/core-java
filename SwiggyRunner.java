class SwiggyRunner{

      public static void main(String []args){
	   Swiggy order=new Swiggy();
	  
	   boolean login=order.login("keerthi","Keerthi@123");
	   System.out.println(login);
	   
	   String result=order.login(9763290086653l,898987);
	   System.out.println(result);
	   
	   String msg=order.search("Masala Dosa");
	   System.out.println(msg);
	    
       String message=order.search("Masala Dosa",true);
	   System.out.println(message);
	   
	   String messages=order.search("Masala Dosa",120.50,2);
	   System.out.println(messages);
	   
	   String results=order.search("Masala Dosa","Udupi");
	   System.out.println(results);
	   
	   String result2=order.search("Masala Dosa",4.5f);
	   System.out.println(result2);
	   
	   
	  }
	   
	   
	   
	   
	   
	   
	   
	  
	  
	  
}