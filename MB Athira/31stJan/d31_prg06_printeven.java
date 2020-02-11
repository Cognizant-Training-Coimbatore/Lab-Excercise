import java.util.Scanner;

public class d31_prg06_printeven 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
