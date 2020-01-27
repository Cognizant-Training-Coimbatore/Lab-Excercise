import java.io.FileOutputStream;
import java.io.PrintStream;

public class prg09_qn09_fileinput_books
{
	public static void main(String[] args) 
	{
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout = new FileOutputStream("D:\\books.CSV");
			p = new PrintStream(fout);
			p.println("101 C E.Balaguruswamy, BPB, 100");
			p.println("102 C++ Kanikar, Tech Mcgraw Hill, 200");
			p.println("103 Java made easy, Karthik, Vijaya, 300");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}
	}

}