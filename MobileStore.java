class MobileStore{

	public double getMobilePrice(String brand){
		System.out.println("invoking a getMobilePrice:"+brand);
		double price=0.0;
		if("Motorola"==brand){
			price=16000;
		}else if("Samsung"==brand){
			price=18000;
		}else if("Apple"==brand){
			price=140000;
		}else if("Oneplus"==brand){
			price=46999;
		}else if("vivo"==brand){
			price=45860;
		}else if("Redmi"==brand){
			price=998;
		}else if("Oppo"==brand){
			price=678899;
		}else if("Iphone"==brand){
			price=15899;
		}else if("Realme"==brand){
			price=16000;
		}else if("Nokia"==brand){
			price=17000;
		}else if("Mi"==brand){
			price=16000;
		}else{
			price=100000;
		}

		System.out.println("End of getMobilePrice ");
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