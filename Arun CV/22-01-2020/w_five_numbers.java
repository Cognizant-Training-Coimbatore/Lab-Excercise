import java.util.Scanner;

public class w_five_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		System.out.println("Enter the value of A");
		System.out.println("Enter the value of B");
		System.out.println("Enter the value of c");
		System.out.println("Enter the value of D");
		System.out.println("Enter the value of E");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		int sum = a+b+c+d+e;
		int avg =sum/5;
		System.out.println("The addition of five numbers is " +sum);
		System.out.println("The average of five numbers is " +avg);
	} 

}
