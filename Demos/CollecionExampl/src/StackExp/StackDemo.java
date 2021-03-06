package StackExp;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{

		Stack <Integer>s= new Stack<>();
		s.push(45);
		s.push(46);
		s.push(47);
		
	/*	System.out.println(s);
		
		System.out.println("Using for each ");
		for(Integer xc:s)
		{
			System.out.print(s+" ");
		}
		System.out.println("using for ");
		for(int i=0; i<s.size(); i++)
		{
			System.out.print(s.get(i)+" ");
		}
		System.out.println(" using pop and while ");
		while(!s.isEmpty())
		{			
			System.out.print(s.pop()+" ");
		}
		System.out.println(s);
		
	*/	
		Stack st= new Stack();
		st.add("JAVA");
		st.add(12);
	//	System.out.println(st);
		st.add(0, 0.8f);
		st.addAll(s);
		st.addElement(300);
	//	System.out.println(st);
		System.out.println(st.capacity());
		
		// below all methos of Stack , other all methods are inherit from vector 
		System.out.println(st.peek());
		System.out.println(st.empty());
		System.out.println(st.pop());
		st.push(39);
		System.out.println(st);
		System.out.println(st.search(50));
		
		Enumeration et=st.elements(); // iterate through enumeration
		while(et.hasMoreElements())
		{
			System.out.print(et.nextElement()+" ");
		}
		System.out.println();
		Iterator itr = st.iterator();   // iterate through iterator
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println(st.subList(2,6)); // return sublist from to index to to index-1
		
	}

}
