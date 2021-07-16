package ArrayExtra;

import java.util.Scanner;

class Card
 {
	private String color;
	private int modelNum;
	Engine e;
	 
	public void setColor(String clr)
	{
		color=clr;
	}
	public void setModelNum(int num)
	{
		modelNum=num;
	}
	public String getColor()
	{
		return color;
	}
	public int getModelNum()
	{
		return modelNum;
	}
	public void setE(Engine e)
	 {
		 this.e=e;
	 }
	public Engine get()
	{
		return e;
	}
	

 }
 class Engine
 {
	 private int price;
	 private String engineType;
	 
	 public void setPrice(int pr)
	 {
		 price=pr;
	 }
	 public void setEngineType(String eng)
	 {
		 engineType=eng;
	 }
	 public int getPrice()
	 {
		 return price;
	 }
	 public String getEngineType()
	 {
		 return engineType;
	 }
	 
	 
 }

public class Q_08_09_Car_Getter_Setter 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Card cr[] = new Card[3];
		Engine e=new Engine();
		for(int i=0; i<cr.length;i++)
		{
			cr[i]= new Card();
			
			System.out.println("Eneter "+(i+1)+"  Car details");
	
			System.out.println("Eneter Strig typr Color of car  ");
			String clr= sc.next();
			cr[i].setColor(clr);
			
			System.out.println("Eneter int type Model Number of car ");
			int num=sc.nextInt();
			cr[i].setModelNum(num);
						
			System.out.println("Eneter String Type Engine Type");
			String ert=sc.next();
			e.setEngineType(ert);
			
			System.out.println("Eneter Int type Engine price");
			int pr= sc.nextInt();
			e.setPrice(pr);
			
			cr[i].setE(e);
			
		}
/*		for(int i=0;i<cr.length;i++)
		{
			System.out.println((i+1)+"  Car Details are");
		
			System.out.println("Color is "+cr[i].getColor());
			System.out.println("Model Number is "+cr[i].getModelNum());
		
			System.out.println("Engine Type "+cr[i].e.getEngineType());
			System.out.println(" Engine Price "+cr[i].e.getPrice());
		}
*/		for(Card cd :cr)
		{
			System.out.println("Color is "+cd.getColor());
			System.out.println("Model Number is "+cd.getModelNum());
		
			System.out.println("Engine Type "+cd.e.getEngineType());
			System.out.println(" Engine Price "+cd.e.getPrice());
			
		}
	}

	
}
