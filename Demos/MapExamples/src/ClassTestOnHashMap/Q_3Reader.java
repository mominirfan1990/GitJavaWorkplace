package ClassTestOnHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Autherd 
{
	int autherId;
	String autherName;
	Autherd(){}
	Autherd(int id, String name)
	{
		autherId=id;
		autherName=name;
	}
	@Override
	public String toString()
	{
		return "Auther Id"+autherId+" Auther name "+ autherName;
	}
}

class Book 
{
	int bookId;
	String bookName;
	int bookPrice;
	Autherd a;
	Book(){}
	Book(int id, String name, int price, Autherd a)
	{
		bookId=id;
		bookName=name;
		bookPrice=price;
		this.a=a;
	}
	@Override
	public String toString() 
	{
		return "Book Id=" + bookId + ", Book Name=" + bookName + ", Book Price=" + bookPrice + ","+a;
	}
	
	
}

public class Q_3Reader
{
	List<Book>list;
	Map<Integer,String>map;
	Map<Autherd,List> map1;
	public void creatList()
	{
		list=new LinkedList<>();
		
		Autherd a=new Autherd(1012,"P.L.Deshpande");
		Autherd a1=new Autherd(1013,"R.K.Shinde");
		Autherd a2=new Autherd(1014,"J.S.Katre");
		
		Book b = new Book(60,"JAVA",200,a);
		Book b1= new Book(61,"SQL",250,a1);
		Book b2= new Book(62,"C++",100,a2);
		Book b3= new Book(63,"DBM",300,a);
		Book b4= new Book(64,"VB",400,a);
		
		list.add(b);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
	}
	public void creatMapBookId()
	{
		map=new HashMap<>();
	/*	for(int i=0; i<list.size();i++)
		{
			map.put(list.get(i).bookId, list.get(i).bookName);
		}
	*/	for(Book x:list)
		{
			map.put(x.bookId, x.bookName);
		}
		Set<Integer>st= map.keySet();
		Iterator<Integer>itr=st.iterator();
		while(itr.hasNext())
		{
			Integer num = itr.next();
			System.out.println("Book ID "+num+" Book Name "+map.get(num));
		}
	
	}
	public void creatAutherId()
	{	
		Map<Integer,Integer>mapid=new HashMap<>();
		int count=0;
		for(Book ax:list)
		{
			count=0;
			for(Book bx:list)
			{
				if(ax.a.autherId==bx.a.autherId)
				{
					count++;
				}
			}
			mapid.put(ax.a.autherId, count);
		}
		System.out.println(mapid);
		System.out.println(mapid.values());
	}
	
	public void creatAutherBookListMap()
	{
		List<Autherd>list1=new LinkedList<>();
		List<String>list2;
		map1= new HashMap<>();
		
		for(Book bx:list)
		{
			if(!list1.contains(bx.a))
				list1.add(bx.a);
		}
		for(Autherd xx: list1)
		{
			list2=new LinkedList<>();
			for(Book cx:list)
			{
				if(xx.autherId==cx.a.autherId)
				{
					list2.add(cx.bookName);
					
				}
			}
			map1.put(xx, list2);
		}
		Set<Autherd>stl= map1.keySet();
		Iterator<Autherd>itr1=stl.iterator();
		while(itr1.hasNext())
		{
			Autherd atr=itr1.next();
			System.out.println(atr);
			System.out.println(map1.get(atr));
		}
	}
	public void creatBookSort()
	{
		List <String>slist= new LinkedList<>();
		for(Book xd: list)
		{
			if(xd.a.autherName.equals("P.L.Deshpande"))
			{
				slist.add(xd.bookName);
			}
		}
		System.out.println(" Books written by P.L.Seshpande");
		Collections.sort(slist,Collections.reverseOrder());
		System.out.println(slist);
	}
	public static void main(String[] args) 
	{
		Q_3Reader rd= new Q_3Reader();
		rd.creatList();
		rd.creatMapBookId();
		rd.creatAutherId();
		rd.creatAutherBookListMap();
		rd.creatBookSort();
	}

}
