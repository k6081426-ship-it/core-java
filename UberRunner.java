class UberRunner{
	public static void main(String[] args) {
		Uber ride=new Uber();
		double Price1=ride.getRidePrice("UberPet");
		System.out.println("ridetype Price is:"+Price1);

		double total1=ride.getTotalAmountByPriceAndQuantity(Price1,8,6.69f);
		System.out.println("Total price is:"+total1);

		System.out.println("---------------");

		double Price2=ride.getRidePrice("Ubercomfort");
		System.out.println("ridetype  Price is:"+Price2);

		double total2=ride.getTotalAmountByPriceAndQuantity(Price2,9,74.50f);
		System.out.println("Total price is:"+total2);

		System.out.println("---------------");

		
		double Price3=ride.getRidePrice("UberPool");
		System.out.println("ridetype  Price is:"+Price3);

		double total3=ride.getTotalAmountByPriceAndQuantity(Price3,6,56.59f);
		System.out.println("Total price is:"+total3);

		System.out.println("---------------");

		
		double Price4=ride.getRidePrice("UberLux");
		System.out.println("ridetype Price is:"+Price4);

		double total4=ride.getTotalAmountByPriceAndQuantity(Price4,2,52.8f);
		System.out.println("Total price is:"+total4);

		System.out.println("---------------");

		
		double Price5=ride.getRidePrice("UberGreen");
		System.out.println("ridetype Price is:"+Price3);

		double total5=ride.getTotalAmountByPriceAndQuantity(Price5,1,5.66f);
		System.out.println("Total price is:"+total5);
		
	}


}