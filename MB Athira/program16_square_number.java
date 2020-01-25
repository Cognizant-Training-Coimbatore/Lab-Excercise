import java.util.Scanner;

public class program16_square_number {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		System.out.println("The square of the number "+x+" is "+(x*x));
	}

}
