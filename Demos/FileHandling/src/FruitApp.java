import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

abstract class Fruit implements Serializable
{
	 int qnty;
	 float price;
	String taste,color;
	public Fruit()
	{}
 	public void purchaseFruit(int q,float pr,String ts,String col)
	{
		 qnty=q;
		price=pr;
		taste=ts;
		color=col;
		
	}
	public void display()
	{
		System.out.println("Fruit dtails are ::"+ "Quantity ::"+qnty+" Price ::"+price+" Taste of fruit ::"+taste+"  Color of fruit ::"+color);
	}
	abstract  String getTaste(String t);

}

 class Apple extends Fruit 
{
	public String getTaste(String t)
	{
		taste = t;
		return taste;
	}
	public void makeJuice()
	{
		System.out.println("Make juice of Apple");
	}
	@Override
	public String toString() {
		return "Apple [qnty=" + qnty + ", price=" + price + ", taste=" + taste + ", color=" + color + "]";
	}
	
}

public class FruitApp 
{
	public static void main(String[] args)
	{
		Apple f= new Apple();
		f.purchaseFruit(5, 10, "bitter", "Yello");
		f.getTaste("Sweet");
		
		
		try(FileOutputStream fout= new FileOutputStream("InformationMArket.ser");
				ObjectOutputStream out = new ObjectOutputStream(fout);
				FileInputStream fin= new FileInputStream("InformationMArket.ser");
				ObjectInputStream oin= new ObjectInputStream(fin);)
		{
			out.writeObject(f); // serialization
			System.out.println("Object stored ");
			Fruit o=(Fruit)oin.readObject();  // deserialization
			System.out.println("Record in file is "+o);
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
