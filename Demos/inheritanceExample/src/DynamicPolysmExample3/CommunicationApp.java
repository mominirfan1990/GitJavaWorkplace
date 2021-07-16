package DynamicPolysmExample3;
import java.util.Scanner;
public class CommunicationApp 
{

	public static void main(String[] args) 
	{
		
		Communication cc=null;
	    	cc= new PostalCommunication();
	    	cc.communicate("Via post");
	    	cc.message();
	    	
	    	    
	}

}
