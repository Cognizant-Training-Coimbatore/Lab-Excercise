import java.util.Scanner;

public class w_number_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, sqr;
		System.out.println("Enter the value of A");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		sqr = a*a;
		System.out.println("Square of the number is " +sqr);
	}

}
