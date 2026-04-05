class ClothsRunner{
	public static void main(String[] cloths){
		Cloths.brandName();
		Cloths.price(3000);
		char length = Cloths.size();
		System.out.println(length);
		String color = Cloths.colorOfCloth("White");
		System.out.println(color);
		
		
	}
}