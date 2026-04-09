class Uber{

	public double getRidePrice(String rideType){
		System.out.println("invoking a getRidePrice:"+rideType);
		double price=0.0;
		if("Uberx"==rideType){
			price=16999;
		}else if("Uberxl"==rideType){
			price=18969;
		}else if("UberGreen"==rideType){
			price=14989;
		}else if("Ubertaxi"==rideType){
			price=48699;
		}else if("UberPet"==rideType){
			price=77847;
		}else if("UberBlack"==rideType){
			price=14998;
		}else if("Ubercomfort"==rideType){
			price=6780;
		}else if("UberWav"==rideType){
			price=15780;
		}else if("UberPool"==rideType){
			price=16790;
		}else if("UberLux"==rideType){
			price=17968;
		}else if("UberElectric"==rideType){
			price=16850;
		}else{
			price=22567;
		}

		System.out.println("End of getRidePrice ");
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