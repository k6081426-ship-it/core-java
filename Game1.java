class Game1{

     String title;        
     String platform;       
     static int releaseYear;
     float rating;    
	 double price;
	 int players;
	 
	 
	 public Game1(){
		 
	 }
	
	 
	 public Game1(String title,String platform,int releaseYear,float rating,double price,int players){
	    this.title=title;
		this.platform=platform;
		this.releaseYear=releaseYear;
		this.rating=rating;
		this.price=price;
		this.players=players;
		
	 }
	 
	 public void displayGameDetails(){
	   System.out.println("title:"+title);
	   System.out.println("platform:"+platform);
	   System.out.println("releaseYear:"+releaseYear);
	   System.out.println("rating:"+rating);
	   System.out.println("price:"+price);
	   System.out.println("players:"+players);
	   
	   
	   }
}