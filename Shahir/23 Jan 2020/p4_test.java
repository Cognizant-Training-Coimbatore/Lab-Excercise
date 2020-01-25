import java.util.Scanner;

class operation
{
	int a,b;
	
	void add()
	{
		System.out.println("Enter the 1st number: ");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		System.out.println("Enter the 2nd number: ");
		Scanner s2 = new Scanner(System.in);
		b=s2.nextInt();
		System.out.println("Sum of 2 numbers:"+(a+b));
	}
	void sub()
	{
		System.out.println("Enter the 1st number: ");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		System.out.println("Enter the 2nd number: ");
		Scanner s2 = new Scanner(System.in);
		b=s2.nextInt();
		System.out.println("Difference of 2 numbers:"+(a-b));
	}
	void mul()
	{
		System.out.println("Enter the 1st number: ");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		System.out.println("Enter the 2nd number: ");
		Scanner s2 = new Scanner(System.in);
		b=s2.nextInt();
		System.out.println("Multiplication of 2 numbers:"+(a*b));
	}
	void div()
	{
		System.out.println("Enter the 1st number: ");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		System.out.println("Enter the 2nd number: ");
		Scanner s2 = new Scanner(System.in);
		b=s2.nextInt();
		System.out.println("Division of 2 numbers:"+(a/b));
	}
}
public class p4_test
{
	public static void main(String[] args)
	{
		operation o = new operation();
		o.add();
		o.sub();
		o.mul();
		o.div();
	}
}