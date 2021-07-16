package inht_Multilevel_Example3;

public class Customer extends Hotel
{
	String nameC,mobC;
	int  noAdultC, totalDayC,noChildC;
	
	public void acceptDetailsCust(String custName, String mob,int adultNum,int childNum,int totalDay)
	{
		nameC=custName;
		mobC=mob;
		noAdultC=adultNum;
		noChildC=childNum;
		totalDayC=totalDay;
		
	}
	public void displayDetailsCust()
	{
		System.out.println("Customer details are ");
		System.out.println("Name ::"+nameC+"\n Mobile Number ::"+mobC+"\n Adults ::"+noAdultC+"\n Childs ::"+noChildC+"\n Staying Days ::"+totalDayC);
	}
	
}

