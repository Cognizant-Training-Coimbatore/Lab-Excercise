import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class p10_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try
		{
			FileInputStream fstream = new 
			FileInputStream("E:\\Java Eclipse Codes\\Jan 27\\src\\books.csv");
			DataInputStream fin = new DataInputStream(fstream);
			while (fin.available() !=0)
			{
				System.out.println(fin.readLine());
			}
			fin.close();
		}
		catch (Exception e)
		{
			System.out.println("File error ");
		}
	}

}
