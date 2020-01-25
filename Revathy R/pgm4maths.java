import java.util.Scanner;

class math
{
	int a,b;
	void add(int n1,int n2)
	{
		System.out.println("sum is "+(n1+n2));
	}
	void sub(int n1,int n2)
	{
		System.out.println("difference is "+(n1-n2));
	}
	void div(int n1,int n2)
	{
		double d=n1/n2;
		System.out.println("quotient is "+d);
	}
	void mul(int n1,int n2)
	{
		System.out.println("product is "+(n1*n2));
	}
	
}
public class pgm4maths {

	public static void main(String[] args) {
		System.out.println("enter the value of two numbers \n");
		Scanner sc=new Scanner(System.in);
		math obj=new math();
		obj.a=sc.nextInt();
		obj.b=sc.nextInt();
		obj.add(obj.a, obj.b);
		obj.sub(obj.a, obj.b);
		obj.div(obj.a, obj.b);
		obj.mul(obj.a, obj.b);

	}

}
