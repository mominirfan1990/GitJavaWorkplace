import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Map;
class Theator
{
	int tId;
	String tName,tAdd,tSlot;
	public Theator(int id, String nm, String ad, String slt)
	{
		tId=id;
		tName=nm;
		tAdd=ad;
		tSlot=slt;
	}
	@Override
	public String toString() 
	{
		return "[Theator-Id=" + tId + ", Theator-Name=" + tName + ", Theator-Add=" + tAdd + ", Time-Slot=" + tSlot + "]";
	}
	
}
public class CollecJDBCExampl
{
	Statement st,st1;
	ResultSet rs,rs1;
	static Connection con;
	HashMap<Integer,Integer>map1;
	HashMap<Theator,ArrayList<String>>map2;
	ArrayList<String>list1;
	public CollecJDBCExampl()
	{
		con=AchieveConnection.getConnection();
	}
	public void creatMapMovieCont() throws SQLException
	{
		map1=new HashMap<>();
		st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs=st.executeQuery("select * from threator");
		st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs1=st1.executeQuery("Select * from movie");
		while(rs.next())
		{
			int tid=rs.getInt(1);
			int cont=0;
			rs1.beforeFirst();
			while(rs1.next())
			{
				if(tid==rs1.getInt(6))
				{
					cont++;
				}
			}
			map1.put(tid, cont);
		}
		System.out.println(map1);
	}
	public void createMovieName() throws SQLException
	{
		ArrayList<String> mlist= new ArrayList<>();
		st=con.createStatement();
		rs=st.executeQuery("select * from movie");
		while(rs.next())
		{
			mlist.add(rs.getString(2));
		}
		Collections.sort(mlist);
		Collections.reverse(mlist);
		System.out.println(mlist);
	}
	public void createMapThMovie() throws SQLException
	{
		st=con.createStatement();
		rs=st.executeQuery("Select * from Threator");
		st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs1=st1.executeQuery("Select * from movie");
		map2=new HashMap<>();
		while(rs.next())
		{
			int tid=rs.getInt(1);
			String mn=rs.getNString(2);
			String ad=rs.getNString(3);
			String slt=rs.getNString(4);
			Theator th=new Theator(tid,mn,ad,slt);
			list1= new ArrayList<>();
			rs1.beforeFirst();
			while(rs1.next())
			{
				if(tid==rs1.getInt(6))
				{
					list1.add(rs1.getString(2));
				}
			}
			map2.put(th,list1);
			
		}
		Set<Entry<Theator,ArrayList<String>>>st= map2.entrySet();
		Iterator<Entry<Theator,ArrayList<String>>> itr=st.iterator();
		while(itr.hasNext())
		{
			Entry et= itr.next();
			System.out.println("Theator Deatials "+et.getKey()+"\t Movie Name "+et.getValue());
		}
	}
	public static void main(String[] args)
	{
		CollecJDBCExampl ce = new CollecJDBCExampl();
		try 
		{
			//ce.creatMapMovieCont();
			//ce.createMovieName();
			ce.createMapThMovie();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try 
			{
				if(con!=null)
					con.close();

			}
			catch (SQLException e) 
			{System.out.println(e.getMessage());}
		}
	}

}
