package abstractExample1;

abstract public class Shape 
{
	static String bCol="Black";
	String fCol;
	
	public void fillColor(String f)
	{
		fCol=f;
		System.out.println("Fill  "+fCol+"  Color inside the shape "+" and fill "+bCol+"  color To the border of shape");
	}
	 abstract public void despcribeShape();
}
