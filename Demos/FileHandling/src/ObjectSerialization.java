import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Laptop implements Serializable
{
	int ram;
	float cost;
	transient String os;
	
	public Laptop()
	{}
	public Laptop(int ram, float cost, String os) 
	{
		this.ram = ram;
		this.cost = cost;
		this.os = os;
	}
	@Override
	public String toString() 
	{
		return "Ram size =" + ram + ", cost =" + cost + ", os =" + os + "]";
	}
	
	
}
public class ObjectSerialization 
{

	public static void main(String[] args)
	{
		Laptop lp =new Laptop(8,55000.0f,"Windows");
		try(FileOutputStream fout= new FileOutputStream("Information.ser");
				ObjectOutputStream out = new ObjectOutputStream(fout);
				FileInputStream fin= new FileInputStream("Information.ser");
				ObjectInputStream oin= new ObjectInputStream(fin);)
		{
			out.writeObject(lp); // serialization
			System.out.println("Object stored ");
			Laptop o=(Laptop)oin.readObject();  // deserialization
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
