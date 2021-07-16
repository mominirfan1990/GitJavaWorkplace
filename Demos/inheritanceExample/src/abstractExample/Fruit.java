package abstractExample;

abstract public class Fruit
{
	 int qnty;
	 float price;
	String taste,color;
	public Fruit()
	{
		qnty = 234;
		price = 45;
		System.out.println("fruit class Default  Constructor");
	}
 	public void purchaseFruit(int q,float pr,String ts,String col)
	{
		 qnty=q;
	//	price=pr;
		taste=ts;
		color=col;
		
	}
	public void display()
	{
		System.out.println("Fruit dtails are ::"+ "Quantity ::"+qnty+" Price ::"+price+" Taste of fruit ::"+taste+"  Color of fruit ::"+color);
	}
	 abstract  String getTaste(String t);

}
