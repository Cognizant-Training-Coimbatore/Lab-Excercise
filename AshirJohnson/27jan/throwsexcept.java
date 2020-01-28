package helloworld;

import java.io.FileInputStream;
import java.io.IOException;

class throwsexcept {


		// TODO Auto-generated method stub
		void fileRead() throws IOException
		{
			FileInputStream fis =null;
			fis =new FileInputStream("B:/myfile.txt");
			int k;
			while((k=fis.read())!=-1)
			{
				System.out.println((char)k);
			}
			fis.close();
		}
	

}
