package ArrayExtra;
import java.util.Scanner;
public class Q_07_Employee 
{
	String name;
	int id, sal;

	Q_07_Employee(String nam, int eid, int sal)
	{
		name= nam;
		id=eid;
		this.sal=sal;
	}
	public String toString()
	{
		String str= "\n Employee Name "+name+"\n Employee Id  "+id+"\n Employee Salary "+sal;
		return str;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Q_07_Employee emp[]= new Q_07_Employee[3];
		for(int i=0;i<emp.length;i++)
		{
			
			System.out.println("Eneter Details Of "+(i+1)+" Employee");
			System.out.println("Emplyee name");
			String name= sc.next();
			System.out.println("Employee Id");
			int id=sc.nextInt();
			System.out.println("Employee Salary ");
			int sal= sc.nextInt();
			emp[i]= new Q_07_Employee(name,id,sal);
		}
		for(int i=0; i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}
}
