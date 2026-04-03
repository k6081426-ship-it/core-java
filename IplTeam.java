class IplTeam{

     String teamName;
	 int captain;
	 static int wins;
	 String coach;
	 String trophies;
	 int totalPlayers;
	 
	 public IplTeam(){
		 
	 }
	
	 
	 public IplTeam(String teamName,int captain,int wins,String coach,String trophies,int totalPlayers){
	    this.teamName=teamName;
		this.captain=captain;
		this.wins=wins;
		this.coach=coach;
		this.trophies=trophies;
		this.totalPlayers=totalPlayers;
		
	 }
	 
	 public void displayTeamDetails(){
	   System.out.println("teamName:"+teamName);
	   System.out.println("captain:"+captain);
	   System.out.println("wins:"+wins);
	   System.out.println("coach:"+coach);
	   System.out.println("trophies:"+trophies);
	   System.out.println("totalPlayers:"+totalPlayers);
	   
	   
	   }
}