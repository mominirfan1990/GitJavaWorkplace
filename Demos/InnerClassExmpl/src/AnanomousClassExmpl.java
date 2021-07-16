
abstract class ElectronicDevice
{
	abstract public void switchOn(boolean signal);
	
	public void tvTest()
	{
		System.out.println("welcome to TV testing");
	}
}
public class AnanomousClassExmpl
{
	
	public static void main(String[] args) 
	{
		ElectronicDevice ed= new ElectronicDevice()
		{

			public void signalTest()
			{
				System.out.println("siganl tested start ");
			}
			@Override
			public void switchOn(boolean signal)
			{
				signalTest();
				if(signal)
					System.out.println("Use remote to switch ON");
				else
					System.out.println("used manual switch ON");
			}
			
			
		};
		ed.switchOn(true);
		ed.tvTest();
	}

}
