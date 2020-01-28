package prgrms;

import java.io.FileInputStream;
import java.io.IOException;

class fileMgmt
{
	void fileRead() throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);;
			
		}
		fis.close();
		
	}
}
public class pro6throws {
	

	public static void main(String[] args) {
		

	}

}

