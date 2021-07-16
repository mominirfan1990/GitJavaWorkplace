package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Scanner;

class Department {
	int did;
	String dname;
	String dcity;

	Department() {
	}

	Department(int id, String nam, String city) {
		did = id;
		dname = nam;
		dcity = city;
	}

	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dcity=" + dcity + "]";
	}

}

class Address {
	int pincode;
	String acity;

	Address() {
	}

	Address(int code, String city) {
		pincode = code;
		acity = city;
	}

	public String toString() {
		return "Address [pincode=" + pincode + ", acity=" + acity + "]";
	}

}

public class Employe {
	int eid;
	String ename;
	int did;

	Employe() {
	}

	Employe(int id, String nam, int did) {
		eid = id;
		ename = nam;
		this.did = did;
	}

	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", did=" + did + "]";
	}

	ArrayList<Employe> emp;
	ArrayList<Department> dpt;
	ArrayList<Address> adr;

	public void addEmplyee() {
		emp = new ArrayList<>();
		emp.add(new Employe(10, "Irfan", 100));
		emp.add(new Employe(11, "Vishal", 101));
		emp.add(new Employe(12, "Vishnu", 102));
		emp.add(new Employe(13, "Sneha", 100));

		dpt = new ArrayList<>();
		dpt.add(new Department(100, "Testing", "pune"));
		dpt.add(new Department(102, "Devlopment", "mumbai"));
		dpt.add(new Department(103, "Outsorce", "nashik"));

		adr = new ArrayList<>();
		adr.add(new Address(44, "pune"));
		adr.add(new Address(45, "mumbai"));
		adr.add(new Address(46, "nashik"));

	}

	public void findEmplyeByCity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter pincode ");
		int pinc = sc.nextInt();
		sc.close();
		for (Address ax : adr) {
			if (pinc == ax.pincode) {
				for (Department xd : dpt) {
					if (ax.acity.equals(xd.dcity)) {
						for (Employe ex : emp) {
							if (xd.did == ex.did) {
								System.out.println(ex.ename);
							}
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Employe ep = new Employe();
		ep.addEmplyee();
		ep.findEmplyeByCity();

	}

}
