import java.io.PrintStream;
import java.io.FileOutputStream;
public class ex_8 {

	public static void main(String[] args) {
		FileOutputStream fout;
		PrintStream p;
		try {
			fout =new FileOutputStream ("E:\\soumyarao.txt");
			p =new PrintStream(fout);
			p.println("hello soumya");
			p.println("hello soumya");
			p.println("hello soumya");
			p.close();
			
		}
		catch(Exception e)
		{
		System.err.println("error");
		}

	}

}
