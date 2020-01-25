import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the 10 numbers");
		int[] x = new int[10];
		int i,a=0,b=0 ,sum=0,avg;
		Scanner scanner = new Scanner(System.in);
		for(i=0;i<=9;i++)
		{
		x[i] = scanner.nextInt();
		}
		for(i=0;i<=9;i++)
		{
			if(a<x[i])
			{
				a=x[i];
			}
		}
		b=a;
		for(i=0;i<=9;i++)
		{
			if(b>x[i])
			{
				b=x[i];
			}
		}
		for(i=0;i<=9;i++)
		{
			sum=sum+x[i];
		}
		avg=sum/10;
		System.out.println("maximum number = "+a);
		System.out.println("minimum number = "+b);
		System.out.println("average is = "+avg);
		
		
	}

}
