import java.io.FileInputStream;
import java.io.IOException;
class FileMgmt
{
	void fileRead() throws IOException
	{FileInputStream fis=null;
	fis=new FileInputStream("C:?myfiii.text");
	int k;
	while((k=fis.read())!=-1)
	{
	System.out.println((char)k);
	}
	fis.close();
	}
	
}
public class filemsgmt {

	public static void main(String args[])
	{
		
		
		
		
	}
}
