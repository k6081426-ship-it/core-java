class TvDetails{

     static byte hdmiPorts[] = {4,7,9,7,8,6,5,4,6,5,2,4,5,6,3};
     static String brand[] = {"Samsung","LG","Sony","Panasonic","Toshiba","Philips","Sharp","Haier","Oneplus","Realme","Mi","Vu","Kodak","Thomson","Hisense"};
     static boolean smartTV[] = {true,false,true,false,true,true,false,true,false,true,false,false,true,true,false};
	 static short warrantlyyear[] = {1,4,7,8,9,7,5,7,2,4,3,6,7,9,4};
	 
	 public static void main(String[] args){
	 
	 for(int i=0;i<15;i++){
	 System.out.println(hdmiPorts[i]);
	 }
	 System.out.println();
	 
	 for(int i=0;i<15;i++){
	 System.out.println(brand[i]);
	 }
	 System.out.println();
	 
	 for(int i=0;i<15;i++){
	 System.out.println(smartTV[i]);
	 }
	 System.out.println();
	 
	 for(int i=0;i<15;i++){
	 System.out.println(warrantlyyear[i]);
	 }
	 System.out.println();
	 
	 }
	 }
  