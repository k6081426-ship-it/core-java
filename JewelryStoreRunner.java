class JewelryStoreRunner{
	public static void main(String[] args) {
		JewelryStore store=new JewelryStore();
		double Price1=store.getJewelryPrice("Gold Ring");
		System.out.println("item Price is:"+Price1);

		double total1=store.getTotalAmountByPriceAndQuantity(Price1,8,6.99f);
		System.out.println("Total price is:"+total1);

		System.out.println("---------------");

		double Price2=store.getJewelryPrice("Silver Ring");
		System.out.println("item  Price is:"+Price2);

		double total2=store.getTotalAmountByPriceAndQuantity(Price2,9,74.88f);
		System.out.println("Total price is:"+total2);

		System.out.println("---------------");

		
		double Price3=store.getJewelryPrice("Gold Earrings");
		System.out.println("item  Price is:"+Price3);

		double total3=store.getTotalAmountByPriceAndQuantity(Price3,6,49.59f);
		System.out.println("Total price is:"+total3);

		System.out.println("---------------");

		
		double Price4=store.getJewelryPrice("Diamond Ring");
		System.out.println("item Price is:"+Price4);

		double total4=store.getTotalAmountByPriceAndQuantity(Price4,2,59.8f);
		System.out.println("Total price is:"+total4);

		System.out.println("---------------");

		
		double Price5=store.getJewelryPrice("Platinum Ring");
		System.out.println("item Price is:"+Price3);

		double total5=store.getTotalAmountByPriceAndQuantity(Price5,1,65.66f);
		System.out.println("Total price is:"+total5);
		
	}


}