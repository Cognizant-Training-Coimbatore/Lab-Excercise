
public class exception_fileout {

	public static void main(String[] args) 
	{
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout = new FileOutputStream("D:\\myfile.txt");
			p= new PrintStream(fout);
			P.println("hello world line1");
			P.println("hello world line2");
			P.println("hello world line3");
			P.close();
		}
		catch (Exception e)
		{
			System.out.println("Error in file");
			}

	}

}
