package StrngBuffBuildr;

public class BufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();     // defualt capacity 16
		StringBuffer sb2 = new StringBuffer("ThinkQoutiont sortware "); // default capacity 16 + String lenght
		StringBuffer sb3 = new StringBuffer(24); // with enetered capacity of 24
		
/*		System.out.println(sb1.capacity());   // return  capacity of buffer
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		
		System.out.println(sb1.length());   // return length of character sequence in string Buffer
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		
*/		
		StringBuffer sb =new StringBuffer();  
		
		System.out.println("capacity " +sb.capacity());
		System.out.println("lenght "+ sb.length());
		
		System.out.println(sb.append(sb2));  //Appends the specified StringBuffer to this sequence. 
		
		System.out.println("capacity after append " +sb.capacity());
		System.out.println("lenght after append "+ sb.length());
		
		boolean flag = false;
//		sb2.insert(2,flag);         // insert boolean expression
//		System.out.println(sb2+" "+sb2.length());	
		 String str = "IRFANMOMIN";
		 System.out.println(sb2);
		sb2.insert(5, str, 2, 8); // insert String char index 2 to 8 at 5th index StringBuffer sb2 
		System.out.println(sb2);

		//StringBuffer sb =new StringBuffer("Irfan");
		//System.out.println(sb.replace(2, 4, "MOM"));  //replace String character in between given index
		
		//System.out.println(sb.reverse());  // reverse character in string buffer 
		
		//System.out.println(sb.charAt(4));    // return character at give index
		
		//System.out.println(sb.deleteCharAt(3)); // delete character of given index
		
		//System.out.println(sb.substring(2)); // return new string character sequence from given index-1
	
		// System.out.println(sb.substring(1, 5));
		
		// System.out.println(sb.subSequence(1, 4)); // return subsequence from given start index to given last index-1 , cant creat new string
	
/*		StringBuffer sbc= new StringBuffer("Jayshree");
		sbc.insert(3,' ');
		System.out.println(sbc);
*/
		StringBuffer sb4=new StringBuffer("JAVA");

		StringBuffer sb5=new StringBuffer("JAVA");

		System.out.println(sb4.equals(sb5));   // return false   .equals method not overridden in stringBuffer so its give false output
		System.out.println(sb4==sb5);         // return false
		
		boolean b= sb4.equals(sb5);
		System.out.println(b);
		
		if(sb4==sb5) 
			System.out.println("true");
		else
			System.out.println("false");
	}

}
