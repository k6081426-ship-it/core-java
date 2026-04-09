class FlipkartRunner{
	public static void main(String[] args) {
		Flipkart App=new Flipkart();
		double ItemPrice=App.getPriceByItemName("Camera");
		System.out.println("Item Price is:"+ItemPrice);

		double totalItemPrice=App.getTotalAmountByPriceAndQuantity(ItemPrice,3,6.4f);
		System.out.println("Total price is:"+totalItemPrice);

		System.out.println("---------------");

		double ItemPrices=App.getPriceByItemName("Tv");
		System.out.println("Item  Price is:"+ItemPrices);

		double totalItemPrices=App.getTotalAmountByPriceAndQuantity(ItemPrice,3,7.7f);
		System.out.println("Total price is:"+totalItemPrices);

		System.out.println("---------------");

		
		double ItemPric=App.getPriceByItemName("Iron Box");
		System.out.println("Item  Price is:"+ItemPric);

		double totalItemPric=App.getTotalAmountByPriceAndQuantity(ItemPrice,4,4.9f);
		System.out.println("Total price is:"+totalItemPric);

		System.out.println("---------------");

		
		double Item=App.getPriceByItemName("Kurti");
		System.out.println("Item Price is:"+Item);

		double totalItem=App.getTotalAmountByPriceAndQuantity(ItemPrice,3,5.4f);
		System.out.println("Total price is:"+totalItem);

		System.out.println("---------------");

		
		double prices=App.getPriceByItemName("Jeans");
		System.out.println("Item Price is:"+prices);

		double totalPrices=App.getTotalAmountByPriceAndQuantity(ItemPrice,6,67f);
		System.out.println("Total price is:"+totalPrices);
		
	}


}