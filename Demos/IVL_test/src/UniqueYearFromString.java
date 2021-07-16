import java.util.HashSet;
import java.util.Set;

public class UniqueYearFromString
{
	static int distinctYear(String str)
	{
		String str2=" ";
		Set<String> uniqueDates = new HashSet<>();
		for(int i=0; i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				str2 += (str.charAt(i));
			}
			if(str.charAt(i)=='-')
			{
				str2=" ";
			}
			if(str2.length()==4)
			{
				uniqueDates.add(str2);
				str2=" ";
			}
		}
		
				
		return uniqueDates.size();
		
	}
	static int distyear(String str)
	{
		int count=0;
		String arr[]=str.split("-");
		for(String x:arr)
		{
			if(x.length()==4)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		String str= "un was established on 24-10-1945"
				+"india got freedom on 15-08-1947";
		System.out.println(distinctYear(str));
		System.out.println(distinctYear(str));
	}

}
