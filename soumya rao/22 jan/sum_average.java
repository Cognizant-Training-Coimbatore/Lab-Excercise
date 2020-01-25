package demo;

import java.util.Scanner;

public class sum_average {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
	int	a=sc.nextInt();
	int	b=sc.nextInt();
	int	c=sc.nextInt();
	int	d=sc.nextInt();
	int	e=sc.nextInt();
	int sum=a+b+c+d+e;
	int average=sum/5;
	System.out.println("The sum is="+sum);
	System.out.println("The average  is="+average);

}
}