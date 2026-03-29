class CarDetails{

    static String CarNames[] = {"Swift","Baleno","Venue","Innova","Nexon","City","Verna","Fortuner","Creta","punch"};
    static int modelyear[] = {2005,2006,2007,2008,2009,2010,2011,2012,2013,2014};
    static byte seatcapacity[] = {4,6,5,6,5,6,5,4,4,5};
    static double mileage[] = {90,95,100,105,110,115,120,125,130,135,140,145,150,155,160};

    public static void getCarDetails(){

        for(int i=0;i<CarNames.length;i++){

            System.out.println("CarName:"+CarNames[i]);
            System.out.println("modelyear:"+modelyear[i]);
            System.out.println("seatcapacity:"+seatcapacity[i]);
            System.out.println("mileage:"+mileage[i]);
			}
			}
}