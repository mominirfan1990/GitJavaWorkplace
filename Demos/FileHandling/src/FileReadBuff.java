import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadBuff
{
	FileInputStream fin=null;
	FileOutputStream fout;
	BufferedOutputStream bout;
	BufferedInputStream bin;
	BufferedOutputStream  bout1;
	public void readFile(File path) throws IOException
	{
			fin= new FileInputStream(path);
			bin= new BufferedInputStream(fin);
			bout1= new BufferedOutputStream(System.out);
			int b=bin.read();
			while(b!=-1)
			{
				bout1.write((char)b);
				bout1.flush();
				b=bin.read();
			}
	}
/*	public void writeContent(String s) throws IOException
	{
		fout=new FileOutputStream(s);
		bout=new BufferedOutputStream(fout);
		String st= "Irfan Momin ";
		byte []data= st.getBytes();
		bout.write(data);
		bout.flush();
		System.out.println("Data written to file ");
	}
	
*/	public static void main(String[] args)
	{
		FileRead fn= new FileRead();
		try
		{
			//fn.writeContent("E:\\New folder\\DemoWrite.txt");
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
				fn.fin.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	
}}
