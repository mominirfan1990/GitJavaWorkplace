
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("irfan");
		System.out.println(s);
		String s2=s.intern();
		System.out.println(s2==s);
	}

}
