import java.util.Scanner;

public class p9_eb_bill
{

	public static void main(String[] args)
	{
		int a,b,c;
		System.out.print(" Enter old reading: ");
		Scanner sc = new Scanner(System.in);
		b= sc.nextInt();
		System.out.print(" Enter new reading: ");
		Scanner sc2 = new Scanner(System.in);
		c= sc2.nextInt();
		a=c-b;
		if (a>1&&a<101)
		{
			System.out.println("Bill is Free");
		}
		else if (a>101&&a<201)
		{
			System.out.println("Bill is: "+a*1);
		}
		else if (a>201&&a<301)
		{
			System.out.println("Bill is: "+a*2);
		}
		else if (a>301&&a<401)
		{
			System.out.println("Bill is: "+a*3);
		}
		else
		{	
			int temp= a/10;
					a+=temp;
			System.out.println("Bill is: "+a);
		}
	}

}
