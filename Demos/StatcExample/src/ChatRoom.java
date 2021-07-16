
public class ChatRoom 
{
	String username, passward;
	static int count;
	
	public ChatRoom()
	{
		username = " ";
		passward = "";
		count++;
	}
	
	public ChatRoom(String u, String p)
	{
		username = u;
		passward = p;
		count++;
	}
	
	public static void getUserCount()    // also write as static public void
	{
		System.out.println("No. of users in chat room "+ count);
	}
	
	public void userinfo()
	{
		System.out.println("Yser name ::" + username);
		System.out.println("User passward is Secured");
		System.out.println("No. of users in chat room are ::"+ count);
	}
	
	
}
