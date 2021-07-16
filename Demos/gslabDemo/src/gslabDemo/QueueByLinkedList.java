package gslabDemo;

public class QueueByLinkedList 
{
	
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	public Node head=null;
	public Node tail=null;
	
	public void enqueue(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void dequeue()
	{
		int temp=head.data;
		head=head.next;
		System.out.println(temp+" ");
	}
	
	public void displayQueue()
	{
		System.out.println("Queue elements are");
		Node temp=head;
		
		if(head==null)
			System.out.println("queue is empty");
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public static void main(String[] args)
	{
		QueueByLinkedList q= new QueueByLinkedList();
		q.enqueue(12);
		q.enqueue(15);
		q.enqueue(46);
		q.enqueue(90);
	
		q.displayQueue();
		System.out.println();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}

}
