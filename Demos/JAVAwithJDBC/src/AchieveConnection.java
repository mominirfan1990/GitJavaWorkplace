import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AchieveConnection 
{
	static Connection con;
	static Connection con1;
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded ");
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/myfirstworkbase","root","root");
			//("jdbc:mysql://localhost:3306/hr","root","root");
		//	("jdbc:mysql://localhost:3306/previouspapers","root","root");
			System.out.println("Connection with db...");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String arge[])
	{
		AchieveConnection.getConnection();
	}
}
