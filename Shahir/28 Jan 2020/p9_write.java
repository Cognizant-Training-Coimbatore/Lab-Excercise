import java.io.FileOutputStream;
import java.io.PrintStream;

public class p9_write
{
	public static void main(String[] args)
	{
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout = new FileOutputStream("E:\\Java Eclipse Codes\\Jan 27\\src\\books.csv");
			p = new PrintStream(fout);
			p.println("101,c,E.Balaguruswamy, BPB, 110");
			p.println("102, C++, Kanikar, Tech mcgraw hill, 200");
			p.println("103, Java made easy, Karthik, Vijaya, 300");
			p.close();
		}	
		catch (Exception e)
		{
			System.out.println("Error in the file");
		}
	}
}