 // to check whether two string are anagram or not

package StringAssignment;
import java.util.Scanner;

public class StringAnagram {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st String ");
		String str1  = sc.next();
		System.out.println("Enter the 2nd String ");
		String str2  = sc.next();
		int count=0;
		if(str1.length()==str2.length())
		{
			for(int i=0; i<str1.length(); i++)
			{
				for(int j=0; j<str2.length(); j++)
				{
					if (str2.charAt(j)==str1.charAt(i))
					{
						count++;
						break;
					}
				}
			}
			if(count==str1.length())
				System.out.println("Eneter Strings are anagram");
			else
				System.out.println("Enetered Strings are not anagram");
		}
		else
			System.out.println("Eneter same lenght char");
		
	}

}
