import java.util.Scanner;

public class employeeDayaParameterPassPayroll 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Name  ");
		String name=sc.nextLine();
		System.out.println("Please Enter Id  ");
		int id=sc.nextInt();
		System.out.println("Please Enter basic  ");
		int basic=sc.nextInt();
		System.out.println("Please Enter Emi  ");
		int emi=sc.nextInt();
		
		int tax=200;
		
		employeeDataParametrPass e1=new employeeDataParametrPass();
		
		e1.acceptDetails(id, name, basic);

		e1.calculateNetSalary(tax,emi,basic);
		e1.displayDetails(tax, emi, basic);
		
		
	}
}

