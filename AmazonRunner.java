class AmazonRunner{

      public static void main(String []args){
	  Amazon a1=new Amazon();
	  
	   boolean login=a1.login("keerthi","Keerthi@123");
	   System.out.println(login);
	   
	   String result=a1.login(9763290086653l,898987);
	   System.out.println(result);
	   
	   String msg=a1.search("KTM");
	   System.out.println(msg);
	    
       String message=a1.search("KTM",12000.8);
	   System.out.println(message);
	   
	   String messages=a1.search("KTM","Black",35);
	   System.out.println(messages);
	   
	   String results=a1.search("KTM",13.8f);
	   System.out.println(results);
	   
	   String result2=a1.search("KTM",5);
	   System.out.println(result2);
	   
	   
	  }
	   
	   
	   
	   
	   
	   
	   
	  
	  
	  
}