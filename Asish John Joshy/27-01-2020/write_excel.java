package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class write_excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout=new FileOutputStream("E:\\books.csv");
			p=new PrintStream(fout);
			p.println("101,c,E.Balaguruswamy,BPB,110");
			p.println("110,C++,Kanikar,Tech mcgraw hill,200");
			p.println("103,Java made easy,Karthik,Vijay,300");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
