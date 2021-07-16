package StringAssignment;

public class StringBasic {
	
		public void StringCreation()
		{
			String comp="ThinkQuotiont";
			System.out.println(comp);
			comp="JAVA PVT LTD ";
			System.out.println(comp);
			
			String s1 = new String();
			System.out.println(s1); // defualt contructor 
			
			String s2 = new String("OOPS");
			System.out.println(s2); // parameeterised constructor
			
			char ch[]= {'i','r','f','a','n'};
			String s3= new String(ch);
			System.out.println(s3);
			String s4= new String(ch,1,2);
			System.out.println(s4);
		}
		
		public void BasicStringMethods()
		{
			String str = "ThinkQuotiot Software pvt ltd";
			System.out.println(str+ "lenght is ="+ str.length());
			
			char ch = str.charAt(5);
			System.out.println("character at 5 = "+ch);
			
			String sub= str.substring(3);
			System.out.println(sub);
			
			String sub1= str.substring(2, 8);
			System.out.println(sub1);
			
			int i =  str.indexOf('t'); // it will show 1st occurence of cha 't'
			System.out.println(i);
			i= str.indexOf("ltd");
			System.out.println(i);
			i= str.lastIndexOf('i');
			System.out.println(i);
			String s1 = str.replace('i', 'X');
			System.out.println(s1);
			
			String strArr[] = str.split(" ");
			
			for(String s2:strArr)
			{
				System.out.println(s2);
			}
			
			System.out.println("Lower case "+str.toLowerCase());
			System.out.println("Upper case "+str.toUpperCase());
			
			System.out.println(str.startsWith("Quo"));  // boolean o/p true or false
			System.out.println(str.endsWith("d"));
			
			String name = " IRFAN ";
			System.out.println(name.length());
			System.out.println(name.trim().length());
			
			String ss = "Hello";
			String sc = ss.concat(" How Are You");
			System.out.println(sc);
			
			String sg = ss+sc;
			System.out.println(sg);
			
			String s2 = "Hello";
			String s3 = "Hello";
			
			if(s2==s3)
			 System.out.println("True");
			 else
				 System.out.println("false");
			
			if(s2.equals(s3))
				System.out.println("true");
			 else
				 System.out.println("false");
			
			String s4 =new String("Hello");
			if(s3.equals(s4))              // check contanet
				 System.out.println("True");
			 else
				 System.out.println("false");
			
			if(s3==s4)                       // check hashcode 
				 System.out.println("True");
			else
				 System.out.println("false");
			
			String s5 = "Hello";
			String s6 = "HELLO";
		
			if(s5==s6)
			 System.out.println("True");
			 else
				 System.out.println("false");
			
			if(s5.equalsIgnoreCase(s6))
				System.out.println("true");
			 else
				 System.out.println("false");
								
		}
		public static void main(String[] args)
		{
			StringBasic obj1=new StringBasic();
			obj1.StringCreation();
			obj1.BasicStringMethods();
			
		}

		
}
