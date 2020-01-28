import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class fileoutput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		int n;
		String name,add;
		long adno;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter address");
		add=sc.next();
		System.out.println("enter aadhar no");
		adno=sc.nextLong();
		System.out.println("Do you want to save?(0/1)");
		n=sc.nextInt();
		if(n==1)
		{
			try
		
		{
			fout = new FileOutputStream("E:\\employee.txt");
			p=new PrintStream(fout);
			p.println(name);
			p.println(add);
			p.println(adno);
			
		}
		
		catch(Exception e)
		{
			System.err.println("error in file");
		}
		}
		else if(n==0)
		{
			System.out.println("record not saved");
		}
		else
		{
			System.out.println("enter the correct value");
		}
	}

}
