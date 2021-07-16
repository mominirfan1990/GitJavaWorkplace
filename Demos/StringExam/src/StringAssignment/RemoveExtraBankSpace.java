package StringAssignment;

public class RemoveExtraBankSpace {

	public static void main(String[] args)
	{
		String s1=" Think Quotiont A";
//		String str = s1.replace(" ","");
//		System.out.println(str);
		
		String s[]=s1.split(" ");
		String temp="";
		
		for(String s2:s)
		{
			temp=temp+s2;
		}
		System.out.println(temp);
	}

}
