import java.io.FileInputStream;
import java.io.IOException;

class file
{
	void fileread() throws IOException
	{
		FileInputStream fis=null;
		fis = new FileInputStream("c:/my.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class throws1 {

}
