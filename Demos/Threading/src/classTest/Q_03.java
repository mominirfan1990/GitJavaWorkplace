package classTest;

import java.util.Scanner;

class Operation
{
	String str;
	Operation(String st)
	{
		str=st;
	}
	public void reverseOrder()
	{
		StringBuilder sb= new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
				
	}
	public void toggleChar()
	{
		char [] ch= str.toCharArray();
		System.out.println();
		for(char x:ch)
		{
			if(x>='a' && x<='z')
			{
				System.out.print(x-=32);
			}
			else if(x>='A' && x<='Z')
			{
				System.out.print(x+=32);
			}
		}
	}
}
class MyCharReverse extends Thread
{
	Operation op;
	MyCharReverse(Operation o)
	{
		op=o;
	}
	public void run()
	{
		op.reverseOrder();
	}
}
class MyCharToggle extends Thread
{
	Operation op;
	MyCharToggle(Operation o)
	{
		op=o;
	}
	public void run()
	{
		op.toggleChar();
	}
}
public class Q_03
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String ss= sc.next();
		
		Operation o= new Operation(ss);
		Thread t1= new MyCharReverse(o);
		Thread t2= new MyCharToggle(o);
		t2.start();
		try 
		{t2.join();}
		catch (InterruptedException e) 
		{e.printStackTrace();}
		t1.start();
		
	}
}
