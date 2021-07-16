package Example6;

interface  SalCal
{
  float CalSal(float bs);
  default public void CalStipend()
  {
	  System.out.println("Defualt method of SalCal Stipend");
  }
}
