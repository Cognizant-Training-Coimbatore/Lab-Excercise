import java.io.FileOutputStream;
import java.io.PrintStream;

public class Prog3_Writing_to_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try {
			fout = new FileOutputStream("C:\\Users\\Admin\\Desktop\\myfile.txt");
			p = new PrintStream(fout);
			p.println("Hello Vishnu Santhosh!!");
			p.println("Hello Vishnu Vijay");
			p.println("Hello Shahir");
			p.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in file"+e);
		}
	}

}
