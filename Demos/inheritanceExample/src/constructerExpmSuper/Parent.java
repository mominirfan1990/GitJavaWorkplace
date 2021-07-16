package constructerExpmSuper;

public class Parent
{
	int x;
	Parent()
	{
		System.out.println("Default constructor of parent");
	}
	Parent(int x)
	{
		this.x=x;
		System.out.println("Paremetrised Constructor parent "+ x);
	}
}
