package demo;

import java.io.FileInputStream;
import java.io.IOException;

public class checked_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
class filemgt{
	void fileRead()  throws IOException  //when the throws is removed then shows error
	{
		FileInputStream f=null;
		f=new FileInputStream("BB://myfile.txt");
		int k;
		while((k=f.read())!=-1) {
			System.out.println((char)k);
	}
	f.close();
	
}
}
}
