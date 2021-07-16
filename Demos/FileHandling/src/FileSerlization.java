import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileSerlization  implements Serializable
{
	int fid;
	String fData;
	public FileSerlization() {}
	public FileSerlization(int id, String data)
	{
		fid=id;
		fData=data;		
	}
		
	@Override
	public String toString()
	{
		return "FileSerlization [File id= " + fid + ", File Data= " + fData + "]";
	}
	public static void main(String[] args) 
	{
		FileSerlization fs= new FileSerlization(101,"JAVA File Serializtion ");
			
		try(FileOutputStream fout=new FileOutputStream("SeralizationExpl.ser");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			FileInputStream fin= new FileInputStream("SeralizationExpl.ser");
			ObjectInputStream oin=new ObjectInputStream(fin); )
		{
			out.writeObject(fs);
			System.out.println("Object store Successfully ");
			
			Object o=oin.readObject();
			System.out.println("Obhect read "+o);
					
			
			oin.close();
			out.close();

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
