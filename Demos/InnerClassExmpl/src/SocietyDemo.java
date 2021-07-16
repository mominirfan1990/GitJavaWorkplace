

public class SocietyDemo {

	public static void main(String[] args)
	{
		Society o = new Society("Trimurti",2341);
		Society.Flat f= o.new Flat(101,"Mr.ABX");
		f.flatDeatials();
	/*	
		Society.Commitee c=new Society.Commitee();
		c.showCommit();
	*/
	}

}
