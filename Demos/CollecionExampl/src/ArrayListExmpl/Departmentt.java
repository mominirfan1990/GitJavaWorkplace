package ArrayListExmpl;

public class Departmentt {
	int did;
	String dname;

	Departmentt() {
	}

	Departmentt(int id, String nam) {
		did = id;
		dname = nam;
	}

	public String toString() {
		return "Dept id=" + did + " Dept name " + dname;
	}

}
