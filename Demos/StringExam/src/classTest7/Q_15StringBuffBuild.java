package classTest7;

public class Q_15StringBuffBuild {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("ThinkQuotiont Software ");
		StringBuffer sb1= new StringBuffer("JAVA");
		
		System.out.println(" String Buffer Function o/p ");
		System.out.println("Capacity of sb "+ sb.capacity());
		System.out.println("lenght of sb "+sb.length());
		System.out.println("append function "+sb.append(sb1));
		System.out.println("sb1 after insert r at 2 index "+sb1.insert(2, 'r'));
		System.out.println(sb1.replace(1, 4, "jdk"));
		System.out.println(sb.reverse());
		
		
		System.out.println(" String Builder Function o/p ");
		
		StringBuilder sd = new StringBuilder("Java Programming");
		StringBuilder sd1= new StringBuilder("JDK");
		
		System.out.println(sd.deleteCharAt(1));
		System.out.println(sd.insert(1, 'S'));
		System.out.println(sd.replace(0,4, "Python"));
		System.out.println(sd.capacity());
		System.out.println(sd.length());
		
	}

}
