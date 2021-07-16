//WAP to use add operation of ArrayList
package ArrayListAssignment;
import java.util.ArrayList;
public class Assign_03 {
	ArrayList list;
	public void addition()
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		
		System.out.println(list);
	}

	public static void main(String[] args) 
	{
		Assign_03 as= new Assign_03();
		as.addition();
	}

}
