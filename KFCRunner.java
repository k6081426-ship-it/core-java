class KFCRunner{
	public static void main(String[] args) {
		KFC item=new KFC();
		double Price1=item.getPriceByItemName("Pepsi");
		System.out.println("Item Price is:"+Price1);

		double total1=item.getTotalAmountByPriceAndQuantity(Price1,9,6.9f);
		System.out.println("Total price is:"+total1);

		System.out.println("---------------");

		double Price2=item.getPriceByItemName("Krushers");
		System.out.println("Item  Price is:"+Price2);

		double total2=item.getTotalAmountByPriceAndQuantity(Price2,7,77.8f);
		System.out.println("Total price is:"+total2);

		System.out.println("---------------");

		
		double Price3=item.getPriceByItemName("Chicken Strips");
		System.out.println("Item  Price is:"+Price3);

		double total3=item.getTotalAmountByPriceAndQuantity(Price3,3,47.5f);
		System.out.println("Total price is:"+total3);

		System.out.println("---------------");

		
		double Price4=item.getPriceByItemName("Chicken Popcorn");
		System.out.println("Item Price is:"+Price4);

		double total4=item.getTotalAmountByPriceAndQuantity(Price4,2,59.8f);
		System.out.println("Total price is:"+total4);

		System.out.println("---------------");

		
		double Price5=item.getPriceByItemName("French Fries");
		System.out.println("Item Price is:"+Price3);

		double total5=item.getTotalAmountByPriceAndQuantity(Price5,1,60.7f);
		System.out.println("Total price is:"+total5);
		
	}


}