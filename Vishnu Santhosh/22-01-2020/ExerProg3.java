import java.util.Scanner;

public class ExerProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		final double pi = 3.14;
		System.out.print("Enter radius: ");
		Scanner scan = new Scanner(System.in);
		double r;
		r=scan.nextInt();
		System.out.println("\nCircle area= "+pi*r*r);
		scan.close();
	}

}
