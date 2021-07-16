import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class transectionManegement
{
	Statement st,st1;
	ResultSet rs;
	static Connection con;
	PreparedStatement pst;
	transectionManegement()
	{
		con=AchieveConnection.getConnection();
		System.out.println("Connection done ");
	}
	public void manageTransection() throws SQLException
	{
		st=con.createStatement();
		con.setAutoCommit(false);
		int cnt=st.executeUpdate("insert into departments values(54,'Electrical',1006,78)");
		System.out.println("Row inserted "+ cnt);
		int cnt1=st.executeUpdate("update departments set department_id=56 where department_id=55");
		System.out.println("record aupdated "+cnt1);
		con.commit();
		con.rollback();
	}
	public void manageTransWithSavepoint() 
	{
		Savepoint p=null;
		try 
		{
			st1=con.createStatement();
			con.setAutoCommit(false);
			
			int cnt1=st1.executeUpdate("update departments set department_name='HR' where department_id=56");
			System.out.println("record aupdated "+cnt1);
			
			p=con.setSavepoint();
			
			int cnt=st1.executeUpdate("insert into departments values(54,'Electrical',1006,78)");
			System.out.println("Row inserted "+ cnt);
			
			con.commit();
			con.rollback(p);
			
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			try
			{
				con.commit();
			}
			catch (SQLException e)
			{
				System.out.println(e.getMessage());
			}
		}
		

	}
	public void updateSavepoint(int did,String nam)
	{
			Savepoint p=null;
			try 
			{
				st1=con.createStatement();
				con.setAutoCommit(false);
				
				int cnt1=st1.executeUpdate("update departments set department_name='Cleark' where department_id=55");
				System.out.println("record aupdated "+cnt1);
				
				p=con.setSavepoint();
				
				pst=con.prepareStatement("update departments set department_name=? where department_id=?");
				pst.setString(1, nam);
				pst.setInt(2, did);
				int r=pst.executeUpdate();
				
				System.out.println("No of row updated "+r);
				
				
				con.commit();
				con.rollback(p);
				
			}
			catch (SQLException e) 
			{
				System.out.println(e.getMessage());
			}
			
			finally
			{
				try
				{
					con.commit();
				}
				catch (SQLException e)
				{
					System.out.println(e.getMessage());
				}
			}
		
	}
	public static void main(String[] args)
	{
		transectionManegement tm = new transectionManegement();
			//tm.manageTransection();
			//tm.manageTransWithSavepoint();
			tm.updateSavepoint(56,"Human Resource");

	}

}
