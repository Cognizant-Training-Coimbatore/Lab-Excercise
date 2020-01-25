import java.util.Scanner;

public class Program11_sum_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value of x");
		int x=scan.nextInt();
		System.out.println("enter value of y");
		int y=scan.nextInt();
		System.out.println("enter value of z");
		int z=scan.nextInt();
		System.out.println("enter value of u");
		int u=scan.nextInt();
		System.out.println("enter value of v");
		int v=scan.nextInt();
		int c=u+v+x+y+z;
		int average=c/5;
		System.out.println("the sum is"+c);
		System.out.println("the average is "+average);
		

	}

}
