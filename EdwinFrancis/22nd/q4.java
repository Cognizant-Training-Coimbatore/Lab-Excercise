import java.util.Scanner;

class calculator{
	int x,y;
	int add(int x,int y)
	{
		int sum=x+y;
		return sum;
		
	}
	int sub(int x,int y)
	{
		int sub=x-y;
		return sub;
		
	}
	int mul(int x,int y)
	{
		int mul=x*y;
		return mul;
		
	}
	int div(int x,int y)
	{
		int div=x/y;
		return div;
		
	}
}
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator obj=new calculator();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		obj.x=input.nextInt();
		obj.y=input.nextInt();
		System.out.println("Addition is:"+obj.add(obj.x,obj.y));
		System.out.println("Substraction is:"+obj.sub(obj.x,obj.y));
		System.out.println("Multiplication is:"+obj.mul(obj.x,obj.y));
		System.out.println("division is:"+obj.div(obj.x,obj.y));
	}

}
