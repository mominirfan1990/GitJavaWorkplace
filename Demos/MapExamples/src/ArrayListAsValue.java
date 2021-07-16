import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListAsValue
{
	ArrayList<String> exe,acct,prod;
	Map<String, ArrayList<String>> map;
	public void creatList()
	{
		exe=new ArrayList<>();
		exe.add("Irfan");
		exe.add("vishal");
		exe.add("omkar");
		
		acct = new ArrayList<>();
		acct.add("Swati");
		acct.add("sneha");
		acct.add("deepak");
	}
	
	public void creatMap()
	{
		map=new HashMap<>();
		map.put("Execution",exe);
		map.put("Account", acct);
		
		Set<String> st=map.keySet();
		Iterator<String> itr=st.iterator();
		
		while(itr.hasNext())
		{
			String temp=itr.next();
			ArrayList sr=map.get(temp);
			System.out.println("Department "+temp);
			System.out.println("Names of Employee "+sr);
		}
	}

	public static void main(String[] args)
	{
		ArrayListAsValue as=new ArrayListAsValue();
		as.creatList();
		as.creatMap();
	}

}
