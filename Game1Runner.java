class Game1Runner{

    public static void main(String []args){
	
	  Game1 g1=new Game1("The Legend of Zelda", "Switch", 2017, 9.5f, 59.99, 1);
	  g1.displayGameDetails();
	
	  Game1 g2=new Game1("Call of Duty", "PS5", 2022, 8.8f, 69.99, 12);
	  g2.displayGameDetails();
	 
	  Game1 g3=new Game1("Grim God of War", "PS4", 2018, 9.7f, 49.99, 1);
	  g3.displayGameDetails();
	
	  Game1 g4=new Game1("FIFA 23", "Xbox", 2022, 8.5f, 69.99, 4);
	  g4.displayGameDetails();
	
	  Game1 g5=new Game1("League of Legends", "PC", 2009, 8.8f, 0.0, 10);
	  g5.displayGameDetails();
	
	  Game1 g6=new Game1("Fortnite", "PS4", 2020, 9.3f, 49.99, 1);
      g6.displayGameDetails();
	
	  Game1 g7=new Game1("Rocket League", "PS5", 2015, 8.6f, 19.99, 4);
      g7.displayGameDetails();
	
	  Game1 g8=new Game1("Stardew Valley", "Switch", 2016, 9.2f, 29.99, 4);
	  g8.displayGameDetails();
	
	  Game1 g9=new Game1("Valorant", "PC", 2020, 8.9f, 0.0, 10);
      g9.displayGameDetails();
	
	  Game1 g10=new Game1("Hollow Knight", "PC", 2017, 9.4f, 14.99, 1);
      g10.displayGameDetails();
	
	}
}