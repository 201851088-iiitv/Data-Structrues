class ArrayList 
{
	Object arr[];
	Integer size;
	Integer buffer;
	ArrayList()
	{
		buffer=5;
		size=0;
		arr=new Object[buffer];
	}
	public void add(Integer i)
	{
		arr[size]=i;
      		size++;
		if (size==buffer)
		{
			Object arr2[]=new Object[buffer*2];
        		buffer*=2;
        		for(Integer y=0;y<size;y++)
	        	{ 
				arr2[y]=arr[y];
		        }
		        arr=arr2;
		}
	}
	public void traverse()
	{
		for(Integer i=0;i<size;i++)
  	     	{ 	
			System.out.print(arr[i]+" ");
 		}
    	}
	public void add(Integer p,Integer pos)
	{
	for(Integer i=size;i>=pos;i--)
	{ 
		arr[i]=arr[i-1];
      	}
      	arr[pos]=p;
      	size++;
      	if(size==buffer)
      	{ 
		Object arr2[]=new Object[buffer*2];
        	buffer*=2;
        	for(Integer j=0;j<size;j++)
        	{ 
			arr2[j]=arr[j];
	        }
	        arr=arr2;
	}
	}
	

}	
