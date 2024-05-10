
// Rule NO.14
//Write a java program to Handle Exception using multiple try-catch pairs.
import java.util.Scanner;
public class Edemo_3 
{
	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter index");
		int index=sn.nextInt();
		try
		{
			String s="Pune";
			char ch=s.charAt(index);
			System.out.println("char :"+ch);
		}
		catch(StringIndexOutOfBoundsException Se)
		{
			System.out.println(Se);
		}
		try
		{
			int a[]= {10,20,30,40};
			int val=a[index];
			System.out.println("arrayValues: "+val);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
	}
}
