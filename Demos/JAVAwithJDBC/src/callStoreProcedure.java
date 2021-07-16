import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;




public class callStoreProcedure 
{
	static Connection con;
	public callStoreProcedure() throws SQLException
	{
		con=AchieveConnection.getConnection();
		System.out.println("connection done");
				
	}
	public void callStoredPrcedure(int eid) throws SQLException
	{
		CallableStatement cst= con.prepareCall("{call employeecount(?,?)}");
		cst.setInt(1,eid);
		cst.registerOutParameter(2,Types.INTEGER);
		cst.execute();
		int cont=cst.getInt(2);
		System.out.println(cont);
	}
	public void callbookProcedure(int bid) throws SQLException
	{
		CallableStatement cst= con.prepareCall("{call authernamebyid(?,?,?)}");
		cst.setInt(1, bid);
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		
		String bname=cst.getString(2);
		int price=cst.getInt(3);
		
		System.out.println("Auther name "+bname+" "+"Book price "+price);
		
	}
	public void callFunction(int mid) throws SQLException
	{
		CallableStatement cst= con.prepareCall("{?=call getsal(?)}");
		cst.setInt(2,mid);
		cst.registerOutParameter(1, Types.INTEGER);
		cst.execute();
		
		int sal=cst.getInt(1);
		System.out.println("AVaragre salary "+sal);
	}
	public static void main(String[] args) 
	{
		callStoreProcedure cp;
		try
		{
			cp = new callStoreProcedure();
			//cp.callStoredPrcedure(55);
			//cp.callbookProcedure(345);
			cp.callFunction(21);
		} 
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
