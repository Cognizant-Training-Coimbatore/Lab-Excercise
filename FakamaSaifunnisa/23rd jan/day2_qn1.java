import java.util.Scanner;

public class day2_qn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the other number");
		int b=sc.nextInt();
		int i;
		for(i=a;i<=b;i++) {
			System.out.println(a);
			a=a+1;
		}

	}

}
