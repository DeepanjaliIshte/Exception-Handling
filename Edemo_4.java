
// Write a java program to handle multiple exception using common catch block.


import java.util.Scanner;
public class Edemo_4 
{
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		try
		{
			int a=Integer.parseInt(5[0]);
			int b=Integer.parseInt(5[1]);
			int c=a/b;
			System.out.println("Result: "+c);
			System.out.println("Enter a ClassName : ");
			String cn=sn.next();
			Class.forName(cn);
			System.out.println("class is loaded");
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}
}
