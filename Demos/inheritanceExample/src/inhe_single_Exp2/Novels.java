package inhe_single_Exp2;

public class Novels extends Book
{
	String name, type,picture;
	int pages,price;
	
	public void accept(String na, String tp, String pic, int pg, int pr)
	{
		name = na;
		type = tp;
		picture = pic;
		pages = pg;
		price = pr;
	}
	
	public void display()
	{
		System.out.println("Name of book is  ::"+name+"\n Type of book  ::"+ type+" "+picture  +" Book");
		System.out.println("Book pages ::"+pages+ "\n price  ::"+price);
		show();
	}
	
	public static void main(String[] args)
	{
		Novels nv = new Novels();
		nv.acceptDetails("paper", "Child ", "English");
		nv.accept("Harry poter","Fictional" ,"Pictured ", 1000, 275);
		nv.display();
	}
}
