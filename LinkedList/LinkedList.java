public class LinkedList
{
ListObject head,tail;

LinkedList()
{
	head=tail=null;
}
public void add(Integer val)
{
	ListObject ob=new ListObject(val);
	if(head==null)
	{
		head=ob;
		tail=ob;
		
	}
	else
	{
		tail.next=ob;
		tail=ob;
	}
}

	public void traverse()
	{
		ListObject ob=head;
		while(ob.next!=null)
		{
			System.out.println(ob.val);
			ob=ob.next;
		}
		System.out.println(ob.val);
	}
	public static void main(String args[])
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(15);
		ob.add(30);
		ob.add(20);
		ob.add(40);
		ob.add(69);
		ob.traverse();
	}
		
}
