import java.util.Scanner;

public class w_divisible_by_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the value of A");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		if(a%7==0)
		{
			System.out.println("Divisible by 7");
		}
		else
		{
			System.out.println("Not divisible by 7");
		}
	}

}
