package classTest;

public class Q_06
{
	int top=-1;
	String arr[];
	Q_06(int val)
	{
		arr= new String[val];
	}
	public void push(String data)
	{
		if(top<arr.length-1)
		{
			arr[++top]=data;
		}
		else
			System.out.println("Stack is Overflow ");
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			if(isPalindrome())
			{
				String temp=arr[top];
				arr[top]=null;
				top--;
				System.out.println("Poped out palindrome String "+temp);
			}
			else
				System.out.println(" Top String is not palindrome ");
		}
	}
	public boolean isPalindrome()
	{
		String stmp= arr[top];
		int i=0;
		int j=stmp.length()-1;
		while(i<j)
		{
			if(stmp.charAt(i)!=stmp.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public void show()
	{
		for(int i=top;i>-1; i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		Q_06 arrst= new Q_06(5);
		arrst.push("JAVA");
		arrst.push("SQL");
		arrst.push("C++");
		arrst.push("VBV");
		arrst.show();
		arrst.pop();
		System.out.println("Stack after pop");
		arrst.show();
	
	}

}
