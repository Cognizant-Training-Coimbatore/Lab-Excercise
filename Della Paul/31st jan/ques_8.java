import java.util.Scanner;
public class ques_8 {

	public static void main(String[] args)
	{
		boolean abc;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter true or false");
		abc=sc.nextBoolean();
		System.out.println("enter the numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(abc==true)
		{
			if(z>y)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else if(abc==false)
		{
			if(y>x&&z>y)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		
		

	}

}
