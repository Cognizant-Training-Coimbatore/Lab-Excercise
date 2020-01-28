import java.io.DataInputStream;
import java.io.FileInputStream;

public class Prog31_Reading_from_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fstream = new FileInputStream("C:\\Users\\Admin\\Desktop\\myfile.txt");
			DataInputStream fin = new DataInputStream(fstream);
			while(fin.available()!=0) {
				System.out.println(fin.readLine());
			}
			fin.close();
		} catch (Exception e) {
			// TODO: handle exceptionfstream
			System.out.println("File error");
		}
	}

}
