class RcbPlayer{

     String playerName;
	 int playerId;
	 static int age;
	 double strikeRate;
	 String role;
	 String country;
	 
	 public RcbPlayer(){
		 
	 }
	
	 
	 public RcbPlayer(String playerName,int playerId,int age,double strikeRate,String role,String country){
	    this.playerName=playerName;
		this.playerId=playerId;
		this.age=age;
		this.strikeRate=strikeRate;
		this.role=role;
		this.country=country;
		
	 }
	 
	 public void displayPlayerDetails(){
	   System.out.println("playerName:"+playerName);
	   System.out.println("playerId:"+playerId);
	   System.out.println("age:"+age);
	   System.out.println("strikeRate:"+strikeRate);
	   System.out.println("role:"+role);
	   System.out.println("country:"+country);
	   
	   
	   }
}