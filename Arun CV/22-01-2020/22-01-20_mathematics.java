import java.util.Scanner;

class maths
{
	int returnAdd(int x, int y)
	{
		return(x+y);
	}
	int returnSub(int x, int y)
	{
		return(x-y);
	}
	int returnMul(int x, int y)
	{
		return(x*y);
	}
	int returnDiv(int x, int y)
	{
		return(x/y);
	}
	
}
public class mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st value");
		a = scanner.nextInt();
		System.out.println("Enter 2nd value");
		b = scanner.nextInt();
		maths obj = new maths();
		int Add = obj.returnAdd(a,b);
		System.out.println("The sum is " +Add);
		int Sub = obj.returnSub(a, b);
		System.out.println("The difference is " +Sub);
		int Mul = obj.returnMul(a, b);
		System.out.println("The product is " +Mul);
		int Div = obj.returnDiv(a, b);
		System.out.println("The quotient is " +Div);
	}

}
