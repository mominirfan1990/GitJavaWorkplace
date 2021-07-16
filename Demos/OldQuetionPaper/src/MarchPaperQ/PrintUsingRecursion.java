package MarchPaperQ;

public class PrintUsingRecursion 
{
	int i=1;
	public void print()
	{
		if(i<6)
		{
			System.out.println(i);
			i++;
			print();
		}
	}
	public static void main(String[] args) 
	{
		PrintUsingRecursion ps= new PrintUsingRecursion();
		ps.print();
	}

}
