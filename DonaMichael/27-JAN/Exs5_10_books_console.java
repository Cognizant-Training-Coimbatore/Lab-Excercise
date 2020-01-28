import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exs5_10_books_console {

	public static void main(String[] args) throws IOException {
		FileInputStream fstream=new
		FileInputStream("D:\\books.CSV");
		DataInputStream fin=new DataInputStream(fstream);
		while(fin.available()!=0)
		{
			System.out.println(fin.readLine());
		}
		fin.close();
	}

}
