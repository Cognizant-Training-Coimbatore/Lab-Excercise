import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class ex_9 {

	public static void main(String[] args) {
		
		try {
			 FileInputStream fstream =new FileInputStream("E:\\soumyarao.txt");
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
