import java.util.Scanner;

public class program8_three_numbers {

	public static void main(String[] args) {
		System.out.println("Enter the condition true or false");
		Scanner sc=new Scanner(System.in);
		boolean abc=sc.nextBoolean();
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(abc==true)
		{
			if(c>b)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			if(b>a && c>b)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}

	}

}
