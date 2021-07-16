package AssignmentonArray__of_Object;

public class Department 
{
	String dName;
	int dEid;
	Department(String dn, int de)
	{
		dName= dn;
		dEid=de;
	}
	public String toString()
	{
		String str;
		return str="\n Department Name ::"+dName+"\n Department Id  ::"+dEid;
	}
}
