import java.util.Scanner;

class operations{
	int n1,n2,s,d,m;
	float q;
	int addition(int a,int b)
	{
		s=a+b;
		return s;
	}
	int difference(int a,int b)
	{
		d=a-b;
		return d;
	}
	int multiplication(int a,int b)
	{
		m=a*b;
		return m;
	}
	float division(int a,int b)
	{
		q=a/b;
		return q;
	}
}
public class program27_arithmetic_operations {

	public static void main(String[] args) {
		System.out.println("Enter n1 and n2");
		Scanner s=new Scanner(System.in);
		operations op=new operations();
		op.n1=s.nextInt();
		op.n2=s.nextInt();
		int sum=op.addition(op.n1,op.n2);
		System.out.println("Sum is:"+sum);
		int diff=op.difference(op.n1,op.n2);
		System.out.println("Difference is:"+diff);
		int mut=op.multiplication(op.n1,op.n2);
		System.out.println("Product is:"+mut);
		float quo=op.division(op.n1,op.n2);
		System.out.println("Quotient is:"+quo);
		

	}

}
