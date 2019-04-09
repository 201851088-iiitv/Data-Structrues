class OrderedList implements List
{
	Integer buffer;
	Integer size;
	Object arr[];
	
	public void add(Object obj)
	{
	Integer pos=0;
	int i, j;
	
	for(j=0;j<=size;j++)        
	{
		if (arr[j]==null)
		{pos=j;
		break;}
								
		else if ( (int)arr[j] >= (int)obj )
		{pos=j;
		break;}
										                      
		}
	
	
	for(i=size-1;i>=pos;i--)
	arr[i+1]=arr[i];
	arr[pos]=obj;
	size++;

	
	
		if(size==buffer)
		{
		Object arr2[]=new Object[buffer*2];
		
		int temp;
		for(temp=0;temp<buffer;temp++)
		arr2[temp]=arr[temp];
		buffer*=2;
		arr=arr2;
		}
	}
	
	
	public void traverse()
	{
	int temp;
	for(temp=0;temp<size;temp++)
	System.out.println(arr[temp]);
	}
	
	OrderedList()
	{
	size=0;
	buffer=2;
	arr=new Object[buffer];
	}
	
	public static void main(String args[])
	{
		OrderedList ob=new OrderedList();
		ob.add(15);
		ob.add(50);
		ob.add(20);
		ob.add(60);
		ob.add(30);
		ob.add(25);
		ob.traverse();
	}
}
