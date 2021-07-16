import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

class MyClass
{
	public void myMethod1() throws IOException
	{
		this.myMethod2();
		
	}
	public void myMethod2() throws IOException
	{
		this.myMethod3();
		
	}
	public void myMethod3() throws IOException 
	{
		File file= new File("D:irfan.txt");
			throw new IOException(" file not found");
		//Scanner sc = new Scanner(file); 	
	}
}

public class Assign_28 {

	public static void main(String[] args) throws IOException
	{
		MyClass ms = new MyClass();
		try
		{
		ms.myMethod1();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	
	}

}
