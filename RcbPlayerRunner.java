class RcbPlayerRunner{

    public static void main(String []args){
	
	RcbPlayer player1=new RcbPlayer("Virat kohli",18,30,145.5,"Batsman","India");
	player1.displayPlayerDetails();
	
	RcbPlayer player2=new RcbPlayer("Faf",13,39,140.2,"Batsman","South Africa");
	player2.displayPlayerDetails();
	
	RcbPlayer player3=new RcbPlayer("Maxwell" ,32,34,155.8,"All-Rounder","Australia");
	player3.displayPlayerDetails();
	
	RcbPlayer player4=new RcbPlayer("Mohammed Siraj", 73,23,110.5, "Bowler", "India");
	player4.displayPlayerDetails();
	
	RcbPlayer player5=new RcbPlayer("Dinesh Karthik", 21,35,150.3, "Wicket Keeper", "India");
	player5.displayPlayerDetails();
	
	RcbPlayer player6=new RcbPlayer("Glenn Maxwell", 32,31, 160.4, "All Rounder", "Australia");
    player6.displayPlayerDetails();
	
	RcbPlayer player7=new RcbPlayer("Glenn Maxwell", 32,28,160.4, "All Rounder", "Australia");
    player6.displayPlayerDetails();
	
	RcbPlayer player8=new RcbPlayer("Rajat Patidar", 97,29,152.4, "Batsman", "India");
	player6.displayPlayerDetails();
	
	RcbPlayer player9=new RcbPlayer("Anuj Rawat", 31,25,133.5, "Wicket Keeper", "India");
    player9.displayPlayerDetails();
	
	RcbPlayer player10=new RcbPlayer("Reece Topley", 15,26,120.2, "Bowler", "England");
    player10.displayPlayerDetails();
	
	}
}