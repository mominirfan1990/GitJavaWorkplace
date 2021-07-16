//child class of langauge class

package inht_hirarchical_Example1;

public class Assembly extends Language
{
	String  level,type;
	int no;
	
	public void accept( String tp,String lev,int no)
	{
		type = tp;
		level = lev;
		this.no=no;
	}
	public void show()
	{
		System.out.println("Assembly langauge is   "+level +"\n Set of instruction ::"+type+"Example ::" + no);
	}
	
	public static void main(String[] args)
	{
		Assembly as = new Assembly();
		as.accept("Limited No of set","MAchine level", 8051);
		as.acceptD("Software ");
		as.show();
		as.displayDetails();
	}
}
