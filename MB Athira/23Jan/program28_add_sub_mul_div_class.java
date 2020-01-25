import java.util.Scanner;

class add
{
	int add(int x, int y)
	{
		int s;
		s = x+y;
		return s;
	}
}
class sub
{
	int sub(int x, int y)
	{
		int d;
		d = x-y;
		return d;
	}
}
class mul
{
	int mul(int x, int y)
	{
		int p;
		p = x*y;
		return p;
	}
}
class div
{
	int div(int x, int y)
	{
		int q;
		q = x/y;
		return q;
	}
}
public class program28_add_sub_mul_div_class {

	public static void main(String[] args) 
	{
		System.out.println("Enter the 1st and 2nd number resp order :");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		add s1 = new add();
		int s2 = s1.add(a,b);
		System.out.println("Sum : "+s2);
		sub s3 = new sub();
		int s4 = s3.sub(a,b);
		System.out.println("Difference : "+s4);
		mul s5 = new mul();
		int s6 = s5.mul(a,b);
		System.out.println("Product : "+s6);
		div s7 = new div();
		int s8 = s7.div(a,b);
		System.out.println("Quotient : "+s8);
		
	}

}
