import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
		int x,y;
		System.out.println("enter the value of x");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter the value of y");
		y=sc.nextInt();
		sc.close();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);

	}

}
