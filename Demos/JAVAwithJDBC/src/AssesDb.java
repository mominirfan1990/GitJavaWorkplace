import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AssesDb
{
	Statement st;
	ResultSet rs;
	static Connection con;
	
	public AssesDb()
	{
		con=AchieveConnection.getConnection();
		System.out.println("connection established ");
		
	}
	public void fetchData() throws SQLException
	{
		st = con.createStatement();
		rs= st.executeQuery("select * from auther ");
		System.out.println("autherid"+"\t\t"+"authername");
		while(rs.next())
		{
			String n= rs.getNString(1); // get string from index 1
			String n2= rs.getNString("authername"); // get string with column name
			System.out.println(n+"\t\t"+n2);
		}
	}
	public void insertRecord() throws SQLException
	{
		int inser= st.executeUpdate("insert into auther values('a-20','D B Shirke')");
		System.out.println("no of rows inserted "+inser);
	}
	public void updateRecord() throws SQLException
	{
		int upd= st.executeUpdate("update auther set autherid='a-17' where autherid='14'");
		System.out.println("no of rows afected "+upd);
	}
	public void deletedata() throws SQLException
	{
		int del= st.executeUpdate("delete from auther where autherid='12'");
		System.out.println("no of rows deleted "+del);	
	}
	public void fecthBook() throws SQLException
	{
		st=con.createStatement();
		rs= st.executeQuery
				("select b.bookid, b.bookname, b.bookpricel, a.authername from book b,auther a where b.autherid=a.autherid");
		System.out.println("bookid"+" \t  "+"BookName"+" \t  "+"Book Price "+" \t  "+"authername");
		
		while(rs.next())
		{
			int id=rs.getInt(1);
			String n=rs.getNString("bookname");
			int pr=rs.getInt("bookpricel");
			String an=rs.getNString("authername");
			
			System.out.println(id+"  \t  "+n+"  \t  "+pr+"  \t  "+an);
		}
	}
	public static void main(String[] args)
	{
		AssesDb ad=new AssesDb();
		try
		{
			ad.fetchData();
			//ad.fecthBook();
			//ad.insertRecord();
			//ad.deletedata();
			//ad.updateRecord();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
