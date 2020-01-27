import java.io.PrintStream;
import java.io.FileOutputStream;
public class ans_9 {

	public static void main(String[] args) {
		FileOutputStream fout;
		PrintStream p;
		try {
			fout =new FileOutputStream ("E:\\books.csv");
			p =new PrintStream(fout);
			p.println("101,c,E.Balaguruswamy, BPB,110");
			p.println("102, C++, Kanikar, Tech mcgraw hill, 200");
			p.println("103, Java made easy, Karthik, Vijaya, 300\r\n" + 
					"\r\n" + 
					"");
			p.close();
			
		}
		catch(Exception e)
		{
		System.err.println("error");
		}


	}

}
