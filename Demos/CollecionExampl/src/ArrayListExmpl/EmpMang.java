package ArrayListExmpl;

import java.util.ArrayList;

public class EmpMang {
	int eid;
	String name;
	int mid;

	EmpMang() {
	}

	EmpMang(int id, String nm, int md) {
		eid = id;
		name = nm;
		mid = md;
	}

	public void find() {
		ArrayList<EmpMang> list = new ArrayList<>();
		list.add(new EmpMang(1, "Pranav sir", 0));
		list.add(new EmpMang(2, "Medha mam", 1));
		list.add(new EmpMang(3, "Balaji sir", 1));
		list.add(new EmpMang(4, "Kirti", 2));
		list.add(new EmpMang(5, "Priyanka", 2));

		for(EmpMang temp:list)
		{
			if(temp.mid==0)
				System.out.println("Employee Name "+ temp.name+" Maneger name "+" No maneger");

				for(EmpMang temp1:list)
				{
					if(temp1.mid==temp.eid)
					{
						System.out.println("Employee Name "+ temp1.name+" Maneger name "+temp.name);
					}
				}
			}
		
	}

	public static void main(String[] args) {
		EmpMang et = new EmpMang();
		et.find();
	}

}
