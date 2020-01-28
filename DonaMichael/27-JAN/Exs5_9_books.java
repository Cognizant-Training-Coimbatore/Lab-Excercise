import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Exs5_9_books {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout;
		PrintStream p;
		
			fout= new FileOutputStream("D:\\books.CSV");
			p=new PrintStream(fout);
			p.println("101,c,E.Balaguruswamy, BPB, 110\r\n" + 
					"102, C++, Kanikar, Tech mcgraw hill, 200\r\n" + 
					"103, Java made easy, Karthik, Vijaya, 300");
			
			p.close();
	}

}
