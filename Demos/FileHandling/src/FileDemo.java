import java.io.File;

public class FileDemo {

	public static void main(String[] args)
	{
		File f= new File("D:\\New folder");
		if(f.isDirectory())
		{
			System.out.println("This is directory");
			String a[]=f.list();
			for(String st:a)
			{
				System.out.println("Lenght  "+st.length()+"  File Name  "+st+ "    ");
			}
			
			System.out.println("\n file less than 10 bytes ");
			for(String sr:a)
			{
				File f1=new File("D:\\New folder\\"+sr);
				if(f1.length()<10)
				{
					System.out.println(f1);
					//f1.delete();
				}
			}
		}
		else
			System.out.println("this is file");
		
	}

}
