class JuiceMenuRunner{

      public static void main(String[] args){
	   
	    JuiceMenu NaturalJuiceCenter=new JuiceMenu();
		NaturalJuiceCenter.getJuiceMenuDetails();
	    NaturalJuiceCenter.checkJuiceByName("Papaya");
	    NaturalJuiceCenter.checkJuiceByName("Mango");
	    NaturalJuiceCenter.checkJuiceByName("Grapes");
	    NaturalJuiceCenter.checkJuiceByName("Orange");
	  
		
		JuiceMenu FreshSip=new JuiceMenu();
		FreshSip.checkJuiceByName("Orange");
	    FreshSip.checkJuiceByName("Banana");
	    FreshSip.checkJuiceByName("Apple Boost");
	    FreshSip.checkJuiceByName("Grapes");
	  
		
		JuiceMenu JuiceParadise=new JuiceMenu();
		JuiceParadise.checkJuiceByName("Pomegranate");
	    JuiceParadise.checkJuiceByName("Sweet lemon");
	    JuiceParadise.checkJuiceByName("Fruit Punch");
	    JuiceParadise.checkJuiceByName("Mixed Fruit");
		
		JuiceMenu TastyJuice=new JuiceMenu();
		TastyJuice.checkJuiceByName("Papaya");
	    TastyJuice.checkJuiceByName("Orange");
	    TastyJuice.checkJuiceByName("Berryblast");
	    TastyJuice.checkJuiceByName("Apple");
		
		JuiceMenu HealthyJuice=new JuiceMenu();
		HealthyJuice.checkJuiceByName("Fruit Punch");
	    HealthyJuice.checkJuiceByName("Fruity Fusion");
	    HealthyJuice.checkJuiceByName("Grapes");
	    HealthyJuice.checkJuiceByName("Liquid Fresh");
		
	

	 
	  }
}