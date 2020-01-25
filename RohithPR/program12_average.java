import java.util.Scanner;

public class program12_average {

	public static void main(String[] args) 
	{
		int x1, x2, x3, x4, x5, sum, avg;
		System.out.println("Enter the Values");
		Scanner scanner= new Scanner(System.in);
		 x1 = scanner.nextInt();
	     x2 = scanner.nextInt();
		 x3 = scanner.nextInt();
		 x4 = scanner.nextInt();
		 x5 = scanner.nextInt();
		sum = x1+x2+x3+x4+x5;
		avg=sum/5;
		System.out.println("The Sum is "+sum);
		System.out.println("The Average is"+avg);
		

	}

}

