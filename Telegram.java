class Telegram{

    public static String Register(String name,String email,String password,long mobileNumber){

        System.out.println("Telegram Register method is started");

        String registerStatus = null;

        if(name != null && email != null && password != null && mobileNumber != 0){

            if(password.length()>4 && name.length()>4){
                registerStatus = "Hello " + name + " Telegram Account Created";
            }
            else{
                registerStatus = "please check the length of password,name";
            }

        }
        else{
            registerStatus = "Please enter validate data";
        }

        System.out.println("Telegram Register method is ended");

        return registerStatus;
    }
}