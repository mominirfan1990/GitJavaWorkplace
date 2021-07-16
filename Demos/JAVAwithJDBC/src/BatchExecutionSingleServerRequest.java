import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class BatchExecutionSingleServerRequest
{

	Statement st;
	ResultSet sr;
	static Connection con;
	PreparedStatement pst,pst1,pst2;
	public BatchExecutionSingleServerRequest()
	{
		con=AchieveConnection.getConnection();
		System.out.println("connection done");
	}
	public void fetchData() throws SQLException
	{
		st=con.createStatement();
		sr=st.executeQuery("select * from book");
		System.out.println("BookId "+"\t\t"+"BookName "+"\t\t"+"Book price"+"\t\t"+"Autherid"+"\t\t"+"blid");
		
		while(sr.next())
		{
			int id= sr.getInt(1);
			String nm=sr.getNString(2);
			int pr= sr.getInt(3);
			String anm= sr.getString(4);
			int bid=sr.getInt(5);
			
			System.out.println(id+"\t\t"+nm+"\t\t"+pr+"\t\t"+anm+"\t\t"+bid);
		}
		
	}
	public void bacthProcess() throws SQLException // by prepared statement
	{
		con.setAutoCommit(false);
		
		pst=con.prepareStatement("insert into book(Bookid,bookname,bookpricel) values(?,?,?)");
		pst.setInt(1, 1989);
		pst.setString(2, "Revati");
		pst.setInt(3, 2080);
		
		pst.addBatch();
		
		pst=con.prepareStatement("delete from book where bookid=?");
		pst.setInt(1, 2451);
		pst.addBatch();
		
		pst=con.prepareStatement("update book set autherid=? where bookid=?");
		pst.setString(1, "a-121");
		pst.setInt(2, 345);
		
		pst.addBatch();
		
		int arr[]=pst.executeBatch();
		con.commit();
		
		System.out.println("rows affected are");
		for(int x:arr)
		{
			System.out.print(x);
		}
		
	}
	public void byStstement()
	{
		try 
		{
			con.setAutoCommit(false);
			st.addBatch("insert into book(Bookid,bookname,bookpricel) values(2021,'yaya',3400)");
			st.addBatch("update book set autherid='a-12' where bookid=2021");
			st.addBatch("delete from book where bookid=354");
			int arr[]=st.executeBatch();
			con.commit();
			String str=Arrays.toString(arr);
			System.out.println("Noof row affected "+str);
		}
		catch (SQLException e)
		{
				e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		BatchExecutionSingleServerRequest ps= new BatchExecutionSingleServerRequest();
		try
		{
			ps.fetchData();
			//ps.bacthProcess();
			ps.byStstement();
			ps.fetchData();
			
		} 
		catch (SQLException e) 
		{
					e.printStackTrace();
		}
		
	}

}
