import java.util.Scanner;
public class program14_check_numis_positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner scanner=new Scanner(System.in);

		System.out.println("enter the value of x");
		x=scanner.nextInt();
		if(x>0) {
			System.out.println("the no is positive");
		}
		else {
			System.out.println("the no is negative");
		}
	}

}
