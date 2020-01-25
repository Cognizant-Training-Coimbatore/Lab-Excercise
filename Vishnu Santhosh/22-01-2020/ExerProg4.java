import java.util.Scanner;

public class ExerProg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.out.print("Enter number: ");
		Scanner scan = new Scanner(System.in);
		int x;
		x=scan.nextInt();
		if(x>=0) {
			System.out.println(x+" is positive.");
		}
		else {
			System.out.println(x+" is negative.");
		}
		scan.close();
	}

}