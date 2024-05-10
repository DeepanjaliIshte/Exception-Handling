
// Rule No.9
// Write a java program to Handle NumberformatException.

public class Edemo_1 
{
	public static void main(String[] args)
	{
		try 
		{

			int a=Integer.parseInt(5[0]);
			int b=Integer.parseInt(5[2]);
			int c=a+b;
			System.out.println("Result : "+c);
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne);
		}
	}
}
