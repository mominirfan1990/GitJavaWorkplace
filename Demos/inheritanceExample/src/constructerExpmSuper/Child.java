package constructerExpmSuper;

public class Child extends Parent
{
	String s;
  Child()
  {
	System.out.println("Default constructor of child");  
  }
  Child(String a)
  {
	  super(20);
	  s=a;
	  System.out.println("Paremeterised constructor of child" + s);
  }
}
