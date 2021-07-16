package gslabDemo;

public class Fibonaci 
{
	int a=0,b=1,c,count=2;
	  public void displayFebonaci()
	  {
	    System.out.println("febonaci series is "+a+" "+b+" ");
	    while(count<30)
	    {
	     	c=a+b;
	     	a=b;
	     	b=c;
	     	count++;
	     	System.out.println(c+" "); 
	    }
	  }
	  public void displayTribonaci()
	  {
		  int a1=0,b1=1,c1=1,d;
		  System.out.println("tribonaci Series is "+a1+" "+b1+" "+c1+" ");
		  while(count<10)
		  {
			  d=a1+b1+c1;
			  a1=b1;
			  b1=c1;
			  c1=d;
			  System.out.print(d+" ");
			  count++;
		  }
	  }
	public static void main(String[] args) 
	{
		Fibonaci f= new Fibonaci();
		//f.displayFebonaci();
		f.displayTribonaci();
	}

}
