import java.util.Scanner;
public class excecise_qn1 {
	static void checknumber(int no)throws Exception
	{
		if(no<=0)
			throw new myexceptions("negative no");
		else
			System.out.println("positive no");
	}
	public static void main(String[] args)
	{
		try
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int x=sc.nextInt();
			checknumber(x);
			
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);
		}

}
}
