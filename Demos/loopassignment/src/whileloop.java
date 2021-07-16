/*
public class whileloop 
{

	public static void main(String[] args)
	{
		int i=1;
		while(i<10)
		{
			System.out.println("Hello");
			i++;	// i=i+1; // i+=1;
			
		}
	}
}

*/

/*


public class whileloop 
{

	public static void main(String[] args)
	{
		int i=110;
		while(i>=106)
		{
			System.out.println("Hello" + i);
			i--;
		}
		
	}
}



public class whileloop 
{

	public static void main(String[] args)
	{
		int i=10;
		while(i>=0)
		{
			System.out.println(i);
			i--;
		}
	}


}

*/

/*

import java.util.Scanner;
public class whileloop
{
	public static void main(String[] args)
	{
		int i=1,n;
		Scanner sc;
		sc=new Scanner(System.in);   //no=newScanner(Syetem.in).nextInt();
		System.out.println("Please eneter Number");
		n=sc.nextInt();
		
		while(i<=10)      //IMP dont put ; after while it will terminate while loop
		{
			System.out.println(n*i);
			i++;             
			
			// or used System.out.println(i++*n);
		}
		
		
	}
}



public class whileloop
{
	public static void main(String[] args)
	{
		int i=1,sum=0;
	
		while(i<=10)      
		{
			sum=sum+i;
			i++;
						
				
		}
		System.out.println(sum);
		
	}
}

*/

/*
// 1st 50 no divisible by 3
public class whileloop
{
	public static void main(String[] args)
	{
		int i=1,no=50;
	
		while(i<=50)      
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
						
			i++;	
		}
	
		
	}
}


//factorial
import java.util.Scanner;
public class whileloop
{
	public static void main(String[] args)
	{
		int i=1,no;
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please eneter Number");
		no=sc.nextInt();
		
		while(i<=no)
		{
		  if(no%i ==0)
		  {
			  System.out.println(i);
		  }
			i++;  
		}
		
	}
	
}
 */


/*
 // prime no 
import java.util.Scanner;
public class whileloop
{
	public static void main(String[] args)
	{
		boolean flag=false;
		int i=2,no;
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please eneter Number");
		no=sc.nextInt();
		
		while(i<=no/2)
		{
			if(no%i ==0)
				{
				 flag =true;
				 break;
				}
			i++;
		}
		
		if(flag == false)
		{
			System.out.println("Given No is prime");
		}
		else 
		{
			System.out.println("Given no is not prime");
		}
	}
}

*/


/*

//Reverse the given no and find total digit of given no.

import java.util.Scanner;
public class whileloop
{
	public static void main(String[] args)
	{

		int no, rem,sum=0;
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please eneter Number");
		no=sc.nextInt();
		
		while (no>0)
		{
			sum=sum+1;
			rem=no%10;
			
			
			System.out.print(rem); // println show o/p at new line
			no=no/10;
			
						
		} System.out.println(" ");
		System.out.println(sum);
	}
	
}
*/


// addition of enetered digit
import java.util.Scanner;
public class whileloop
{
	public static void main(String[] args)
	{
		int no, sum, rem,totaldigit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter no");
		no = sc.nextInt();
		
		while (no>0)
		{
			rem=no%10;
			System.out.print(rem);
			//no=no/10;
			totaldigit=totaldigit+rem;
		}
		System.out.println("  ");
		System.out.println(totaldigit);
	}
}