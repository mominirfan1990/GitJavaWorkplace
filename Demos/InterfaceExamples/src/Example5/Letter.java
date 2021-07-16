package Example5;

public class Letter implements decorable
{

	@Override
	public void decorate() 
	{
		System.out.println("Decorate entered letters in Bold, Capital and Italic font");
	}

	
}
