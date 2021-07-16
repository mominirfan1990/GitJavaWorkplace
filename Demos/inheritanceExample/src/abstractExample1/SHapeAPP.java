package abstractExample1;

public class SHapeAPP 
{

	public static void main(String[] args)
	{
		Shape sp;
		sp= new Circle();
		sp.despcribeShape();
		sp.fillColor("Pink");
		System.out.println();
		
		sp= new Rectangle();
		sp.despcribeShape();
		sp.fillColor("Blue");
		System.out.println();
		
		sp=new Heart();
		sp.despcribeShape();
		sp.fillColor("Red");
		Heart ht = (Heart)sp;
		ht.drawShape();
		
	/*	FreeHandShape fs;
		fs = new Heart();
		fs.despcribeShape();
		fs.drawShape();
		fs.fillColor("Red");
		*/
		
		
		
	}

}
