import java.util.Scanner;

public class employeeDataParametrPass
{

	
		String  name;
		double net, gross,eid,basic;
		 
		
		public void acceptDetails(int id, String n,int b)
		{
				eid=id;
				name = n;
				basic = b;
		}
		
		public double calculateNetSalary(int tax,int emi,int base)
		{
				gross= (base+ (base*0.20) + (base*0.35));
				net=(gross-tax-emi);
				return net;      // return value of net in main 
			
		}
		
		public void displayDetails(int tax,int emi,int basic)
		{			
			System.out.println("Employee Id " + eid);
			System.out.println("name  " +name);
			
			System.out.println("Gross salary  " +gross);
			
			
			
		}

}

