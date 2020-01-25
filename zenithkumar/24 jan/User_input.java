import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<b;i++)
		{
			System.out.println(i);
		}

	}

}
