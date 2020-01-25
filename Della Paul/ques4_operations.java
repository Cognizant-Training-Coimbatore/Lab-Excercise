import java.util.Scanner;
class Add
{
	int add(int x,int y) {
		
		return x+y;
	}
}
	class Sub
	{
	
	int sub(int x,int y)
	{
		return x-y;
	}
	}
	class Mul
	{
		int mul(int x,int y)
		{
			
			return x*y;
		}
	}
	class Div
	{
		int div(int x,int y)
		{
	
		return x/y;
	}
	}
public class ques4_operations {

	public static void main(String[] args) {
		Add a=new Add();
		Sub b=new Sub();
		Mul c=new Mul();
		Div d=new Div();
		System.out.println("enter the value of x");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println("enter the value of y");
		int y=s.nextInt();
		System.out.println("adding the nos we get"+a.add(x,y));
		System.out.println("subtracting the nos we get"+b.sub(x,y));
		System.out.println("multiplying the nos we get"+c.mul(x,y));
		System.out.println("dividing the nos we get"+d.div(x,y));
	}

}
