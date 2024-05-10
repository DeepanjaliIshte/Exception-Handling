import java.io.FileInputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					// Compile time Exception/Checked exception 
			//FileInputStream fis=new FileInputStream("d:/abc.txt");
			//Class.forName("com.mysql.jdbc.driver");
			
					// Run-time Exception/ Unchecked exception
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
							
				//	Compile successfully but gives tread exception
			String name=null;
			System.out.println(name.length());
			
		
	}

}

