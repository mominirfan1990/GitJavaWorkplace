
public class WebApp 
{
  
	public static void main(String[] args)
	{
		ChatRoom u1= new ChatRoom("user123" , "ASD@123");
		ChatRoom u2= new ChatRoom("user143" , "QWE@143");
		
		ChatRoom.getUserCount();
		

		ChatRoom u3= new ChatRoom("user343" , "asc@563");
		ChatRoom u4= new ChatRoom("user563" , "kjh@873");
		
		u3.getUserCount();   // dont call static method by object
		
		u3.userinfo();
		
	}
}
