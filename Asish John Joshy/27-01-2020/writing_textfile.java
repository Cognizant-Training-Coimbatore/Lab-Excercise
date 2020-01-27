package demo;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class writing_textfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout=new FileOutputStream("E:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("hello world 1");
			p.println("hello world 2");
			p.println("hello world 3");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}
	}

}
