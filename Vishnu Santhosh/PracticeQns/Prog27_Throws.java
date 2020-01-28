import java.io.FileInputStream;
import java.io.IOException;

class fileMgmt{
	void fileManagement() throws IOException{
		FileInputStream fin = null;
		fin = new FileInputStream("alpha.txt");
		int k;
		while((k=fin.read())!=-1) {
			System.out.println((char)k);
		}
		fin.close();
	}
}
public class Prog27_Throws {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fileMgmt obj = new fileMgmt();
		obj.fileManagement();
	}

}
