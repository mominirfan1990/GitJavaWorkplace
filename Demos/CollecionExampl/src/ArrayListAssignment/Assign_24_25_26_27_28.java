//WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. 
//Sysout and see both variable memory space is printed.

package ArrayListAssignment;

import java.util.ArrayList;

class Emp {
	int eid, sal;
	String name;

	Emp() {
	}

	Emp(int id, String nm, int sal) {
		eid = id;
		name = nm;
		this.sal = sal;
	}

	public String toString() // Assign-25 to override to String method
	{
		return " Eid " + eid + " Name " + name + " Salary " + sal;
	}
}

public class Assign_24_25_26_27_28 {
	ArrayList<Emp> list;

	public void creatEmp() {
		list = new ArrayList<>();
		list.add(new Emp(10, "irfan", 14000));
		list.add(new Emp(20, "Rajesh", 15000));
		list.add(new Emp(30, "Sachin", 10000));
		System.out.println(list);

	}

	public void findSal() // Assign-26 print Emp whose salary is > 10000
	{
		System.out.println("Employee whos salary is greter than 10000");
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).sal) > 10000) {
				System.out.println(list.get(i));
			}
		}
	}

	public void findName() // Assign -27 WAP to print Emp who have name "Sachin"
	{
		System.out.println("Employee Details whos name is Sachin ");
		for (Emp lx : list) {
			if (lx.name.equals("Sachin")) {
				System.out.println(lx);
			}
		}

	}

	public void findHeighest()// 28. WAP to print Emp who have highest number of salary
	{
		System.out.println("Employee details of Heighest salary");
		int max = list.get(0).sal;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).sal > max) {
				max = list.get(i).sal;
			}
		}
		for (Emp x : list) {
			if (x.sal == max) {
				System.out.println(x);
			}
		}
	}

	public static void main(String[] args) {
		Assign_24_25_26_27_28 ee = new Assign_24_25_26_27_28();
		ee.creatEmp();
		ee.findSal();
		ee.findName();
		ee.findHeighest();
	}

}
