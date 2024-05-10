import java.util.Scanner;

public class Nested_Try_Block 
{
	 public static void main(String args[])
	 {
		 int d,s; 
		 Scanner in = new Scanner(System.in); 
		 System.out.print("Enter number: "); 
		 d = in.nextInt(); 
		 try 
		 { 
			 s = 17 / d; //statement1 
			 System.out.println("Division: "+s); 
		 try 
		 { 
			 int a = 100 / (d-1); //statement2 
			 short arr[] = {15}; 
			 arr[10] = 25; //statement3 
			 System.out.println("Inner try end..."); 
		 } 
		 catch(ArrayIndexOutOfBoundsException e) //1 
		 { 
			 System.out.println("Array indexing wrong"); 
		 } 
		 	System.out.println("Outer try end..."); 
		 } 
		 catch(ArithmeticException e) //2 
		 { 
			System.out.println("Division by zero"); 
		 } 
		 	System.out.println("Program end...");
	 }
}
