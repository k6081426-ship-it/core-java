class BikeDetails{

    static String BikeNames[] = {"ktmduke200","TVS Raider","Pulsar NS200","HeroXpulse","Suzuki Gixxer","Bajaj Platina","Honda Shine","RoyalEnfield","Honda Unicorn","Jawa 42"};
    static int modelyear[] = {2005,2006,2007,2008,2009,2010,2011,2012,2013,2014};
    static byte gear[] = {4,6,5,6,5,6,5,4,4,5};
    static char colourcode[] = {'A','C','B','R','E','O','P','F','K','L'};

    public static void getBikeDetails(){

        for(int i=0;i<BikeNames.length;i++){

            System.out.println("Bike Name:"+BikeNames[i]);
            System.out.println("modelyear:"+modelyear[i]);
            System.out.println("gear:"+gear[i]);
            System.out.println("colourcode:"+colourcode[i]);
			}
			}
}