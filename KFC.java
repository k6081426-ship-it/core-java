class KFC{

	public double getPriceByItemName(String ItemName){
		System.out.println("invoking a getPriceByItemName:"+ItemName);
		double price=0.0;
		if("Chicken Bucket"==ItemName){
			price=258;
		}else if("Chicken Popcorn"==ItemName){
			price=658;
		}else if("Zinger Burgar "==ItemName){
			price=908;
		}else if("Pepsi"==ItemName){
			price=899;
		}else if("Krushers"==ItemName){
			price=458;
		}else if("Hot wings"==ItemName){
			price=999;
		}else if("Chicken Roll"==ItemName){
			price=678;
		}else if("French Fries"==ItemName){
			price=158;
		}else if("Veg Burgar"==ItemName){
			price=1690;
		}else if("Chicken Strips"==ItemName){
			price=1768;
		}else if("Zinger combo"==ItemName){
			price=1650;
		}else{
			price=12999;
		}

		System.out.println("End of getPriceByItemName ");
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