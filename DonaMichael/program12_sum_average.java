import java.util.Scanner;

public class program12_sum_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,n4,n5,sum;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1:");
		n1=sc.nextInt();
		System.out.println("Enter the value of n2:");
		n2=sc.nextInt();
		System.out.println("Enter the value of n3:");
		n3=sc.nextInt();
		System.out.println("Enter the value of n4:");
		n4=sc.nextInt();
		System.out.println("Enter the value of n5:");
		n5=sc.nextInt();
		sum=n1+n2+n3+n4+n5;
		avg=sum/5;
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+avg);
		
	}

}
