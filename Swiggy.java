class Swiggy{

	public double getPriceByFoodName(String foodName){
		System.out.println("invoking a getPriceByFoodName:"+foodName);
		double price=0.0;
		if("Burger"==foodName){
			price=80.87;
		}else if("Pizza"==foodName){
			price=130.43;
		}else if("Plain dosa"==foodName){
			price=90;
		}else if("Fries"==foodName){
			price=40;
		}else if("Sandwich"==foodName){
			price=45;
		}else if("Poori"==foodName){
			price=90.65;
		}else if("Chapathi"==foodName){
			price=65.55;
		}else if(""==foodName){
			price=159;
		}else if("Veg meal"==foodName){
			price=169.45;
		}else if("Noodles"==foodName){
			price=170;
		}else if("cold coffe"==foodName){
			price=160;
		}else{
			price=160.5;
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