class Flipkart{

	public double getPriceByItemName(String ItemName){
		System.out.println("invoking a getPriceByItemName:"+ItemName);
		double price=0.0;
		if("Fridge"==ItemName){
			price=80000;
		}else if("Tv"==ItemName){
			price=65888;
		}else if("Washing Machine"==ItemName){
			price=90888;
		}else if("Camera"==ItemName){
			price=46789;
		}else if("Monitor"==ItemName){
			price=45800;
		}else if("Speaker"==ItemName){
			price=99867;
		}else if("Iron Box"==ItemName){
			price=67800;
		}else if("Shirt"==ItemName){
			price=15800;
		}else if("Saree"==ItemName){
			price=169000;
		}else if("Kurti"==ItemName){
			price=176888;
		}else if("Jeans"==ItemName){
			price=16500;
		}else{
			price=129999;
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