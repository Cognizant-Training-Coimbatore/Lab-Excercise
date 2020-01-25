import java.util.Scanner;

public class program14_check_number_positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
			System.out.println("The number is positive");
		else
			System.out.println("The number is negative");
		
	}

}
