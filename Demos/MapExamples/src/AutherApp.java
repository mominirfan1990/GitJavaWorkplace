import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Book
{
	int id;
	String name;
	int price;
	Book()
	{}
	Book(int id, String n, int pr)
	{
		this.id=id;
		name=n;
		price=pr;
	}
	public String toString() 
	{
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode()
	{
		return price/(id+name.hashCode());
	
	}
	@Override
	public boolean equals(Object o)
	{
		if(o==null)    //check pass object is null or ot
			return false;
		if(this==o)       //check hashcode of object is same with pass oject
			return true;
		if(this.getClass()!=o.getClass())   //check class of object with pass bject
			return false;
		Book b= (Book)o;
		if(this.id==b.id && this.price==b.price && this.name.equals(b.name) )
			return true;
		else
			return false;
		
	}
}
public class AutherApp
{
	Map<Book,String>map;
	public void creatHashMAp()
	{
		
		map=new HashMap<>();
		
		// direct Book type ananomus object as key 
	/*	map.put(new Book(101,"YAYATI",2000), "VSKhandekar");
		map.put(new Book(102,"HITLAR",600), "AtulKahate");
		map.put(new Book(103,"BHAGIRATH",2000), "VBBarve");
		//map.put(new Book(101,"YAYATI",2000), "Joshi S");
	*/
		
		// creat book type object and pas as key 
		
		Book b1= new Book(101,"YAYATI",2000);
		Book b2= new Book(102,"HITLAR",600);
		Book b3= new Book(103,"BHAGIRATH",2000);
		Book b4= new Book(101,"YAYATI",2000);
		
		map.put(b1,"VSKhandekar");
		map.put(b2,"AtulKahate");
		map.put(b3,"VBBarve");
		map.put(b4,"Joshi");
		
	//	System.out.println(map);
	}
	public void iterateMAp()
	{
		Set<Book> st= map.keySet();
		Iterator<Book>itr=st.iterator();
		while(itr.hasNext())
		{
			Book bk=itr.next();
			String kt=map.get(bk);
			System.out.println();
			System.out.print("Auther name "+kt+" Book Id "+bk.id+"  Book Name  "+bk.name+"   Book Price "+bk.price+"\n");
		}
	}
	public void iterateMapToEntry()
	{
		Set<Entry<Book, String>> st1= map.entrySet();
		Iterator<Entry<Book,String>>itr1=st1.iterator();
		while(itr1.hasNext())
		{
			Entry<Book,String> et=itr1.next();
			Book bs= et.getKey();
			System.out.println("Book id "+bs.id+" Book name "+bs.name+" book Price "+bs.price+" Auther name "+et.getValue());
		}
		
	}
	public static void main(String[] args) 
	{
		AutherApp ap=new AutherApp();
		ap.creatHashMAp();
		ap.iterateMAp();
		ap.iterateMapToEntry();
		
	}

}
