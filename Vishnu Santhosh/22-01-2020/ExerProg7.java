import java.util.Scanner;

public class ExerProg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x;
		x=scan.nextInt();
		if(x%7==0)
			System.out.println(x+" is divisible by 7.");
		else
			System.out.println(x+" is not divisible by 7.");
	}

}
