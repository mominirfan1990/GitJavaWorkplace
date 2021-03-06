package VectorExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector vs = new Vector();
		vs.add(10);
		vs.add(0, "www");
		vs.addElement(60);
		vs.addElement(0.09f);
		vs.ensureCapacity(20);
		System.out.println(vs.elementAt(2));
		System.out.println(vs.get(2));
		System.out.println(vs);
		System.out.println(vs);
		System.out.println(vs.contains(10));
		
		Enumeration em = vs.elements(); // iterate through enumeration
		while(em.hasMoreElements())
		{
			System.out.print(em.nextElement()+" ");
		}
		
		Iterator itr = vs.iterator();  // iterate through Iterator
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		Object o=60;
		System.out.println(vs.remove(o));  // remove object and return true if object remove
		System.out.println(vs);
		System.out.println();
		System.out.println(vs.remove(0)); // remove element of index and return removed element
		System.out.println(vs);
		vs.clear();
		System.out.println(vs.isEmpty()); // check vector and true if no element else return false
	}

}
