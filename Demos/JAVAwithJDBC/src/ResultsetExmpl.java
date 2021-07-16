import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetExmpl 
{
	Statement st;
	ResultSet sr;
	static Connection con;
	public ResultsetExmpl() throws SQLException
	{
		con=AchieveConnection.getConnection();
		System.out.println("connection done");
		st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
	}
	
	public void resultSetFectch() throws SQLException
	{
		sr=st.executeQuery("select * from book");
		
	}
	public void showInForward() throws SQLException
	{
		System.out.println(" record in forward direction ");
		sr.beforeFirst();
		System.out.println("book id  \t"+"  Book Name  \t"+"  Bookprice \t"+"  autherid \t"+"  billid \t");
		while(sr.next())
		{
			System.out.println(sr.getInt(1)+"  \t\t"+sr.getString(2)+"  \t\t"+sr.getInt(3)+"  \t\t"+sr.getString(4)+" \t\t"+sr.getInt(5));
		}
	}
	public void showInReverse() throws SQLException
	{
		System.out.println(" record in reverse direction ");
		sr.afterLast();
		System.out.println("book id  \t"+"  Book Name  \t"+"  Bookprice \t"+"  autherid \t"+"  billid \t");
		while(sr.previous())
		{
			System.out.println(sr.getInt(1)+"  \t\t"+sr.getString(2)+"  \t\t"+sr.getInt(3)+"  \t\t"+sr.getString(4)+" \t\t"+sr.getInt(5));
		}
	}
	public void methods() throws SQLException
	{
		
		System.out.println(" in absoulute and relative row record ");
		sr.absolute(3);   // go to exact 3rd row 
		System.out.println(sr.getInt(1)+"  \t\t"+sr.getString(2)+"  \t\t"+sr.getInt(3)+"  \t\t"+sr.getString(4)+" \t\t"+sr.getInt(5));
		
		sr.relative(-2); // go to current row - 2 row position
		System.out.println(sr.getInt(1)+"  \t\t"+sr.getString(2)+"  \t\t"+sr.getInt(3)+"  \t\t"+sr.getString(4)+" \t\t"+sr.getInt(5));
		
		sr.first(); // cursor at first row
		System.out.println(sr.getInt(1)+"  \t\t"+sr.getString(2)+"  \t\t"+sr.getInt(3)+"  \t\t"+sr.getString(4)+" \t\t"+sr.getInt(5));
		
		sr.last(); // cursor at last row
		System.out.println(sr.getInt(1)+"  \t\t"+sr.getString(2)+"  \t\t"+sr.getInt(3)+"  \t\t"+sr.getString(4)+" \t\t"+sr.getInt(5));
		
		sr.last();
		sr.deleteRow(); 
	}
	public void insertRecords(int bid,String bnam,int pr,String aid,int bil) throws SQLException
	{
		sr.moveToInsertRow();
		sr.updateInt(1, bid);
		sr.updateString(2, bnam);
		sr.updateInt(3,pr);
		sr.updateString(4, aid);
		sr.updateInt(5,bil);
		
		sr.insertRow();
		System.out.println("Row inserted Successfully ");
	}
	public void updateRecord(int bid,int pr) throws SQLException
	{
		sr.beforeFirst();
		while(sr.next())
		{
			if(sr.getInt(1)==bid)
			{
				sr.updateInt("bookpricel",pr);
				sr.updateRow();
			}
		}
	}
	public void deleteRecord(int bid) throws SQLException
	{
		sr.beforeFirst();
		while(sr.next())
		{
			if(bid==sr.getInt(1))
			{
				sr.deleteRow();
			}
		}
		System.out.println("record deleted successfully ");
	}
	public static void main(String[] args)
	{
		ResultsetExmpl ps=null;
		try
		{
			ps = new ResultsetExmpl();
			ps.resultSetFectch();
			ps.showInForward();
			//ps.showInReverse();
			//ps.methods();
			//ps.insertRecords(2121,"YARANA", 580, "a-12", 3);
			// ps.deleteRecord(2121);
			//ps.updateRecord(2324,2500);
			//ps.showInForward();
		}
		catch (SQLException e) 
		{
			
			System.out.println(e.getMessage());
		}
		finally
		{
			try 
			{
				if(ps.sr!=null)
					ps.sr.close();

				if(ps.st!=null)
					ps.st.close();
				
				if(con!=null)
					con.close();
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}


}
