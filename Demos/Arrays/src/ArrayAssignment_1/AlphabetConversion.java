package ArrayAssignment_1;
import java.util.Scanner;
public class AlphabetConversion {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please eneter lenght of array");
	int lnght = sc.nextInt();
	char ch[]= new char [lnght];
	for (int i=0; i<ch.length; i++)
	{
		System.out.println("Eneter element of array");
		ch[i]= sc.next().charAt(0);
	}
	for(char x:ch)
	{
		System.out.print(x+" ");
	}
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]>=65 && ch[i]<= 89)
		{
			ch[i]=(char)(ch[i]+32);
		}
		else if (ch[i]>=97 && ch[i]<= 177)
		{
			ch[i]=(char)(ch[i]-32);
		}
	}
	System.out.println();
	for (char z:ch)
	{
		System.out.print(z+" ");
	}
}

}
