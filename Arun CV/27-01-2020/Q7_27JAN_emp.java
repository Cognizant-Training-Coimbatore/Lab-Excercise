import java.util.Scanner;

public class Q7_27JAN_emp {
static void emp(int code)
{
	if(code>101 && code<200)
	{
		System.out.println("CODE ACCEPTED");
	}
	else
	{
		throw new ArithmeticException("MISMATCH");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a = scanner.nextInt();
		emp(a);
	}

}
