package inheritanceExample;

public class ClassRoom extends Student
{
	int slot1,slot2;
	String teachers;
	
	public void timeSlot(int a,int b)
	{
		slot1 = a;
		slot2=b;
	}
	public void allocateTeacher(String name)
	{
		teachers = name;
		System.out.println("Allocated Teacher is ::" + teachers + "\n at Time slot of ::"+slot1+" am  to "+ slot2 +"  pm");
	}


	public static void main(String[] args)
	{
		ClassRoom cs = new ClassRoom();
		cs.takeAdmiddion("IT", "AISSMS", "JAVA");
		cs.acceptDetails("Irfan", 13);
		cs.timeSlot(10,04);
		cs.displayDetails();
		cs.allocateTeacher("Mr Bond");
		
	}
}
