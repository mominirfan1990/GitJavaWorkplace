import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class statmentDemo 
{
	static Connection con;
	
	Statement st;
	st=con.createStatement();
	ResultSet rs= st.executeQuery("select * from employee ");
	
	PreparedStatement pt;
	pt=con.createPreparedStatemnt();
	ResultSet rs1=pt.executeQuery("");
}
