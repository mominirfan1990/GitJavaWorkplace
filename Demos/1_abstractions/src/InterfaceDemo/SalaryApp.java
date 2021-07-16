package InterfaceDemo;

public class SalaryApp {

	public static void main(String[] args) 
	{
		Employee e= new Manegar(30000);
		e.calcuatePt();
		e.calculateTDS();
		e.information();
		
	//	Manegar m =(Manegar)e;
		
		((Manegar)e).calculatenetSal();
	}

}
