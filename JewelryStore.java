class JewelryStore{

	public double getJewelryPrice(String item){
		System.out.println("invoking a getJewelryPrice:"+item);
		double price=0.0;
		if("Gold Ring"==item){
			price=16999;
		}else if("Silver Ring"==item){
			price=18997;
		}else if(""==item){
			price=14900;
		}else if("Gold Necklace"==item){
			price=48695;
		}else if("Silver Necklace"==item){
			price=77458;
		}else if("Gold Earrings"==item){
			price=14998;
		}else if("Silver Anklet"==item){
			price=6780;
		}else if("Silver Bracelet"==item){
			price=15780;
		}else if("Silver chain"==item){
			price=16790;
		}else if("Diamond Ring"==item){
			price=17968;
		}else if("Platinum Ring"==item){
			price=16850;
		}else{
			price=22567;
		}

		System.out.println("End of getJewelryPrice ");
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