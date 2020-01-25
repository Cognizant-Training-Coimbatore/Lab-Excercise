import java.util.Scanner;

public class program19_electricity_bill 
{

	public static void main(String[] args) 
	{
		int om, nm, u;
		System.out.println("Enter the OLd meter Reading");
		Scanner scanner = new Scanner(System.in);
		om = scanner.nextInt();
		System.out.println("Enter the New meter Reading");
		nm = scanner.nextInt();
		u = nm-om;
		if(u>0&&u<=100)
		{
			System.out.println("Price : Free");
		}
		else if(u>100&&u<=200)
		{
			System.out.println("Price : Rs. 1");
		}
		else if(u>200&&u<=300)
		{
			System.out.println("Price : Rs. 2");
		}
		else if(u>300&&u<=400)
		{
			System.out.println("Price : Rs. 3");
		}
		else
		{
			System.out.println("Price : Rs. 4 + 10% tax");
		}
		
	}

}
