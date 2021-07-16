import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRead 
{
	FileInputStream fin=null;
	FileOutputStream fout;
	BufferedOutputStream bout;
	BufferedInputStream bin;
	public void readFile(File path) throws IOException
	{
			fin= new FileInputStream(path);
			int b=fin.read();
			while(b!=-1)
			{
				System.out.print((char)b);
				b=fin.read();
			}
	}
	public void writeContent(String s) throws IOException
	{
		fout=new FileOutputStream(s);
		String st= "Irfan Momin ";
		byte []data= st.getBytes();
		fout.write(data);
		fout.flush();
		System.out.println("Data written to file ");
	}
	public static void main(String[] args)
	{
		FileRead fn= new FileRead();
		try
		{
			fn.writeContent("D:\\New folder\\DemoWrite.txt");  // if file is not present then creat new file 
			fn.readFile(new File("D:\\New folder\\DemoWrite.txt"));
			
 
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				   // compulsory close to avoid memory leakage problem
				fn.fout.close();
				fn.fin.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
