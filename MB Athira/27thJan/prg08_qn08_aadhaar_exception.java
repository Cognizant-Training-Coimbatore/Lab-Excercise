import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class prg08_qn08_aadhaar_exception 
{
	static void validate(int i)throws negativeexceptions
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
			throw new negativeexceptions("Invalid choice");
		}
		
	}

	public static void main(String[] args)throws FileNotFoundException, negativeexceptions 
	{
		int adhar,i;
		try
		{
			
			String name,address;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name");
			name=sc.next();
			System.out.println("enter the address");
			address=sc.next();
			System.out.println("enter the adhar number");
			adhar=sc.nextInt();
			System.out.println("Do you want to save?(1/0)");
			i=sc.nextInt();
				if(i==1)
					{
						FileOutputStream fout;
						PrintStream p;
						fout=new FileOutputStream("E:\\file.txt");
						p=new PrintStream(fout);
						p.println(name+"\n"+address+"\n"+adhar);
						p.close();
					}
			validate(i);
		}
		catch(Exception m)
		{
			System.out.println("Exception occurs: "+m);
		}
	}
}
