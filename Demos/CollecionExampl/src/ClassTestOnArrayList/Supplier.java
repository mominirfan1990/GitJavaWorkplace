package ClassTestOnArrayList;

public class Supplier
{
		int suppId;
		String suppName;
		Supplier()
		{}
		Supplier(int sid,String snm)
		{
			suppId=sid;
			suppName=snm;
		}
		public String toString() 
		{
			return "Supplier [suppId=" + suppId + ", suppName=" + suppName + "]";
		}
}
