package regularExpressionDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDem {

	public static void main(String[] args)
	{
		String st= "9922867929";
		
		if(st.matches("[0-9]{10}"))
			System.out.println("Valid number");
		else
			System.out.println("not valid number");
		
		
		Pattern p= Pattern.compile("[0-9]{10}");
		Matcher m=p.matcher(st);
		if(m.find())
			System.out.println("Valid number");
		else
			System.out.println("not valid number");
		
		System.out.println(Pattern.matches("[0-9]{10}", st));
		
	}

}
