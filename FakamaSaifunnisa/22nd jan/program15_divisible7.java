import java.util.Scanner;

public class program15_divisible7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("enter the value");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		if((x%7)==0)
		{
			System.out.println("divisible");
		}
		else
		{
			System.out.println("not divisible");
		}
	}

}
