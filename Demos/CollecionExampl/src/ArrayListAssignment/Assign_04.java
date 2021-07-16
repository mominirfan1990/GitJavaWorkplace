//WAP to print all elements of ArrayList using iterator

package ArrayListAssignment;
import java.util.ArrayList;
import java.util.Iterator;

public class Assign_04 {
	ArrayList list;
	Iterator itr;
	public void addition()
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		
		itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}

	public static void main(String[] args) {
		Assign_04 as = new Assign_04();
		as.addition();
	}

}
