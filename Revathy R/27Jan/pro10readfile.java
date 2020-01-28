package prgrms;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class pro10readfile {

	public static void main(String[] args) throws IOException {
		FileInputStream fstream= new
				FileInputStream("E:\\books.CSV");
				DataInputStream fin=new DataInputStream(fstream);
				while(fin.available()!=0)
				{
					System.out.println(fin.readLine());
				}
				fin.close();

	}

}
