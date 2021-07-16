// parent class of novels class
package inhe_single_Exp2;

public class Book 
{
	String type, category,langauge;  //(audio , paper , picture book)
	
	public void acceptDetails(String typ,String cat,String lang)
	{
		type = typ;
		category = cat;
		langauge = lang;
	}
	public void show()
	{
		System.out.println("Book is in  "+ langauge+ " Langauge  "+type+" Book"+ "\n"+category +"  Category" );
	}
}
