package Class_Test_6;

import java.util.Scanner;

public class Q_2_Ternary {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Score ");
		int score = sc.nextInt();
		
		String b="Bronze", s="Silver", g="Gold", p="Platinum";
		
		String result= score<60000?score<40000?score<25000?b:s:g:p;
		
		System.out.println(result);
	}

}
