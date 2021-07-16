package inht_Multilevel_Example1;

public class Country 
{
 String name;
 int pop;
 
 Country()
 {
	name="India";
	pop = 150000000;
 }
 /*public void accept(String n, int p)
 {
	 name= n;
	 pop = p;
 }
 */
 public void show ()
 {
	 System.out.println("Country name ::"+name+"\n Total Population  ::"+pop);
 }
 
}
