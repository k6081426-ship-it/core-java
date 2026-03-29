class FanDetails{

    static String fanNames[] = {"Usha Ceiling","Orient Electric","Cromption Highspeed","Bajaj Maxima","Atomberg Smart","Luminous Ceiling","Panasonic Table","V-guard Pedestal","Wagon R","Toyota Tiago"};
    static float price[] = {4500,6000,7800,12700,14500,2000,4500,6700,8967,98700};
    static byte bladecount[] = {4,6,5,6,5,6,5,4,4,5};
    static double powerconsumption[] = {75.5,98.6,86.5,76.5,23.5,65,5,75.8,44.3,12.5,16,5};

    public static void getFanDetails(){

        for(int i=0;i<fanNames.length;i++){

            System.out.println("FanName:"+fanNames[i]);
            System.out.println("price:"+price[i]);
            System.out.println("bladecount:"+bladecount[i]);
            System.out.println("powerconsumption:"+powerconsumption[i]);
			}
			}
}