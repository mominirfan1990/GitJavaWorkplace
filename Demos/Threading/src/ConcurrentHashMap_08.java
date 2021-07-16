import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class ConHashMap
{
	ConcurrentHashMap<Integer,String>cmap;
	public void creatCHashMap()
	{
		cmap=new ConcurrentHashMap<>();
		cmap.put(11, "IRFAn");
		cmap.put(12, "Vishal");
		cmap.put(13, "Vishu");
		cmap.put(14, "Omkar");
	}
	public void show()
	{
		Set<Integer>st=cmap.keySet();
		Iterator<Integer>itr=st.iterator();
		while(itr.hasNext())
		{
			Integer temp=itr.next();
			System.out.println(temp+" "+cmap.get(temp));
		}
	}

}
class MyThread1 extends Thread
{
	ConHashMap o;
	MyThread1(ConHashMap o)
	{
		this.o=o;
	}
	@Override
	public void run() 
	{
		o.show();
	}
	
}
class MyThread2 extends Thread
{
	ConHashMap o;
	MyThread2(ConHashMap o)
	{
		this.o=o;
	}
	@Override
	public void run() 
	{
		o.cmap.remove(13);
	}
}
public class ConcurrentHashMap_08 
{
	public static void main(String[] args) 
	{
		ConHashMap c=new ConHashMap();
		c.creatCHashMap();
				
		MyThread1 ct = new MyThread1(c);
		ct.start();
		MyThread2 ct1 = new MyThread2(c);
		ct1.start();
		
		
	}

}
