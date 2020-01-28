import java.io.FileOutputStream;
import java.io.PrintStream;

public class program73_fileoutput_stream {

	public static void main(String[] args) {
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout= new FileOutputStream("D:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("helloworld line 1");
			p.println("helloworld line 2");
			p.println("helloworld line 3");
			p.close();
			
		}
		catch (Exception e)
		{
			System.err.println("Error in file");
		}

	}

	
	}


