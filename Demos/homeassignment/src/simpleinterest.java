import java.util.Scanner;
public class simpleinterest
{

	public static void main(String[] args)
	{
	 float P,T,R,SI,I;
	 Scanner sc;
	 sc = new Scanner(System.in);
	 System.out.println("Please Enter Principal Amount P=");
	 P = sc.nextFloat();
	 System.out.println("Please Eneter Tenure in Year T=");
	 T= sc.nextFloat();
	 System.out.println("Please Enter Rate Of Interest R=");
	 R= sc.nextFloat();
	 R=(R/100);
	 
	 I = (P*R*T); // only interset
	 SI = (P*(1+R*T)); // priciple +interest
	// CI = (P(1+R)^T-P);  compond interest formula
	 System.out.println("Simple interest is ="+I);
	 System.out.println("priciple + simple Interest is ="+ SI);
	}
}
