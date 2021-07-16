package CompareAndComparatorExm;

import java.util.Comparator;

public class Bike implements Comparable<Bike>
{
	int year;
	String model;
	int price;
	Bike()
	{}
	Bike(int yr,String model, int price)
	{
		year=yr;
		this.model=model;
		this.price=price;
	}
	public String toString()
	{
		return "\n Bike Manuf. Year "+year+" model "+ model+" Price "+price;
	}
	public int compareTo(Bike o)
	{
		if(this.year<o.year)
			return -1;
		else if(this.year>o.year)
			return 1;
		else if(this.price<o.price)
			return -1;
		else if(this.price>o.price)
			return 1;
		else 
			return(this.model.compareTo(o.model));
	}
		
}

