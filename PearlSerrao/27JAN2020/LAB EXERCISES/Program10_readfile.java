package demo;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Program10_readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileInputStream fstream;
		
		try {
			fstream=new FileInputStream("D:\\Pearl\\books.csv");
	//	Data	InputStream fin=new DataInputStream(fstream);
			DataInputStream fin=new DataInputStream(fstream);
			while(fin.available()!=0)
				System.out.println(fin.readLine());
		
		fin.close();
		}
		catch(Exception e)
		{
			System.err.println("error");
		}
	}

}
