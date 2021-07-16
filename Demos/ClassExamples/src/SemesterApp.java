
public class SemesterApp
{
	
		public static void main(String[] args)
		{
		Semester sem1=new Semester();
		sem1.acceptDetails(78, 67, 88);
		Semester sem2=new Semester();
		sem2.acceptDetails(79, 90, 77);
		// Semester finalResult = new Semester(); only when pass object as parameter
		
		// finalResult.calculateResult(sem1,sem2);
		//finalResult.show();
		
		Semester finalResult=sem1.calculateResult(sem2);   // pass object as parameter and return object as parameter
		finalResult.show();
		
		
		}
	
}
