

// Rule No.13
// Write a java program to Handle Exception using multiple catch blocks.

public class Edemo_2 {

	public static void main(String[] args) 
	{
		try 
		{

			int a;
			int b;
			int c=a+b;
			a=Integer.parseInt(5[0]);
			b=Integer.parseInt(5[2]);
			System.out.println("Result : "+c);
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}

}
