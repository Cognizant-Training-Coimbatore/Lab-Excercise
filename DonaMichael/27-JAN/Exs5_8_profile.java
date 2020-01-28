import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Exs5_8_profile { 
	static void validate(int i)throws negative_exception_1
	{
		
		if(i==1)
		{
			System.out.println("Record saved.....exiting.......");
		}
		else if(i==0)
		{
			System.out.println("Record not saved.....exiting....... ");
		}
		else 
		{
			throw new negative_exception_1("Invalid choice");
		}
		
	}




	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		String str1,str2;
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		str1=sc.next();
		System.out.println("Enter your address");
		str2=sc.next();
		System.out.println("Enter your aadhar card number");
		n=sc.nextInt();
		System.out.println("Do you want to save");
		i=sc.nextInt();
		if(i==1)
		{
		FileOutputStream fout;
		PrintStream p;
		fout=new FileOutputStream("D:\\file.txt");
		p=new PrintStream(fout);
		p.println(str1+"\n"+str2+"\n"+n);
		p.close();
		}
		validate(i);
		}
		catch(Exception e)
		{
			System.out.println("error in the code"+e);
			
		}

		
	}
	

}
