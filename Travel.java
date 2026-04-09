class Travel {

    public double getPriceByDestination(String destination) {
        System.out.println("Invoking getPriceByDestination: " + destination);
        double price = 0.0;

        if ("Goa"==destination){
            price = 5000;
        } else if ("Delhi"==destination) {
            price = 7000;
        } else if ("Mumbai"==destination) {
            price = 6000;
        } else if ("Kerala"==destination) {
            price = 8000;
        } else if ("Bangalore"==destination) {
            price = 3000;
        } else if ("Chennai"==destination) {
            price = 3500;
        } else if ("Hyderabad"==destination) {
            price = 4000;
		} else if ("Mandya"==destination) {
            price = 60;
		} else if ("Maddur"==destination) {
            price = 40;
		} else if ("Mysore"==destination) {
            price = 80;
        } else {
            price = 0.0;
        }

        System.out.println("End of getPriceByDestination");
        return price;
    }

    public double getTotalAmount(double price, int persons, float discount) {
        System.out.println("Invoking getTotalAmount");

        double total = price * persons;
        double discountAmount = total * (discount / 100);
        total = total - discountAmount;

        System.out.println("End of getTotalAmount");
        return total;
    }
}