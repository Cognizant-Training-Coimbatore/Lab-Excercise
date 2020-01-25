import java.util.Scanner;
public class program12_sum_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,sum,average;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value of a ");
		a=scanner.nextInt();
		System.out.println("enter the value of b ");
		b=scanner.nextInt();
		System.out.println("enter the value of c ");
		c=scanner.nextInt();

		System.out.println("enter the value of d ");
		d=scanner.nextInt();
	
		System.out.println("enter the value of e ");
		e=scanner.nextInt();
		sum=a+b+c+d+e;
		System.out.println("the sum is"+sum);
		average=sum/5;
		System.out.println("the average is"+average);
		
	}

}
