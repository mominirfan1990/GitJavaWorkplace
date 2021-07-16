import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileData
{
	FileInputStream fin=null;
	FileInputStream fin1=null;
	FileOutputStream fout;
	BufferedInputStream bin;
	BufferedOutputStream bout;
	
	public void readFile(File path) throws IOException   // read from one file and write in other file
	{
			fin= new FileInputStream(path);
			bin= new BufferedInputStream(fin);
			fout=new FileOutputStream("E:\\New folder\\DemoAppend.txt",true);
			bout= new BufferedOutputStream(fout);
		
			int b=bin.read();
			while(b!=-1)
			{
				bout.write(b);
				b=bin.read();
				bout.flush();
			}
			
			fin1= new FileInputStream("E:\\New folder\\DemoAppend.txt");
			int b1= fin1.read();
		/*	while(b1!=-1)
			{
				System.out.print((char)b1);
				b1=fin1.read();
			}
			
		*/
			BufferedOutputStream bout1= new BufferedOutputStream(System.out);
			while(b1!=-1)
			{
				bout1.write((char)b1);
				bout1.flush();
				b1=fin1.read();
			}
			
			
	}
	public static void main(String[] args)
	{
		CopyFileData fn= new CopyFileData();
		try
		{
			fn.readFile(new File("E:\\New folder\\DemoWrite.txt"));
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
