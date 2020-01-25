import java.util.Scanner;

public class program13_circle 
{

	public static void main(String[] args)
	{
		int r;
		final double p = 3.14;
		System.out.println("Enter the radius");
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextInt();
		double a = r*r*p;
		System.out.println("The area of the circle "+a);
	}

}
