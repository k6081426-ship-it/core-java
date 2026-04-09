class MobileStoreRunner{
	public static void main(String[] args) {
		MobileStore phone=new MobileStore();
		double Price1=phone.getMobilePrice("Oneplus");
		System.out.println("brand Price is:"+Price1);

		double total1=phone.getTotalAmountByPriceAndQuantity(Price1,8,6.9f);
		System.out.println("Total price is:"+total1);

		System.out.println("---------------");

		double Price2=phone.getMobilePrice("Oneplus");
		System.out.println("brand  Price is:"+Price2);

		double total2=phone.getTotalAmountByPriceAndQuantity(Price2,2,74.8f);
		System.out.println("Total price is:"+total2);

		System.out.println("---------------");

		
		double Price3=phone.getMobilePrice("Iphone");
		System.out.println("brand  Price is:"+Price3);

		double total3=phone.getTotalAmountByPriceAndQuantity(Price3,3,47.5f);
		System.out.println("Total price is:"+total3);

		System.out.println("---------------");

		
		double Price4=phone.getMobilePrice("Realme");
		System.out.println("brand Price is:"+Price4);

		double total4=phone.getTotalAmountByPriceAndQuantity(Price4,8,59.8f);
		System.out.println("Total price is:"+total4);

		System.out.println("---------------");

		
		double Price5=phone.getMobilePrice("Mi");
		System.out.println("brand Price is:"+Price3);

		double total5=phone.getTotalAmountByPriceAndQuantity(Price5,9,66.67f);
		System.out.println("Total price is:"+total5);
		
	}


}