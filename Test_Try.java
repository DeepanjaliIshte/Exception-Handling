
// : The following program includes a try block and a catch clause which

public class Test_Try 
{
	public static void main(String[] args)
	{
		int x=10,y=7,z;
		try
		{
			// monitor the code 
			System.out.println("Entered in try block");
			z=x/y;
			System.out.println("End of try block");
		}
		catch(ArithmeticException e)
		{
			// catch the exception
			System.out.println("Divide by zero error");
		}
		System.out.println("After catch block");
	}
}
