import java.util.Scanner;

public class program6_check_odd_or_even {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}

}
