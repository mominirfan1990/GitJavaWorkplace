package AugestPaperQ;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;




//10.	Write a jdbc program to display highest selling model 
//along with name and count 

public class AugestPaper
{
	Statement st,st1;
	ResultSet rs,rs1;
	static Connection con;
	public AugestPaper()
	{
		//con=AchieveConnection.getConnection();
	}
	public void findHeighestSellingModel() throws SQLException
	{
		int count1=0;
		st=con.createStatement();
		st1=con.createStatement
				(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		rs=st.executeQuery("select * from model");
		rs1=st1.executeQuery("select * from purchase");
		HashMap<String,Integer>map=new HashMap<>();
		while(rs.next())
		{
			int count=0;
			int mid=rs.getInt(1);
			String mod=rs.getNString(2);
			rs1.beforeFirst();
			while( rs1.next())
			{
				if(rs1.getInt(3)==mid)
				{
					count++;
				}
			}
			if(count>=count1)
			{
				count1=count;
				map.put(mod, count1);
			}
		}
		System.out.println("Heighest Selling model is ");
		System.out.println(map);
	}
	
	public static void main(String ar[])
	{
		AugestPaper ap =new AugestPaper();
		try {
			ap.findHeighestSellingModel();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
