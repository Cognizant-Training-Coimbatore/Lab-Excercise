import java.io.FileInputStream;
 class checked_exception 
{
	void fileread() throws IOException
	{
		FileInputStream fis = null;
		fis =  new FileInputStream("B:/myfile.txt");
		int k;
		while ((k = fid.read() ) != -1)
		{
			System.out.print((char)k);
		}
		fis.close();
	}

}

