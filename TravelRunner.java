class TravelRunner {
    public static void main(String[] args) {

        Travel travel = new Travel();

        double price1 = travel.getPriceByDestination("Goa");
        System.out.println("Ticket Price: " + price1);
        double total1 = travel.getTotalAmount(price1, 2, 10f);
        System.out.println("Total Price: " + total1);

        System.out.println("---------------");

        double price2 = travel.getPriceByDestination("Delhi");
        System.out.println("Ticket Price: " + price2);
        double total2 = travel.getTotalAmount(price2, 3, 5f);
        System.out.println("Total Price: " + total2);

        System.out.println("---------------");

        double price3 = travel.getPriceByDestination("Kerala");
        System.out.println("Ticket Price: " + price3);
        double total3 = travel.getTotalAmount(price3, 1, 15f);
        System.out.println("Total Price: " + total3);
		
		 System.out.println("---------------");

        double price4 = travel.getPriceByDestination("Mandya");
        System.out.println("Ticket Price: " + price4);
        double total4 = travel.getTotalAmount(price4, 1, 15f);
        System.out.println("Total Price: " + total4);
		
		 System.out.println("---------------");

        double price5 = travel.getPriceByDestination("Mysore");
        System.out.println("Ticket Price: " + price5);
        double total5= travel.getTotalAmount(price5, 1, 15f);
        System.out.println("Total Price: " + total5);
    }
}