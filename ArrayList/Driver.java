public class Driver
{
    public static void main(String[] args)
	{
		ArrayList ob=new ArrayList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		ob.traverse();
		ob.add(0,1);
		System.out.println();
		System.out.println("After adding on position");
		ob.traverse();
		
		
		
	}
}