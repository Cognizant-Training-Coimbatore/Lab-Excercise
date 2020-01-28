import java.io.FileOutputStream;
import java.io.PrintStream;
public class file_output1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream P;
		try
		{
			fout = new FileOutputStream("E:\\books.csv");
			P=new PrintStream(fout);
			P.println("101,c,E.Balaguruswamy,BPB,110");
			P.println("102,c++,kanikar, Tec mcgraw hill,200");
			P.println("java made easy,karthik,vijaya, 300");
		}
		catch(Exception e)
		{
			System.out.println("error in file");
		}

	}

}
