package jan_27th;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class EX_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		FileInputStream fstream;
				
				try {
					fstream=new FileInputStream("D:\\Hobbit\\books.csv");
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


