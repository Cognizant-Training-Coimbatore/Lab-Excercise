package demo;

import java.util.Scanner;

public class number_recognise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,sum=0,cc=0;
		float avg;
		System.out.println("Enter numbers");
		for(int i=0;;i++)
		{
			a=s.nextInt();
			if(a==999)
			{
				break;
			}
			cc++;
			sum=sum+a;
		}
		avg=sum/cc;
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
	}

}
