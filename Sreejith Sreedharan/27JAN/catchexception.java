import java.io.FileOutputStream;
import java.io.PrintStream;

public class catchexception {

	public static void main(String[] args) {
		
	FileOutputStream fout;
	PrintStream p;
	try
	{
		fout=new FileOutputStream("E:\\myfile.txt");
		p=new PrintStream(fout);
		p.println("hello world line1");
		p.println("hello world line2");
		p.println("hello world line3");
		p.close();
	}
	catch(Exception e)
	{
		System.err.println("Error in file");
	}
	}

}
