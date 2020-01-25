import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,sum,avg;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		e=input.nextInt();
		sum=a+b+c+d+e;
		avg=sum/5;
		System.out.println("the total is "+sum);
		System.out.println("the average is "+avg);
		
		
		

	}

}
