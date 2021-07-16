package classTest7;

public class ClassTest_Q_2 {
	public void foo(String s)
	{
		System.out.println("s");
	}
	public void foo(StringBuffer sb)
	{
		System.out.println("sb");
	}
	public static void main(String[] args) {
		
		 new ClassTest_Q_2().foo("null");
		
	}

}
