package ArrayListExmpl;

import java.util.ArrayList;

public class Employee {
	int eid, salary;
	String name;
	Departmentt d1;

	Employee() {
	}

	Employee(int id, int sal, String name, Departmentt d) {
		eid = id;
		salary = sal;
		this.name = name;
		d1 = d;
	}

	ArrayList<Employee> elist;

	public void addDetails() {
		elist = new ArrayList<>();

		elist.add(new Employee(11, 45000, "Irfan", (new Departmentt(101, "Sales"))));
		elist.add(new Employee(12, 55000, "Omkar", (new Departmentt(102, "Prod"))));
		elist.add(new Employee(13, 35000, "Deepak", (new Departmentt(103, "Hr"))));
		elist.add(new Employee(14, 40000, "Praddep", (new Departmentt(101, "Sales"))));

	}

	public void showDetails() {
		System.out.println(" Employee Details ");
		for (int i = 0; i < elist.size(); i++) {
			System.out.println("Id " + elist.get(i).eid + " Name " + elist.get(i).name + " Salary "
					+ elist.get(i).salary + " " + elist.get(i).d1);
		}
	}

	public void findSales() {
		System.out.println("\n Employees of sales Department");
		for (Employee fn : elist) {
			if (fn.d1.dname.equals("Sales")) {
				System.out.println(fn.eid + " " + fn.name + " " + fn.salary);
			}

		}
	}

	public void salOfSales() {
		int sal = 0;
		for (Employee fn : elist) {
			if (fn.d1.dname.equals("Sales")) {
				sal = sal + fn.salary;
			}
		}
		System.out.println("\nTotal Salary of Sales Department is " + sal);
	}

	public void findProduction() {
		int count = 0;
		for (Employee xc : elist) {
			if (xc.d1.dname.equals("Prod")) {
				count++;
			}
		}
		System.out.println("\n Number Production Department Employee " + count);

	}

	public static void main(String[] args) {
		Employee epm = new Employee();
		epm.addDetails();
		epm.showDetails();
		epm.findSales();
		epm.salOfSales();
		epm.findProduction();
	}

}
