package MayPaperQ;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;


public class CallStorePrc
{
	CallableStatement st;
	static Connection con;
	public CallStorePrc() 
	{
		con=CreateConnection.getConToSql();
	}
	public void callStorePrcedure() throws SQLException
	{
		st=con.prepareCall("{call hotelfindbyCity(?)}");
		st.setNString(1, "pune");
		System.out.println("Hotel in Pune ");
		boolean flag=st.execute();
		if(flag)
		{
			ResultSet rs=st.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getNString(1));
			}
		}
	}
	public static void main(String[] args)
	{
		CallStorePrc cp = new CallStorePrc();
		try 
		{
			cp.callStorePrcedure();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
