package MayPaperQ;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustMap 
{
	Map<Integer,ArrayList<String>> map;
	ArrayList<String>list;
	Statement st;
	Statement st1;
	Statement st2;
	ResultSet rs;
	ResultSet rs1;
	ResultSet rs2;
	
	static Connection con;
	CustMap()
	{
		con=CreateConnection.getConToSql();
	}
	
	public void createmap() throws SQLException
	{
		map=new HashMap<>();
		st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		st2=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		rs=st.executeQuery("Select * from booking_details");
		rs1=st1.executeQuery("Select * from booking_details");
		rs2=st2.executeQuery("Select * from Hotel");
		while(rs.next())
		{
			list=new ArrayList<>();
			int custid=rs.getInt(2);
			int hotelid=rs.getInt(4);
			rs1.beforeFirst();
			while(rs1.next())
			{
				if(custid==rs1.getInt(2))
				{
					rs2.beforeFirst();
					while(rs2.next())
					{
						if(rs1.getInt(4)==rs2.getInt(1))
						{
							list.add(rs2.getNString(2));
						}
					}
					
				}
				map.put(custid, list);
			}
			
		}
		System.out.println(map);
		
	}
	public static void main(String[] args) throws SQLException 
	{
		CustMap cm= new CustMap();
		cm.createmap();
	}

}
