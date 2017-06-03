
public class add {

	public static void main(String[] args)
	{
		int a=3, b=4;
		System.out.println(a+b);
		
 add(2,3);
int result=addOne(4,5);
System.out.println("result is "+ result);
	}

	private static int addOne(int i, int j)
	{
		int k=i+j;
		return k;
	}

	private static void add(int i, int j)
	{
		int k=i+j;
		System.out.println("addition result "+ k);
			
	}
}