// child class of sport clas
package inhe_single_Exp3;

public class Kabbadi extends Sport
{
	String type;
	int no, slots;
	int groundLenght;
	
	Kabbadi()
	{	
	
		groundLenght = 3;
	}
	
	Kabbadi(int x)
	{	
		super (321);
		groundLenght =x;
	}
	void acceptDetails(String tp, int no,int slt)
	{
		type= tp;
		this.no=no;
		slots= slt;
	}
	void display()
	{
		System.out.println("Game Kabbadi is ::"+type+"type"+"\n Each Team have  "+no+" players "+"\n Game have" + slots+"  min two slots "+"Ground lenght ::"+ groundLenght +" meter");
	
	}
	
	public static void main(String[] args)
	{
		Kabbadi kb= new Kabbadi(4);
		kb.acceptdetails("Olampic", "Multiple");
		kb.acceptDetails("OutDoor", 7, 30);
		kb.display();
		kb.show();
	}
}
