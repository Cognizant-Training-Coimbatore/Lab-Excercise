import java.io.FilterInputStream;

import demo.DataInputStream;
import demo.FileInputStream;
import demo.FileNotFoundException;

public class file_read_browser_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin;
		try 
		{
			fin = new FilterInputStream("E:\\books.csv");
			DataInputStream dr=new DataInputStream(fin);
			while(dr.available()!=0)
			{
			System.out.println(dr.readLine());
			}
	}

}
