class HeroXpulse{

     static String name[]={"Ola Roadster X","Hero xpulse","yamaha R15","Bajaj pulsar","Ktm Duke","Ather 450x","Honda Shine","RoyalEnfield","TVS Apache","BMW","Jawa 42","Ducati Monster","Roadster Go","Harely Davidson","Ather Rizta"};
     static byte gears[]={1,3,6,8,4,5,8,2,9,8,7,4,2,1,6};
     static float price[]={15000,16000,86000,98760,65409,1350000,120000,98700,17000,76900,76500,12400,98500,14500,87000};
	 static double Milage[]={90,95,100,105,110,115,120,125,130,135,140,145,150,155,160};
	 
	 public static void main(String[] args){
	 
	 for(int i=0;i<15;i++){
	 System.out.println(name[i]);
	 }
	 System.out.println();
	 
	 for(int i=0;i<15;i++){
	 System.out.println(gears[i]);
	 }
	 System.out.println();
	 
	 for(int i=0;i<15;i++){
	 System.out.println(price[i]);
	 }
	 System.out.println();
	 
	 for(int i=0;i<15;i++){
	 System.out.println(Milage[i]);
	 }
	 System.out.println();
	 
	 }
	 }