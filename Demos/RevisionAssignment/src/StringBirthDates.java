//to display  birth day and year in format like dd/yyyy of all dates with birth month is May

public class StringBirthDates {

	public static void main(String[] args) {
		
		String str[]= {"12/05/2000","08/12/20001","31/06/1993","28/05/1999"};
		String chk= "05";	
		for(int i=0; i<str.length; i++)
		{
			String str1[]=str[i].split(",")
			for(int j=0; j<str1.length; j++)
			{
				if(str1[j].equals(chk))
				{
					for(int k=0; k<str1.length; k++)
					{
						System.out.println(str[k]);
					}
				}
			}
		}

	}

}
