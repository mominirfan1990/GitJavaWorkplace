
public class ArraySeatAvailableEachLine {

	public static void main(String[] args) {

		int ar1[]= {1, 0, 0, 1, 1, 1, 0};
		int ar2[]= {1, 0, 1, 0};
		int ar3[]= {0, 0, 0, 0, 1, 1, 1, 0, 0};
		int cnt1=0,cnt2=0,cnt3=0;
		for(int i=0; i<=ar1.length-1; i++)
		{
			if(ar1[i]==0)
			{
				cnt1++;
			}
		}
		System.out.println("First Line total seats are available for booking are "+cnt1);
		for(int i=0; i<=ar2.length-1; i++)
		{
			if(ar2[i]==0)
			{
				cnt2++;
			}
		}
		System.out.println("Second Line total seats are available for booking are "+cnt2);
		for(int i=0; i<=ar3.length-1; i++)
		{
			if(ar3[i]==0)
			{
				cnt3++;
			}
		}
		System.out.println("Second Line total seats are available for booking are "+cnt3);
		
	}

}
