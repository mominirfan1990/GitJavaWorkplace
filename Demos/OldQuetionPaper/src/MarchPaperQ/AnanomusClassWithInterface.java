package MarchPaperQ;

interface Bike
{
	public void ride();
}

public class AnanomusClassWithInterface implements Bike 
{

	public static void main(String[] args) 
	{
		AnanomusClassWithInterface as= new AnanomusClassWithInterface()
				{
					@Override
					public void ride() 
					{
						System.out.println("bike riding ");
					}
				};
	}

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
