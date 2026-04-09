class ZomatoRunner{
	public static void main(String[] args) {
		Zomato ZomatoApp=new Zomato();
		double foodPrice=ZomatoApp.getPriceByFoodName("upma");
		System.out.println("Food Price is:"+foodPrice);

		double totalFoodPrice=ZomatoApp.getTotalAmountByPriceAndQuantity(foodPrice,3,6.4f);
		System.out.println("Total price is:"+totalFoodPrice);

		System.out.println("---------------");

		double foodPrices=ZomatoApp.getPriceByFoodName("Rooti");
		System.out.println("Food Price is:"+foodPrices);

		double totalFoodPrices=ZomatoApp.getTotalAmountByPriceAndQuantity(foodPrice,3,7.7f);
		System.out.println("Total price is:"+totalFoodPrices);

		System.out.println("---------------");

		
		double foodPric=ZomatoApp.getPriceByFoodName("Lemon");
		System.out.println("Food Price is:"+foodPric);

		double totalFoodPric=ZomatoApp.getTotalAmountByPriceAndQuantity(foodPrice,4,4.9f);
		System.out.println("Total price is:"+totalFoodPric);

		System.out.println("---------------");

		
		double food=ZomatoApp.getPriceByFoodName("Rava Dosa");
		System.out.println("Food Price is:"+food);

		double totalFood=ZomatoApp.getTotalAmountByPriceAndQuantity(foodPrice,3,5.4f);
		System.out.println("Total price is:"+totalFood);

		System.out.println("---------------");

		
		double prices=ZomatoApp.getPriceByFoodName("Veg Biryani");
		System.out.println("Food Price is:"+prices);

		double totalPrices=ZomatoApp.getTotalAmountByPriceAndQuantity(foodPrice,6,67f);
		System.out.println("Total price is:"+totalPrices);
		
	}


}