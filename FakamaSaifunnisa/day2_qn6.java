import java.util.Scanner;

public class day2_qn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int sum=0;
		int avg=0;
		int i=0;
		while(a!=999)
		{
			i=i+1;
			sum=sum+a;
			avg=sum/i;
			a=sc.nextInt();
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
