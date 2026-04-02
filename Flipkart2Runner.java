class Flipkart2Runner{

      public static void main(String []args){
	  Flipkart app=new Flipkart();
	  
	   boolean login=app.login("keerthi","Keerthi@123");
	   System.out.println(login);
	   
	   String result=app.login(9763290086653l,898987);
	   System.out.println(result);
	   
	   String msg=app.search("Iphone17pro");
	   System.out.println(msg);
	    
       String message=app.search("Iphone17pro",256);
	   System.out.println(message);
	   
	   String messages=app.search("Iphone17pro",true,50000.50);
	   System.out.println(messages);
	   
	   String results=app.search("Iphone17pro",6.3f);
	   System.out.println(results);
	   
	   String result2=app.search("Iphone17pro","snapdragon");
	   System.out.println(result2);
	   
	   
	  }
	   
	   
	   
	   
	   
	   
	   
	  
	  
	  
}