class Dominos{

	public double getPriceByPizza(String pizza){
		System.out.println("invoking a getPriceByPizza:"+pizza);
		double price=0.0;
		if("Fridge"==pizza){
			price=160.9;
		}else if("Margherita"==pizza){
			price=180.7;
		}else if("Mushroom"==pizza){
			price=140.9;
		}else if("Farmhouse"==pizza){
			price=469;
		}else if("Pepperoni"==pizza){
			price=458;
		}else if("Tandoori"==pizza){
			price=998;
		}else if("Garlic"==pizza){
			price=6780;
		}else if("Thin Crust"==pizza){
			price=1580;
		}else if("Corn"==pizza){
			price=1690;
		}else if("Spicy Chicken"==pizza){
			price=1768;
		}else if("Supreme"==pizza){
			price=1650;
		}else{
			price=1299;
		}

		System.out.println("End of getPriceByPizza ");
		return price;
	}

	public double getTotalAmountByPriceAndQuantity(double price, int quantity, float discount) {
    System.out.println("Invoking a getTotalAmountByPriceAndQuantity");

    double totalPrice = price * quantity;

    double discountAmount = totalPrice * (discount / 100);
    totalPrice = totalPrice - discountAmount;

    System.out.println("End of the getTotalAmountByPriceAndQuantity");

    return totalPrice;

	}
}