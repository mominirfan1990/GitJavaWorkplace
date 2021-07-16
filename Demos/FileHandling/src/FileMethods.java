import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) throws IOException 
	{
		// read data from file using FileInputStream
	/*	
		FileInputStream fin= new FileInputStream(new File("E:\\New folder\\Demo.txt"));
		int b= fin.read();
		while(b!=-1)
		{
			System.out.print((char)b); 
			b=fin.read();
		}
		fin.close();
		
		// write data to file using FileOutputStream
		
		FileOutputStream fout= new FileOutputStream("E:\\New folder\\Demo.txt",true);
		String st= "Q.8 WAP to find plindrome number";
		byte []barr= st.getBytes();
		fout.write(barr);
		fout.flush();
		System.out.println("Write data successfully ");
		fout.close();
		
		//read data from file using BufferedInputStream
		
		FileInputStream fin1= new FileInputStream(new File("E:\\New folder\\DemoAppend.txt"));
		BufferedInputStream bin= new BufferedInputStream(fin1);
		int b1= bin.read();
		while(b1!=-1)
		{
			System.out.print((char)b1);
			b1=bin.read();
		}
		bin.close();
		
		// write data using BufferedOutputStream
		
		FileOutputStream fout1= new FileOutputStream("E:\\New folder\\DemoAppend.txt",true);
		BufferedOutputStream bout = new BufferedOutputStream(fout1);
		String st1="Going to pune";
		byte []br= st1.getBytes();
		bout.write(br);
		bout.flush();
		System.out.println("datat written successfully ");
		bout.close();
		*/
		
		// print file data on Monitor
		
		FileInputStream fin2= new FileInputStream(new File("E:\\New folder\\DemoAppend.txt"));
		BufferedInputStream bin2= new BufferedInputStream(fin2);
		BufferedOutputStream bout2= new BufferedOutputStream(System.out);
		int b2=bin2.read();
		while(b2!=-1)
		{
			bout2.write((char)b2);
			bout2.flush();
			b2=bin2.read();
		}
	}

}
