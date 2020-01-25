import java.util.Scanner;

class operations
{
	
	float add(float a, float b)
	{
		return a+b;
	}
	float sub(float a, float b)
	{
		return a-b;
	}float mul(float a, float b)
	{
		return a*b;
	}float div(float a, float b)
	{
		return a/b;
	}
}
public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operations obj= new operations();
		Scanner sc= new Scanner(System.in);
		float a,b;
		System.out.println("enter two numbers");
		a=sc.nextFloat();
		b= sc.nextFloat();
		System.out.println("addition "+obj.add(a,b)+" subtraction "+obj.sub(a,b)+" multiplication "+obj.mul(a,b)+" division "+obj.div(a,b)+"");
	}

}
