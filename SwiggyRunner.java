class SwiggyRunner{
	public static void main(String[] args) {
		Swiggy SwiggyApp=new Swiggy();
		double foodPrice=SwiggyApp.getPriceByFoodName("Burgar");
		System.out.println("Food Price is:"+foodPrice);

		double totalFoodPrice=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,3,6.4f);
		System.out.println("Total price is:"+totalFoodPrice);

		System.out.println("---------------");

		double foodPrices=SwiggyApp.getPriceByFoodName("Fries");
		System.out.println("Food Price is:"+foodPrices);

		double totalFoodPrices=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,3,7.7f);
		System.out.println("Total price is:"+totalFoodPrices);

		System.out.println("---------------");

		
		double foodPric=SwiggyApp.getPriceByFoodName("Veg meal");
		System.out.println("Food Price is:"+foodPric);

		double totalFoodPric=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,4,4.9f);
		System.out.println("Total price is:"+totalFoodPric);

		System.out.println("---------------");

		
		double food=SwiggyApp.getPriceByFoodName("Noodles");
		System.out.println("Food Price is:"+food);

		double totalFood=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,3,5.4f);
		System.out.println("Total price is:"+totalFood);

		System.out.println("---------------");

		
		double prices=SwiggyApp.getPriceByFoodName("Plain dosa");
		System.out.println("Food Price is:"+prices);

		double totalPrices=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,6,67f);
		System.out.println("Total price is:"+totalPrices);
		
	}


}