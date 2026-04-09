class DominosRunner{
	public static void main(String[] args) {
		Dominos d=new Dominos();
		double Price1=d.getPriceByPizza("Garlic");
		System.out.println("pizza Price is:"+Price1);

		double total1=d.getTotalAmountByPriceAndQuantity(Price1,7,6.7f);
		System.out.println("Total price is:"+total1);

		System.out.println("---------------");

		double Price2=d.getPriceByPizza("Corn");
		System.out.println("pizza  Price is:"+Price2);

		double total2=d.getTotalAmountByPriceAndQuantity(Price2,9,7.8f);
		System.out.println("Total price is:"+total2);

		System.out.println("---------------");

		
		double Price3=d.getPriceByPizza("Thin Crust");
		System.out.println("pizza  Price is:"+Price3);

		double total3=d.getTotalAmountByPriceAndQuantity(Price3,4,4.5f);
		System.out.println("Total price is:"+total3);

		System.out.println("---------------");

		
		double Price4=d.getPriceByPizza("Tandoori");
		System.out.println("pizza Price is:"+Price4);

		double total4=d.getTotalAmountByPriceAndQuantity(Price4,8,5.8f);
		System.out.println("Total price is:"+total4);

		System.out.println("---------------");

		
		double Price5=d.getPriceByPizza("Supreme");
		System.out.println("pizza Price is:"+Price3);

		double total5=d.getTotalAmountByPriceAndQuantity(Price5,9,6.67f);
		System.out.println("Total price is:"+total5);
		
	}


}