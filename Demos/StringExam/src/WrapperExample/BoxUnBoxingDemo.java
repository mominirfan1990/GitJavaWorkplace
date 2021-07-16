package WrapperExample;

public class BoxUnBoxingDemo {

	public static void main(String[] args) {
		
		// converting into integer, primitive to Wrapper class
		
/*		int a=20;
		Integer i1 = new Integer(a); // converting int into Integer expicitily
		Integer i= Integer.valueOf(a); 
		Integer j=a; // Autoboxing 
		System.out.println(a +" "+i+" "+j);
*/		
		
		// converting Integer to int , wrapper to premitive
		
/*		Integer a = new Integer(3);
		int i=a.intValue(); // return vale of Integer to int
		int j=a;   // unboxing
		System.out.println(a +" "+i+" "+j);
*/
		
		// parseXXX(String) used for converting String to array
		
/*		String str="10";
		int val = Integer.parseInt(str);
		double d= Double.parseDouble(str);
		float f= Float.parseFloat(str);
		// boolean and char method not in wrapper class
		
*/
		// XXXValue()
		
	//	Number obj=new Number(); // cannot instantiate type mean wrapper class obj is abtract
		
/*		Number obj = new Integer("25");
		System.out.println(obj.intValue());
		System.out.println(obj.floatValue());
		System.out.println(obj.doubleValue());
				
		Number obj1 = new Float("25.09");
		System.out.println(obj1.intValue());
		System.out.println(obj1.doubleValue());
*/	
		// String class ValueOf() premitive to string
		
		String name="Jayshree";
		String b = String.valueOf(false);
		System.out.println(b);
	
		String strr=String.valueOf(10);
		System.out.println(strr);
		
		String strr1=String.valueOf(10.0);
		System.out.println(strr1);
		
		char[] ch= {'i','r','f','a','n'};
		String strr2= String.valueOf(ch);
		System.out.println(strr2);
		
		String strr3=String.valueOf(name);
		System.out.println(strr3);
 	}

}
