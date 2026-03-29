class ChatsRunner{

      public static void main(String[] args){
	   
	    Chats Chats1=new Chats();
		Chats1.getChatsDetails();
	    Chats1.checkChatsByName("Gobi Manchuri");
	    Chats1.checkChatsByName("Sandwitch");
	    Chats1.checkChatsByName("Fried rice");
	    Chats1.checkChatsByName("Mushroom dry");
		
	  
	    Chats Chats2=new Chats();
		Chats2.checkChatsByName("Vegrole");
	    Chats2.checkChatsByName("Noodles");
	    Chats2.checkChatsByName("Chicken Manchuri");
	    Chats2.checkChatsByName("Crispy Corner");
		

		Chats Chats3=new Chats();
		Chats3.checkChatsByName("Panner eggrice");
	    Chats3.checkChatsByName("Egg rice");
	    Chats3.checkChatsByName("Masalpoori");
	    Chats3.checkChatsByName("Cofee");
		
	    Chats Chats4=new Chats();
	    Chats4.checkChatsByName("Noodles");
	    Chats4.checkChatsByName("Gobi Manchuri");
	    Chats4.checkChatsByName("Vegrole");
	    Chats4.checkChatsByName("Mushroom Biryani");
		
		Chats Chats5=new Chats();
		Chats5.checkChatsByName("Gobi rice");
	    Chats5.checkChatsByName("Masalpoori");
	    Chats5.checkChatsByName("Fried rice");
	    Chats5.checkChatsByName("Mushroom Fry");

	  }
}