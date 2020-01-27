import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
public class ans_10 {

	public static void main(String[] args) {
		
		try {
			 FileInputStream fstream =new FileInputStream("E:\\books.csv");
			DataInputStream fin=new DataInputStream( fstream);
			while(fin.available()!=0) {
				System.out.println(fin.readLine());
			}
			fin.close();
			
		}
		catch(Exception e)
		{
		System.err.println("error");
		}
	}

}
