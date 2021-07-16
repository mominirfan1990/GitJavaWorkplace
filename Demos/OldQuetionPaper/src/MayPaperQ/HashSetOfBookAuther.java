package MayPaperQ;

import java.util.HashSet;
import java.util.Iterator;

class Book
{
	int bookid;
	String bookname;
	int autherid ;
	int price ;
	int copiessold;
	
	public Book(int bid, String bnm, int aid, int pr, int sold)
	{
		bookid=bid;
		bookname=bnm;
		autherid=aid;
		price=pr;
		copiessold=sold;
	}

	@Override
	public String toString() 
	{
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", autherid=" + autherid + ", price=" + price
				+ ", copiessold=" + copiessold + "]";
	}
	
}
class Auther
{
	int autherid;
	String authername;
	int totalbookssold; 
	
	public Auther(int aid, String anam)
	{
		autherid=aid;
		authername=anam;
	}
	@Override
	public String toString() 
	{
		return "Auther [autherid=" + autherid + ", authername=" + authername + ", totalbookssold=" + totalbookssold
				+ "]";
	}
	
}
public class HashSetOfBookAuther 
{
	HashSet<Book>bst;
	HashSet<Auther>ast;
	public void createBookSet()
	{
		bst= new HashSet<>();
		Book b1=new Book(10,"Yayati",90,250,35);
		Book b2=new Book(11,"Yugandhar",90,550,50);
		Book b3=new Book(12,"Hitlar",91,300,70);
		

		bst.add(b1);
		bst.add(b2);
		bst.add(b3);
		
	
		ast=new HashSet<>();
		Auther a1=new Auther(90,"v.s.khandekar");
		Auther a2=new Auther(91,"Autl kahate");
		ast.add(a1);
		ast.add(a2);
		
		Iterator<Auther>atr=ast.iterator();
		Iterator<Book>itr;
		while(atr.hasNext())
		{
			itr= bst.iterator();
			Auther at= atr.next();
			while(itr.hasNext())
			{
				Book bk=itr.next();
				if(at.autherid==bk.autherid)
				{
				
					at.totalbookssold+=bk.copiessold;
				}
			}

		}
				
		System.out.println(ast);
			
	}
	public static void main(String[] args)
	{
		HashSetOfBookAuther hs= new HashSetOfBookAuther();
		hs.createBookSet();
	}

}
