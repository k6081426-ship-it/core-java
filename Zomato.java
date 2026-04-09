class Zomato{

	public double getPriceByFoodName(String foodName){
		System.out.println("invoking a getPriceByFoodName:"+foodName);
		double price=0.0;
		if("Idli"==foodName){
			price=80.97;
		}else if("Poori"==foodName){
			price=130.36;
		}else if("upma"==foodName){
			price=30;
		}else if("Rava Dosa"==foodName){
			price=45;
		}else if("Set Dosa"==foodName){
			price=46;
		}else if("Rooti"==foodName){
			price=34.65;
		}else if("Fried Rice"==foodName){
			price=67.55;
		}else if("Curd Rice"==foodName){
			price=150;
		}else if("Lemon Rice"==foodName){
			price=168.45;
		}else if("Veg Biryani"==foodName){
			price=179;
		}else if("Mutton Biryani"==foodName){
			price=167;
		}else{
			price=190.5;
		}

		System.out.println("End of getPriceByFoodName ");
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