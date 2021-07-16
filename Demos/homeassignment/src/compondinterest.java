import java.util.Scanner;
public class compondinterest 
{
  public static void main(String[] args)
  {
	double P,R,T,CI,CIP;
	Scanner sc;
	sc= new Scanner(System.in);
	System.out.println("Please Eneter Principle P = ");
	P=sc.nextDouble();
	System.out.println("Please Eneter Rate of Interest R =");
	R=sc.nextDouble();
	System.out.println("Please Eneter Tenure in Year T =");
	T=sc.nextDouble();
	
	R= (R/100);
	CI = P*(Math.pow((1+R),T))-P;
	System.out.println("Compond Interest is =" + CI);
	CIP = P*(Math.pow((1+R),T));
	System.out.println("Compond interest With Principle ="+ CIP);
  }
}
