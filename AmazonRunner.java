class AmazonRunner{

      public static void main(String []args){
	  
	       System.out.println("-----First Time method call-----");
	       String pavana =Amazon.createAccount("pavana Kr","pavana@gmil.com","pavana_786",9865433175979l);
	       System.out.println(pavana);
	  
	       System.out.println("-----Second Time method call-----");
	       String radha =Amazon.createAccount("radha pr","radha@723","radha_198",9823537452536l);
	       System.out.println(radha);
	    }
}
	  