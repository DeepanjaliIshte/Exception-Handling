import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
	void readFile() throws FileNotFoundException
	{
		//statement
		FileInputStream fis=new FileInputStream("d:/abc.txt");
	}
		void  SaveFile()throws FileNotFoundException
		{
			String text= "this is demo";
		//statement
			FileOutputStream fos=new FileOutputStream("d:xyz.txt");
		}
}
	
	class Final
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadAndWrite rw=new ReadAndWrite();
		try
		{
			
			rw.readFile();
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			rw.SaveFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
