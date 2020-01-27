import java.io.FileOutputStream;
import java.io.PrintStream;

public class file_output_exp1 
{

	public static void main(String[] args) 
	{
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout = new FileOutputStream("D:\\myfile.txt");
			p = new PrintStream(fout);
			p.println("Fakama");
			p.println("Revathy");
			p.println("Della");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}
	}

}
