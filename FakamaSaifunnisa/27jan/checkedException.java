package packB;
//import java.io.ICException;
import java.io.FileInputStream;

class filemgmt{
	void fileRead() throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read())!= -1) {
			System.out.print((char)k);
		}
		fis.close();
		
	}
}
public class checkedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
