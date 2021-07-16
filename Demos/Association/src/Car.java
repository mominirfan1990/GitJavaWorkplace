//Association with containment aggregation with construct method

public class Car 
{


	int regno, avg;
	String model;
	Driver d1;
	
	Car()      //default constructor its dot have parameter 
	{
		regno = 4567;
		avg = 23;
		model = "Maruti";
		
		System.out.println("Defualt Contructer of car class");
		d1=new Driver();
	}
	

	
	 Car ( int rg, int av , String md,Driver d1)  // parameter constructor .. its initialize by parameter
	{
		regno = rg;
		avg = av;
		model = md;
		this.d1 = d1;
		
	}
	
	 public void diDetails()
	 {
		 System.out.println("car Details "+ "\nReg No :"+ regno + "\n Average : "+ avg + "\n model : "+model + "\n"+d1);
	 } 
	 
	 public void polutionCertificate()
	 {
		 d1.TakeRTOExam();
		 System.out.println( "Car is PUC Certified");
		 
		 
	 }
	 
	
	
	
	public static void main(String[] args)
	{
		
		Driver d1=new Driver();
		System.out.println(d1);
		Car san = new Car(12345, 24,"Hundai",d1);
		Car santro = new Car();
		santro.polutionCertificate();
		santro.diDetails();	
		san.diDetails();
	}
	
}


