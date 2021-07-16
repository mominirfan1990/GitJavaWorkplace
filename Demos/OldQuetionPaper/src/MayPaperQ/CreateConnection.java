package MayPaperQ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CreateConnection 
{
	static Connection con;
	public static Connection getConToSql()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/previouspapers","root","root");
			
			System.out.println("Connection done");
	
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args)
	{
	
		CreateConnection.getConToSql();
	}

}
