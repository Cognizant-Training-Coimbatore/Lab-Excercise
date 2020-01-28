import java.io.FileInputStream;
import java.io.IOException;

class filemgt{
	void fileRead() throws IOException
	{
		FileInputStream fis=null;
		fis= new FileInputStream("B:myfile.txt");
		int k;
		while((k=fis.read() )!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class program70_file_mgmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
