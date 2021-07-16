
 class Class 
{

	public int rollNo = 06;
	protected int admissionNo = 4211;
	private int age = 20;
	int courseId = 1798;
	
	public void doPublic()
	{
		System.out.println("you are in public method  "+rollNo);
	}
	
	 void doDefualt()
	{
		 System.out.println("you are in defualt method  "+courseId);
	}
	 
	 protected void doProtected()
	 {
		 System.out.println("you are in protected method   "+admissionNo);
	 }
	 
	 private void doPrivate()
	 {
		 System.out.println("you are in private method   "+age);
	 }
	 
	 
	 
		 
}


