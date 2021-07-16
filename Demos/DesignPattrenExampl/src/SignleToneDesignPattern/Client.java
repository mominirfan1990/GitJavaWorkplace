package SignleToneDesignPattern;

public class Client {

	public static void main(String[] args)
	{
		App o=App.getObject();
		App o1= App.getObject();
		
		System.out.println(o.hashCode());
		System.out.println(o1.hashCode());
		
	}

}
