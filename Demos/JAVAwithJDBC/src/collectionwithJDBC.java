import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Book
{
	int bookid;
	String bookname;
	int bprice;
	String authername;
	int billid;
	public Book()
	{}
	public Book(int bid, String bnam, int pr, String ath, int bild)
	{
		bookid=bid;
		bookname= bnam;
		bprice= pr;
		authername=ath;
		billid=bild;
	}
	@Override
	public String toString() 
	{
		return "[bookid=" + bookid + ", bookname=" + bookname + ", bprice=" + bprice + ", authername=" + authername
				+ ", billid=" + billid + "]";
	}
	
}
public class collectionwithJDBC 
{
	Statement st,st1;
	ResultSet sr;
	ResultSet sr1;
	static Connection con;
	PreparedStatement pst;
	ArrayList<String> str;
	ArrayList<Book>list;
	ArrayList<String>bname;
	public collectionwithJDBC()
	{
		con=AchieveConnection.getConnection();
		System.out.println("connection done");
	}
	public void createBookNameArrayList() throws SQLException
	{
		st=con.createStatement();
		sr=st.executeQuery("select * from book");
		
		str= new ArrayList<>();
		while(sr.next())
		{
			String nm=sr.getNString(2);
		/*	int id= sr.getInt(1);
			int pr= sr.getInt(3);
			String anm= sr.getString(4);
			int bid=sr.getInt(5);
		*/	
			str.add(nm);
			
		}
		System.out.println(str);
		
	}
	public void createBookObj() throws SQLException
	{
		st=con.createStatement();
		sr=st.executeQuery("select * from book");
		
		list= new ArrayList<>();
		while(sr.next())
		{
			
			int id= sr.getInt(1);
			String nm=sr.getNString(2);
			int pr= sr.getInt(3);
			String anm= sr.getString(4);
			int bid=sr.getInt(5);
			
			Book b= new Book(id,nm,pr,anm,bid);
			
			list.add(b);
		}
		for(Book x:list)
		{
			System.out.println(x);
		}
	}
	public void createHashMap() throws SQLException
	{
		HashMap<Integer,String>map=new HashMap<>();
		st=con.createStatement();
		sr=st.executeQuery("select * from book");
		
		list= new ArrayList<>();
		while(sr.next())
		{
			int id= sr.getInt(1);
			String anm= sr.getString(4);
			map.put(id, anm);		
		}
		System.out.println(map);
		
	}
	public void createBookIdAuthername() throws SQLException
	{
		HashMap< Integer, String> map1= new HashMap<>();
		st=con.createStatement();
		sr=st.executeQuery("select * from book");
		st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		sr1=st1.executeQuery("Select * from auther");
		
		while(sr.next())
		{

			int bid=sr.getInt(1);
			String aid=sr.getString(4);
	
			sr1.beforeFirst();
			while(sr1.next())
			{	
				
				if(aid.equals(sr1.getString(1)))
				{
					map1.put(bid,sr1.getString(2));
				}
			}
			
		}
		
		Set<Integer> st= map1.keySet();
		Iterator<Integer>itr=st.iterator();
		while(itr.hasNext())
		{
			int id= itr.next();
			System.out.println(id+"\t"+map1.get(id));
		}
	}
	public void createBookArray() throws SQLException
	{
		HashMap<String,ArrayList<String>> map2= new HashMap<>();
		st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		sr=st.executeQuery("select * from book");
		st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		sr1=st1.executeQuery("Select * from auther");
		while(sr1.next())
		{
			bname=new ArrayList<>();
			String aid=sr1.getString(1);
			sr.beforeFirst();
			while(sr.next())
			{
				if(aid.equals(sr.getString(4)))
				{
					bname.add(sr.getString(2));
				}
			}
			map2.put(sr1.getString(2), bname);
		}
		Set<String> st= map2.keySet();
		Iterator<String>itr=st.iterator();
		while(itr.hasNext())
		{
			String id= itr.next();
			System.out.println(id+"\t"+map2.get(id));
		}
	}
	
	public static void main(String[] args) throws SQLException 
	{
		collectionwithJDBC jc=new collectionwithJDBC();
		//jc.createBookNameArrayList();
		//jc.createBookObj();
		//jc.createHashMap();
		//jc.createBookIdAuthername();
		jc.createBookArray();
		try 
		{
			if(con!=null)
				con.close();

		}
		catch (SQLException e) 
		{System.out.println(e.getMessage());}

	}

}
