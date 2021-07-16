package StringAssignment;

public class SplitString {

	public static void main(String[] args) {
		
		String str = "HELLO$WORD";
		
		String str1 = str.replace("$", " ");
		String strArr[] = str1.split(" ");
		
		for(String s2:strArr)
		{
			System.out.println(s2);
		}
	
	}

}
