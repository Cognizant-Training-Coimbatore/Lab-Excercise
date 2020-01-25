import java.util.Scanner;
public class program17_divisible_by_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		x=scanner.nextInt();
		if(x%7==0) {
			System.out.println("the no is divisible by 7");
		}
		else {
			System.out.println("the no is not divisible by 7");
		}
	}

}
