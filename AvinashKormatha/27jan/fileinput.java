import java.io.DataInputStream;
import java.io.FileInputStream;

public class fileinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fin= new FileInputStream("E:\\myfile.txt");
			DataInputStream dt= new DataInputStream(fin);
			while(dt.available()!=0)
			{
				System.out.println(dt.readLine());
			}
			dt.close();
		}
		catch(Exception e)
		{
			System.err.println("file error");
		}
	}

}
