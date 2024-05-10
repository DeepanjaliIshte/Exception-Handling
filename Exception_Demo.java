
// Following program tries to access 3rd element of the array which throws an exception

public class Exception_Demo
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] =new int[2];
			System.out.println("Access element three: "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Exception thrown : " +e);
		}
		System.out.println("Out of the block");
	}
}
