class VegMenuRunner{

      public static void main(String[] Food){
	   
	    VegMenu v1=new VegMenu();
		v1.getVegMenuDetails();
	    v1.checkFoodByFoodName("Vada");
	    v1.checkFoodByFoodName("Chapathi");
	    v1.checkFoodByFoodName("Pongal");
	    v1.checkFoodByFoodName("Aloo gobi");
		
	  
		VegMenu v2=new VegMenu();
		v2.checkFoodByFoodName("Pongal");
	    v2.checkFoodByFoodName("poori");
	    v2.checkFoodByFoodName("Masala Dosa");
	    v2.checkFoodByFoodName("Veg kurma");
		

	  
		VegMenu v3=new VegMenu();
		v3.checkFoodByFoodName("Fried Rice");
	    v3.checkFoodByFoodName("Dosa");
	    v3.checkFoodByFoodName("Upma");
	    v3.checkFoodByFoodName("Vada");
		
	    VegMenu v4=new VegMenu();
	    v4.checkFoodByFoodName("Masala Dosa");
	    v4.checkFoodByFoodName("Upma");
	    v4.checkFoodByFoodName("Fried Rice");
	    v4.checkFoodByFoodName("vegetable samber");
		
		VegMenu v5=new VegMenu();
		v5.checkFoodByFoodName("Roti");
	    v5.checkFoodByFoodName("Pongal");
	    v5.checkFoodByFoodName("Veg Biryani");
	    v5.checkFoodByFoodName("Rava Dosa");

	  }
}