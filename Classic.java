class EarphoneDetails{

     static short warrantlymonth[]={12,4,5,7,13,15,18,7,9,7};
	 static int modelyear[]={2005,2006,2007,2008,2009,2010,2011,2012,2013,2014};
	 static float price[]={82000.25f,34000.56f,76988.90f,44300.87f,77000.74f,66899.21f,24500.54f,65466.34f,98765.87f,44399.50f};
	 static double batterylife[]={75.5,98.6,86.5,76.5,23.5,65,5,75.8,44.3,12.5,16.5};
	 
	 public static void main getEarphoneDetails(){
	 
	 for(int i=0;i<ClassicNames.length;i++){
	 System.out.println("warrantlymonth:"+warrantlymonth[i]);
	 System.out.println("modelyear:"+modelyear[i]);
	 System.out.println("price:"+price[i]);
	 System.out.println("batterylife:"+batterylife[i]);
	 }
	 }
	 }