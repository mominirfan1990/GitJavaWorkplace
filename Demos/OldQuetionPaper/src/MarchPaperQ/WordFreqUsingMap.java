package MarchPaperQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFreqUsingMap 
{
	ArrayList<String>list;
	Map<String,Integer>map;
	public void findWordFrequency(String sr)
	{
		list=new ArrayList<>();
		map=new LinkedHashMap<>();
		String arr[]=sr.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		for(String x:list)
		{
			int cnt=0;
			cnt=Collections.frequency(list, x);
			map.put(x, cnt);
		}
		System.out.println(map);
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the line ");
		String str= sc.nextLine();
		
		WordFreqUsingMap wm= new WordFreqUsingMap();
		wm.findWordFrequency(str);
		
		sc.close();
	}

}
