class Flipkart {

    public static String Register(String email,String password,long mobileNumber,String userName){ 
	    System.out.println("Flipkart Register method is started");
		String registerStatus= null;

        if(email != null && password != null && mobileNumber != 0 && userName !=null){

            if(email.contains("@") && password.length()>4 && userName.length()>4){

               registerStatus  ="Welcome "+userName+" Flipkart account created successfully";

            } else {
				
              registerStatus  = "please check the length of userName,email,password";
            }

        } else {
            registerStatus = "please enter the validate Data";
        }

        System.out.println("Flipkart Register method is ended");

        return registerStatus;
    }
}