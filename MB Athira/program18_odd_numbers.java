import java.util.Scanner;

public class program18_odd_numbers {

	public static void main(String[] args) 
	{
		int x1, x2, x3, x4, x5;
		System.out.println("Enter five numbers");
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextInt();
		x2 = scanner.nextInt();
		x3 = scanner.nextInt();
		x4 = scanner.nextInt();
		x5 = scanner.nextInt();
		if(x1%2!=0)
		{
			System.out.println(x1+" : Odd number");
		}
		if(x2%2!=0)
		{
			System.out.println(x2+" : Odd number");
		}
		if(x3%2!=0)
		{
			System.out.println(x3+" : Odd number");
		}
		if(x4%2!=0)
		{
			System.out.println(x4+" : Odd number");
		}
		if(x5%2!=0)
		{
			System.out.println(x5+" : Odd number");
		}
	}

}
