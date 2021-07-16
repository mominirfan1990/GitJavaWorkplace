package StringAssignment;

public class ToggleCaseOfStringChar {

	public static void main(String[] args) {
		
		String s1=" IrfAn";
		char ch[]=s1.toCharArray();
		for(char x :ch)     // using for each
		{
			if(x >=65 && x <=89 )
				System.out.print(x= (char) (x+32));
			else if (x>=97 && x<=177)
				System.out.print(x= (char) (x-32));
		}
		
		
	}

}
