package MarchPaperQ;

import java.util.Iterator;
import java.util.TreeSet;

class Train implements Comparable<Train>
{
	int trainid;
	String trainname;
	int totalseat;
	public Train(int id, String nm, int tseat)
	{
		trainid=id;
		trainname=nm;
		totalseat=tseat;
	}
	@Override
	public String toString() 
	{
		return "Train [trainid=" + trainid + ", trainname=" + trainname + ", totalseat=" + totalseat + "]";
	}
	@Override
	public int compareTo(Train o)
	{
		if(o.totalseat>this.totalseat)
			return -1;
		else if(o.totalseat<this.totalseat)
			return 1;
		else
			return 0;
	}
	
}

public class TreesetSorted
{
	TreeSet<Train>ts;
	public void createTrainData()
	{
		ts=new TreeSet<>();
		ts.add(new Train(1123,"Rajadhani",100));
		ts.add(new Train(3025,"shatabdi",45));
		ts.add(new Train(4567,"chennai mail",10));
		ts.add(new Train(9987,"delhi superfast",20));
		ts.add(new Train(2490,"kokan passenger",178));
		
		Iterator<Train>itr=ts.iterator();
		while(itr.hasNext())
		{
			Train t= itr.next();
			System.out.println(t.trainid+" "+t.trainname+" "+t.totalseat);
		}
	}
	public static void main(String[] args)
	{
		TreesetSorted s= new TreesetSorted();
		s.createTrainData();
	}

}
