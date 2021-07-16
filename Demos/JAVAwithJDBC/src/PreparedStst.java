import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStst
{
	Statement st;
	ResultSet sr;
	static Connection con;
	PreparedStatement pst;
	public PreparedStst()
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
	public void insertData(int bkid, String bnm, int bpr) throws SQLException
	{
		pst=con.prepareStatement("insert into book(Bookid,bookname,bookpricel) values(?,?,?)");
		pst.setInt(1, bkid);
		pst.setString(2, bnm);
		pst.setInt(3, bpr);
		
		int r= pst.executeUpdate();
		System.out.println("no of row inserted "+r);
	}
	public void deleteData(int id) throws SQLException
	{
		pst=con.prepareStatement("delete from book where bookid=?");
		pst.setInt(1, id);
		int r= pst.executeUpdate();
		
		System.out.println("No of raw deleted "+r);
	}
	public void updateData(String anm,int bid) throws SQLException
	{
		pst=con.prepareStatement("update book set autherid=? where bookid=?");
		pst.setString(1, anm);
		pst.setInt(2, bid);
		int r=pst.executeUpdate();
		
		System.out.println("No of row updated "+r);
	}
	public static void main(String[] args) throws SQLException 
	{
		PreparedStst ps= new PreparedStst();
		ps.fetchData();
		//ps.insertData(4567,"pirhana", 200);
		//ps.fetchData();
		//ps.deleteData(675);
		//ps.fetchData();
		ps.updateData("a-12",345);
		ps.fetchData();
	}

}
