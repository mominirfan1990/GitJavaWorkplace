/*import java.util.Scanner;
public class cacluApp 
{

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("\t\t-----Operation-----");
		System.out.println("\t\t--1.Square");
		System.out.println("\t\t--2.log");
		System.out.println("\t\t--3.Sin");
		System.out.println("\t\t--4.Cos");
		System.out.println("\t\t------------------");
		System.out.println("\t\t-----Enter Your Choice-----");
		int ch = sc.nextInt();
		System.out.println("\t\t---Enter Number---");
		double num=sc.nextDouble();
		double ans;
		
		switch(ch)
		{
		default : System.out.println("Invalid choice Please Renter");
				break;
		case 1: ans = Math.sqrt(num);
				System.out.println("Square root of "+num+"is "+ ans);
				break;
		
		case 2: ans = Math.log(num);
				System.out.println("Log of "+num+"is "+ ans);
				break;
		
		case 3: ans = Math.sin(num);
				System.out.println("Sin of "+num+"is "+ ans);
				break;
		
		case 4: ans = Math.cos(num);
				System.out.println("Cos of "+num+"is "+ ans);
				break;
		
		}
	}
	

}
  

import java.util.Scanner;
public class cacluApp 
{

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("\t\t-----Operation-----");
		System.out.println("\t\t--A.Addition");
		System.out.println("\t\t--B.Substraction");
		System.out.println("\t\t--C.Division");
		System.out.println("\t\t--D.Multiplication");
		System.out.println("\t\t------------------");
		System.out.println("\t\t-----Enter Your Choice-----");
		char ch = sc.next().charAt(0);
		System.out.println("\t\t---Enter First  Number---");
		int num1=sc.nextInt();
		System.out.println("\t\t---Enter Second  Number---");
		int num2=sc.nextInt();
		double ans;
		
		switch(ch)
		{
		default : System.out.println("Invalid choice Please Renter");
				break;
		case 'A': ans = num1+num2;
				System.out.println("Addition of  "+num1+"+ "+num2+"="+ans);
				break;
		
		case 2: ans = num1 - num2;
				System.out.println("Substraction of  "+num1+"- "+num2+"="+ans);
				break;
		
		case 3: ans = num1 / num2;
				System.out.println("Division of  "+num1+"/"+num2+"="+ans);
				break;
		
		case 4: ans = num1 * num2;
				System.out.println("Multiplication of  "+num1+"*"+num2+"="+ans);
				break;
		
		}
	}
	

}
*/

import java.util.Scanner;
public class cacluApp
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tPlease Choose Operatio");
		System.out.println("\t\t a.Standarad Calculator");
		System.out.println("\t\t b.Scientific Calculator");
		char ch = sc.next().charAt(0);
		char a,b;
		
		switch(ch)
		{
		 default : System.out.println("Pleae Enter valid Number");
		           break;
		 
		 case 'a':
			 	System.out.println("\t\t Operations");
				System.out.println("\t\t 1.Addition");
				System.out.println("\t\t 2.Substraction");
				System.out.println("\t\t 3.Division");
				System.out.println("\t\t 4.Multiplication");
				int ch1 = sc.nextInt();

			 	int Num;
			 	System.out.println("Eneter First No.");
			 	int Num1 = sc.nextInt();
			 	System.out.println("Enter Second NO ");
			 	int Num2 = sc.nextInt();
		switch (ch1)	
		{
			default : System.out.println("Pleae Enter valid Number");
					break;
		 case 1: 
			 	Num = Num1+Num2;
			 	System.out.println("Addition of  " + Num1 + "+ " + Num2 + "=" + Num);
			 	break;

		 case 2: 
			 	Num = Num1-Num2;
			 	System.out.println("Substraction of  " + Num1 + "- " + Num2 + "=" + Num);
			 	break;

		 case 3: 
			 	Num = Num1/Num2;
			 	System.out.println("Division of " + Num1 + "/ " + Num2 + "=" + Num);
			 	break;

		 case 4: 
			 	Num = Num1*Num2;
			 	System.out.println("Multiplication of  " + Num1 + "* " + Num2 + "=" + Num);
			 	break;
		       }
		break;
		 case 'b':
			    System.out.println("\t\t Operations");
				System.out.println("\t\t 1.log");
				System.out.println("\t\t 2.sin");
				System.out.println("\t\t 3.cos");
				System.out.println("\t\t 4.tan");
				int ch2 = sc.nextInt();

			 	Double Nm;
			 	System.out.println("Eneter The No.");
			 	int Nnm = sc.nextInt();
			 	
			 	switch(ch2)
				{
				default : System.out.println("Invalid choice Please Renter");
						break;
								
				case 1: Nm = Math.log(Nnm);
						System.out.println("Log of "+Nnm+"is "+ Nm);
						break;

				case 2: Nm = Math.sin(Nnm);
						System.out.println("Sin of "+Nnm+"is "+ Nm);
						break;
				

				case 3: Nm = Math.cos(Nnm);
						System.out.println("Cos of "+Nnm+"is "+ Nm);
						break;
				

				case 4: Nm = Math.tan(Nnm);
						System.out.println("Tan of "+Nnm+"is "+ Nm);
						break;
				}
			

			 
		}
	
}
}

  