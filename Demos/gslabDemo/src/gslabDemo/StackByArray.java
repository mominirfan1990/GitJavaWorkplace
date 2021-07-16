package gslabDemo;

public class StackByArray
{
	int top=-1;
	int arr[];
	int temp;
	public StackByArray(int val)
	{
		arr=new int[val];
	}
	public void push(int data)
	{
		if(top<arr.length-1)
		{
			arr[++top]=data;
			
		}
		else
			System.out.println("StackOverFlow");
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("stackUnderFlow");
		
		}
		else
		{
			temp=arr[top--];
			System.out.println(temp);
		}
	}
	public void dislay()
	{
		int temp1=top;
		while(temp1!=-1)
		{
			System.out.println(arr[temp1]);
			temp1--;
		}
	}
	public static void main(String []args)
	{
		StackByArray st= new StackByArray(6);
		st.push(12);
		st.push(23);
		st.push(45);
		st.push(1);
		st.push(23);
		st.push(45);
		
		st.dislay();
		System.out.println();
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
	}

}
