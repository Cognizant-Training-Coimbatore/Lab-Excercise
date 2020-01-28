import java.io.FileOutputStream;
import java.io.PrintStream;

public class fileoutput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout = new FileOutputStream("E:\\books.csv");
			p=new PrintStream(fout);
			p.println("101,c,E.Balaguruswamy,BPB,110");
			p.println("102,c++,kanikar, Tech mcgraw hill,200");
			p.println("java made easy, Karthik,vijaya, 300");
			
		}
		catch(Exception e)
		{
			System.err.println("error in file");
		}
	}

}
