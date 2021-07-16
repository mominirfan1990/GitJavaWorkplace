class Swaping_Two_Numbers

{

		public static void main(String[] a1)
		{
			int A=100, B=50;
	

			System.out.println("Values before Swaping" + "=" + A + B);
			
			 A= (A+B);
			 B= (A-B);
			 A= (A-B);
			System.out.println("Values After Swaping" +"=" + A + B);
			
		}


}