// tribonacii series find out given number is in tribonacii series or not
/*
import java.util.Scanner;
public class tribonacy 
{
  public static void main(String[] args)
  {
	  boolean flag= false;
	  int a=0,b=1,c=1,d=0,enterno;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please enter number");
	  enterno = sc.nextInt();
	  
	  
	  while(d<=100)
	  {
		  d=a+b+c;
		  a=b;
		  b=c;
		  c=d;
	
		  if(d== enterno)
		  {
			flag=true;
			break;
					  
		  }
	  }
	  
	  if(flag==true)
	  {
		  System.out.println("Given number is in Tribonacii series");
	  }
	  else
	  System.out.println("Given number is not in Tribonacii series");
	
  }
}


*/



//tribonacii series

public class tribonacy 
{
public static void main(String[] args)
{
	 
	  int a=0,b=1,c=1,d=0;
	  
	  
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  
	  while(d<=100)
	  {
		  d=a+b+c;
		  a=b;
		  b=c;
		  c=d;
		  
		  System.out.println(d);
	  }
	
}
}

