import java.util.Scanner;

class add
{
	int add(int x, int y)
	{
		int p;
		p = x+y;
		return p;
	}
}
class sub
{
	int sub(int x ,int y)
	{
		int q;
		q = x-y;
		return q;
		
	}
}
class mul
{
	int mul(int x,int y)
	{
		int r;
		r = x*y;
		return r;
	}
}
class div
{
	int div (int x, int y)
	{
		int s;
		s = x/y;
		return s;
	}
}
public class program25_arithmatic_operations {

	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Enter the second number");
		int b = scanner.nextInt();
		add c = new add();
		int p = c.add(a, b);
		System.out.println("Sum : "+p);
		sub d = new sub();
		int q = d.sub(a, b);
		System.out.println("Differrence : "+q);
		mul e = new mul();
		int r = e.mul(a, b);
		System.out.println("Product : "+r);
		div f = new div();
		int s = f.div(a, b);
		System.out.println("Value : "+s);
		
		
		

	}

}
