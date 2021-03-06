//16. WAP to create a map using Custom class as key and any other Custom class as value

package HashMapAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class SimCard
{
	String name;
	String type;
	SimCard(){}
	SimCard(String nm,String tp){
		name=nm;
		type=tp;
	}
	@Override
	public String toString() {
		return "SimCard =" + name + ", type=" + type;
	}
	@Override
	public int hashCode() {
		return (name.hashCode()+type.hashCode())/100;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(this.getClass()!=obj.getClass())
			return false;
		SimCard so= (SimCard)obj;
		if(this.name.equals(so.name) && this.type.equals(so.type))
			return true;
		else
			return false;
	}
	
	
}
class ComapatibleMobile
{
	String mobname;
	String model;
	ComapatibleMobile(){}
	ComapatibleMobile(String mb, String md){
		mobname=mb;
		model=md;
	}
	@Override
	public String toString() {
		return "mobname=" + mobname + ", model=" + model;
	}
	
}
public class Assign_16 
{
	Map<SimCard,ComapatibleMobile> map;
	
	public void creatMobApp()
	{
		SimCard s1= new SimCard("Idea","4G");
		SimCard s2= new SimCard("Airtel","2G");
		SimCard s3= new SimCard("BSNL","GSM");
		SimCard s4= new SimCard("Vodaphone","CDMA");
		SimCard s5= new SimCard("Idea","4G");
		
		ComapatibleMobile cm1= new ComapatibleMobile("NOKIA","Base Phone");
		ComapatibleMobile cm2= new ComapatibleMobile("MI ","Smart Phone");
		ComapatibleMobile cm3= new ComapatibleMobile("SamSung ","TouchPad Phone");
		
		map=new HashMap<>();
		map.put(s1, cm1);
		map.put(s2, cm3);
		map.put(s3, cm1);
		map.put(s4, cm1);
		map.put(s5, cm2);
	
	}
	
	public void display()
	{
		Set<Entry<SimCard, ComapatibleMobile>> st= map.entrySet();
		Iterator<Entry<SimCard, ComapatibleMobile>> itr= st.iterator();
		while(itr.hasNext())
		{
			Entry<SimCard, ComapatibleMobile> et= itr.next();
			System.out.println(et.getKey());
			System.out.println("Compatible device");
			System.out.println(et.getValue());
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Assign_16 cm= new Assign_16();
		cm.creatMobApp();
		cm.display();
	}
}
