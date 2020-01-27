import java.io.FileInputStream;
import java.io.IOException;

class fileMgmt
{
	void fileRead() throws IOException
	{
		FileInputStream fis = null;
		fis = new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class thrown_cmd_exp_1 
{

	public static void main(String[] args) 
	{
		
	}

}
