
public class Exception_Method 
{
	public static void main(String[] args) 
	{
		int d= 17;
		int s= 0;
		int h;
		try
		{
			h=d/s;
			System.out.println("value"+h);
		}
		catch(ArithmeticException e)
		{
			System.out.println("getMessage :");
			System.out.println(e.getMessage());
			System.out.println("\n printStackTrace:");
			e.printStackTrace();
			System.out.println("\n toStrng:");
			System.out.println("\n Reffering object:");
			System.out.println(e);
		}
		System.out.println("\n End of program...");
	}
}


