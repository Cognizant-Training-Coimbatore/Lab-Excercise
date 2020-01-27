import java.util.Scanner;

public class w_positive_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the value of A");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		if(a>=0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("Negative number");
		}
	}

}
