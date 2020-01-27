package demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class read_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin;
		try 
		{
			fin = new FileInputStream("E:\\books.csv");
			DataInputStream dr=new DataInputStream(fin);
			while(dr.available()!=0)
			{
			System.out.println(dr.readLine());
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
