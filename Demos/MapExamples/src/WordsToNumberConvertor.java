
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordsToNumberConvertor 
{
	static final List<String> wordList=Arrays.asList("zero","one","two","three","four","five","six","seven",
			    "eight","nine","ten","eleven","twelve","thirteen","fourteen",
			    "fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
			    "thirty","forty","fifty","sixty","seventy","eighty","ninety",
			    "hundred","thousand","million","billion");
	  
   	static boolean isValidWord = true;
   	static long tempNumber = 0;
   	static long finalNumber = 0;
    static void convertWordsToNumber(String inputWord)
    {
    if(inputWord != null && inputWord.length()> 0)
    {
    	inputWord = inputWord.replaceAll("-", " ");
    	inputWord = inputWord.toLowerCase().replaceAll(" and", " ");
        String[] inputWordSplit = inputWord.trim().split("\\s+");

        for(String str : inputWordSplit)
        {
            if(!wordList.contains(str))
            {
            	isValidWord = false;
                System.out.println("Invalid word found : "+str);
                break;
            }
        }
        if(isValidWord)
        {
            for(String str : inputWordSplit)
            {
                if(str.equalsIgnoreCase("zero")) 
                	tempNumber += 0;
             
                else if(str.equalsIgnoreCase("one")) 
                	tempNumber += 1;
            
                else if(str.equalsIgnoreCase("two")) 
                	tempNumber += 2;
                
                else if(str.equalsIgnoreCase("three")) 
                	tempNumber += 3;
                
                else if(str.equalsIgnoreCase("four")) 
                	tempNumber += 4;
                
                else if(str.equalsIgnoreCase("five")) 
                	tempNumber += 5;
                
                else if(str.equalsIgnoreCase("six")) 
                	tempNumber += 6;
                
                else if(str.equalsIgnoreCase("seven")) 
                	tempNumber += 7;
                
                else if(str.equalsIgnoreCase("eight")) 
                	tempNumber += 8;
                
                else if(str.equalsIgnoreCase("nine")) 
                	tempNumber += 9;
                
                else if(str.equalsIgnoreCase("ten")) 
                	tempNumber += 10;
                
                else if(str.equalsIgnoreCase("eleven")) 
                	tempNumber += 11;
                
                else if(str.equalsIgnoreCase("twelve")) 
                	tempNumber += 12;
               
                else if(str.equalsIgnoreCase("thirteen")) 
                	tempNumber += 13;
               
                else if(str.equalsIgnoreCase("fourteen")) 
                	tempNumber += 14;
                
                else if(str.equalsIgnoreCase("fifteen")) 
                	tempNumber += 15;
                
                else if(str.equalsIgnoreCase("sixteen")) 
                	tempNumber += 16;
                
                else if(str.equalsIgnoreCase("seventeen")) 
                	tempNumber += 17;
                
                else if(str.equalsIgnoreCase("eighteen")) 
                	tempNumber += 18;
               
                else if(str.equalsIgnoreCase("nineteen")) 
                	tempNumber += 19;
                
                else if(str.equalsIgnoreCase("twenty")) 
                	tempNumber += 20;
                
                else if(str.equalsIgnoreCase("thirty")) 
                	tempNumber += 30;
                
                else if(str.equalsIgnoreCase("forty")) 
                	tempNumber += 40;
                
                else if(str.equalsIgnoreCase("fifty")) 
                	tempNumber += 50;
                
                else if(str.equalsIgnoreCase("sixty")) 
                	tempNumber += 60;
                
                else if(str.equalsIgnoreCase("seventy")) 
                	tempNumber += 70;
                
                else if(str.equalsIgnoreCase("eighty")) 
                	tempNumber += 80;
                
                else if(str.equalsIgnoreCase("ninety")) 
                	tempNumber += 90;
                
                else if(str.equalsIgnoreCase("hundred")) 
                	tempNumber *= 100;
                
                else if(str.equalsIgnoreCase("thousand")) {
                	tempNumber *= 1000;
                    finalNumber += tempNumber;
                    tempNumber=0;
                }
                else if(str.equalsIgnoreCase("million")) {
                	tempNumber *= 1000000;
                    finalNumber += tempNumber;
                    tempNumber=0;
                }
                else if(str.equalsIgnoreCase("billion")) {
                	tempNumber *= 1000000000;
                    finalNumber += tempNumber;
                    tempNumber=0;
                }
               
            }

            finalNumber += tempNumber;
            tempNumber=0;
            System.out.println(finalNumber);
        }
    }
    }
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the Number in textual format");
		String textNumber=sc.nextLine();
		convertWordsToNumber(textNumber);
		sc.close();
	
	}

}
