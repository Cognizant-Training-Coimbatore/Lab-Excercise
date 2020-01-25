import java.util.Scanner;

public class p2_sum {
	public static void main(String[] args) 
	{	
		int a,b,c,d,e,f,g;
		System.out.println("Enter 1st number=");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		System.out.println("Enter 2nd number=");
		Scanner s2 = new Scanner(System.in);
		b=s2.nextInt();System.out.println("Enter 3rd number=");
		Scanner s3 = new Scanner(System.in);
		c=s3.nextInt();
		System.out.println("Enter 4th number=");
		Scanner s4 = new Scanner(System.in);
		d=s4.nextInt();
		System.out.println("Enter 5th number=");
		Scanner s5 = new Scanner(System.in);e=s5.nextInt();
		f=a+b+c+d+e;
		g=f/5;
		System.out.println("The sum of 5 numbers:"+f);
		System.out.println("The average of 5 numbers:"+g);
	}

}
