package Example5;

public class decorateApp {

	public static void main(String[] args)
	{
		decorable lt;
		lt = new Letter();
		lt.decorate();
		lt= new NumberS();
		lt.decorate();
		
	}

}
