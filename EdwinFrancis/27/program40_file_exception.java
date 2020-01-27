package demo;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class program40_file_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try {
			fout=new FileOutputStream("D:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("hello world line 1");
			p.println("hello world line 2");
			p.println("hello world line 3");
			p.close();
		}
		catch(Exception e) {
			System.err.println("Error in file");
		}

	}

}
