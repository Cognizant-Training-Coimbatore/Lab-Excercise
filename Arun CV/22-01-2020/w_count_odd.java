import java.util.Scanner;

public class w_count_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e, counter=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of A");
		a = scanner.nextInt();
		if(a % 2 == 1)
		{
			counter++;
		}
		System.out.println("Enter the value of B");
		b = scanner.nextInt();
		if(b % 2 == 1)
		{
			counter++;
		}
		System.out.println("Enter the value of C");
		c = scanner.nextInt();
		if(c % 2 == 1)
		{
			counter++;
		}
		System.out.println("Enter the value of D");
		d = scanner.nextInt();
		if(d % 2 == 1)
		{
			counter++;
		}
		System.out.println("Enter the value of E");
		e = scanner.nextInt();
		if(e % 2 == 1)
		{
			counter++;
		}
		
		System.out.println(counter);
	}
}
