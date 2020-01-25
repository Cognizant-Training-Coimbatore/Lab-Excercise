import java.util.Scanner;
public class day2_ques6 {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		int avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		 int a=sc.nextInt();
		while(a!=-999)
		{
			i=i+1;
			sum=sum+a;
			avg=sum/i;
			a=sc.nextInt();
		}
		System.out.println("sum is"+sum);
		System.out.println("avg is"+avg);
	}

}
