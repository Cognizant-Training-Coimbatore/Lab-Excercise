import java.util.Scanner;

public class program17_check_divisible_by_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%7==0)
		{
			System.out.println(n+" is divisible by 7");
		}
		else
		{
			System.out.println(n+" is not divisible by 7");
		}
	}

}
